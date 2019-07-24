import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.print.DocFlavor;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

public class ModeloTabla_Maquinaria extends AbstractTableModel {

    private Connection conexion;

    String encabezados[] = new String[]{
        "Clave","NOMBRE", "TIPO", "MODELO", "COSTO", "ESTADO", "PRECIO DE RENTA"
    };

    Class tipos[] = new Class[]{
       Integer.class, String.class, String.class, Integer.class, Double.class, String.class, Double.class
    };
    Object datos[][];

    public ModeloTabla_Maquinaria(String Usuario, String Contraseña) {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            /**Adminn es usuario y admin es el pasword*/
            conexion = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/Constructora", Usuario, Contraseña);
            System.out.println("Se concecto Correctamente ");

        } catch (Exception e) {
            System.err.println("Hubo un error en la instalacion " + e);
        }
        actualizaEstatus();
    }

    // solo los metodos getRowCount( ), getColumnCount( ),y  getValueAt( ) son requeridos
    @Override
    public int getRowCount() {
        return datos.length;
    }

    @Override
    public int getColumnCount() {
        return encabezados.length;
    }

    @Override
    public String getColumnName(int c) {
        return encabezados[c];
    }

    @Override
    public Class getColumnClass(int c) {
        return tipos[c];
    }

    @Override
    public Object getValueAt(int r, int c) {
        return datos[r][c];
    }

    public int getTotal() {
        int contador = 0;
        try {
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT CLAVE_MAQ,NOMBRE_MAQ,TIPO_MAQ,MODELO_MAQ,COSTO_MAQ,ESTADO_MAQ,PRECIORENTA_MAQ FROM MAQUINARIA");
            while (rs.next()) {
                contador += 1;
            }
        } catch (Exception e) {
        }
        return contador;
    }

    // metodo que llena a los datos
    public void actualizaEstatus() {
        datos = new Object[getTotal()][encabezados.length];
        try {
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT CLAVE_MAQ,NOMBRE_MAQ,TIPO_MAQ,MODELO_MAQ,COSTO_MAQ,ESTADO_MAQ,PRECIORENTA_MAQ FROM MAQUINARIA");
            int contador = 0;
            while (rs.next()) {
                datos[contador][0] = rs.getInt(1);
                datos[contador][1] = rs.getString(2);
                datos[contador][2] = rs.getString(3);
                datos[contador][3] = rs.getInt(4);
                datos[contador][4] = rs.getDouble(5);
                datos[contador][5] = rs.getString(6);
                datos[contador][6] = rs.getDouble(7);
                //datos[contador][6] = rs.getBl(6)

                contador += 1;
            }
        } catch (Exception e) {

        }
//  usa el modelo de tabla creada por el usuario
        fireTableDataChanged();
    }

    public  ImageIcon getImagen(int id) {
        String sql = "SELECT IMAGEN_MAQ FROM MAQUINARIA WHERE CLAVE_MAQ = " + id;
        ImageIcon ic = null;
        InputStream is = null;
        try {
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                is = rs.getBinaryStream(1);
                BufferedImage bi = ImageIO.read(is);
                ic = new ImageIcon(bi);

            }
        } catch (Exception e) {
        }
        return ic;
    }
}

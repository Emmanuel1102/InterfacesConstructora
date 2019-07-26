

import java.awt.*;

import javax.swing.*;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.awt.image.ImageObserver.PROPERTIES;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class AgregarMaquinaria extends JFrame {

    PreparedStatement psd, psd2;
    ModeloTabla_Maquinaria mt = new ModeloTabla_Maquinaria("Adminn", "admin");
    private FileInputStream fis; //Aca se almacena el flujo del archivo
    int longitud_bytes;

    AgregarMaquinaria() {

        setSize(860, 500);
        setTitle("Agregar maquinarias");
        setResizable(false);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel DatosMaquinaria = new JPanel();
        DatosMaquinaria.setLayout(null);
        DatosMaquinaria.setSize(900, 700);
        DatosMaquinaria.setBounds(0, 0, 1800, 900);
        DatosMaquinaria.setBackground(Color.decode("#049cff"));

        ///En este panel se deben poner la imagenes
        JLabel Imagen = new JLabel();
        Imagen.setLayout(null);
        Imagen.setBounds(590, 93, 200, 200);
        Imagen.setBackground(Color.black);
        DatosMaquinaria.add(Imagen);

        JLabel Encabezado = new JLabel("Agregar datos de la maquinaría:");
        Encabezado.setForeground(Color.white);
        Font fuente = new Font("Arial", Font.BOLD, 16);
        Encabezado.setFont(fuente);
        Encabezado.setBounds(349, 0, 300, 70);
        DatosMaquinaria.add(Encabezado);

        JLabel NombreMaquina = new JLabel("Nombre de la máquina:");
        NombreMaquina.setForeground(Color.white);
        Font fuenteMaquina = new Font("Arial", Font.BOLD, 14);
        NombreMaquina.setFont(fuenteMaquina);
        NombreMaquina.setBounds(0, 30, 300, 150);
        DatosMaquinaria.add(NombreMaquina);

        JTextField NombreMaquinatxt = new JTextField("");
        NombreMaquinatxt.setForeground(Color.black);
        NombreMaquinatxt.setBorder(null);
        NombreMaquinatxt.setBounds(163, 92, 200, 30);
        DatosMaquinaria.add(NombreMaquinatxt);

        JLabel Modelo = new JLabel("Modelo de la máquina:");
        Modelo.setForeground(Color.white);
        Font fuenteModelo = new Font("Arial", Font.BOLD, 14);
        Modelo.setFont(fuenteModelo);
        Modelo.setBounds(0, 75, 300, 150);
        DatosMaquinaria.add(Modelo);

        CampoDato Modelotxt = new CampoDato();
        Modelotxt.setForeground(Color.black);
        Modelotxt.setBorder(null);
        Modelotxt.setBounds(164, 140, 200, 30);
        Modelotxt.setTipo('E');
        Modelotxt.setLongitud(15);
        DatosMaquinaria.add(Modelotxt);

        JLabel Tipo = new JLabel("Tipo de máquina:");
        Tipo.setForeground(Color.white);
        Font fuenteTipo = new Font("Arial", Font.BOLD, 14);
        Tipo.setFont(fuenteTipo);
        Tipo.setBounds(0, 125, 300, 150);
        DatosMaquinaria.add(Tipo);

        String[] tiposMaquinas = {"Excavadora", "Revolvedora", "Volteo"};
        JComboBox TipoCombo = new JComboBox(tiposMaquinas);
        TipoCombo.setForeground(Color.black);
        TipoCombo.setBorder(null);
        TipoCombo.setBounds(161, 190, 200, 30);
        DatosMaquinaria.add(TipoCombo);

        JLabel Costo = new JLabel("Costo:");
        Costo.setForeground(Color.white);
        Font fuenteCosto = new Font("Arial", Font.BOLD, 14);
        Costo.setFont(fuenteCosto);
        Costo.setBounds(0, 170, 300, 150);
        DatosMaquinaria.add(Costo);

        CampoDato CostoTxt = new CampoDato();
        CostoTxt.setForeground(Color.black);
        CostoTxt.setBorder(null);
        CostoTxt.setBounds(161, 238, 200, 30);
        CostoTxt.setTipo('D');
        CostoTxt.setLongitud(15);
        DatosMaquinaria.add(CostoTxt);

        JLabel Matricula = new JLabel("Matricula:");
        Matricula.setForeground(Color.white);
        Font fuenteMatricula = new Font("Arial", Font.BOLD, 14);
        Matricula.setFont(fuenteMatricula);
        Matricula.setBounds(0, 220, 300, 150);
        DatosMaquinaria.add(Matricula);

        JTextField MatriculaTxt = new JTextField();
        MatriculaTxt.setForeground(Color.black);
        MatriculaTxt.setBorder(null);
        MatriculaTxt.setBounds(161, 290, 200, 30);
        DatosMaquinaria.add(MatriculaTxt);

        JLabel precio_renta = new JLabel("Precio Renta:");
        precio_renta.setForeground(Color.white);
        Font fuenteMarca = new Font("Arial", Font.BOLD, 14);
        precio_renta.setFont(fuenteMarca);
        precio_renta.setBounds(0, 270, 300, 150);
        DatosMaquinaria.add(precio_renta);

        CampoDato precio_rentaTxt = new CampoDato();
        precio_rentaTxt.setForeground(Color.black);
        precio_rentaTxt.setBorder(null);
        precio_rentaTxt.setTipo('D');
        precio_rentaTxt.setLongitud(15);
        precio_rentaTxt.setBounds(161, 334, 200, 30);
        DatosMaquinaria.add(precio_rentaTxt);

        ///////        // En esta parte van los estados, los que deben ser: EN USO, DISPONIBLE y MANTENIMIENTO
        JLabel EstadoMaquinaAgregar = new JLabel(" Estado: ");
        EstadoMaquinaAgregar.setForeground(Color.WHITE);
        Font fuenteMaquinaC = new Font(" Arial ", Font.BOLD, 14);
        EstadoMaquinaAgregar.setFont(fuenteMaquinaC);
        EstadoMaquinaAgregar.setBounds(375, 30, 300, 30);
        DatosMaquinaria.add(EstadoMaquinaAgregar);

        String tiposEstados[] = {" EN USO ", " DISPONIBLE ", " MANTENIMIENTO "};
        JComboBox EstadoMaquinatxtAgregar = new JComboBox(tiposEstados);
        EstadoMaquinatxtAgregar.setForeground(Color.BLACK);
        EstadoMaquinatxtAgregar.setBorder(null);
        EstadoMaquinatxtAgregar.setBounds(427, 92, 150, 30);
        DatosMaquinaria.add(EstadoMaquinatxtAgregar);

     
        ///////Botones
        JButton AgregarMaquina = new JButton("Agregar maquinaría");
        AgregarMaquina.setBackground(Color.decode("#049cff"));
        AgregarMaquina.setBounds(350, 400, 210, 50);
        AgregarMaquina.setBorder(new ComponenteBotonRedondo(40));
        AgregarMaquina.setForeground(Color.black);
        DatosMaquinaria.add(AgregarMaquina);
        AgregarMaquina.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                String nombre = NombreMaquinatxt.getText();
                int modelo = Integer.parseInt(Modelotxt.getText());
                String tipo = (String) TipoCombo.getSelectedItem();
                double costo = Integer.parseInt(CostoTxt.getText());
                String matricula = MatriculaTxt.getText();
                //String marca = .getText();
                String estado = EstadoMaquinatxtAgregar.getSelectedItem().toString();
                double precio_renta = Double.parseDouble(precio_rentaTxt.getText());
               
                try {
                    Connection cn;
                    cn = getConexion();
                    psd = cn.prepareStatement("INSERT INTO MAQUINARIA (NOMBRE_MAQ,TIPO_MAQ,MODELO_MAQ,COSTO_MAQ,ESTADO_MAQ,PRECIORENTA_MAQ,MATRICULA_MAQ,IMAGEN_MAQ) VALUES(?,?,?,?,?,?,?,?)");
                    psd.setString(1, nombre);
                    psd.setString(2, tipo);
                    psd.setInt(3, modelo);
                    psd.setDouble(4, costo);
                    psd.setString(5, estado);
                    psd.setDouble(6, precio_renta);
                    psd.setString(7, matricula);
                    psd.setBlob(8, fis, getLongitud());
                    int res = psd.executeUpdate();
                    
                   if (res < 0) {
                        JOptionPane.showMessageDialog(null, "No se pudo añadir el registro");
                    }
                    JOptionPane.showMessageDialog(null, "Registro Exitoso");
                    cn.close();
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    mt.actualizaEstatus();
                } catch (SQLException e) {
                    System.err.println("Error en: " + e);
                }

                mt.actualizaEstatus();
                dispose();
            }
            

        });

        JButton AgregarFoto = new JButton("Agregar foto");
        AgregarFoto.setBackground(Color.decode("#049cff"));
        AgregarFoto.setBounds(610, 330, 210, 50);
        AgregarFoto.setBorder(new ComponenteBotonRedondo(40));
        AgregarFoto.setForeground(Color.black);
        DatosMaquinaria.add(AgregarFoto);

        AgregarFoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int estado = jfc.showOpenDialog(null);
                if (estado == JFileChooser.APPROVE_OPTION) {
                    try {
                        fis = new FileInputStream(jfc.getSelectedFile());
                        longitud_bytes = (int) jfc.getSelectedFile().length();

                        Image icono = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT);
                        Imagen.setIcon(new ImageIcon(icono));
                        Imagen.updateUI();

                        setLongitud(longitud_bytes);
                    } catch (Exception ee) {
                    }
                }

            }
        });

        JLabel background = new JLabel();
        background.add(DatosMaquinaria);
        add(background);
        setVisible(true);

    }

    public static void main(String[] args) {
        new AgregarMaquinaria();
    }

    public Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conexion = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/Constructora", "Adminn", "admin");
            System.out.println("Se concecto Correctamente ");

        } catch (Exception e) {
            System.err.println("Hubo un error en la instalacion " + e);
        }
        return conexion;

    }
    
    public void setLongitud(int longi){
        longitud_bytes=longi;
    }
    public int getLongitud(){
        return longitud_bytes;
    }
}

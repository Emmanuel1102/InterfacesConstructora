import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EditarCliente extends JFrame {

    PreparedStatement psd;

    // Se realiza la conexión a la BDD 
    public Connection getConexion() {
        Connection conexion = null;
        try {

            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conexion = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/Construct", "Adminn", "Admin");
           // JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (Exception e) {
            System.out.println(e);
        }
        return conexion;
    }

    // Método para generar los Jpanel y TextField, corrrespondientes 

    EditarCliente() {

        setSize(900, 600);
        setTitle("Editar clientes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        JPanel Clientes = new JPanel();
        Clientes.setLayout(null);
        Clientes.setSize(900, 768);
        Clientes.setBackground(Color.black);

        JLabel anuncio = new JLabel("Editar datos de los clientes:");
        anuncio.setForeground(Color.decode("#049cff"));
        Font fuente = new Font("Arial Black", Font.BOLD, 20);
        anuncio.setFont(fuente);
        anuncio.setBounds(400, 0, 400, 70);
        Clientes.add(anuncio);

        JLabel nombresResponsable = new JLabel("Nombre(s):");
        nombresResponsable.setForeground(Color.white);
        Font fuenteResponsables = new Font("Arial", Font.BOLD, 20);
        nombresResponsable.setFont(fuenteResponsables);
        nombresResponsable.setBounds(0, 30, 280, 230);
        Clientes.add(nombresResponsable);

        CampoDato NombreResponsabletxt = new CampoDato();
        NombreResponsabletxt.setForeground(Color.black);
        NombreResponsabletxt.setBounds(128, 135, 375, 30);
        NombreResponsabletxt.setBorder(null);
        NombreResponsabletxt.setTipo('T');
        NombreResponsabletxt.setLongitud(20);
        Clientes.add(NombreResponsabletxt);

        // Boton BUSCAR para realizar las consultas en la BDD
        JButton Buscar = new JButton("Bsucar");
        Buscar.setBackground(Color.black);
        Buscar.setBorder(new ComponenteBotonRedondo(40));
        Buscar.setForeground(Color.decode("#049cff"));
        Buscar.setBounds(538, 125, 125, 40);
        Clientes.add(Buscar);

        JLabel Telefono = new JLabel("Télefono:");
        Telefono.setForeground(Color.white);
        Font fuenteTelefono = new Font("Arial", Font.BOLD, 20);
        Telefono.setFont(fuenteTelefono);
        Telefono.setBounds(0, 70, 200, 230);
        Clientes.add(Telefono);

        CampoDato Telefonotxt = new CampoDato();
        Telefonotxt.setForeground(Color.black);
        Telefonotxt.setBounds(128, 176, 200, 30);
        Telefonotxt.setBorder(null);
        Telefonotxt.setTipo('E');
        Telefonotxt.setLongitud(9);
        Clientes.add(Telefonotxt);

        JLabel Correo = new JLabel("E-mail:");
        Correo.setForeground(Color.white);
        Font fuenteCorreo = new Font("Arial", Font.BOLD, 20);
        Correo.setFont(fuenteCorreo);
        Correo.setBounds(435, 113, 260, 150);
        Clientes.add(Correo);

        JTextField Correotxt = new JTextField("");
        Correotxt.setForeground(Color.black);
        Correotxt.setBounds(502, 178, 200, 30);
        Correotxt.setBorder(null);
        Clientes.add(Correotxt);

        JLabel Domicilio = new JLabel("Datos domiciliarios:");
        Domicilio.setForeground(Color.decode("#049cff"));
        Font fuenteDomicilio = new Font("Arial Black", Font.BOLD, 20);
        Domicilio.setFont(fuenteDomicilio);
        Domicilio.setBounds(410, 100, 300, 300);
        Clientes.add(Domicilio);

        JLabel Calle = new JLabel("Calle:");
        Calle.setForeground(Color.white);
        Font fontCalle = new Font("Arial", Font.BOLD, 20);
        Calle.setFont(fontCalle);
        Calle.setBounds(0, 166, 300, 300);
        Clientes.add(Calle);

        CampoDato Calletxt = new CampoDato();
        Calletxt.setForeground(Color.black);
        Calletxt.setBounds(130, 300, 200, 30);
        Calletxt.setBorder(null);
        Calletxt.setTipo('T');
        Calletxt.setLongitud(30);
        Clientes.add(Calletxt);

        JLabel Numero = new JLabel("Número:");
        Numero.setForeground(Color.white);
        Font fontNumero = new Font("Arial", Font.BOLD, 20);
        Numero.setFont(fontNumero);
        Numero.setBounds(418, 166, 300, 300);
        Clientes.add(Numero);

        CampoDato Numtxt = new CampoDato();
        Numtxt.setForeground(Color.black);
        Numtxt.setBounds(503, 300, 40, 30);
        Numtxt.setBorder(null);
        Numtxt.setTipo('E');
        Numtxt.setLongitud(2);
        Clientes.add(Numtxt);

        JLabel colonia = new JLabel("Colonia:");
        colonia.setForeground(Color.white);
        Font fontColonia = new Font("Arial", Font.BOLD, 20);
        colonia.setFont(fontColonia);
        colonia.setBounds(588, 166, 300, 300);
        Clientes.add(colonia);

        CampoDato Coltxt = new CampoDato();
        Coltxt.setForeground(Color.black);
        Coltxt.setBounds(670, 300, 200, 30);
        Coltxt.setBorder(null);
        Coltxt.setTipo('T');
        Coltxt.setLongitud(30);
        Clientes.add(Coltxt);

        JLabel Municipio = new JLabel("Municipio:");
        Municipio.setForeground(Color.white);
        Font fontMunicipio = new Font("Arial", Font.BOLD, 20);
        Municipio.setFont(fontMunicipio);
        Municipio.setBounds(0, 210, 300, 300);
        Clientes.add(Municipio);

        //JComboBox Municipiotxt = new JComboBox();
        CampoDato Municipiotxt = new CampoDato();
        Municipiotxt.setForeground(Color.black);
        Municipiotxt.setBounds(128, 350, 200, 30);
        Municipiotxt.setBorder(null);
        Municipiotxt.setTipo('T');
        Municipiotxt.setLongitud(30);
        Clientes.add(Municipiotxt);

        JLabel Estado = new JLabel("Estado:");
        Estado.setForeground(Color.white);
        Font fontEstado = new Font("Arial", Font.BOLD, 20);
        Estado.setFont(fontEstado);
        Estado.setBounds(427, 210, 100, 300);
        Clientes.add(Estado);

        CampoDato Estadotxt = new CampoDato();
        Estadotxt.setForeground(Color.black);
        Estadotxt.setBounds(503, 350, 200, 30);
        Estadotxt.setBorder(null);
        Estadotxt.setTipo('T');
        Estadotxt.setLongitud(30);
        Clientes.add(Estadotxt);

        JButton Agregar = new JButton("Guardar cambios");
        Agregar.setBackground(Color.black);
        Agregar.setBorder(new ComponenteBotonRedondo(40));
        Agregar.setForeground(Color.decode("#049cff"));
        Agregar.setBounds(410, 430, 250, 50);
        Clientes.add(Agregar);

        // Función que se le otorga al boton, siendo guardar los datos en la BDD 
        Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection cn;

                    cn = getConexion();

                    // Para modificar uno o varios datos de uno o varios registros utilizamos "update" (actualizar).  
                    psd = cn.prepareStatement("UPDATE CLIENTE SET NOMBRE_CLIENTE=?,NUMERO_CALLE=?,CALLE=?,COLONIA=?,MUNICIPIO=?,ESTADO=?,CORREO=?,TELEFONO=? WHERE NOMBRE_CLIENTE=?");

                    psd.setString(1, NombreResponsabletxt.getText());
                    psd.setString(2, Numtxt.getText());
                    psd.setString(3, Calletxt.getText());
                    psd.setString(4, Coltxt.getText());
                    psd.setString(5, Municipiotxt.getText());
                    psd.setString(6, Estadotxt.getText());
                    psd.setString(7, Correotxt.getText());
                    psd.setString(8, Telefonotxt.getText());
                    psd.setString(9, NombreResponsabletxt.getText());

                    int res = psd.executeUpdate();
                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Registro Modificado");

                    } else {
                        JOptionPane.showMessageDialog(null, "Error al Modificar Registro");
                    }
                    cn.close();
                } catch (SQLException ex) {
                    System.err.println("Error en: " + ex);
                }

            }
        });
        /* Función para el boton bsucar, este boton tiene la funcion de hacer la búsqueda en la BDD
         tiene como objetivo buscar de acuerdo al atributo nombre, en este caso es el nombre del cliente.
         */

        Buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection cn = null;
                try {

                    cn = getConexion();

                    // Se realian las consultas en la BDD
                    psd = cn.prepareStatement("SELECT * FROM CLIENTE WHERE NOMBRE_CLIENTE =?");
                    psd.setString(1, NombreResponsabletxt.getText());

                    ResultSet res = psd.executeQuery();

                    if (res.next()) {
                        Numtxt.setText(res.getString("NUMERO_CALLE"));
                        Calletxt.setText(res.getString("CALLE"));
                        Coltxt.setText(res.getString("COLONIA"));
                        Municipiotxt.setText(res.getString("MUNICIPIO"));
                        Estadotxt.setText(res.getString("ESTADO"));
                        Correotxt.setText(res.getString("CORREO"));
                        Telefonotxt.setText(res.getString("TELEFONO"));

                    } else {
                        JOptionPane.showMessageDialog(null, "No existe un registro con el nombre de: "+NombreResponsabletxt.getText());

                    }

                } catch (SQLException ex) {
                    System.err.println("Error en: " + ex);
                }

            }
        });

        JLabel background = new JLabel();

        background.add(Clientes);

        add(background);

        setVisible(true);

    }

    public static void main(String[] args) {

        new EditarCliente();
    }

}

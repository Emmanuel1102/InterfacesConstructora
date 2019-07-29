
import java.awt.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginOriginal extends JFrame {

    String usua, contrasenia, correo_e;

    LoginOriginal() {
        /// Atributos básicos de la ventana 
        setSize(1366, 768);
        setTitle("Sistema de gestión de maquinaría");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        /////Panel de arriba (Cabecera) que ayuda a mejor distribucion
        JPanel cabecera;
        cabecera = new JPanel();
        cabecera.setBackground(new Color(0, 0, 0, 0));
        cabecera.setBounds(0, 0, 1366, 150);
        ////Panel donde se colocaran partes del login
        JPanel login = new JPanel();
        login.setLayout(null);
        login.setSize(400, 350);
        login.setBackground(Color.black);
        login.setBounds(260, 150, 366, 480);

        ///Etiquetas 
        JLabel usuarioEtiqueta = new JLabel("Ingresa tu nombre de usuario:");
        usuarioEtiqueta.setForeground(Color.decode("#049cff"));
        usuarioEtiqueta.setBounds(100, 50, 300, 50);

        JLabel contraseñaEtiqueta = new JLabel("Ingresa tu contraseña:");
        contraseñaEtiqueta.setForeground(Color.decode("#049cff"));
        contraseñaEtiqueta.setBounds(120, 180, 300, 50);

        //TextField (entradas de texto)
        JTextField usuario = new JTextField("Ingresa tu usuario");
        usuario.setForeground(Color.white);
        usuario.setBounds(35, 100, 300, 50);
        usuario.setBackground(Color.black);
        login.add(usuario);
        login.add(usuarioEtiqueta);
        usuario.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                //selecciona el texto al dar click
                usuario.selectAll();
            }

            @Override
            public void focusLost(FocusEvent fe) {
            }
        });

        JTextField contraseña = new JPasswordField("Ingresa tu contraseña");
        contraseña.setForeground(Color.white);
        contraseña.setBounds(35, 230, 300, 50);
        contraseña.setBackground(Color.black);
        login.add(contraseña);
        login.add(contraseñaEtiqueta);
        contraseña.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                //selecciona el texto al dar click
                contraseña.selectAll();
            }

            @Override
            public void focusLost(FocusEvent fe) {
            }
        });

        ////botones
        JButton entrar = new JButton("Ingresar");
        entrar.setBackground(Color.black);
        entrar.setBounds(110, 350, 150, 50);
        entrar.setBorder(new ComponenteBotonRedondo(40));
        entrar.setForeground(Color.decode("#049cff"));
        login.add(entrar);

        JButton Recuperar = new JButton("¿Perdiste tu contraseña? Recuperala aqui");
        Recuperar.setBackground(Color.black);
        Recuperar.setBounds(35, 420, 296, 50);
        Recuperar.setBorder(null);
        Recuperar.setForeground(Color.decode("#049cff"));
        login.add(Recuperar);
        Recuperar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Recuperador r = new Recuperador();
                r.setVisible(true);
                dispose();
            }

        });

        ImageIcon background_image = new ImageIcon("C:\\Users\\Bayer\\Pictures\\InterfacesConstructora-master\\neoo3.jpg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);

        background.add(login);
        background.add(cabecera);
        background.setBounds(0, 0, 1366, 768);
        add(background);

        setVisible(true);

        JLabel mensaje_error = new JLabel();
        mensaje_error.setBounds(35, 160, 300, 30);
        login.add(mensaje_error);
        JLabel contrasenia_error = new JLabel();
        contrasenia_error.setBounds(35, 290, 300, 30);
        login.add(contrasenia_error);
        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = usuario.getText();
                try {
                    Connection cn = getConexion();
                    Statement stmn = cn.createStatement();
                    ResultSet rs = stmn.executeQuery("SELECT*FROM Usuario WHERE USUARIOO ='" + user + "'");
                    rs.next();
                    usua = rs.getString("USUARIOO");
                    contrasenia = rs.getString("PASWORD");
                    correo_e = rs.getString("CORREO");
                    if (usuario.getText().equalsIgnoreCase(usua)) {
                        if (contraseña.getText().equals(contrasenia)) {
                            JOptionPane.showMessageDialog(null, "Presiona Aceptar para continuar");
                            PrincipalOriginal p = new PrincipalOriginal();
                            p.setVisible(true);
                            dispose();
                        } else {
                            contrasenia_error.setText("Contraseña Incorrecta! Intentelo de nuevo");
                            contrasenia_error.setFont(new Font("Arial", Font.BOLD, 15));
                            contrasenia_error.setForeground(Color.RED);
                        }
                    } else {
                        mensaje_error.setText("Usuario incorrecto  o Registre uno nuevo");
                        mensaje_error.setFont(new Font("Arial", Font.BOLD, 15));
                        mensaje_error.setForeground(Color.RED);
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Usuario y Contraseña son Incorrectos");
                    mensaje_error.setText("");
                    contrasenia_error.setText("");
                }

            }
        });
        contraseña.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String user = usuario.getText();
                    try {
                        Connection cn = getConexion();
                        Statement stmn = cn.createStatement();
                        ResultSet rs = stmn.executeQuery("SELECT*FROM Usuario WHERE USUARIOO ='" + user + "'");
                        rs.next();
                        usua = rs.getString("USUARIOO");
                        contrasenia = rs.getString("PASWORD");
                        correo_e = rs.getString("CORREO");
                        if (usuario.getText().equalsIgnoreCase(usua)) {
                            if (contraseña.getText().equals(contrasenia)) {
                               
                                PrincipalOriginal p = new PrincipalOriginal();
                                p.setVisible(true);
                                dispose();
                            } else {
                                contrasenia_error.setText("Contraseña Incorrecta! Intentelo de nuevo");
                                contrasenia_error.setFont(new Font("Arial", Font.BOLD, 15));
                                contrasenia_error.setForeground(Color.RED);
                            }
                        } else {
                            mensaje_error.setText("Usuario incorrecto  o Registre uno nuevo");
                            mensaje_error.setFont(new Font("Arial", Font.BOLD, 15));
                            mensaje_error.setForeground(Color.RED);
                        }
                        

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Usuario y Contraseña son Incorrectos");
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    System.exit(0);
                }
            }
        });

    }

    public static void main(String[] args) {
        new LoginOriginal();
    }

    public static Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://ns64.hostgator.mx:3306/dirtycod_constructora?autoReconnect=true&useSSL=false", "dirtycod_dirty", "dirtycode");
            System.out.println("Se concecto Correctamente ");
        } catch (Exception e) {
            System.err.println("Hubo un error en la instalacion " + e);
        }
        return conexion;
    }
}

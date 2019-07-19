import java.awt.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginOriginal extends JFrame {

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

        ImageIcon background_image = new ImageIcon("C:\\Users\\Adan Sanchez\\Documents\\NetBeansProjects\\Fun_Ing_Soft\\src\\InterfacesConstructora\\neo3.jpg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);

        background.add(login);
        background.add(cabecera);
        background.setBounds(0, 0, 1366, 768);
        add(background);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginOriginal();
    }

}

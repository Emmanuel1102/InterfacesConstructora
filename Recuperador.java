
import java.awt.*;

import javax.swing.*;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Recuperador extends JFrame {

    Recuperador() {

        setSize(500, 500);
        setTitle("Recuperación de contraseña");
        setResizable(false);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel Recuperacion = new JPanel();
        Recuperacion.setLayout(null);
        Recuperacion.setSize(200, 350);
        Recuperacion.setBackground(Color.black);
        Recuperacion.setBounds(90, 0, 300, 500);

        JLabel etiquetaAviso;
        etiquetaAviso = new JLabel("Modo recuperación de contraseña:");
        etiquetaAviso.setForeground(Color.white);
        etiquetaAviso.setBounds(60, 20, 400, 50);
        Recuperacion.add(etiquetaAviso);

        JLabel etiquetaEscribir;
        etiquetaEscribir = new JLabel("Por favor, escriba su correo empresarial aquí:");
        etiquetaEscribir.setForeground(Color.decode("#049cff"));
        etiquetaEscribir.setBounds(20, 130, 400, 50);
        Recuperacion.add(etiquetaEscribir);

        JTextField CampoCorreo;
        CampoCorreo = new JTextField("Escriba el correo aquí");
        CampoCorreo.setBounds(20, 190, 265, 50);
        CampoCorreo.setForeground(Color.white);
        CampoCorreo.setBackground(Color.black);
        Recuperacion.add(CampoCorreo);

        JButton Enviar = new JButton("Enviar");
        Enviar.setBackground(Color.black);
        Enviar.setBounds(75, 310, 150, 50);
        Enviar.setBorder(new ComponenteBotonRedondo(40));
        Enviar.setForeground(Color.decode("#049cff"));
        Recuperacion.add(Enviar);

        ImageIcon background_image = new ImageIcon("C:\\Users\\Adan Sanchez\\Documents\\NetBeansProjects\\Fun_Ing_Soft\\src\\InterfacesConstructora\\neo3.jpg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);

        background.add(Recuperacion);
        background.setBounds(0, 0, 700, 700);
        add(background);

        setVisible(true);

    }

    public static void main(String[] args) {

        new Recuperador();
    }

}

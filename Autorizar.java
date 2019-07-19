
import java.awt.*;

import javax.swing.*;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Autorizar extends JFrame {

    Autorizar() {
        setSize(683, 500);
        setTitle("Autorizar renta");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        JPanel Autorizar = new JPanel();
        Autorizar.setLayout(null);
        Autorizar.setSize(683, 500);
        Autorizar.setBackground(Color.decode("#049cff"));

        JLabel anuncio = new JLabel("Autorizar renta de maquinaria:");
        anuncio.setForeground(Color.white);
        Font fuente = new Font("Arial", Font.BOLD, 16);
        anuncio.setFont(fuente);
        anuncio.setBounds(250, 0, 300, 70);
        Autorizar.add(anuncio);

        JLabel persona = new JLabel("Nombre de la persona que autoriza:");
        persona.setForeground(Color.white);
        Font fuenteEmpresa = new Font("Arial", Font.BOLD, 14);
        persona.setFont(fuenteEmpresa);
        persona.setBounds(0, 0, 300, 150);
        Autorizar.add(persona);

        JTextField personatxt = new JTextField("");
        personatxt.setForeground(Color.black);
        personatxt.setBorder(null);
        personatxt.setBounds(336, 63, 200, 30);
        Autorizar.add(personatxt);

        JLabel Correopersona = new JLabel("Correo eléctronico de la persona que autoriza:");
        Correopersona.setForeground(Color.white);
        Font fuenteCorreo = new Font("Arial", Font.BOLD, 14);
        Correopersona.setFont(fuenteCorreo);
        Correopersona.setBounds(0, 54, 400, 150);
        Autorizar.add(Correopersona);

        JTextField Correopersonatxt = new JTextField("");
        Correopersonatxt.setForeground(Color.black);
        Correopersonatxt.setBorder(null);
        Correopersonatxt.setBounds(336, 120, 200, 30);
        Autorizar.add(Correopersonatxt);

        JLabel CorreoDestino = new JLabel("Correo eléctronico del destinatario:");
        CorreoDestino.setForeground(Color.white);
        Font Destino = new Font("Arial", Font.BOLD, 14);
        CorreoDestino.setFont(Destino);
        CorreoDestino.setBounds(0, 104, 400, 150);
        Autorizar.add(CorreoDestino);

        JTextField CorreoDestinotxt = new JTextField("");
        CorreoDestinotxt.setForeground(Color.black);
        CorreoDestinotxt.setBorder(null);
        CorreoDestinotxt.setBounds(336, 170, 200, 30);
        Autorizar.add(CorreoDestinotxt);

        JLabel CampoB = new JLabel("Escriba en el espacio en blanco la información necesaria:");
        CampoB.setForeground(Color.black);
        Font CampoBlanco = new Font("Arial", Font.BOLD, 14);
        CampoB.setFont(CampoBlanco);
        CampoB.setBounds(150, 150, 500, 150);
        Autorizar.add(CampoB);

        JTextArea Campotxt = new JTextArea();
        Campotxt.setSize(650, 130);
        Campotxt.setLineWrap(true);
        Campotxt.setForeground(Color.black);
        Campotxt.setBorder(null);
        Campotxt.setBounds(10, 240, 650, 130);
        Autorizar.add(Campotxt);

        JButton Enviar = new JButton("Enviar");
        Enviar.setBackground(Color.decode("#049cff"));
        //entrar.setBounds(110, 350, 150, 50);
        Enviar.setBorder(new ComponenteBotonRedondo(40));
        Enviar.setForeground(Color.black);
        Enviar.setBounds(250, 400, 200, 50);
        Autorizar.add(Enviar);

        JLabel background = new JLabel();

        background.add(Autorizar);
        add(background);

        setVisible(true);

    }

    public static void main(String[] args) {

        new Autorizar();

    }

}

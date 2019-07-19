
import java.awt.*;

import javax.swing.*;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class EditarCliente extends JFrame {

    EditarCliente() {

        setSize(683, 500);
        setTitle("Editar clientes");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        JPanel Clientes = new JPanel();
        Clientes.setLayout(null);
        Clientes.setSize(1600, 768);
        Clientes.setBackground(Color.black);

        JLabel anuncio = new JLabel("Editar datos de los clientes:");
        anuncio.setForeground(Color.decode("#049cff"));
        Font fuente = new Font("Arial", Font.BOLD, 16);
        anuncio.setFont(fuente);
        anuncio.setBounds(250, 0, 300, 70);
        Clientes.add(anuncio);

        JLabel empresa = new JLabel("Nombre de la empresa:");
        empresa.setForeground(Color.white);
        Font fuenteEmpresa = new Font("Arial", Font.BOLD, 14);
        empresa.setFont(fuenteEmpresa);
        empresa.setBounds(0, 0, 300, 150);
        Clientes.add(empresa);

        JTextField empresatxt = new JTextField("");
        empresatxt.setForeground(Color.black);
        empresatxt.setBorder(null);
        empresatxt.setBounds(170, 63, 200, 30);
        Clientes.add(empresatxt);

        JLabel nombreResponsable = new JLabel("Información cliente:");
        nombreResponsable.setForeground(Color.black);
        Font fuenteResponsable = new Font("Arial", Font.BOLD, 14);
        nombreResponsable.setFont(fuenteResponsable);
        nombreResponsable.setBounds(260, 0, 280, 230);
        Clientes.add(nombreResponsable);

        JLabel nombresResponsable = new JLabel("Nombres:");
        nombresResponsable.setForeground(Color.white);
        Font fuenteResponsables = new Font("Arial", Font.BOLD, 14);
        nombresResponsable.setFont(fuenteResponsables);
        nombresResponsable.setBounds(0, 30, 280, 230);
        Clientes.add(nombresResponsable);

        JTextField NombreResponsabletxt = new JTextField("");
        NombreResponsabletxt.setForeground(Color.black);
        NombreResponsabletxt.setBounds(128, 135, 120, 30);
        NombreResponsabletxt.setBorder(null);
        Clientes.add(NombreResponsabletxt);

        JLabel ApellidoResponsablePaterno = new JLabel("Apellido paterno:");
        ApellidoResponsablePaterno.setForeground(Color.white);
        Font fuenteResponsablesP = new Font("Arial", Font.BOLD, 14);
        ApellidoResponsablePaterno.setFont(fuenteResponsablesP);
        ApellidoResponsablePaterno.setBounds(290, 30, 350, 230);
        Clientes.add(ApellidoResponsablePaterno);

        JTextField ApellidoResponsablePaternotxt = new JTextField("");
        ApellidoResponsablePaternotxt.setForeground(Color.black);
        ApellidoResponsablePaternotxt.setBounds(436, 130, 120, 30);
        ApellidoResponsablePaternotxt.setBorder(null);
        Clientes.add(ApellidoResponsablePaternotxt);

        JLabel ApellidoResponsableMaterno = new JLabel("Apellido materno:");
        ApellidoResponsableMaterno.setForeground(Color.white);
        Font fuenteResponsablesMaterno = new Font("Arial", Font.BOLD, 14);
        ApellidoResponsableMaterno.setFont(fuenteResponsables);
        ApellidoResponsableMaterno.setBounds(0, 70, 280, 230);
        Clientes.add(ApellidoResponsableMaterno);

        JTextField ApellidoResponsableMaternotxt = new JTextField("");
        ApellidoResponsableMaternotxt.setForeground(Color.black);
        ApellidoResponsableMaternotxt.setBounds(128, 176, 120, 30);
        ApellidoResponsableMaternotxt.setBorder(null);
        Clientes.add(ApellidoResponsableMaternotxt);

        JLabel Telefono = new JLabel("Télefono del cliente:");
        Telefono.setForeground(Color.white);
        Font fuenteTelefono = new Font("Arial", Font.BOLD, 14);
        Telefono.setFont(fuenteTelefono);
        Telefono.setBounds(290, 115, 300, 150);
        Clientes.add(Telefono);

        JTextField Telefonotxt = new JTextField("");
        Telefonotxt.setForeground(Color.black);
        Telefonotxt.setBounds(436, 175, 120, 30);
        Telefonotxt.setBorder(null);
        Clientes.add(Telefonotxt);

        JLabel Correo = new JLabel("Correo electrónico del cliente:");
        Correo.setForeground(Color.white);
        Font fuenteCorreo = new Font("Arial", Font.BOLD, 14);
        Correo.setFont(fuenteCorreo);
        Correo.setBounds(0, 155, 280, 150);
        Clientes.add(Correo);

        JTextField Correotxt = new JTextField("");
        Correotxt.setForeground(Color.black);
        Correotxt.setBounds(220, 218, 210, 30);
        Correotxt.setBorder(null);
        Clientes.add(Correotxt);

        JLabel Domicilio = new JLabel("Datos del domicilio del cliente:");
        Domicilio.setForeground(Color.decode("#049cff"));
        Font fuenteDomicilio = new Font("Arial", Font.BOLD, 14);
        Domicilio.setFont(fuenteDomicilio);
        Domicilio.setBounds(225, 137, 300, 300);
        Clientes.add(Domicilio);

        JLabel Calle = new JLabel("Calle:");
        Calle.setForeground(Color.white);
        Font fontCalle = new Font("Arial", Font.BOLD, 14);
        Calle.setFont(fontCalle);
        Calle.setBounds(0, 159, 300, 300);
        Clientes.add(Calle);

        JTextField Calletxt = new JTextField("");
        Calletxt.setForeground(Color.black);
        Calletxt.setBounds(45, 300, 170, 30);
        Calletxt.setBorder(null);
        Clientes.add(Calletxt);

        JLabel Numero = new JLabel("Número:");
        Numero.setForeground(Color.white);
        Font fontNumero = new Font("Arial", Font.BOLD, 14);
        Numero.setFont(fontNumero);
        Numero.setBounds(250, 159, 300, 300);
        Clientes.add(Numero);

        JTextField Numtxt = new JTextField("");
        Numtxt.setForeground(Color.black);
        Numtxt.setBounds(325, 300, 40, 30);
        Numtxt.setBorder(null);
        Clientes.add(Numtxt);

        JLabel colonia = new JLabel("Colonia:");
        colonia.setForeground(Color.white);
        Font fontColonia = new Font("Arial", Font.BOLD, 14);
        colonia.setFont(fontColonia);
        colonia.setBounds(390, 159, 300, 300);
        Clientes.add(colonia);

        JTextField Coltxt = new JTextField();
        Coltxt.setForeground(Color.black);
        Coltxt.setBounds(450, 300, 200, 30);
        Coltxt.setBorder(null);
        Clientes.add(Coltxt);

        JLabel Municipio = new JLabel("Municipio:");
        Municipio.setForeground(Color.white);
        Font fontMunicipio = new Font("Arial", Font.BOLD, 14);
        Municipio.setFont(fontMunicipio);
        Municipio.setBounds(0, 210, 300, 300);
        Clientes.add(Municipio);

        //JComboBox Municipiotxt = new JComboBox();
        JTextField Municipiotxt = new JTextField();
        Municipiotxt.setForeground(Color.black);
        Municipiotxt.setBounds(75, 350, 200, 30);
        Municipiotxt.setBorder(null);
        Clientes.add(Municipiotxt);

        JLabel Estado = new JLabel("Estado:");
        Estado.setForeground(Color.white);
        Font fontEstado = new Font("Arial", Font.BOLD, 14);
        Estado.setFont(fontEstado);
        Estado.setBounds(300, 210, 100, 300);
        Clientes.add(Estado);

        JTextField Estadotxt = new JTextField();
        Estadotxt.setForeground(Color.black);
        Estadotxt.setBounds(355, 350, 170, 30);
        Estadotxt.setBorder(null);
        Clientes.add(Estadotxt);

        JButton Agregar = new JButton("Agregar cliente");
        Agregar.setBackground(Color.black);
        //entrar.setBounds(110, 350, 150, 50);
        Agregar.setBorder(new ComponenteBotonRedondo(40));
        Agregar.setForeground(Color.decode("#049cff"));
        Agregar.setBounds(250, 400, 200, 50);
        Clientes.add(Agregar);

        JLabel background = new JLabel();

        background.add(Clientes);

        add(background);

        setVisible(true);

    }

    public static void main(String[] args) {

        new EditarCliente();
    }

}

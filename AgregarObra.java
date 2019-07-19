
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

import com.toedter.calendar.JCalendar;

public class AgregarObra extends JFrame {

    AgregarObra() {

        setSize(1366, 768);
        setTitle("Agregar obras");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        JPanel DatosObras = new JPanel();
        DatosObras.setLayout(null);
        DatosObras.setSize(1366, 384);
        DatosObras.setBackground(new Color(0, 0, 0, 0));

        JLabel anuncio = new JLabel("Agregar datos de la obra:");
        anuncio.setForeground(Color.white);
        Font fuente = new Font("Arial", Font.BOLD, 16);
        anuncio.setFont(fuente);
        anuncio.setBounds(550, 0, 300, 70);
        DatosObras.add(anuncio);

        JLabel empresa = new JLabel("Nombre de la empresa:");
        empresa.setForeground(Color.white);
        Font fuenteEmpresa = new Font("Arial", Font.BOLD, 14);
        empresa.setFont(fuenteEmpresa);
        empresa.setBounds(0, 0, 300, 150);
        DatosObras.add(empresa);

        JTextField empresatxt = new JTextField("");
        empresatxt.setForeground(Color.black);
        empresatxt.setBorder(null);
        empresatxt.setBounds(170, 63, 200, 30);
        DatosObras.add(empresatxt);
        ////////////
        JLabel nombreResponsable = new JLabel("Nombre del responsable de la obra:");
        nombreResponsable.setForeground(Color.black);
        Font fuenteResponsable = new Font("Arial", Font.BOLD, 14);
        nombreResponsable.setFont(fuenteResponsable);
        nombreResponsable.setBounds(0, 0, 280, 230);
        DatosObras.add(nombreResponsable);

        JLabel nombresResponsable = new JLabel("Nombres:");
        nombresResponsable.setForeground(Color.white);
        Font fuenteResponsables = new Font("Arial", Font.BOLD, 14);
        nombresResponsable.setFont(fuenteResponsables);
        nombresResponsable.setBounds(0, 30, 280, 230);
        DatosObras.add(nombresResponsable);

        JTextField NombreResponsabletxt = new JTextField("");
        NombreResponsabletxt.setForeground(Color.black);
        NombreResponsabletxt.setBounds(69, 135, 120, 30);
        NombreResponsabletxt.setBorder(null);
        DatosObras.add(NombreResponsabletxt);

        JLabel ApellidoResponsablePaterno = new JLabel("Apellido paterno:");
        ApellidoResponsablePaterno.setForeground(Color.white);
        Font fuenteResponsablesP = new Font("Arial", Font.BOLD, 14);
        ApellidoResponsablePaterno.setFont(fuenteResponsablesP);
        ApellidoResponsablePaterno.setBounds(200, 30, 350, 230);
        DatosObras.add(ApellidoResponsablePaterno);

        JTextField ApellidoResponsablePaternotxt = new JTextField("");
        ApellidoResponsablePaternotxt.setForeground(Color.black);
        ApellidoResponsablePaternotxt.setBounds(322, 135, 120, 30);
        ApellidoResponsablePaternotxt.setBorder(null);
        DatosObras.add(ApellidoResponsablePaternotxt);

        JLabel ApellidoResponsableMaterno = new JLabel("Apellido materno:");
        ApellidoResponsableMaterno.setForeground(Color.white);
        Font fuenteResponsablesMaterno = new Font("Arial", Font.BOLD, 14);
        ApellidoResponsableMaterno.setFont(fuenteResponsables);
        ApellidoResponsableMaterno.setBounds(0, 70, 280, 230);
        DatosObras.add(ApellidoResponsableMaterno);

        JTextField ApellidoResponsableMaternotxt = new JTextField("");
        ApellidoResponsableMaternotxt.setForeground(Color.black);
        ApellidoResponsableMaternotxt.setBounds(128, 175, 120, 30);
        ApellidoResponsableMaternotxt.setBorder(null);
        DatosObras.add(ApellidoResponsableMaternotxt);

        //////////////////////////
        JLabel Telefono = new JLabel("Télefono del responsable:");
        Telefono.setForeground(Color.white);
        Font fuenteTelefono = new Font("Arial", Font.BOLD, 14);
        Telefono.setFont(fuenteTelefono);
        Telefono.setBounds(510, 0, 300, 150);
        DatosObras.add(Telefono);

        JTextField Telefonotxt = new JTextField("");
        Telefonotxt.setForeground(Color.black);
        Telefonotxt.setBounds(700, 62, 110, 30);
        Telefonotxt.setBorder(null);
        DatosObras.add(Telefonotxt);

        JLabel Correo = new JLabel("Correo electrónico del responsable:");
        Correo.setForeground(Color.white);
        Font fuenteCorreo = new Font("Arial", Font.BOLD, 14);
        Correo.setFont(fuenteCorreo);
        Correo.setBounds(840, 0, 300, 150);
        DatosObras.add(Correo);

        JTextField Correotxt = new JTextField("");
        Correotxt.setForeground(Color.black);
        Correotxt.setBounds(1100, 62, 210, 30);
        Correotxt.setBorder(null);
        DatosObras.add(Correotxt);

        JLabel Monto = new JLabel("Monto de la obra: $");
        Monto.setForeground(Color.white);
        Font fuenteMonto = new Font("Arial", Font.BOLD, 14);
        Monto.setFont(fuenteMonto);
        Monto.setBounds(512, 40, 300, 150);
        DatosObras.add(Monto);

        JTextField Montotxt = new JTextField("");
        Montotxt.setForeground(Color.black);
        Montotxt.setBounds(650, 100, 70, 30);
        Montotxt.setBorder(null);
        DatosObras.add(Montotxt);

        JLabel FechaInicio = new JLabel("Fecha de inicio de la obra:");
        FechaInicio.setForeground(Color.white);
        Font fuenteFechaI = new Font("Arial", Font.BOLD, 14);
        FechaInicio.setFont(fuenteFechaI);
        FechaInicio.setBounds(0, 70, 300, 300);
        DatosObras.add(FechaInicio);

        JCalendar FechaI = new JCalendar();
        FechaI.setForeground(Color.black);
        FechaI.setBorder(null);
        FechaI.setBounds(0, 230, 200, 170);
        DatosObras.add(FechaI);

        JLabel FechaFinal = new JLabel("Fecha final de la obra:");
        FechaFinal.setForeground(Color.white);
        Font fuenteFechaF = new Font("Arial", Font.BOLD, 14);
        FechaFinal.setFont(fuenteFechaF);
        FechaFinal.setBounds(250, 70, 300, 300);
        DatosObras.add(FechaFinal);

        JCalendar FechaF = new JCalendar();
        FechaF.setForeground(Color.black);
        FechaF.setBorder(null);
        FechaF.setBounds(250, 230, 200, 170);
        DatosObras.add(FechaF);

        JLabel Domicilio = new JLabel("Datos del domicilio de la obra:");
        Domicilio.setForeground(Color.BLACK);
        Font fuenteDomicilio = new Font("Arial", Font.BOLD, 14);
        Domicilio.setFont(fuenteDomicilio);
        Domicilio.setBounds(514, 5, 300, 300);
        DatosObras.add(Domicilio);

        JLabel Calle = new JLabel("Calle:");
        Calle.setForeground(Color.white);
        Font fontCalle = new Font("Arial", Font.BOLD, 14);
        Calle.setFont(fontCalle);
        Calle.setBounds(514, 65, 300, 300);
        DatosObras.add(Calle);

        JTextField Calletxt = new JTextField("");
        Calletxt.setForeground(Color.black);
        Calletxt.setBounds(560, 200, 170, 30);
        Calletxt.setBorder(null);
        DatosObras.add(Calletxt);

        JLabel Numero = new JLabel("Número:");
        Numero.setForeground(Color.white);
        Font fontNumero = new Font("Arial", Font.BOLD, 14);
        Numero.setFont(fontNumero);
        Numero.setBounds(790, 65, 300, 300);
        DatosObras.add(Numero);

        JTextField Numtxt = new JTextField("");
        Numtxt.setForeground(Color.black);
        Numtxt.setBounds(855, 200, 40, 30);
        Numtxt.setBorder(null);
        DatosObras.add(Numtxt);

        JLabel colonia = new JLabel("Colonia:");
        colonia.setForeground(Color.white);
        Font fontColonia = new Font("Arial", Font.BOLD, 14);
        colonia.setFont(fontColonia);
        colonia.setBounds(980, 65, 300, 300);
        DatosObras.add(colonia);

        JTextField Coltxt = new JTextField();
        Coltxt.setForeground(Color.black);
        Coltxt.setBounds(1040, 200, 200, 30);
        Coltxt.setBorder(null);
        DatosObras.add(Coltxt);

        JLabel Municipio = new JLabel("Municipio:");
        Municipio.setForeground(Color.white);
        Font fontMunicipio = new Font("Arial", Font.BOLD, 14);
        Municipio.setFont(fontMunicipio);
        Municipio.setBounds(514, 150, 100, 300);
        DatosObras.add(Municipio);

        //JComboBox Municipiotxt = new JComboBox();
        JTextField Municipiotxt = new JTextField();
        Municipiotxt.setForeground(Color.black);
        Municipiotxt.setBounds(590, 287, 170, 30);
        Municipiotxt.setBorder(null);
        DatosObras.add(Municipiotxt);

        JLabel Estado = new JLabel("Estado:");
        Estado.setForeground(Color.white);
        Font fontEstado = new Font("Arial", Font.BOLD, 14);
        Estado.setFont(fontEstado);
        Estado.setBounds(790, 150, 100, 300);
        DatosObras.add(Estado);

        JTextField Estadotxt = new JTextField();
        Estadotxt.setForeground(Color.black);
        Estadotxt.setBounds(850, 287, 170, 30);
        Estadotxt.setBorder(null);
        DatosObras.add(Estadotxt);

        ///Agregado
        JLabel NombreObra = new JLabel("Nombre de la obra:");
        NombreObra.setForeground(Color.white);
        Font fontNObra = new Font("Arial", Font.BOLD, 14);
        NombreObra.setFont(fontNObra);
        NombreObra.setBounds(1030, 150, 300, 300);
        DatosObras.add(NombreObra);

        JTextField NombreObrartxt = new JTextField();
        NombreObrartxt.setForeground(Color.black);
        NombreObrartxt.setBounds(1170, 288, 150, 30);
        NombreObrartxt.setBorder(null);
        DatosObras.add(NombreObrartxt);

        //////////////////////// Termina panel uno empieza panel 2: Datos Maquinaria
        JPanel DatosMaquinaria = new JPanel();
        DatosMaquinaria.setLayout(null);
        DatosMaquinaria.setSize(1366, 384);
        DatosMaquinaria.setBounds(0, 384, 1366, 384);
        DatosMaquinaria.setBackground(Color.black);

        ///En este panel se deben poner la imagenes
        JPanel Imagen = new JPanel();
        Imagen.setLayout(null);
        Imagen.setBounds(983, 60, 303, 234);
        Imagen.setBackground(Color.decode("#049cff"));
        DatosMaquinaria.add(Imagen);

        JLabel anuncioMaquinaria = new JLabel("Agregar datos de la maquinaria:");
        anuncioMaquinaria.setForeground(Color.white);
        Font fuenteMaquinaria = new Font("Arial", Font.BOLD, 16);
        anuncioMaquinaria.setFont(fuenteMaquinaria);
        anuncioMaquinaria.setBounds(550, 0, 300, 70);
        DatosMaquinaria.add(anuncioMaquinaria);

        JLabel TipoMaquinaria = new JLabel("Tipo de maquinaria:");
        TipoMaquinaria.setForeground(Color.white);
        Font fuenteMaquina = new Font("Arial", Font.BOLD, 14);
        TipoMaquinaria.setFont(fuenteMaquina);
        TipoMaquinaria.setBounds(0, 0, 300, 150);
        DatosMaquinaria.add(TipoMaquinaria);

        JComboBox TipoMC = new JComboBox();
        TipoMC.setForeground(Color.black);
        TipoMC.setBorder(null);
        TipoMC.setBounds(139, 63, 200, 30);
        DatosMaquinaria.add(TipoMC);

        JLabel ModeloMaquinaria = new JLabel("Modelo de la maquinaria:");
        ModeloMaquinaria.setForeground(Color.white);
        Font fuenteModeloM = new Font("Arial", Font.BOLD, 14);
        ModeloMaquinaria.setFont(fuenteModeloM);
        ModeloMaquinaria.setBounds(410, 0, 300, 150);
        DatosMaquinaria.add(ModeloMaquinaria);

        JComboBox MaquinariaC = new JComboBox();
        MaquinariaC.setForeground(Color.black);
        MaquinariaC.setBounds(587, 62, 110, 30);
        MaquinariaC.setBorder(null);
        DatosMaquinaria.add(MaquinariaC);

        JLabel CantidadMaquinas = new JLabel("Cantidad de máquinas para obra:");
        CantidadMaquinas.setForeground(Color.white);
        Font fuenteCantidadMaquinas = new Font("Arial", Font.BOLD, 14);
        CantidadMaquinas.setFont(fuenteCantidadMaquinas);
        CantidadMaquinas.setBounds(0, 130, 300, 150);
        DatosMaquinaria.add(CantidadMaquinas);

        JSpinner CantidadSpiner = new JSpinner();
        CantidadSpiner.setForeground(Color.black);
        CantidadSpiner.setBounds(240, 195, 50, 30);
        CantidadSpiner.setBorder(null);
        DatosMaquinaria.add(CantidadSpiner);

        JButton AgregarInformación = new JButton("Guardar información");
        AgregarInformación.setBackground(Color.black);
        AgregarInformación.setBounds(550, 250, 200, 50);
        AgregarInformación.setBorder(new ComponenteBotonRedondo(40));
        AgregarInformación.setForeground(Color.decode("#049cff"));
        DatosMaquinaria.add(AgregarInformación);

        ImageIcon background_image = new ImageIcon("C:\\Users\\Adan Sanchez\\Documents\\NetBeansProjects\\Fun_Ing_Soft\\src\\neo4.jpg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);

        JLabel background = new JLabel("", background_image, JLabel.CENTER);

        background.add(DatosObras);
        background.add(DatosMaquinaria);

        add(background);

        setVisible(true);

    }

    public static void main(String[] args) {

        new AgregarObra();
    }

}

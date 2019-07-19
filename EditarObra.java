
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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.toedter.calendar.JCalendar;

public class EditarObra extends JFrame {

    EditarObra() {

        setSize(1366, 768);
        setTitle("Editar obras");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        JPanel DatosObras = new JPanel();
        DatosObras.setLayout(null);
        DatosObras.setSize(1366, 384);
        DatosObras.setBackground(new Color(0, 0, 0, 0));

        JLabel anuncio = new JLabel("Editar datos de la obra:");
        anuncio.setForeground(Color.white);
        Font fuente = new Font("Arial", Font.BOLD, 16);
        anuncio.setFont(fuente);
        anuncio.setBounds(550, 0, 300, 70);
        DatosObras.add(anuncio);

        JLabel empresaEditar = new JLabel("Nombre de la empresa:");
        empresaEditar.setForeground(Color.white);
        Font fuenteEmpresa = new Font("Arial", Font.BOLD, 14);
        empresaEditar.setFont(fuenteEmpresa);
        empresaEditar.setBounds(0, 0, 300, 150);
        DatosObras.add(empresaEditar);

        JTextField empresatxtEditar = new JTextField("");
        empresatxtEditar.setForeground(Color.black);
        empresatxtEditar.setBorder(null);
        empresatxtEditar.setBounds(170, 63, 200, 30);
        DatosObras.add(empresatxtEditar);

        JLabel nombreResponsableEditar = new JLabel("Nombre del responsable de la obra:");
        nombreResponsableEditar.setForeground(Color.black);
        Font fuenteResponsable = new Font("Arial", Font.BOLD, 14);
        nombreResponsableEditar.setFont(fuenteResponsable);
        nombreResponsableEditar.setBounds(0, 0, 280, 230);
        DatosObras.add(nombreResponsableEditar);

        JLabel nombresResponsableEditar = new JLabel("Nombres:");
        nombresResponsableEditar.setForeground(Color.white);
        Font fuenteResponsables = new Font("Arial", Font.BOLD, 14);
        nombresResponsableEditar.setFont(fuenteResponsables);
        nombresResponsableEditar.setBounds(0, 30, 280, 230);
        DatosObras.add(nombresResponsableEditar);

        JTextField NombreResponsabletxtEditar = new JTextField("");
        NombreResponsabletxtEditar.setForeground(Color.black);
        NombreResponsabletxtEditar.setBounds(69, 135, 120, 30);
        NombreResponsabletxtEditar.setBorder(null);
        DatosObras.add(NombreResponsabletxtEditar);

        JLabel ApellidoResponsablePaternoEditar = new JLabel("Apellido paterno:");
        ApellidoResponsablePaternoEditar.setForeground(Color.white);
        Font fuenteResponsablesP = new Font("Arial", Font.BOLD, 14);
        ApellidoResponsablePaternoEditar.setFont(fuenteResponsablesP);
        ApellidoResponsablePaternoEditar.setBounds(200, 30, 350, 230);
        DatosObras.add(ApellidoResponsablePaternoEditar);

        JTextField ApellidoResponsablePaternotxtEditar = new JTextField("");
        ApellidoResponsablePaternotxtEditar.setForeground(Color.black);
        ApellidoResponsablePaternotxtEditar.setBounds(322, 135, 120, 30);
        ApellidoResponsablePaternotxtEditar.setBorder(null);
        DatosObras.add(ApellidoResponsablePaternotxtEditar);

        JLabel ApellidoResponsableMaternoEditar = new JLabel("Apellido materno:");
        ApellidoResponsableMaternoEditar.setForeground(Color.white);
        Font fuenteResponsablesMaterno = new Font("Arial", Font.BOLD, 14);
        ApellidoResponsableMaternoEditar.setFont(fuenteResponsables);
        ApellidoResponsableMaternoEditar.setBounds(0, 70, 280, 230);
        DatosObras.add(ApellidoResponsableMaternoEditar);

        JTextField ApellidoResponsableMaternotxtEditar = new JTextField("");
        ApellidoResponsableMaternotxtEditar.setForeground(Color.black);
        ApellidoResponsableMaternotxtEditar.setBounds(128, 175, 120, 30);
        ApellidoResponsableMaternotxtEditar.setBorder(null);
        DatosObras.add(ApellidoResponsableMaternotxtEditar);

        JLabel TelefonoEditar = new JLabel("Télefono del responsable:");
        TelefonoEditar.setForeground(Color.white);
        Font fuenteTelefono = new Font("Arial", Font.BOLD, 14);
        TelefonoEditar.setFont(fuenteTelefono);
        TelefonoEditar.setBounds(510, 0, 300, 150);
        DatosObras.add(TelefonoEditar);

        JTextField TelefonotxtEditar = new JTextField("");
        TelefonotxtEditar.setForeground(Color.black);
        TelefonotxtEditar.setBounds(700, 62, 110, 30);
        TelefonotxtEditar.setBorder(null);
        DatosObras.add(TelefonotxtEditar);

        JLabel CorreoEditar = new JLabel("Correo electrónico del responsable:");
        CorreoEditar.setForeground(Color.white);
        Font fuenteCorreo = new Font("Arial", Font.BOLD, 14);
        CorreoEditar.setFont(fuenteCorreo);
        CorreoEditar.setBounds(840, 0, 300, 150);
        DatosObras.add(CorreoEditar);

        JTextField CorreotxtEditar = new JTextField("");
        CorreotxtEditar.setForeground(Color.black);
        CorreotxtEditar.setBounds(1100, 62, 210, 30);
        CorreotxtEditar.setBorder(null);
        DatosObras.add(CorreotxtEditar);

        JLabel MontoEditar = new JLabel("Monto de la obra: $");
        MontoEditar.setForeground(Color.white);
        Font fuenteMonto = new Font("Arial", Font.BOLD, 14);
        MontoEditar.setFont(fuenteMonto);
        MontoEditar.setBounds(512, 40, 300, 150);
        DatosObras.add(MontoEditar);

        JTextField MontotxtEditar = new JTextField("");
        MontotxtEditar.setForeground(Color.black);
        MontotxtEditar.setBounds(650, 100, 70, 30);
        MontotxtEditar.setBorder(null);
        DatosObras.add(MontotxtEditar);

        JLabel FechaInicioEditar = new JLabel("Fecha de inicio de la obra:");
        FechaInicioEditar.setForeground(Color.white);
        Font fuenteFechaI = new Font("Arial", Font.BOLD, 14);
        FechaInicioEditar.setFont(fuenteFechaI);
        FechaInicioEditar.setBounds(0, 70, 300, 300);
        DatosObras.add(FechaInicioEditar);

        JCalendar FechaIEditar = new JCalendar();
        FechaIEditar.setForeground(Color.black);
        FechaIEditar.setBorder(null);
        FechaIEditar.setBounds(0, 230, 200, 170);
        DatosObras.add(FechaIEditar);

        JLabel FechaFinalEditar = new JLabel("Fecha final de la obra:");
        FechaFinalEditar.setForeground(Color.white);
        Font fuenteFechaF = new Font("Arial", Font.BOLD, 14);
        FechaFinalEditar.setFont(fuenteFechaF);
        FechaFinalEditar.setBounds(250, 70, 300, 300);
        DatosObras.add(FechaFinalEditar);

        JCalendar FechaFEditar = new JCalendar();
        FechaFEditar.setForeground(Color.black);
        FechaFEditar.setBorder(null);
        FechaFEditar.setBounds(250, 230, 200, 170);
        DatosObras.add(FechaFEditar);

        JLabel DomicilioEditar = new JLabel("Datos del domicilio de la obra:");
        DomicilioEditar.setForeground(Color.BLACK);
        Font fuenteDomicilio = new Font("Arial", Font.BOLD, 14);
        DomicilioEditar.setFont(fuenteDomicilio);
        DomicilioEditar.setBounds(514, 5, 300, 300);
        DatosObras.add(DomicilioEditar);

        JLabel CalleEditar = new JLabel("Calle:");
        CalleEditar.setForeground(Color.white);
        Font fontCalle = new Font("Arial", Font.BOLD, 14);
        CalleEditar.setFont(fontCalle);
        CalleEditar.setBounds(514, 65, 300, 300);
        DatosObras.add(CalleEditar);

        JTextField CalletxtEditar = new JTextField("");
        CalletxtEditar.setForeground(Color.black);
        CalletxtEditar.setBounds(560, 200, 170, 30);
        CalletxtEditar.setBorder(null);
        DatosObras.add(CalletxtEditar);

        JLabel NumeroEditar = new JLabel("Número:");
        NumeroEditar.setForeground(Color.white);
        Font fontNumero = new Font("Arial", Font.BOLD, 14);
        NumeroEditar.setFont(fontNumero);
        NumeroEditar.setBounds(790, 65, 300, 300);
        DatosObras.add(NumeroEditar);

        JTextField NumtxtEditar = new JTextField("");
        NumtxtEditar.setForeground(Color.black);
        NumtxtEditar.setBounds(855, 200, 40, 30);
        NumtxtEditar.setBorder(null);
        DatosObras.add(NumtxtEditar);

        JLabel coloniaEditar = new JLabel("Colonia:");
        coloniaEditar.setForeground(Color.white);
        Font fontColonia = new Font("Arial", Font.BOLD, 14);
        coloniaEditar.setFont(fontColonia);
        coloniaEditar.setBounds(980, 65, 300, 300);
        DatosObras.add(coloniaEditar);

        JTextField ColtxtEditar = new JTextField();
        ColtxtEditar.setForeground(Color.black);
        ColtxtEditar.setBounds(1040, 200, 200, 30);
        ColtxtEditar.setBorder(null);
        DatosObras.add(ColtxtEditar);

        JLabel MunicipioEditar = new JLabel("Municipio:");
        MunicipioEditar.setForeground(Color.white);
        Font fontMunicipio = new Font("Arial", Font.BOLD, 14);
        MunicipioEditar.setFont(fontMunicipio);
        MunicipioEditar.setBounds(514, 150, 100, 300);
        DatosObras.add(MunicipioEditar);

        //JComboBox Municipiotxt = new JComboBox();
        JTextField MunicipiotxtEditar = new JTextField();
        MunicipiotxtEditar.setForeground(Color.black);
        MunicipiotxtEditar.setBounds(590, 287, 170, 30);
        MunicipiotxtEditar.setBorder(null);
        DatosObras.add(MunicipiotxtEditar);

        JLabel EstadoEditar = new JLabel("Estado:");
        EstadoEditar.setForeground(Color.white);
        Font fontEstado = new Font("Arial", Font.BOLD, 14);
        EstadoEditar.setFont(fontEstado);
        EstadoEditar.setBounds(790, 150, 100, 300);
        DatosObras.add(EstadoEditar);

        JTextField EstadotxtEditar = new JTextField();
        EstadotxtEditar.setForeground(Color.black);
        EstadotxtEditar.setBounds(850, 287, 170, 30);
        EstadotxtEditar.setBorder(null);
        DatosObras.add(EstadotxtEditar);

        ///Agregado
        JLabel NombreObraEditar = new JLabel("Nombre de la obra:");
        NombreObraEditar.setForeground(Color.white);
        Font fontNObra = new Font("Arial", Font.BOLD, 14);
        NombreObraEditar.setFont(fontNObra);
        NombreObraEditar.setBounds(1030, 150, 300, 300);
        DatosObras.add(NombreObraEditar);

        JTextField NombreObraEditartxt = new JTextField();
        NombreObraEditartxt.setForeground(Color.black);
        NombreObraEditartxt.setBounds(1170, 288, 150, 30);
        NombreObraEditartxt.setBorder(null);
        DatosObras.add(NombreObraEditartxt);

        //////////////////////// Termina panel uno empieza panel 2: Datos Maquinaria
        JPanel DatosMaquinariaEditar = new JPanel();
        DatosMaquinariaEditar.setLayout(null);
        DatosMaquinariaEditar.setSize(1366, 384);
        DatosMaquinariaEditar.setBounds(0, 384, 1366, 384);
        DatosMaquinariaEditar.setBackground(Color.decode("#049cff"));

        ///En este panel se deben poner la imagenes
        JPanel Imagen = new JPanel();
        Imagen.setLayout(null);
        Imagen.setBounds(983, 60, 303, 234);
        Imagen.setBackground(Color.black);
        DatosMaquinariaEditar.add(Imagen);

        JLabel anuncioMaquinaria = new JLabel("Editar datos de la maquinaria:");
        anuncioMaquinaria.setForeground(Color.white);
        Font fuenteMaquinaria = new Font("Arial", Font.BOLD, 16);
        anuncioMaquinaria.setFont(fuenteMaquinaria);
        anuncioMaquinaria.setBounds(550, 0, 300, 70);
        DatosMaquinariaEditar.add(anuncioMaquinaria);

        JLabel TipoMaquinariaEditar = new JLabel("Tipo de maquinaria:");
        TipoMaquinariaEditar.setForeground(Color.white);
        Font fuenteMaquina = new Font("Arial", Font.BOLD, 14);
        TipoMaquinariaEditar.setFont(fuenteMaquina);
        TipoMaquinariaEditar.setBounds(0, 0, 300, 150);
        DatosMaquinariaEditar.add(TipoMaquinariaEditar);

        JComboBox TipoMCEditar = new JComboBox();
        TipoMCEditar.setForeground(Color.black);
        TipoMCEditar.setBorder(null);
        TipoMCEditar.setBounds(139, 63, 200, 30);
        DatosMaquinariaEditar.add(TipoMCEditar);

        JLabel ModeloMaquinariaEditar = new JLabel("Modelo de la maquinaria:");
        ModeloMaquinariaEditar.setForeground(Color.white);
        Font fuenteModeloM = new Font("Arial", Font.BOLD, 14);
        ModeloMaquinariaEditar.setFont(fuenteModeloM);
        ModeloMaquinariaEditar.setBounds(410, 0, 300, 150);
        DatosMaquinariaEditar.add(ModeloMaquinariaEditar);

        JComboBox MaquinariaCEditar = new JComboBox();
        MaquinariaCEditar.setForeground(Color.black);
        MaquinariaCEditar.setBounds(587, 62, 110, 30);
        MaquinariaCEditar.setBorder(null);
        DatosMaquinariaEditar.add(MaquinariaCEditar);

        JLabel CantidadMaquinasEditar = new JLabel("Cantidad de máquinas para obra:");
        CantidadMaquinasEditar.setForeground(Color.white);
        Font fuenteCantidadMaquinas = new Font("Arial", Font.BOLD, 14);
        CantidadMaquinasEditar.setFont(fuenteCantidadMaquinas);
        CantidadMaquinasEditar.setBounds(0, 130, 300, 150);
        DatosMaquinariaEditar.add(CantidadMaquinasEditar);

        JSpinner CantidadSpinerEditar = new JSpinner();
        CantidadSpinerEditar.setForeground(Color.black);
        CantidadSpinerEditar.setBounds(240, 195, 50, 30);
        CantidadSpinerEditar.setBorder(null);
        DatosMaquinariaEditar.add(CantidadSpinerEditar);

        JButton AgregarInformaciónEditar = new JButton("Agregar información");
        AgregarInformaciónEditar.setBackground(Color.decode("#049cff"));
        AgregarInformaciónEditar.setBounds(550, 250, 200, 50);
        AgregarInformaciónEditar.setBorder(new ComponenteBotonRedondo(40));
        AgregarInformaciónEditar.setForeground(Color.black);
        DatosMaquinariaEditar.add(AgregarInformaciónEditar);

        ImageIcon background_image = new ImageIcon("C:\\Users\\Adan Sanchez\\Documents\\NetBeansProjects\\Fun_Ing_Soft\\src\\neo4.jpg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);

        JLabel background = new JLabel("", background_image, JLabel.CENTER);

        background.add(DatosObras);
        background.add(DatosMaquinariaEditar);

        add(background);

        setVisible(true);

    }

    public static void main(String[] args) {

        new EditarObra();
    }

}

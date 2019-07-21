
import java.awt.*;

import javax.swing.*;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.toedter.calendar.JCalendar;

public class NuevoAgregarObra extends JFrame {

    NuevoAgregarObra() {
        setSize(1366, 768);
        setTitle("Agregar obras");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        JPanel DatosObras = new JPanel();
        DatosObras.setLayout(null);
        DatosObras.setSize(1366, 768);
        DatosObras.setBackground(Color.black);

        JLabel nombreResponsable = new JLabel("Datos del responsable de la obra:");
        nombreResponsable.setForeground(Color.decode("#049cff"));
        Font fuenteResponsable = new Font("Arial Black", Font.BOLD, 20);
        nombreResponsable.setFont(fuenteResponsable);
        nombreResponsable.setBounds(500, 0, 500, 40);
        DatosObras.add(nombreResponsable);

        JLabel nombresResponsable = new JLabel("Nombre(s):");
        nombresResponsable.setForeground(Color.white);
        Font fuenteResponsables = new Font("Arial", Font.BOLD, 20);
        nombresResponsable.setFont(fuenteResponsables);
        nombresResponsable.setBounds(0, 40, 300, 20);
        DatosObras.add(nombresResponsable);

        CampoDato NombreResponsabletxt = new CampoDato();
        NombreResponsabletxt.setForeground(Color.black);
        NombreResponsabletxt.setBounds(105, 40, 200, 30);
        NombreResponsabletxt.setBorder(null);
        NombreResponsabletxt.setTipo('T');
        NombreResponsabletxt.setLongitud(20);
        DatosObras.add(NombreResponsabletxt);

        JLabel ApellidoResponsablePaterno = new JLabel("Apellido paterno:");
        ApellidoResponsablePaterno.setForeground(Color.white);
        Font fuenteResponsablesP = new Font("Arial", Font.BOLD, 20);
        ApellidoResponsablePaterno.setFont(fuenteResponsablesP);
        ApellidoResponsablePaterno.setBounds(315, 40, 300, 20);
        DatosObras.add(ApellidoResponsablePaterno);

        CampoDato ApellidoResponsablePaternotxt = new CampoDato();
        ApellidoResponsablePaternotxt.setForeground(Color.black);
        ApellidoResponsablePaternotxt.setBounds(480, 40, 200, 30);
        ApellidoResponsablePaternotxt.setBorder(null);
        ApellidoResponsablePaternotxt.setTipo('T');
        ApellidoResponsablePaternotxt.setLongitud(20);
        DatosObras.add(ApellidoResponsablePaternotxt);

        JLabel ApellidoResponsableMaterno = new JLabel("Apellido materno:");
        ApellidoResponsableMaterno.setForeground(Color.white);
        Font fuenteResponsablesMaterno = new Font("Arial", Font.BOLD, 20);
        ApellidoResponsableMaterno.setFont(fuenteResponsables);
        ApellidoResponsableMaterno.setBounds(690, 40, 300, 20);
        DatosObras.add(ApellidoResponsableMaterno);

        CampoDato ApellidoResponsableMaternotxt = new CampoDato();
        ApellidoResponsableMaternotxt.setForeground(Color.black);
        ApellidoResponsableMaternotxt.setBounds(860, 40, 200, 30);
        ApellidoResponsableMaternotxt.setBorder(null);
        ApellidoResponsableMaternotxt.setTipo('T');
        ApellidoResponsableMaternotxt.setLongitud(20);
        DatosObras.add(ApellidoResponsableMaternotxt);

        JLabel Monto = new JLabel("Monto de la obra: $");
        Monto.setForeground(Color.white);
        Font fuenteMonto = new Font("Arial", Font.BOLD, 20);
        Monto.setFont(fuenteMonto);
        Monto.setBounds(1065, 40, 300, 20);
        DatosObras.add(Monto);

        CampoDato Montotxt = new CampoDato();
        Montotxt.setForeground(Color.black);
        Montotxt.setBounds(1250, 40, 70, 30);
        Montotxt.setBorder(null);
        Montotxt.setTipo('D');
        Montotxt.setLongitud(20);
        DatosObras.add(Montotxt);

        JLabel Telefono = new JLabel("Télefono:");
        Telefono.setForeground(Color.white);
        Font fuenteTelefono = new Font("Arial", Font.BOLD, 20);
        Telefono.setFont(fuenteTelefono);
        Telefono.setBounds(0, 80, 300, 20);
        DatosObras.add(Telefono);

        CampoDato Telefonotxt = new CampoDato();
        Telefonotxt.setForeground(Color.black);
        Telefonotxt.setBounds(107, 80, 200, 30);
        Telefonotxt.setBorder(null);
        Telefonotxt.setTipo('E');
        Telefonotxt.setLongitud(15);
        DatosObras.add(Telefonotxt);

        JLabel Correo = new JLabel("E-mail:");
        Correo.setForeground(Color.white);
        Font fuenteCorreo = new Font("Arial", Font.BOLD, 20);
        Correo.setFont(fuenteCorreo);
        Correo.setBounds(410, 80, 300, 20);
        DatosObras.add(Correo);

        JTextField Correotxt = new JTextField();
        Correotxt.setForeground(Color.black);
        Correotxt.setBounds(480, 80, 200, 30);
        Correotxt.setBorder(null);
        DatosObras.add(Correotxt);

        JLabel empresa = new JLabel("Empresa:");
        empresa.setForeground(Color.white);
        Font fuenteEmpresa = new Font("Arial", Font.BOLD, 20);
        empresa.setFont(fuenteEmpresa);
        empresa.setBounds(770, 80, 300, 20);
        DatosObras.add(empresa);

        JTextField empresatxt = new JTextField("");
        empresatxt.setForeground(Color.black);
        empresatxt.setBorder(null);
        empresatxt.setBounds(860, 80, 200, 30);
        DatosObras.add(empresatxt);

        JLabel DomicilioEditar = new JLabel("Ubicación de la obra:");
        DomicilioEditar.setForeground(Color.decode("#049cff"));
        Font fuenteDomicilio = new Font("Arial Black", Font.BOLD, 20);
        DomicilioEditar.setFont(fuenteDomicilio);
        DomicilioEditar.setBounds(550, 35, 600, 200);
        DatosObras.add(DomicilioEditar);

        JLabel Calle = new JLabel("Calle:");
        Calle.setForeground(Color.white);
        Font fontCalle = new Font("Arial", Font.BOLD, 20);
        Calle.setFont(fontCalle);
        Calle.setBounds(0, 150, 300, 20);
        DatosObras.add(Calle);

        CampoDato Calletxt = new CampoDato();
        Calletxt.setForeground(Color.black);
        Calletxt.setBounds(105, 150, 200, 30);
        Calletxt.setBorder(null);
        Calletxt.setTipo('T');
        Calletxt.setLongitud(100);
        DatosObras.add(Calletxt);

        JLabel Numero = new JLabel("Número:");
        Numero.setForeground(Color.white);
        Font fontNumero = new Font("Arial", Font.BOLD, 20);
        Numero.setFont(fontNumero);
        Numero.setBounds(417, 150, 300, 20);
        DatosObras.add(Numero);

        CampoDato Numtxt = new CampoDato();
        Numtxt.setForeground(Color.black);
        Numtxt.setBounds(500, 150, 40, 30);
        Numtxt.setBorder(null);
        Numtxt.setTipo('E');
        Numtxt.setLongitud(10);
        DatosObras.add(Numtxt);

        JLabel colonia = new JLabel("Colonia:");
        colonia.setForeground(Color.white);
        Font fontColonia = new Font("Arial", Font.BOLD, 20);
        colonia.setFont(fontColonia);
        colonia.setBounds(780, 150, 300, 20);
        DatosObras.add(colonia);

        CampoDato Coltxt = new CampoDato();
        Coltxt.setForeground(Color.black);
        Coltxt.setBounds(858, 150, 200, 30);
        Coltxt.setBorder(null);
        Coltxt.setTipo('T');
        Coltxt.setLongitud(30);
        DatosObras.add(Coltxt);

        JLabel Municipio = new JLabel("Municipio:");
        Municipio.setForeground(Color.white);
        Font fontMunicipio = new Font("Arial", Font.BOLD, 20);
        Municipio.setFont(fontMunicipio);
        Municipio.setBounds(1080, 150, 300, 20);
        DatosObras.add(Municipio);

        //JComboBox Municipiotxt = new JComboBox();
        CampoDato Municipiotxt = new CampoDato();
        Municipiotxt.setForeground(Color.black);
        Municipiotxt.setBounds(1180, 150, 170, 30);
        Municipiotxt.setBorder(null);
        Municipiotxt.setTipo('T');
        Municipiotxt.setLongitud(30);
        DatosObras.add(Municipiotxt);

        JLabel Estado = new JLabel("Estado:");
        Estado.setForeground(Color.white);
        Font fontEstado = new Font("Arial", Font.BOLD, 20);
        Estado.setFont(fontEstado);
        Estado.setBounds(0, 190, 300, 20);
        DatosObras.add(Estado);

        CampoDato Estadotxt = new CampoDato();
        Estadotxt.setForeground(Color.black);
        Estadotxt.setBounds(105, 190, 200, 30);
        Estadotxt.setBorder(null);
        Estadotxt.setTipo('T');
        Estadotxt.setLongitud(30);
        DatosObras.add(Estadotxt);

        ///Agregado
        JLabel NombreObra = new JLabel("Nombre de la obra:");
        NombreObra.setForeground(Color.white);
        Font fontNObra = new Font("Arial", Font.BOLD, 20);
        NombreObra.setFont(fontNObra);
        NombreObra.setBounds(315, 190, 300, 20);
        DatosObras.add(NombreObra);

        CampoDato NombreObratxt = new CampoDato();
        NombreObratxt.setForeground(Color.black);
        NombreObratxt.setBounds(500, 190, 200, 30);
        NombreObratxt.setBorder(null);
        NombreObratxt.setTipo('T');
        NombreObratxt.setLongitud(50);
        DatosObras.add(NombreObratxt);

        JLabel anuncioMaquinaria = new JLabel("Tipos y cantidades de máquinaria para la obra:");
        anuncioMaquinaria.setForeground(Color.decode("#049cff"));
        Font fuenteMaquinaria = new Font("Arial Black", Font.BOLD, 20);
        anuncioMaquinaria.setFont(fuenteMaquinaria);
        anuncioMaquinaria.setBounds(400, 100, 700, 300);
        DatosObras.add(anuncioMaquinaria);

        JLabel TipoMaquinaria = new JLabel("Tipo de maquinaria:");
        TipoMaquinaria.setForeground(Color.white);
        Font fuenteMaquina = new Font("Arial", Font.BOLD, 20);
        TipoMaquinaria.setFont(fuenteMaquina);
        TipoMaquinaria.setBounds(0, 220, 300, 150);
        DatosObras.add(TipoMaquinaria);

        ////El cliente dijo que hasta el momento tiene 5 tractores,2 volteos,6 retroexcabadoras, 1 montacargas
        JComboBox TipoMC = new JComboBox();
        TipoMC.setForeground(Color.black);
        TipoMC.setBorder(null);
        TipoMC.setBounds(190, 280, 200, 30);
        DatosObras.add(TipoMC);

        JLabel ModeloMaquinaria = new JLabel("Modelo de la maquinaria:");
        ModeloMaquinaria.setForeground(Color.white);
        Font fuenteModeloM = new Font("Arial", Font.BOLD, 20);
        ModeloMaquinaria.setFont(fuenteModeloM);
        ModeloMaquinaria.setBounds(455, 220, 300, 150);
        DatosObras.add(ModeloMaquinaria);

        JComboBox MaquinariaC = new JComboBox();
        MaquinariaC.setForeground(Color.black);
        MaquinariaC.setBounds(692, 280, 200, 30);
        MaquinariaC.setBorder(null);
        DatosObras.add(MaquinariaC);

        JLabel CantidadMaquinas = new JLabel("Cantidad de máquinas para obra:");
        CantidadMaquinas.setForeground(Color.white);
        Font fuenteCantidadMaquinas = new Font("Arial", Font.BOLD, 20);
        CantidadMaquinas.setFont(fuenteCantidadMaquinas);
        CantidadMaquinas.setBounds(980, 220, 500, 150);
        DatosObras.add(CantidadMaquinas);

        JSpinner CantidadSpiner = new JSpinner();
        CantidadSpiner.setForeground(Color.black);
        CantidadSpiner.setBounds(1299, 280, 50, 30);
        CantidadSpiner.setBorder(null);
        DatosObras.add(CantidadSpiner);

        JPanel imagen = new JPanel();
        imagen.setBackground(Color.decode("#049cff"));
        imagen.setBounds(950, 400, 400, 200);
        DatosObras.add(imagen);

        JLabel FechaInicio = new JLabel("Fecha de inicio de la obra:");
        FechaInicio.setForeground(Color.white);
        Font fuenteFechaI = new Font("Arial", Font.BOLD, 20);
        FechaInicio.setFont(fuenteFechaI);
        FechaInicio.setBounds(0, 230, 300, 300);
        DatosObras.add(FechaInicio);

        JCalendar FechaI = new JCalendar();
        FechaI.setForeground(Color.black);
        FechaI.setBorder(null);
        FechaI.setBounds(0, 400, 390, 200);
        DatosObras.add(FechaI);

        JLabel FechaFinal = new JLabel("Fecha final de la obra:");
        FechaFinal.setForeground(Color.white);
        Font fuenteFechaF = new Font("Arial", Font.BOLD, 20);
        FechaFinal.setFont(fuenteFechaF);
        FechaFinal.setBounds(478, 230, 300, 300);
        DatosObras.add(FechaFinal);

        JCalendar FechaF = new JCalendar();
        FechaF.setForeground(Color.black);
        FechaF.setBorder(null);
        FechaF.setBounds(480, 400, 390, 200);
        DatosObras.add(FechaF);

        JButton AgregarInformaciónEditar = new JButton("Guardar información");
        AgregarInformaciónEditar.setBackground(Color.black);
        AgregarInformaciónEditar.setBounds(550, 640, 300, 50);
        Font fontBoton = new Font("Arial", Font.BOLD, 20);
        AgregarInformaciónEditar.setFont(fontBoton);
        AgregarInformaciónEditar.setBorder(new ComponenteBotonRedondo(50));
        AgregarInformaciónEditar.setForeground(Color.decode("#049cff"));
        DatosObras.add(AgregarInformaciónEditar);

        JLabel background = new JLabel();

        background.add(DatosObras);
        add(background);
        setVisible(true);

    }

    public static void main(String[] args) {

        new NuevoAgregarObra();
    }

}

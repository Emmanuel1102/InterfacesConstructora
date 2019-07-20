import java.awt.*;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.Border;

import com.toedter.calendar.JCalendar;
public class EditarObra extends JFrame {
	
	EditarObra(String obra,String responsable,Date fechaIni,Date fechaFin,int numero,double inversion,String empresa,int numMaqui){
		
		setSize(1366,768);
		setTitle("Editar obras");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
		JPanel DatosObras= new JPanel();
		DatosObras.setLayout(null);
		DatosObras.setSize(1366,768);
		DatosObras.setBackground(Color.black);
	
		JLabel nombreResponsableEditar= new JLabel("Datos del responsable de la obra:");
		nombreResponsableEditar.setForeground(Color.decode("#049cff"));
		Font fuenteResponsable=new Font("Arial Black",Font.BOLD,20);
		nombreResponsableEditar.setFont(fuenteResponsable);
		nombreResponsableEditar.setBounds(500,0,500,40);
		DatosObras.add(nombreResponsableEditar);
		
		
		JLabel nombresResponsableEditar= new JLabel("Nombre(s):");
		nombresResponsableEditar.setForeground(Color.white);
		Font fuenteResponsables=new Font("Arial",Font.BOLD,20);
		nombresResponsableEditar.setFont(fuenteResponsables);
		nombresResponsableEditar.setBounds(0,40,300,20);
		DatosObras.add(nombresResponsableEditar);
		
		JTextField NombreResponsabletxtEditar = new JTextField("");
		NombreResponsabletxtEditar.setForeground(Color.black);
		NombreResponsabletxtEditar.setBounds(105,40,200,30);
		NombreResponsabletxtEditar.setBorder(null);
		DatosObras.add(NombreResponsabletxtEditar);
		
		JLabel ApellidoResponsablePaternoEditar= new JLabel("Apellido paterno:");
		ApellidoResponsablePaternoEditar.setForeground(Color.white);
		Font fuenteResponsablesP=new Font("Arial",Font.BOLD,20);
		ApellidoResponsablePaternoEditar.setFont(fuenteResponsablesP);
		ApellidoResponsablePaternoEditar.setBounds(315,40,300,20);
		DatosObras.add(ApellidoResponsablePaternoEditar);
	
		JTextField ApellidoResponsablePaternotxtEditar = new JTextField("");
		ApellidoResponsablePaternotxtEditar.setForeground(Color.black);
		ApellidoResponsablePaternotxtEditar.setBounds(480,40,200,30);
		ApellidoResponsablePaternotxtEditar.setBorder(null);
		DatosObras.add(ApellidoResponsablePaternotxtEditar);
		
		JLabel ApellidoResponsableMaternoEditar= new JLabel("Apellido materno:");
		ApellidoResponsableMaternoEditar.setForeground(Color.white);
		Font fuenteResponsablesMaterno=new Font("Arial",Font.BOLD,20);
		ApellidoResponsableMaternoEditar.setFont(fuenteResponsables);
		ApellidoResponsableMaternoEditar.setBounds(690,40,300,20);
		DatosObras.add(ApellidoResponsableMaternoEditar);
		
		
		JTextField ApellidoResponsableMaternotxtEditar = new JTextField("");
		ApellidoResponsableMaternotxtEditar.setForeground(Color.black);
		ApellidoResponsableMaternotxtEditar.setBounds(860,40,200,30);
		ApellidoResponsableMaternotxtEditar.setBorder(null);
		DatosObras.add(ApellidoResponsableMaternotxtEditar);
		
		JLabel MontoEditar = new JLabel("Monto de la obra: $");
		MontoEditar.setForeground(Color.white);
		Font fuenteMonto=new Font("Arial",Font.BOLD,20);
		 MontoEditar.setFont(fuenteMonto);
		 MontoEditar.setBounds(1065,40,300, 20);
		DatosObras.add( MontoEditar);
		
		JTextField MontotxtEditar = new JTextField(String.valueOf(inversion));
		MontotxtEditar.setForeground(Color.black);
		MontotxtEditar.setBounds(1250,40,70,30);
		MontotxtEditar.setBorder(null);
		DatosObras.add(MontotxtEditar);
	
		
		JLabel TelefonoEditar = new JLabel("Télefono:");
		TelefonoEditar.setForeground(Color.white);
		Font fuenteTelefono=new Font("Arial",Font.BOLD,20);
		TelefonoEditar.setFont(fuenteTelefono);
		TelefonoEditar.setBounds(0,80,300, 20);
		DatosObras.add(TelefonoEditar);
		
		JTextField TelefonotxtEditar = new JTextField(String.valueOf(numero));
		TelefonotxtEditar.setForeground(Color.black);
		TelefonotxtEditar.setBounds(107,80,200,30);
		TelefonotxtEditar.setBorder(null);
		DatosObras.add(TelefonotxtEditar);
		
		
		JLabel CorreoEditar = new JLabel("E-mail:");
		CorreoEditar.setForeground(Color.white);
		Font fuenteCorreo=new Font("Arial",Font.BOLD,20);
		CorreoEditar.setFont(fuenteCorreo);
		CorreoEditar.setBounds(410,80,300, 20);
		DatosObras.add(CorreoEditar);
		
		JTextField CorreotxtEditar = new JTextField("");
		CorreotxtEditar.setForeground(Color.black);
		CorreotxtEditar.setBounds(480,80,200,30);
		CorreotxtEditar.setBorder(null);
		DatosObras.add(CorreotxtEditar);
		
		
		JLabel empresaEditar = new JLabel("Empresa:");
		empresaEditar.setForeground(Color.white);
		Font fuenteEmpresa= new Font("Arial",Font.BOLD,20);
		empresaEditar.setFont(fuenteEmpresa);
		empresaEditar.setBounds(770,80,300,20);
		DatosObras.add(empresaEditar);
		
		JTextField empresatxtEditar= new JTextField("");
		empresatxtEditar.setForeground(Color.black);
		empresatxtEditar.setBorder(null);
		empresatxtEditar.setBounds(860,80,200,30);
		DatosObras.add(empresatxtEditar);
	
		JLabel DomicilioEditar= new JLabel("Ubicación de la obra:");
		DomicilioEditar.setForeground(Color.decode("#049cff"));
		Font fuenteDomicilio= new Font("Arial Black",Font.BOLD,20);
	    DomicilioEditar.setFont(fuenteDomicilio);
		DomicilioEditar.setBounds(550,35,600,200);
		DatosObras.add(DomicilioEditar);
		
		JLabel CalleEditar = new JLabel("Calle:");
		CalleEditar.setForeground(Color.white);
		Font fontCalle=new Font("Arial",Font.BOLD,20);
		CalleEditar.setFont(fontCalle);
		CalleEditar.setBounds(0,150,300,20);
		DatosObras.add(CalleEditar);
		
		JTextField CalletxtEditar = new JTextField("");
		CalletxtEditar.setForeground(Color.black);
		CalletxtEditar.setBounds(105,150,200,30);
		CalletxtEditar.setBorder(null);
		DatosObras.add(CalletxtEditar);
		
		JLabel NumeroEditar= new JLabel("Número:");
		NumeroEditar.setForeground(Color.white);
		Font fontNumero=new Font("Arial",Font.BOLD,20);
		NumeroEditar.setFont(fontNumero);
		NumeroEditar.setBounds(417,150,300,20);
		DatosObras.add(NumeroEditar);
		
		JTextField NumtxtEditar = new JTextField("");
		NumtxtEditar.setForeground(Color.black);
		NumtxtEditar.setBounds(500,150,40,30);
		NumtxtEditar.setBorder(null);
		DatosObras.add(NumtxtEditar);
		
		JLabel coloniaEditar = new JLabel("Colonia:");
	    coloniaEditar.setForeground(Color.white);
	    Font fontColonia = new Font("Arial",Font.BOLD,20);
	    coloniaEditar.setFont(fontColonia);
	    coloniaEditar.setBounds(780,150,300,20);
		DatosObras.add(coloniaEditar);
	
		JTextField ColtxtEditar= new JTextField();
		ColtxtEditar.setForeground(Color.black);
		ColtxtEditar.setBounds(858,150,200,30);
		ColtxtEditar.setBorder(null);
	    DatosObras.add(ColtxtEditar);
	 
	
		
		JLabel MunicipioEditar = new JLabel("Municipio:");
		MunicipioEditar.setForeground(Color.white);
		Font fontMunicipio=new Font("Arial",Font.BOLD,20);
		MunicipioEditar.setFont(fontMunicipio);
		MunicipioEditar.setBounds(1080,150,300,20);
		DatosObras.add(MunicipioEditar);
	
		//JComboBox Municipiotxt = new JComboBox();
		JTextField MunicipiotxtEditar= new JTextField();
		MunicipiotxtEditar.setForeground(Color.black);
		MunicipiotxtEditar.setBounds(1180,150,170,30);
		MunicipiotxtEditar.setBorder(null);
		DatosObras.add(MunicipiotxtEditar);
		
		JLabel EstadoEditar= new JLabel("Estado:");
		EstadoEditar.setForeground(Color.white);
		Font fontEstado= new Font("Arial",Font.BOLD,20);
		EstadoEditar.setFont(fontEstado);
		EstadoEditar.setBounds(0,190,300,20);
		DatosObras.add(EstadoEditar);
	
		JTextField EstadotxtEditar= new JTextField();
		EstadotxtEditar.setForeground(Color.black);
		EstadotxtEditar.setBounds(105,190,200,30);
		EstadotxtEditar.setBorder(null);
		DatosObras.add(EstadotxtEditar);
	
		///Agregado
		
	JLabel NombreObraEditar = new JLabel("Nombre de la obra:");
	    NombreObraEditar.setForeground(Color.white);
	    Font fontNObra = new Font("Arial",Font.BOLD,20);
	    NombreObraEditar.setFont(fontNObra);
	    NombreObraEditar.setBounds(315,190,300,20);
		DatosObras.add( NombreObraEditar);
		
		JTextField NombreObraEditartxt= new JTextField(obra);
		NombreObraEditartxt.setForeground(Color.black);
		NombreObraEditartxt.setBounds(500,190,200,30);
	    NombreObraEditartxt.setBorder(null);
	    DatosObras.add(NombreObraEditartxt);
	    
		JLabel anuncioMaquinaria = new JLabel("Tipos y cantidades de máquinaria para la obra:");
		anuncioMaquinaria.setForeground(Color.decode("#049cff"));
		Font fuenteMaquinaria=new Font("Arial Black", Font.BOLD, 20);
		anuncioMaquinaria.setFont(fuenteMaquinaria);
		anuncioMaquinaria.setBounds(400,100,700,300);
		DatosObras.add(anuncioMaquinaria);
	
		JLabel TipoMaquinariaEditar = new JLabel("Tipo de maquinaria:");
		TipoMaquinariaEditar.setForeground(Color.white);
		Font fuenteMaquina= new Font("Arial",Font.BOLD,20);
		TipoMaquinariaEditar.setFont(fuenteMaquina);
		TipoMaquinariaEditar.setBounds(0,220,300,150);
		DatosObras.add(TipoMaquinariaEditar);
		
		////El cliente dijo que hasta el momento tiene 5 tractores,2 volteos,6 retroexcabadoras, 1 montacargas
		JComboBox TipoMCEditar= new JComboBox();
		TipoMCEditar.setForeground(Color.black);
		TipoMCEditar.setBorder(null);
		TipoMCEditar.setBounds(190,280,200,30);
		DatosObras.add(TipoMCEditar);
		
	
		JLabel ModeloMaquinariaEditar = new JLabel("Modelo de la maquinaria:");
		ModeloMaquinariaEditar.setForeground(Color.white);
		Font fuenteModeloM=new Font("Arial",Font.BOLD,20);
		ModeloMaquinariaEditar.setFont(fuenteModeloM);
		ModeloMaquinariaEditar.setBounds(455,220,300, 150);
		DatosObras.add(ModeloMaquinariaEditar);
		
		JComboBox MaquinariaCEditar = new JComboBox();
		MaquinariaCEditar .setForeground(Color.black);
		MaquinariaCEditar .setBounds(692,280,200,30);
		MaquinariaCEditar .setBorder(null);
		DatosObras.add(MaquinariaCEditar );
		
	    JLabel CantidadMaquinasEditar = new JLabel("Cantidad de máquinas para obra:");
		CantidadMaquinasEditar.setForeground(Color.white);
		Font fuenteCantidadMaquinas=new Font("Arial",Font.BOLD,20);
		CantidadMaquinasEditar.setFont(fuenteCantidadMaquinas);
		CantidadMaquinasEditar.setBounds(980,220,500, 150);
		DatosObras.add(CantidadMaquinasEditar);
		
	
		JSpinner CantidadSpinerEditar = new JSpinner();
		CantidadSpinerEditar.setForeground(Color.black);
		CantidadSpinerEditar.setBounds(1299,280,50,30);
		CantidadSpinerEditar.setBorder(null);
		DatosObras.add(CantidadSpinerEditar);
		
	    JPanel imagen = new JPanel();
	    imagen.setBackground(Color.decode("#049cff"));
	    imagen.setBounds(950,400,400,200);
	    DatosObras.add(imagen);
	
		 JLabel FechaInicioEditar = new JLabel("Fecha de inicio de la obra:");
	    FechaInicioEditar.setForeground(Color.white);
	    Font fuenteFechaI=new Font("Arial",Font.BOLD,20);
	    FechaInicioEditar.setFont(fuenteFechaI);
		FechaInicioEditar.setBounds(0,230,300,300);
		DatosObras.add(FechaInicioEditar);
		
		JCalendar FechaIEditar= new JCalendar(fechaIni);
		FechaIEditar.setForeground(Color.black);
		FechaIEditar.setBorder(null);
		FechaIEditar.setBounds(0,400,390,200);
		DatosObras.add(FechaIEditar);
		
		JLabel FechaFinalEditar = new JLabel("Fecha final de la obra:");
		FechaFinalEditar.setForeground(Color.white);
		Font fuenteFechaF= new Font("Arial",Font.BOLD,20);
		FechaFinalEditar.setFont(fuenteFechaF);
		FechaFinalEditar.setBounds(478,230,300,300);
		DatosObras.add(FechaFinalEditar);
		
		JCalendar FechaFEditar= new JCalendar(fechaFin);
		FechaFEditar.setForeground(Color.black);
		FechaFEditar.setBorder(null);
		FechaFEditar.setBounds(480,400,390,200);
		DatosObras.add(FechaFEditar);
	
		JButton AgregarInformaciónEditar= new JButton("Guardar información");
		AgregarInformaciónEditar.setBackground(Color.black);
		AgregarInformaciónEditar.setBounds(550,640,300,50);
		Font fontBoton= new Font("Arial",Font.BOLD,20);
	  	AgregarInformaciónEditar.setFont(fontBoton);
		AgregarInformaciónEditar.setBorder(new ComponenteBotonRedondo(50));
		AgregarInformaciónEditar.setForeground(Color.decode("#049cff"));
		DatosObras.add(AgregarInformaciónEditar);

		JLabel background = new JLabel();

		background.add(DatosObras);
		add(background );
		setVisible(true);

	}

	/*public static void main(String[]args){
		
		new EditarObra();
	}*/

}

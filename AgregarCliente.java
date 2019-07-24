	import java.awt.*;

import javax.swing.*;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
public class AgregarCliente extends JFrame{
PreparedStatement psd; // variable para la BDD	


//Aqui hacemos la conexión a la BDD
    
    public Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conexion = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/Constructoraa", "Adminn", "admin");
            JOptionPane.showMessageDialog(null,
                    "¡Registro guardado exitosamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Hubo un error en la instalacion" + e);
            //  System.err.println("Hubo un error en la instalacion " + e);
        }
        return conexion;

    }

    //_________________________________________________________________________-
	
	AgregarCliente(){
		
		setSize(1100,600);
		setTitle("Agregar clientes");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		
		JPanel Clientes= new JPanel();
		Clientes.setLayout(null);
		Clientes.setSize(1100,600);
		Clientes.setBackground(Color.black);

		JLabel anuncio = new JLabel("Agregar datos de los clientes:");
		anuncio.setForeground(Color.white);
		Font fuente=new Font("Arial Black", Font.BOLD, 20);
		anuncio.setFont(fuente);
		anuncio.setBounds(370,0,400,70);
		Clientes.add(anuncio);
		
		JLabel nombresResponsable = new JLabel("Nombre(s):");
		nombresResponsable.setForeground(Color.white);
		Font fuenteResponsables=new Font("Arial",Font.BOLD,20);
		nombresResponsable.setFont(fuenteResponsables);
		nombresResponsable.setBounds(0,30,280,230);
		Clientes.add(nombresResponsable);
		//JTextField Nombre
		CampoDato NombreResponsabletxt = new CampoDato();
		NombreResponsabletxt.setForeground(Color.black);
		NombreResponsabletxt.setBounds(128,135,200,30);
		NombreResponsabletxt.setBorder(null);
                 NombreResponsabletxt.setTipo('T');
                NombreResponsabletxt.setLongitud(20);
		Clientes.add(NombreResponsabletxt);
		
		JLabel ApellidoResponsablePaterno= new JLabel("Apellido paterno:");
		ApellidoResponsablePaterno.setForeground(Color.white);
		Font fuenteResponsablesP=new Font("Arial",Font.BOLD,20);
		ApellidoResponsablePaterno.setFont(fuenteResponsablesP);
		ApellidoResponsablePaterno.setBounds(340,30,350,230);
		Clientes.add(ApellidoResponsablePaterno);
	
		CampoDato ApellidoResponsablePaternotxt = new CampoDato();
		ApellidoResponsablePaternotxt.setForeground(Color.black);
		ApellidoResponsablePaternotxt.setBounds(502,135,200,30);
		ApellidoResponsablePaternotxt.setBorder(null);
		Clientes.add(ApellidoResponsablePaternotxt);
		
		JLabel ApellidoResponsableMaterno = new JLabel("Apellido materno:");
		ApellidoResponsableMaterno.setForeground(Color.white);
		Font fuenteResponsablesMaterno=new Font("Arial",Font.BOLD,20);
		ApellidoResponsableMaterno.setFont(fuenteResponsables);
		ApellidoResponsableMaterno.setBounds(720,30,200,230);
		Clientes.add(ApellidoResponsableMaterno);
		
		
		CampoDato ApellidoResponsableMaternotxt = new CampoDato();
		ApellidoResponsableMaternotxt.setForeground(Color.black);
		ApellidoResponsableMaternotxt.setBounds(890,135,200,30);
		ApellidoResponsableMaternotxt.setBorder(null);
		Clientes.add(ApellidoResponsableMaternotxt);
		
		JLabel Telefono = new JLabel("Télefono:");
		Telefono.setForeground(Color.white);
		Font fuenteTelefono=new Font("Arial",Font.BOLD,20);
		Telefono.setFont(fuenteTelefono);
		Telefono.setBounds(0,70,200,230);
		Clientes.add(Telefono);
		
		CampoDato Telefonotxt = new CampoDato();
		Telefonotxt.setForeground(Color.black);
		Telefonotxt.setBounds(128,176,200,30);
		Telefonotxt.setBorder(null);
                Telefonotxt.setTipo('E');
                Telefonotxt.setLongitud(9);
		Clientes.add(Telefonotxt);
		
		
		JLabel Correo = new JLabel("E-mail:");
		Correo.setForeground(Color.white);
		Font fuenteCorreo=new Font("Arial",Font.BOLD,20);
		Correo.setFont(fuenteCorreo);
		Correo.setBounds(435,113,260, 150);
		Clientes.add(Correo);
		
		CampoDato Correotxt = new CampoDato();
		Correotxt.setForeground(Color.black);
		Correotxt.setBounds(502,178,200,30);
		Correotxt.setBorder(null);
		Clientes.add(Correotxt);
		
		JLabel empresa = new JLabel("Empresa:");
		empresa.setForeground(Color.white);
		Font fuenteEmpresa= new Font("Arial",Font.BOLD,20);
		empresa.setFont(fuenteEmpresa);
		empresa.setBounds(797,112,300,150);
		Clientes.add(empresa);
		
		CampoDato empresatxt = new CampoDato();
		empresatxt.setForeground(Color.black);
		empresatxt.setBorder(null);
		empresatxt.setBounds(890,178,200,30);
		Clientes.add(empresatxt);
		
		
		
		
		JLabel Domicilio= new JLabel("Datos domiciliarios:");
		Domicilio.setForeground(Color.white);
		Font fuenteDomicilio= new Font("Arial Black",Font.BOLD,20);
	    Domicilio.setFont(fuenteDomicilio);
		Domicilio.setBounds(410,100,300,300);
		Clientes.add(Domicilio);
		
		JLabel Calle = new JLabel("Calle:");
		Calle.setForeground(Color.white);
		Font fontCalle=new Font("Arial",Font.BOLD,20);
		Calle.setFont(fontCalle);
		Calle.setBounds(0,166,300,300);
		Clientes.add(Calle);
		// JTextField Calle
		CampoDato Calletxt = new CampoDato();
		Calletxt.setForeground(Color.black);
		Calletxt.setBounds(130,300,200,30);
		Calletxt.setBorder(null);
		Clientes.add(Calletxt);
		
		JLabel Numero= new JLabel("Número:");
		Numero.setForeground(Color.white);
		Font fontNumero = new Font("Arial",Font.BOLD,20);
		Numero.setFont(fontNumero);
		Numero.setBounds(418,166,300,300);
		Clientes.add(Numero);
		
		CampoDato Numtxt = new CampoDato();
		Numtxt.setForeground(Color.black);
		Numtxt.setBounds(503,300,40,30);
		Numtxt.setBorder(null);
                 Numtxt.setTipo('E');
                Numtxt.setLongitud(2);
		Clientes.add(Numtxt);
		
		JLabel colonia = new JLabel("Colonia:");
	    colonia.setForeground(Color.white);
	    Font fontColonia = new Font("Arial",Font.BOLD,20);
	    colonia.setFont(fontColonia);
	    colonia.setBounds(805,166,300,300);
		Clientes.add(colonia);
		
		CampoDato Coltxt = new CampoDato();
		Coltxt.setForeground(Color.black);
		Coltxt.setBounds(890,300,200,30);
		Coltxt.setBorder(null);
	    Clientes.add(Coltxt);
	    
	
		
		JLabel Municipio = new JLabel("Municipio:");
		Municipio.setForeground(Color.white);
		Font fontMunicipio=new Font("Arial",Font.BOLD,20);
		Municipio.setFont(fontMunicipio);
		Municipio.setBounds(0,210,300,300);
		Clientes.add(Municipio);
		
		//JComboBox Municipiotxt = new JComboBox();
		CampoDato Municipiotxt = new CampoDato();
		Municipiotxt.setForeground(Color.black);
		Municipiotxt.setBounds(128,350,200,30);
		Municipiotxt.setBorder(null);
		Clientes.add(Municipiotxt);
		
		JLabel Estado= new JLabel("Estado:");
		Estado.setForeground(Color.white);
		Font fontEstado= new Font("Arial",Font.BOLD,20);
		Estado.setFont(fontEstado);
		Estado.setBounds(427,210,100,300);
		Clientes.add(Estado);
		
		CampoDato Estadotxt = new CampoDato();
		Estadotxt.setForeground(Color.black);
		Estadotxt.setBounds(503,350,170,30);
		Estadotxt.setBorder(null);
		Clientes.add(Estadotxt);
           // Boton agregar cleinte:::::::::::::::::::::::::::
	     JButton Agregar = new JButton("Agregar cliente");
	      Agregar.setBackground(Color.black);
	  	Font fontBoton= new Font("Arial",Font.BOLD,20);
	  	Agregar.setFont(fontBoton);
	        //entrar.setBounds(110, 350, 150, 50);
	        Agregar.setBorder(new ComponenteBotonRedondo(40));
	        Agregar.setForeground(Color.decode("#049cff"));
	        Agregar.setBounds(410, 430, 250, 50);
	        Clientes.add(Agregar);
                
                //Aqui se hacen las consultas:::::::::::::::::::::::::::
                
                Agregar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Connection cn;
                        cn = getConexion();
                   // primer consulta a la tabla Clientes --->
                        psd = cn.prepareStatement("INSERT INTO CLIENTE (NOMBREC,CALLE,COLONIA,MUNICIPIO,ESTADO,CORREO,TELEFONO) VALUES(?,?,?,?,?,?,?)");

                        psd.setString(1, NombreResponsabletxt.getText());
                        psd.setString(2, Calletxt.getText());
                        psd.setString(3, Coltxt.getText());
                        psd.setString(4, Municipiotxt.getText());
                        psd.setString(5, Estadotxt.getText());
                        psd.setString(6, Correotxt.getText());
                        psd.setString(7, Telefonotxt.getText());

                    //  segunda consulta a la tabla Obras  ---->
                        psd = cn.prepareStatement("INSERT INTO OBRA (CLAVEOB,NOMBRE, AP_PAT, AP_MAT) VALUES(?,?,?,?)");
                          psd.setString(1,  Numtxt.getText());
                        psd.setString(2,empresatxt.getText());
                        psd.setString(3,ApellidoResponsablePaternotxt.getText());
                        psd.setString(4,ApellidoResponsableMaterno.getText());
                      
                        
                        
                        
                        int res = psd.executeUpdate();
                        if (res < 0) {
                            JOptionPane.showMessageDialog(null, "No se pudo añadir el registro");
                        }
                        cn.close();

                    } catch (SQLException ex) {
                        System.err.println("Error en: " + ex);
                    }
                    // mt.actualizaEstatus();
                }
            });
       
                ///------------------------------------
                
  
		JLabel background = new JLabel();
		background.add(Clientes);
		add(background );
		setVisible(true);

	}// cierra AregarCliente
       
        
        
        
	public static void main(String[]args){
		
		new AgregarCliente();
	}
	
	

}

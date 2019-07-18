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
public class EditarMaquinaria extends JFrame {

	
	EditarMaquinaria(){
		
		setSize(860,500);
		setTitle("Editar maquinarias");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel DatosMaquinaria=new JPanel();
		DatosMaquinaria.setLayout(null);
		DatosMaquinaria.setSize(900,700);
		DatosMaquinaria.setBounds(0,0,1800,900);
		DatosMaquinaria.setBackground(Color.black);
		
		///En este panel se deben poner la imagenes
		JPanel Imagen = new JPanel();
		Imagen.setLayout(null);
		Imagen.setBounds(590,93,250,230);
		Imagen.setBackground(Color.decode("#049cff"));
		DatosMaquinaria.add(Imagen);

		JLabel Encabezado = new JLabel("Editar datos de la maquinaría:");
		Encabezado.setForeground(Color.white);
		Font fuente=new Font("Arial", Font.BOLD, 16);
		Encabezado.setFont(fuente);
		Encabezado.setBounds(349,0,300,70);
		DatosMaquinaria.add(Encabezado);
		
		JLabel NombreMaquinaEditar= new JLabel("Nombre de la máquina:");
		NombreMaquinaEditar.setForeground(Color.white);
		Font fuenteMaquina= new Font("Arial",Font.BOLD,14);
		NombreMaquinaEditar.setFont(fuenteMaquina);
		NombreMaquinaEditar.setBounds(0,30,300,150);
		DatosMaquinaria.add(NombreMaquinaEditar);
		
		JTextField NombreMaquinatxtEditar= new JTextField("");
		NombreMaquinatxtEditar.setForeground(Color.black);
		NombreMaquinatxtEditar.setBorder(null);
		NombreMaquinatxtEditar.setBounds(163,92,200,30);
		DatosMaquinaria.add(NombreMaquinatxtEditar);
		
		JLabel ModeloEditar = new JLabel("Modelo de la máquina:");
		ModeloEditar.setForeground(Color.white);
		Font fuenteModelo= new Font("Arial",Font.BOLD,14);
		ModeloEditar.setFont(fuenteModelo);
		ModeloEditar.setBounds(0,75,300,150);
		DatosMaquinaria.add(ModeloEditar);
		
		JTextField ModelotxtEditar= new JTextField("");
		ModelotxtEditar.setForeground(Color.black);
		ModelotxtEditar.setBorder(null);
		ModelotxtEditar.setBounds(164,140,200,30);
		DatosMaquinaria.add(ModelotxtEditar);
		
		JLabel TipoEditar = new JLabel("Tipo de máquina:");
		TipoEditar.setForeground(Color.white);
		Font fuenteTipo= new Font("Arial",Font.BOLD,14);
		TipoEditar.setFont(fuenteTipo);
		TipoEditar.setBounds(0,125,300,150);
		DatosMaquinaria.add(TipoEditar);
		
		JComboBox TipoComboEditar= new JComboBox();
		TipoComboEditar.setForeground(Color.black);
		TipoComboEditar.setBorder(null);
		TipoComboEditar.setBounds(161,190,200,30);
		DatosMaquinaria.add(TipoComboEditar);
		
		JLabel CostoEditar = new JLabel("Costo:");
		CostoEditar.setForeground(Color.white);
		Font fuenteCosto= new Font("Arial",Font.BOLD,14);
		CostoEditar.setFont(fuenteCosto);
		CostoEditar.setBounds(0,170,300,150);
		DatosMaquinaria.add(CostoEditar);
		
		JTextField CostoTxtEditar= new JTextField();
		CostoTxtEditar.setForeground(Color.black);
		CostoTxtEditar.setBorder(null);
		CostoTxtEditar.setBounds(161,238,200,30);
		DatosMaquinaria.add(CostoTxtEditar);
		
		JLabel MatriculaEditar = new JLabel("Matricula:");
		MatriculaEditar.setForeground(Color.white);
		Font fuenteMatricula= new Font("Arial",Font.BOLD,14);
		MatriculaEditar.setFont(fuenteMatricula);
		MatriculaEditar.setBounds(0,220,300,150);
		DatosMaquinaria.add(MatriculaEditar);
		
		JTextField MatriculaTxtEditar= new JTextField();
		MatriculaTxtEditar.setForeground(Color.black);
		MatriculaTxtEditar.setBorder(null);
		MatriculaTxtEditar.setBounds(161,290,200,30);
		DatosMaquinaria.add(MatriculaTxtEditar);
		
		
		JLabel MarcaEditar = new JLabel("Marca:");
		MarcaEditar.setForeground(Color.white);
		Font fuenteMarca= new Font("Arial",Font.BOLD,14);
		MarcaEditar.setFont(fuenteMarca);
		MarcaEditar.setBounds(0,270,300,150);
		DatosMaquinaria.add(MarcaEditar);
		
		JTextField MarcaTxtEditar= new JTextField();
		MarcaTxtEditar.setForeground(Color.black);
		MarcaTxtEditar.setBorder(null);
		MarcaTxtEditar.setBounds(161,334,200,30);
		DatosMaquinaria.add(MarcaTxtEditar);
		
				
		// En esta parte van los estados, los cuales deben ser : Ocupado,desocupado y descompuesto
		
		JLabel EstadoMaquinaEditar= new JLabel("Estado:");
		EstadoMaquinaEditar.setForeground(Color.white);
		Font fuenteMaquinaC= new Font("Arial",Font.BOLD,14);
		EstadoMaquinaEditar.setFont(fuenteMaquinaC);
		EstadoMaquinaEditar.setBounds(375,30,300,150);
		DatosMaquinaria.add(EstadoMaquinaEditar);
		
		JComboBox EstadoMaquinatxtEditar= new JComboBox();
		EstadoMaquinatxtEditar.setForeground(Color.black);
		EstadoMaquinatxtEditar.setBorder(null);
		EstadoMaquinatxtEditar.setBounds(427,92,150,30);
			DatosMaquinaria.add(EstadoMaquinatxtEditar);
		
		
		
		///////Botones
		
		JButton AgregarMaquinaria= new JButton("Agregar maquinaría");
		AgregarMaquinaria.setBackground(Color.black);
		AgregarMaquinaria.setBounds(350,400,210,50);
		AgregarMaquinaria.setBorder(new ComponenteBotonRedondo(40));
		AgregarMaquinaria.setForeground(Color.white);
		DatosMaquinaria.add(AgregarMaquinaria);
		
		JButton AgregarFoto= new JButton("Agregar foto");
		AgregarFoto.setBackground(Color.black);
		AgregarFoto.setBounds(610,330,210,50);
		AgregarFoto.setBorder(new ComponenteBotonRedondo(40));
		AgregarFoto.setForeground(Color.white);
		DatosMaquinaria.add(AgregarFoto);
		
	
		
		JLabel background = new JLabel();
    	background.add(DatosMaquinaria);
		add(background );
		setVisible(true);
			
	}
	
	public static void main(String[]args){
		new EditarMaquinaria();
		}
	
	
}

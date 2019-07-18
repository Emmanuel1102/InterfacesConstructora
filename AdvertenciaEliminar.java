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
public class AdvertenciaEliminar extends JFrame{
	
	AdvertenciaEliminar(){
		
		{
			
			setSize(470,200);
		
			setResizable(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			
		
			

			JPanel ModifAdv= new JPanel();
			ModifAdv.setLayout(null);
			ModifAdv.setSize(200,350);
			ModifAdv.setBackground(Color.decode("#049cff"));
			ModifAdv.setBounds(0,0,470,200);
			
			
			JLabel etiquetaAviso;
			etiquetaAviso=new JLabel("¿ESTAS SEGURO DE QUE QUIERES ELIMINAR LOS DATOS!!?");
			etiquetaAviso.setForeground(Color.white);
			etiquetaAviso.setBounds(70,20,400,50);
			ModifAdv.add(etiquetaAviso);

			
			JButton Seguro= new JButton("Si ,estoy seguro");
			Seguro.setBackground(Color.decode("#049cff"));
			Seguro.setBounds(10,80,200,50);
		    Seguro.setBorder(new ComponenteBotonRedondo(40));
			Seguro.setForeground(Color.black);
			ModifAdv.add(Seguro);
			
			JButton Cobarde= new JButton("No ,no estoy seguro");
			Cobarde.setBackground(Color.decode("#049cff"));
			Cobarde.setBounds(250,80,200,50);
		    Cobarde.setBorder(new ComponenteBotonRedondo(40));
			Cobarde.setForeground(Color.black);
			ModifAdv.add(Cobarde);
			
			
			
		
			JLabel background = new JLabel();
			background.add(ModifAdv);
			background.setBounds(0,0,700,700);
			add(background );
		
			setVisible(true);
			
			
			
			
		
	}
		
	
	}
	
	public static void main(String[]args){
		new AdvertenciaEliminar();
	}
}


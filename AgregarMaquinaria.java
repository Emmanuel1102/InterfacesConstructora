
import java.awt.*;

import javax.swing.*;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class AgregarMaquinaria extends JFrame {

    AgregarMaquinaria() {

        setSize(860, 500);
        setTitle("Agregar maquinarias");
        setResizable(false);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel DatosMaquinaria = new JPanel();
        DatosMaquinaria.setLayout(null);
        DatosMaquinaria.setSize(900, 700);
        DatosMaquinaria.setBounds(0, 0, 1800, 900);
        DatosMaquinaria.setBackground(Color.decode("#049cff"));

        ///En este panel se deben poner la imagenes
        JPanel Imagen = new JPanel();
        Imagen.setLayout(null);
        Imagen.setBounds(590, 93, 250, 230);
        Imagen.setBackground(Color.black);
        DatosMaquinaria.add(Imagen);

        JLabel Encabezado = new JLabel("Agregar datos de la maquinaría:");
        Encabezado.setForeground(Color.white);
        Font fuente = new Font("Arial", Font.BOLD, 16);
        Encabezado.setFont(fuente);
        Encabezado.setBounds(349, 0, 300, 70);
        DatosMaquinaria.add(Encabezado);

        JLabel NombreMaquina = new JLabel("Nombre de la máquina:");
        NombreMaquina.setForeground(Color.white);
        Font fuenteMaquina = new Font("Arial", Font.BOLD, 14);
        NombreMaquina.setFont(fuenteMaquina);
        NombreMaquina.setBounds(0, 30, 300, 150);
        DatosMaquinaria.add(NombreMaquina);

        JTextField NombreMaquinatxt = new JTextField("");
        NombreMaquinatxt.setForeground(Color.black);
        NombreMaquinatxt.setBorder(null);
        NombreMaquinatxt.setBounds(163, 92, 200, 30);
        DatosMaquinaria.add(NombreMaquinatxt);

        JLabel Modelo = new JLabel("Modelo de la máquina:");
        Modelo.setForeground(Color.white);
        Font fuenteModelo = new Font("Arial", Font.BOLD, 14);
        Modelo.setFont(fuenteModelo);
        Modelo.setBounds(0, 75, 300, 150);
        DatosMaquinaria.add(Modelo);

        CampoDato Modelotxt = new CampoDato();
        Modelotxt.setForeground(Color.black);
        Modelotxt.setBorder(null);
        Modelotxt.setBounds(164, 140, 200, 30);
        Modelotxt.setTipo('E');
        Modelotxt.setLongitud(15);
        DatosMaquinaria.add(Modelotxt);

        JLabel Tipo = new JLabel("Tipo de máquina:");
        Tipo.setForeground(Color.white);
        Font fuenteTipo = new Font("Arial", Font.BOLD, 14);
        Tipo.setFont(fuenteTipo);
        Tipo.setBounds(0, 125, 300, 150);
        DatosMaquinaria.add(Tipo);

        JComboBox TipoCombo = new JComboBox();
        TipoCombo.setForeground(Color.black);
        TipoCombo.setBorder(null);
        TipoCombo.setBounds(161, 190, 200, 30);
        DatosMaquinaria.add(TipoCombo);

        JLabel Costo = new JLabel("Costo:");
        Costo.setForeground(Color.white);
        Font fuenteCosto = new Font("Arial", Font.BOLD, 14);
        Costo.setFont(fuenteCosto);
        Costo.setBounds(0, 170, 300, 150);
        DatosMaquinaria.add(Costo);

        CampoDato CostoTxt = new CampoDato();
        CostoTxt.setForeground(Color.black);
        CostoTxt.setBorder(null);
        CostoTxt.setBounds(161, 238, 200, 30);        
        CostoTxt.setTipo('D');
        CostoTxt.setLongitud(15);
        DatosMaquinaria.add(CostoTxt);

        JLabel Matricula = new JLabel("Matricula:");
        Matricula.setForeground(Color.white);
        Font fuenteMatricula = new Font("Arial", Font.BOLD, 14);
        Matricula.setFont(fuenteMatricula);
        Matricula.setBounds(0, 220, 300, 150);
        DatosMaquinaria.add(Matricula);

        JTextField MatriculaTxt = new JTextField();
        MatriculaTxt.setForeground(Color.black);
        MatriculaTxt.setBorder(null);
        MatriculaTxt.setBounds(161, 290, 200, 30);
        DatosMaquinaria.add(MatriculaTxt);

        JLabel Marca = new JLabel("Marca:");
        Marca.setForeground(Color.white);
        Font fuenteMarca = new Font("Arial", Font.BOLD, 14);
        Marca.setFont(fuenteMarca);
        Marca.setBounds(0, 270, 300, 150);
        DatosMaquinaria.add(Marca);

        JTextField MarcaTxt = new JTextField();
        MarcaTxt.setForeground(Color.black);
        MarcaTxt.setBorder(null);
        MarcaTxt.setBounds(161, 334, 200, 30);
        DatosMaquinaria.add(MarcaTxt);

        ///////        // En esta parte van los estados, los que deben ser: EN USO, DISPONIBLE y MANTENIMIENTO
        JLabel EstadoMaquinaAgregar = new JLabel(" Estado: ");
        EstadoMaquinaAgregar.setForeground(Color.WHITE);
        Font fuenteMaquinaC = new Font(" Arial ", Font.BOLD, 14);
        EstadoMaquinaAgregar.setFont(fuenteMaquinaC);
        EstadoMaquinaAgregar.setBounds(375, 30, 300, 150);
        DatosMaquinaria.add(EstadoMaquinaAgregar);

        String tiposEstados[] = {" EN USO ", " DISPONIBLE ", " MANTENIMIENTO "};
        JComboBox EstadoMaquinatxtAgregar = new JComboBox(tiposEstados);
        EstadoMaquinatxtAgregar.setForeground(Color.BLACK);
        EstadoMaquinatxtAgregar.setBorder(null);
        EstadoMaquinatxtAgregar.setBounds(427, 92, 150, 30);
        DatosMaquinaria.add(EstadoMaquinatxtAgregar);

        ///////Botones
        JButton AgregarMaquina = new JButton("Agregar maquinaría");
        AgregarMaquina.setBackground(Color.decode("#049cff"));
        AgregarMaquina.setBounds(350, 400, 210, 50);
        AgregarMaquina.setBorder(new ComponenteBotonRedondo(40));
        AgregarMaquina.setForeground(Color.black);
        DatosMaquinaria.add(AgregarMaquina);
        AgregarMaquina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nombre = NombreMaquinatxt.getText();
                int modelo =Integer.parseInt(Modelotxt.getText());
                String tipo = (String) TipoCombo.getSelectedItem();
                double costo = Integer.parseInt(CostoTxt.getText());
                String matricula = MatriculaTxt.getText();
                String marca = MarcaTxt.getText();

            }
        });

        JButton AgregarFoto = new JButton("Agregar foto");
        AgregarFoto.setBackground(Color.decode("#049cff"));
        AgregarFoto.setBounds(610, 330, 210, 50);
        AgregarFoto.setBorder(new ComponenteBotonRedondo(40));
        AgregarFoto.setForeground(Color.black);
        DatosMaquinaria.add(AgregarFoto);

        JLabel background = new JLabel();
        background.add(DatosMaquinaria);
        add(background);
        setVisible(true);

    }

    public static void main(String[] args) {
        new AgregarMaquinaria();
    }
}

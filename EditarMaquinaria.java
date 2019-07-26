import java.awt.*;

import javax.swing.*;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.imageio.ImageIO;

//import componentetextfield.CampoDato;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.border.Border;

public class EditarMaquinaria extends JFrame {

    //PrincipalOriginal pp = new PrincipalOriginal();
    static CampoDato dPrecioRenta;
    static JTextField MatriculaTxtEditar;
    static CampoDato CostoTxtEditar;
    static CampoDato ModelotxtEditar;
    static JTextField NombreMaquinatxtEditar;
    static JTextField marca_Maquinaria;
    FileInputStream fis;
    int longitud_bytes;
    PreparedStatement psd;
    ModeloTabla_Maquinaria modelo=new ModeloTabla_Maquinaria("Adminn", "admin");
    
    public EditarMaquinaria(int id) {

        setSize(860, 500);
        setTitle("Editar maquinarias");
        setResizable(false);
        //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        JPanel DatosMaquinaria = new JPanel();
        DatosMaquinaria.setLayout(null);
        DatosMaquinaria.setSize(900, 700);
        DatosMaquinaria.setBounds(0, 0, 1800, 900);
        DatosMaquinaria.setBackground(Color.black);

        ///En este panel se deben poner la imagenes
        JLabel Imagen = new JLabel();
        Imagen.setLayout(null);
        Imagen.setBounds(590, 93, 250, 230);
        Imagen.setBackground(Color.decode("#049cff"));
        Imagen.setIcon(modelo.getImagen(id));
        DatosMaquinaria.add(Imagen);

        JLabel Encabezado = new JLabel("Editar datos de la maquinaría:");
        Encabezado.setForeground(Color.white);
        Font fuente = new Font("Arial", Font.BOLD, 16);
        Encabezado.setFont(fuente);
        Encabezado.setBounds(349, 0, 300, 70);
        DatosMaquinaria.add(Encabezado);

        JLabel NombreMaquinaEditar = new JLabel("Nombre de la máquina:");
        NombreMaquinaEditar.setForeground(Color.white);
        Font fuenteMaquina = new Font("Arial", Font.BOLD, 14);
        NombreMaquinaEditar.setFont(fuenteMaquina);
        NombreMaquinaEditar.setBounds(0, 30, 300, 150);
        DatosMaquinaria.add(NombreMaquinaEditar);

        NombreMaquinatxtEditar = new JTextField();
        NombreMaquinatxtEditar.setForeground(Color.black);
        NombreMaquinatxtEditar.setBorder(null);
        NombreMaquinatxtEditar.setBounds(163, 92, 200, 30);
        DatosMaquinaria.add(NombreMaquinatxtEditar);

        JLabel ModeloEditar = new JLabel("Modelo de la máquina:");
        ModeloEditar.setForeground(Color.white);
        Font fuenteModelo = new Font("Arial", Font.BOLD, 14);
        ModeloEditar.setFont(fuenteModelo);
        ModeloEditar.setBounds(0, 75, 300, 150);
        DatosMaquinaria.add(ModeloEditar);

        //JTextField ModelotxtEditar = new JTextField(String.valueOf(modelo));        
        ModelotxtEditar = new CampoDato();
        ModelotxtEditar.setForeground(Color.black);
        ModelotxtEditar.setBorder(null);
        ModelotxtEditar.setBounds(164, 140, 200, 30);
        ModelotxtEditar.setTipo('E');
        ModelotxtEditar.setLongitud(15);
        DatosMaquinaria.add(ModelotxtEditar);

        JLabel TipoEditar = new JLabel("Tipo de máquina:");
        TipoEditar.setForeground(Color.white);
        Font fuenteTipo = new Font("Arial", Font.BOLD, 14);
        TipoEditar.setFont(fuenteTipo);
        TipoEditar.setBounds(0, 125, 300, 150);
        DatosMaquinaria.add(TipoEditar);

        String[] tiposMaquinas = {"Excavadora", "Revolvedora", "Volteo"};
        JComboBox TipoComboEditar = new JComboBox(tiposMaquinas);
        TipoComboEditar.setForeground(Color.black);
        TipoComboEditar.setBorder(null);
        TipoComboEditar.setBounds(161, 190, 200, 30);
        DatosMaquinaria.add(TipoComboEditar);

        JLabel CostoEditar = new JLabel("Costo:");
        CostoEditar.setForeground(Color.white);
        Font fuenteCosto = new Font("Arial", Font.BOLD, 14);
        CostoEditar.setFont(fuenteCosto);
        CostoEditar.setBounds(0, 170, 300, 150);
        DatosMaquinaria.add(CostoEditar);

        CostoTxtEditar = new CampoDato();
        CostoTxtEditar.setForeground(Color.black);
        CostoTxtEditar.setBorder(null);
        CostoTxtEditar.setBounds(161, 238, 200, 30);
        CostoTxtEditar.setTipo('D');
        CostoTxtEditar.setLongitud(15);
        DatosMaquinaria.add(CostoTxtEditar);

        JLabel MatriculaEditar = new JLabel("Matricula:");
        MatriculaEditar.setForeground(Color.white);
        Font fuenteMatricula = new Font("Arial", Font.BOLD, 14);
        MatriculaEditar.setFont(fuenteMatricula);
        MatriculaEditar.setBounds(0, 220, 300, 150);
        DatosMaquinaria.add(MatriculaEditar);

        MatriculaTxtEditar = new JTextField();
        MatriculaTxtEditar.setForeground(Color.black);
        MatriculaTxtEditar.setBorder(null);
        MatriculaTxtEditar.setBounds(161, 290, 200, 30);
        DatosMaquinaria.add(MatriculaTxtEditar);

        JLabel MarcaEditar = new JLabel("Precio Renta:");
        MarcaEditar.setForeground(Color.white);
        Font fuenteMarca = new Font("Arial", Font.BOLD, 14);
        MarcaEditar.setFont(fuenteMarca);
        MarcaEditar.setBounds(0, 270, 300, 150);
        DatosMaquinaria.add(MarcaEditar);

        CampoDato RentaTxtEditar = new CampoDato();
        RentaTxtEditar.setForeground(Color.black);
        RentaTxtEditar.setBorder(null);
        RentaTxtEditar.setBounds(161, 334, 200, 30);
        RentaTxtEditar.setTipo('D');
        RentaTxtEditar.setLongitud(12);
        DatosMaquinaria.add(RentaTxtEditar);
        // En esta parte van los estados, los cuales deben ser : EN USO, DISPONIBLE y MANTENIMIENTO
        JLabel EstadoMaquinaAgregar = new JLabel("Estado:");
        EstadoMaquinaAgregar.setForeground(Color.white);
        Font fuenteMaquinaC = new Font("Arial", Font.BOLD, 14);
        EstadoMaquinaAgregar.setFont(fuenteMaquinaC);
        EstadoMaquinaAgregar.setBounds(375, 30, 300, 150);
        DatosMaquinaria.add(EstadoMaquinaAgregar);

        String tiposEstados[] = {"EN USO", "DISPONIBLE", "MANTENIMIENTO"};
        JComboBox EstadoMaquinatxtAgregar = new JComboBox(tiposEstados);
        EstadoMaquinatxtAgregar.setForeground(Color.black);
        EstadoMaquinatxtAgregar.setBorder(null);
        EstadoMaquinatxtAgregar.setBounds(427, 92, 150, 30);
        DatosMaquinaria.add(EstadoMaquinatxtAgregar);

        ///////Botones
        JButton AgregarMaquinaria = new JButton("Agregar maquinaría");
        AgregarMaquinaria.setBackground(Color.black);
        AgregarMaquinaria.setBounds(350, 400, 210, 50);
        AgregarMaquinaria.setBorder(new ComponenteBotonRedondo(40));
        AgregarMaquinaria.setForeground(Color.white);
        DatosMaquinaria.add(AgregarMaquinaria);
        JFrame copy = this;
        AgregarMaquinaria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //dispose();
                String nombre = NombreMaquinatxtEditar.getText();
                int modelo_maq = Integer.parseInt(ModelotxtEditar.getText());
                String tipo = (String) TipoComboEditar.getSelectedItem();
                double costo = Integer.parseInt(CostoTxtEditar.getText());
                String matricula = MatriculaTxtEditar.getText();
                //String marca = MarcaTxt.getText();
                String estado = EstadoMaquinatxtAgregar.getSelectedItem().toString();
                double precio_renta = Double.parseDouble(dPrecioRenta.getText());
                ModeloTabla_Maquinaria m =new ModeloTabla_Maquinaria("Adminn","admin");
                m.actualizaEstatus(id);
                System.out.println(nombre);
                try {
                    Connection cn;
                    cn =Clase_Conexion.getConexion();
                    psd = cn.prepareStatement("UPDATE MAQUINARIA SET NOMBRE_MAQ=?,TIPO_MAQ=?,MODELO_MAQ=?,COSTO_MAQ=?,ESTADO_MAQ=?,PRECIORENTA_MAQ=?,MATRICULA_MAQ=?,IMAGEN_MAQ=? WHERE CLAVE_MAQ= "+id);
                    psd.setString(1, nombre);
                    psd.setString(2, tipo);
                    psd.setInt(3, modelo_maq);
                    psd.setDouble(4, costo);
                    psd.setString(5, estado);
                    psd.setDouble(6, precio_renta);
                    psd.setString(7, matricula);
                    
                    psd.setBlob(8, fis, getLongitud());
                    int res = psd.executeUpdate();
                    
                   if (res < 0) {
                        JOptionPane.showMessageDialog(null, "No se pudo añadir el registro");
                    }
                    JOptionPane.showMessageDialog(null, "Registro Exitoso");
                    cn.close();
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    modelo.actualizaEstatus();
                } catch (SQLException e) {
                    System.err.println("Error en: " + e);
                }

                //modelo.actualizaEstatus();
                //dispose();
            }

                

            
        });

        JButton AgregarFoto = new JButton("Agregar foto");
        AgregarFoto.setBackground(Color.black);
        AgregarFoto.setBounds(610, 330, 210, 50);
        AgregarFoto.setBorder(new ComponenteBotonRedondo(40));
        AgregarFoto.setForeground(Color.white);
        DatosMaquinaria.add(AgregarFoto);
        AgregarFoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int estado = jfc.showOpenDialog(null);
                if (estado == JFileChooser.APPROVE_OPTION) {
                    try {
                        fis = new FileInputStream(jfc.getSelectedFile());
                        longitud_bytes = (int) jfc.getSelectedFile().length();

                        Image icono = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT);
                        Imagen.setIcon(new ImageIcon(icono));
                        Imagen.updateUI();

                        setLongitud(longitud_bytes);
                    } catch (Exception ee) {
                    }
                }
            }
        });

        JLabel background = new JLabel();
        background.add(DatosMaquinaria);
        add(background);
        setVisible(true);

    }
public void setLongitud(int longi){
        longitud_bytes=longi;
    }
    public int getLongitud(){
        return longitud_bytes;
    }

}

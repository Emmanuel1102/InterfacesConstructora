import java.awt.*;

import javax.swing.*;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

  /**
     * **VARIABLES DEL METODO MAQUINARIA
     */
//private JPanel bienvenido, Maquinaria, Obras, Clientes, Finanzas;
   

public class PrincipalOriginal extends JFrame {
    //ModeloTabla_Cliente model= ModeloTabla_Cliente();
    public Connection getConexion() throws SQLException {
        Connection conexion = null;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conexion = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/Construct", "Adminn", "Admin");
           // JOptionPane.showMessageDialog(null,
         //           "¡Registro guardado exitosamente!");
        } catch (ClassNotFoundException | HeadlessException e) {
            JOptionPane.showMessageDialog(null,
                    "Hubo un error en la instalacion" + e);

        }
        return conexion;

    }
    
    
    
    
    
    
    
    
         ModeloTabla_Maquinaria modelo = new ModeloTabla_Maquinaria("Adminn", "admin");
    TableRowSorter TRSFiltro = new TableRowSorter();
    PreparedStatement psd, psd2;
    JTable MaquinasT = new JTable(modelo);
    JTextField busqueda;
    String nombre_maq;
    int modelo_maq;
    double costo_maq;
    String matricula_maq;
    double Precio_renta_maq;


    private JPanel bienvenido, Maquinaria, Obras, Clientes, Finanzas;
       private CardLayout Imagenes;
    private  String nImagenes []={"C:\\Users\\Emmanuel\\Desktop\\manual\\m1.jpg","C:\\Users\\Emmanuel\\Desktop\\manual\\m2.jpg","C:\\Users\\Emmanuel\\Desktop\\manual\\m3.jpg",
    		"C:\\Users\\Emmanuel\\Desktop\\manual\\m4.jpg","C:\\Users\\Emmanuel\\Desktop\\manual\\m5.jpg","C:\\Users\\Emmanuel\\Desktop\\manual\\m6.jpg","C:\\Users\\Emmanuel\\Desktop\\manual\\m7.jpg","C:\\Users\\Emmanuel\\Desktop\\manual\\m8.jpg","C:\\Users\\Emmanuel\\Desktop\\manual\\m9.jpg"
    		,"C:\\Users\\Emmanuel\\Desktop\\manual\\m10.jpg"};
    private Icon  icons[]={new ImageIcon(nImagenes[0]),new ImageIcon(nImagenes[1]),new ImageIcon(nImagenes[2]),new ImageIcon(nImagenes[3]),new ImageIcon(nImagenes[4]),new ImageIcon(nImagenes[5]),new ImageIcon(nImagenes[6]),new ImageIcon(nImagenes[7]),new ImageIcon(nImagenes[8])
    ,new ImageIcon(nImagenes[9])};
    private JLabel la[];
	 private JPanel ap[]; 
	 int contar=0;
	 ImageIcon Graficas = new ImageIcon("C:\\Users\\Emmanuel\\Desktop\\manual\\graf.png");

    PrincipalOriginal() {
        setSize(1366, 768);
        setTitle("Sistema de gestion de maquinaria");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel principal = new JPanel();
        principal.setLayout(null);

        principal.setBackground(Color.black);
        principal.setBounds(0, 115, 1366, 768);

        ImageIcon background_image = new ImageIcon("C:\\Users\\Bayer\\Documents\\NetBeansProjects\\Constructora_Adan\\neo3.jpg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);
        background.add(principal);
        background.setBounds(0, 0, 1366, 768);
        add(background);

        /**
         * Parte donde se agregan las Pestañas
         */
        JTabbedPane tabla = new JTabbedPane();
        tabla.setBounds(0, 0, 1366, 768);
        principal.add(tabla);
        tabla.addTab("Bienvenido al sistema ", bienvenido());
        tabla.addTab("Maquinaria", Maquinaria());
        tabla.addTab("Obras", Obras());
        tabla.addTab("Clientes", Clientes());
        tabla.addTab("Finanzas", Finanzas());

    }

    public static void main(String[] args) {
        new PrincipalOriginal();
    }

    public JPanel bienvenido() {
        
        //Se agrego en esta parte el algoritmo de la galeria de manual rapido de usuario
  bienvenido = new JPanel();
        bienvenido.setLayout(null);
        setBounds(0, 0, 1366, 768);
        bienvenido.setBackground(Color.black);
        
        JLabel manual = new JLabel("Guía rápida del manual de usuario:");
        manual.setForeground(Color.decode("#049cff"));
    	Font fuente=new Font("Arial", Font.BOLD, 16);
    	manual.setBounds(550,15,400,30);
    	manual.setFont(fuente);
        bienvenido.add(manual);
        


		JPanel botonAtras = new JPanel();
		 botonAtras.setLayout(null);
		 //botonAtras.setSize(400,350);
		 botonAtras.setBackground(new Color (0,0,0,100));
		 botonAtras.setBounds(50,250,51,87);
			bienvenido.add(botonAtras);
		

		JPanel botonAdelante = new JPanel();
		botonAdelante.setLayout(null);
		//botonAdelante.setSize(400,350);
		botonAdelante.setBackground(new Color (0,0,0,100));
		botonAdelante.setBounds(1260,250,51,87);
		bienvenido.add(botonAdelante);
		
		JButton atras= new JButton("<");
		atras.setBackground(Color.black);
		Font fuenteA=new Font("Arial", Font.BOLD, 86);
		atras.setForeground(Color.decode("#049cff"));
		atras.setFont(fuenteA);
		//atras.setBackground(Color.decode("#B9090B"));
		atras.setBounds(1,1,1,1);
		atras.setSize(51,87);
		//atras.setIcon(atras1);
		atras.setBorder(null);
		 botonAtras.add(atras);
		
		JButton adelante= new JButton(">");
		adelante.setBackground(Color.black);
		Font fuenteAd=new Font("Arial", Font.BOLD, 86);
		adelante.setForeground(Color.decode("#049cff"));
		adelante.setFont(fuenteA);
		//atras.setBackground(Color.decode("#B9090B"));
		adelante.setBounds(1,1,1,1);
		adelante.setSize(51,87);
	
		adelante.setBorder(null);
		botonAdelante.add(adelante);
		
		
		Imagenes=new CardLayout(); 
		final JPanel ImagenPanel = new JPanel();
		 ImagenPanel.setLayout(null);

		 ImagenPanel.setBackground(Color.white);
		 ImagenPanel.setBounds(132,50,1105,500);
		
		 la =new JLabel[ nImagenes.length]; 
		 ap=new JPanel[icons.length];   
		 ImagenPanel.setLayout(Imagenes);
		
		 for(int z=0; z<nImagenes.length;z++){
			    la[z]=new JLabel(icons[z]); 
			    ap[z ]=new JPanel(); 
			    ap[z].add(la[z]);
			    ap[z].setBackground(Color.BLACK);
			    ImagenPanel.add(ap[z],String.valueOf(z));
			}
		
		 
		 adelante.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
			 if (contar < nImagenes.length) {
			 contar += 1;
			 Imagenes.show( ImagenPanel,"" + (contar));
			 }
			 }
			 });
			
			 atras.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
			 if (contar > 0) {
			 contar -= 1;
			 Imagenes.show( ImagenPanel, "" + (contar));
			 }
			 
			 
			 }
			 });
		
		 

		bienvenido.add(ImagenPanel);

        
        return bienvenido;
    }

   public JPanel Maquinaria() {

        JPanel Maquinas = new JPanel();
        Maquinas.setLayout(null);
        Maquinas.setBackground(Color.black);

        //La reorganizacion de las colunmas se desactiva
        MaquinasT.getTableHeader().setReorderingAllowed(false);
        //La redimencion de las colunmas se desactiva
        TableColumnModel columnModel = MaquinasT.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(20);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(50);
        columnModel.getColumn(5).setPreferredWidth(50);
        columnModel.getColumn(6).setPreferredWidth(50);
        MaquinasT.getTableHeader().setResizingAllowed(false);
        //Se Restinge la seleccion de las filas a solo una
        // MaquinasT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane sc = new JScrollPane(MaquinasT);
        sc.setVisible(true);
        sc.setBounds(20, 70, 1000, 400);
        Maquinas.add(sc);

        busqueda = new JTextField();
        busqueda.setForeground(Color.black);
        busqueda.setBounds(463, 15, 400, 30);
        Maquinas.add(busqueda);

        JLabel panelImagen = new JLabel();

        panelImagen.setSize(
                200, 200);
        panelImagen.setBackground(Color.BLUE);

        panelImagen.setBounds(
                1100, 70, 200, 200);
        Maquinas.add(panelImagen);

        JButton Buscar = new JButton("BUSCAR");

        Buscar.setBackground(Color.black);
        //entrar.setBounds(110, 350, 150, 50);

        Buscar.setBorder(new ComponenteBotonRedondo(40));
        Buscar.setForeground(Color.decode("#049cff"));
        Buscar.setBounds(
                866, 15, 150, 30);
        Maquinas.add(Buscar);

        JButton Agregar = new JButton("Agregar");

        Agregar.setBackground(Color.black);

        Agregar.setBorder(
                new ComponenteBotonRedondo(40));
        Agregar.setForeground(Color.decode("#049cff"));
        Agregar.setBounds(
                1050, 310, 140, 50);
        Maquinas.add(Agregar);
        //abre una nueva ventana para agregar una maquinaría

        Agregar.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new AgregarMaquinaria();
                modelo.actualizaEstatus();
            }
        }
        );

        JButton Editar = new JButton("Editar");
        Editar.setBackground(Color.black);
        Editar.setBorder(new ComponenteBotonRedondo(40));
        Editar.setForeground(Color.decode("#049cff"));
        Editar.setBounds(1200, 310, 140, 50);
        Maquinas.add(Editar);
        //abre una nueva venta para editar la maquinaría seleccionada
        
        Editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int fila = MaquinasT.getSelectedRow();

               
                if (fila < 0) {
                    JOptionPane.showMessageDialog(null, "Seleccione un registro");
                } else {
                    int id_maq = Integer.parseInt(MaquinasT.getValueAt(fila, 0).toString());
                    new EditarMaquinaria(id_maq);

                }

            }
        }
        );
        JButton Eliminar_maq = new JButton("Eliminar");
        Eliminar_maq.setBackground(Color.black);
        Eliminar_maq.setBorder(new ComponenteBotonRedondo(40));
        Eliminar_maq.setForeground(Color.decode("#049cff"));
        Eliminar_maq.setBounds(1050, 380, 140, 50);
        //Borra el registro de la base de datos
        Eliminar_maq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fila = MaquinasT.getSelectedRow();

                if (fila < 0) {
                    JOptionPane.showMessageDialog(null, "Seleccione un registro");
                } else {

                    int id = Integer.parseInt(MaquinasT.getValueAt(fila, 0).toString());
                    String sql = "DELETE FROM MAQUINARIA WHERE CLAVE_MAQ = " + id;
                    int res = 0;
                    try {
                        Connection cn = Clase_Conexion.getConexion();
                        psd = cn.prepareStatement(sql);
                        res = psd.executeUpdate();
                        if (res > 0) {
                            JOptionPane.showMessageDialog(null, "Registro Eliminado");
                        }
                        cn.close();
                    } catch (SQLException ee) {
                        System.err.println("Error en: " + ee);
                    }
                }
            }
        });
        Maquinas.add(Eliminar_maq);

        /////nuevo    
        JButton Autorizar = new JButton("Autorizar");

        Autorizar.setBackground(Color.black);

        Autorizar.setBorder(new ComponenteBotonRedondo(40));
        Autorizar.setForeground(Color.decode("#049cff"));
        Autorizar.setBounds(
                1200, 380, 140, 50);
        Maquinas.add(Autorizar);
        //abre una nueva ventana para autorizar la salida de una máquina

        Autorizar.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae
            ) {
                new Autorizar();
            }
        }
        );
        
        MaquinasT.getSelectionModel()
                .addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent ek
                    ) {
                        int fila = MaquinasT.getSelectedRow();
                        int id = Integer.parseInt(MaquinasT.getValueAt(fila, 0).toString());
                        ModeloTabla_Maquinaria mt = new ModeloTabla_Maquinaria("Adminn", "admin");
                        ImageIcon foto = mt.getImagen(id);
                        if (foto != null) {
                            panelImagen.setIcon(foto);
                        } else {
                            panelImagen.setText("No Existe una Imagen el la base de Datos");
                        }
                        panelImagen.updateUI();
                        panelImagen.repaint();
                    }
                }
                );

        busqueda.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                modelo.actualizaEstatus(busqueda.getText());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                modelo.actualizaEstatus(busqueda.getText());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                modelo.actualizaEstatus(busqueda.getText());
            }
        });

        return Maquinas;
    }

    public JPanel Obras() {

        JPanel Obras = new JPanel();
        Obras.setLayout(null);
        Obras.setBackground(Color.black);

        String[] Cabecera = {"NOMBRE DE LA OBRA", "NOMBRE DEL RESPONSABLE", "FECHA DE INICIO", "FECHA DE FINALIZACIÓN", "NÚMERO DEL RESPONSABLE", "INVERSIÓN $", "NOMBRE DE LA EMPRESA", "NUM DE MÁQUINAS RENTADAS"};
        String[][] datos = {{"Carretera Esmeralda", "Juan de Dios", "01/02/16", "01/03/16", "9566162", "100,000", "Construcciones El chapo", "3"}};
        DefaultTableModel modelo = new DefaultTableModel(datos, Cabecera) {
            //La edicion de la tabla esta desactivada
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        JTable OrasT = new JTable(modelo);
        //La reorganizacion de las colunmas se desactiva
        OrasT.getTableHeader().setReorderingAllowed(false);
        //La redimencion de las colunmas se desactiva
        OrasT.getTableHeader().setResizingAllowed(false);
        //Se Restinge la seleccion de las filas a solo una
        OrasT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane sc = new JScrollPane(OrasT);
        sc.setVisible(true);
        sc.setBounds(10, 70, 1336, 410);
        Obras.add(sc);

        JTextField busqueda = new JTextField();
        busqueda.setForeground(Color.black);
        busqueda.setBounds(463, 15, 400, 30);
        Obras.add(busqueda);

        JButton Buscar = new JButton("BUSCAR");
        Buscar.setBackground(Color.black);
        //entrar.setBounds(110, 350, 150, 50);
        Buscar.setBorder(new ComponenteBotonRedondo(40));
        Buscar.setForeground(Color.decode("#049cff"));
        Buscar.setBounds(866, 15, 150, 30);
        Obras.add(Buscar);

        JButton Agregar = new JButton("Agregar");
        Agregar.setBackground(Color.black);
        Agregar.setBorder(new ComponenteBotonRedondo(40));
        Agregar.setForeground(Color.decode("#049cff"));
        Agregar.setBounds(400, 498, 150, 50);
        Obras.add(Agregar);
        //abre una nueva venta para agregar una nueva obra
        Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new AgregarObra();
            }
        });

        JButton Editar = new JButton("Editar");
        Editar.setBackground(Color.black);
        Editar.setBorder(new ComponenteBotonRedondo(40));
        Editar.setForeground(Color.decode("#049cff"));
        Editar.setBounds(600, 498, 150, 50);
        Obras.add(Editar);
        //abre una nueva ventana para editar la obra seleccionada 
        Editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int fila = OrasT.getSelectedRow();
                    String obra = (String) OrasT.getValueAt(fila, 0);
                    String responsable = (String) OrasT.getValueAt(fila, 1);
                    Date fechaIni = new Date((String) OrasT.getValueAt(fila, 2));
                    Date fechaFin = new Date((String) OrasT.getValueAt(fila, 3));
                    String numero = (String) OrasT.getValueAt(fila, 4);
                    double inversion = esDouble((String) OrasT.getValueAt(fila, 5));
                    String empresa = (String) OrasT.getValueAt(fila, 6);
                    int numMaqui = esNum((String) OrasT.getValueAt(fila, 7));
                    new EditarObra(obra, responsable, fechaIni, fechaFin, numero, inversion, empresa, numMaqui);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Seleccione una Obra\n" + e.toString());
                }
            }
        });

        JButton Eliminar = new JButton("Eliminar");
        Eliminar.setBackground(Color.black);
        Eliminar.setBorder(new ComponenteBotonRedondo(40));
        Eliminar.setForeground(Color.decode("#049cff"));
        Eliminar.setBounds(800, 498, 150, 50);
        Obras.add(Eliminar);
        //se elimana la obera seleccionada
        Eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

            }
        });
        return Obras;
    }

    public JPanel Clientes() {
        JPanel Clientes = new JPanel();
        Clientes.setLayout(null);
        Clientes.setBackground(Color.black);

        String[] Cabecera = {"NOMBRE(S)", "CALLE", "NÚMERO", "COLONIA", "MUNICIPIO", "ESTADO", "CORREO ELECTRÓNICO", "NÚMERO TELEFÓNICO"};
        String[][] datos = {{"Juan de Dios", "La soledad", "16", "Trinidad de Viguera", "Oaxaca de juárez", "Oaxaca", "emmanuel1102@hotmail.com", "71826371"}};
        JTable MaquinasT = new JTable(datos, Cabecera);
        JScrollPane sc = new JScrollPane(MaquinasT);
        sc.setVisible(true);
        sc.setBounds(10, 70, 1336, 410);
        Clientes.add(sc);

        JTextField busqueda = new JTextField();
        busqueda.setForeground(Color.black);
        busqueda.setBounds(463, 15, 400, 30);
        Clientes.add(busqueda);

        JButton Buscar = new JButton("BUSCAR");
        Buscar.setBackground(Color.black);
        //entrar.setBounds(110, 350, 150, 50);
        Buscar.setBorder(new ComponenteBotonRedondo(40));
        Buscar.setForeground(Color.decode("#049cff"));
        Buscar.setBounds(866, 15, 150, 30);
        Clientes.add(Buscar);

        JButton Agregar = new JButton("Agregar");
        Agregar.setBackground(Color.black);
        Agregar.setBorder(new ComponenteBotonRedondo(40));
        Agregar.setForeground(Color.decode("#049cff"));
        Agregar.setBounds(400, 498, 150, 50);
        Clientes.add(Agregar);
      
         // Funcion para el  boton agregar 
         Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               AgregarCliente agregarCliente = new AgregarCliente();
               agregarCliente.setVisible(true); 
               agregarCliente.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            }
         });
        JButton Editar = new JButton("Editar");
        Editar.setBackground(Color.black);
        Editar.setBorder(new ComponenteBotonRedondo(40));
        Editar.setForeground(Color.decode("#049cff"));
        Editar.setBounds(600, 498, 150, 50);
        Clientes.add(Editar);
             // función para el boton Editar
            Editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               EditarCliente editarCliente = new EditarCliente();
               editarCliente.setVisible(true);
               editarCliente.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            }
         });

        JButton Eliminar = new JButton("Eliminar");
        Eliminar.setBackground(Color.black);
        Eliminar.setBorder(new ComponenteBotonRedondo(40));
        Eliminar.setForeground(Color.decode("#049cff"));
        Eliminar.setBounds(800, 498, 150, 50);
        Clientes.add(Eliminar);
        //se elimina el registro seleccionado
        Eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
 
//        try {
//            modelo=(ModeloTabla_Maquinaria) MaquinasT.getModel();
//            modelo.removeRow(MaquinasT.getSelectedRow());
//            MaquinasT.addRowSelectionInterval(0,0);
//            modelo=null;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Seleccione la fila que desea quitar.");
//        }
//    int fila = MaquinasT.getSelectedRowCount();
//                if (fila < 1) {
//                    JOptionPane.showMessageDialog(null, "Seleccione un registro");
//                } else {
//                    if (deleteAct(Integer.parseInt(MaquinasT.getValueAt(MaquinasT.getSelectedRow(), 6).toString())) > 0) {
//
//                    }
//                }
//                ModeloTabla_Maquinaria.actualizaEstatus();
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            
                    
                
                
            
   }});

        return Clientes;
    }

    public JPanel Finanzas() {
             Finanzas = new JPanel();
        Finanzas.setLayout(null);
        Finanzas.setBackground(Color.black);
        JLabel FinanzasMensaje = new JLabel("Gráficas de finanzas mesuales");
        FinanzasMensaje.setForeground(Color.white);
        Finanzas.add(FinanzasMensaje);
        
    	final JButton BotonGraf = new JButton();
		 BotonGraf.setLayout(null);
		 BotonGraf.setBorder(null);
		 BotonGraf.setBackground(Color.black);
		 BotonGraf.setBounds(132,50,1105,500);
		 BotonGraf.setIcon(Graficas);
        
	BotonGraf.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
			new Graficador();
			 }
			 
			 });
		 
		 
		 
		 
        Finanzas.add(BotonGraf);
        
        return Finanzas;
    }
    
    // metdod
      public int deleteDatos(int id) throws SQLException {
        Connection cn = getConexion();
        String sql = "DELETE FROM PERSONA WHERE IDPERSONA =" + id;

        int res = 0;
        try {
            psd = cn.prepareStatement(sql);
            // psd.setInt(1, id);
            res = psd.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en: " + e);
        }
        return res;
    }
    public int deleteAct(int id) throws SQLException {
        Connection cn = getConexion();
        String sql = "DELETE FROM MEDICIONES WHERE IDPERSONA =" + id;

        int res = 0;
        try {
            psd = cn.prepareStatement(sql);
            // psd.setInt(1, id);
            res = psd.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en: " + e);
        }
        return res;
    }

    private static int esNum(String cadena) {
        try {
            int a = Integer.parseInt(cadena);
            return a;
        } catch (Exception e) {
            return 0;
        }
    }

    private static double esDouble(String cadena) {
        try {
            Pattern p = Pattern.compile("[$',']");
            Matcher m = p.matcher(cadena);
            String remplazado = cadena;
            if (m.find()) {
                remplazado = m.replaceAll("");
            }
            double a = Double.parseDouble(remplazado);
            return a;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 0;
        }
    }


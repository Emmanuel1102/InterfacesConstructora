
import java.awt.*;

import javax.swing.*;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class PrincipalOriginal extends JFrame implements ActionListener {

    private JPanel bienvenido, Maquinaria, Obras, Clientes, Finanzas;

    PrincipalOriginal() {
        setSize(1366, 768);
        setTitle("Sistema de gestion de maquinaria");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel principal = new JPanel();
        principal.setLayout(null);

        principal.setBackground(Color.black);
        principal.setBounds(0, 115, 1366, 768);

        ImageIcon background_image = new ImageIcon("C:\\Users\\Adan Sanchez\\Documents\\NetBeansProjects\\Fun_Ing_Soft\\src\\neo3.jpg");
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
        bienvenido = new JPanel();
        bienvenido.setLayout(null);
        setBounds(0, 0, 1366, 768);
        bienvenido.setBackground(Color.black);

        JLabel MensajeB = new JLabel("Escribe lo que quieras buscar aqui:");
        MensajeB.setForeground(Color.white);
        bienvenido.add(MensajeB);
        MensajeB.setBounds(560, 150, 500, 20);

        JTextField busqueda = new JTextField();
        busqueda.setForeground(Color.black);
        busqueda.setBounds(463, 180, 400, 30);
        bienvenido.add(busqueda);

        JButton Buscar = new JButton("BUSCAR");
        Buscar.setBackground(Color.black);
        //entrar.setBounds(110, 350, 150, 50);
        Buscar.setBorder(new ComponenteBotonRedondo(40));
        Buscar.setForeground(Color.decode("#049cff"));
        Buscar.setBounds(590, 220, 150, 50);
        bienvenido.add(Buscar);

        return bienvenido;
    }

    public JPanel Maquinaria() {

        JPanel Maquinas = new JPanel();
        Maquinas.setLayout(null);
        Maquinas.setBackground(Color.black);

        String[] Cabecera = {"NOMBRE", "TIPO", "MODELO", "COSTO", "ESTADO", "PRECIO DE RENTA"};
        String[][] datos = {{"aj11", "Tractor", "2015", "$10000.00", "DISPONIBLE", "$4000.00"}};
        DefaultTableModel modelo = new DefaultTableModel(datos, Cabecera) {
            //La edicion de la tabla esta desactivada
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        JTable MaquinasT = new JTable(modelo);
        //La reorganizacion de las colunmas se desactiva
        MaquinasT.getTableHeader().setReorderingAllowed(false);
        //La redimencion de las colunmas se desactiva
        MaquinasT.getTableHeader().setResizingAllowed(false);
        //Se Restinge la seleccion de las filas a solo una
        MaquinasT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane sc = new JScrollPane(MaquinasT);
        sc.setVisible(true);
        sc.setBounds(10, 70, 1336, 410);
        Maquinas.add(sc);

        JTextField busqueda = new JTextField();
        busqueda.setForeground(Color.black);
        busqueda.setBounds(463, 15, 400, 30);
        Maquinas.add(busqueda);

        JButton Buscar = new JButton("BUSCAR");
        Buscar.setBackground(Color.black);
        //entrar.setBounds(110, 350, 150, 50);
        Buscar.setBorder(new ComponenteBotonRedondo(40));
        Buscar.setForeground(Color.decode("#049cff"));
        Buscar.setBounds(866, 15, 150, 30);
        Maquinas.add(Buscar);

        JButton Agregar = new JButton("Agregar");
        Agregar.setBackground(Color.black);
        Agregar.setBorder(new ComponenteBotonRedondo(40));
        Agregar.setForeground(Color.decode("#049cff"));
        Agregar.setBounds(400, 498, 150, 50);
        Maquinas.add(Agregar);
        //abre una nueva ventana para agregar una maquinaría
        Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new AgregarMaquinaria();
            }
        });

        JButton Editar = new JButton("Editar");
        Editar.setBackground(Color.black);
        Editar.setBorder(new ComponenteBotonRedondo(40));
        Editar.setForeground(Color.decode("#049cff"));
        Editar.setBounds(600, 498, 150, 50);
        Maquinas.add(Editar);
        //abre una nueva venta para editar la maquinaría seleccionada
        Editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int fila = MaquinasT.getSelectedRow();
                    String nombre = (String) MaquinasT.getValueAt(fila, 0);
                    String tipo = (String) MaquinasT.getValueAt(fila, 1);
                    int modelo = PrincipalOriginal.esNum((String) MaquinasT.getValueAt(fila, 2));
                    String estado = (String) MaquinasT.getValueAt(fila, 4);
                    double precioRenta = PrincipalOriginal.esDouble((String) MaquinasT.getValueAt(fila, 5));
                    new EditarMaquinaria(nombre, tipo, modelo, estado, precioRenta);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Seleccione una maquina");
                }
            }
        });

        JButton Eliminar = new JButton("Eliminar");
        Eliminar.setBackground(Color.black);
        Eliminar.setBorder(new ComponenteBotonRedondo(40));
        Eliminar.setForeground(Color.decode("#049cff"));
        Eliminar.setBounds(800, 498, 150, 50);
        Maquinas.add(Eliminar);
        //Borra el registro de la base de datos
        Eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

            }
        });

        /////nuevo    
        JButton Autorizar = new JButton("Autorizar");
        Autorizar.setBackground(Color.black);
        Autorizar.setBorder(new ComponenteBotonRedondo(40));
        Autorizar.setForeground(Color.decode("#049cff"));
        Autorizar.setBounds(950, 498, 150, 50);
        Maquinas.add(Autorizar);
        //abre una nueva ventana para autorizar la salida de una máquina
        Autorizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Autorizar();
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
                new NuevoAgregarObra();
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
                    JOptionPane.showMessageDialog(null, "Seleccione una Obra\n"+e.toString());
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
        //abre una nueva ventana para agregar a un cliente nuevo
        Agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new AgregarCliente();
            }
        });

        JButton Editar = new JButton("Editar");
        Editar.setBackground(Color.black);
        Editar.setBorder(new ComponenteBotonRedondo(40));
        Editar.setForeground(Color.decode("#049cff"));
        Editar.setBounds(600, 498, 150, 50);
        Clientes.add(Editar);
        //abre una nueva ventana para agregar un nuevo cliente
        Editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new EditarCliente();
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

            }
        });

        return Clientes;
    }

    public JPanel Finanzas() {
        Finanzas = new JPanel();
        Finanzas.setBackground(Color.black);
        JLabel FinanzasMensaje = new JLabel("Gráficas de finanzas mesuales");
        FinanzasMensaje.setForeground(Color.white);
        Finanzas.add(FinanzasMensaje);
        return Finanzas;
    }

    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

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
            String remplazado=cadena;
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
}

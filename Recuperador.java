import java.awt.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**La clase Recuperador se base en que si un usuario no recuerda su contraseña la pueda recuperar
 * Mediante su usuario y su correo, si ambos estan la base de datos se haran visible los campos de dar una 
 * nueva contraseña y actualizara la base de datos y lo redimensionara de nuevo al login principal
 * @author DirtyCode
 */
public class Recuperador extends JFrame {

    String usua, correo_e;
    PreparedStatement psd;

    Recuperador() {

        setSize(500, 500);
        setTitle("Recuperación de contraseña");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel Recuperacion = new JPanel();
        Recuperacion.setLayout(null);
        Recuperacion.setSize(200, 350);
        Recuperacion.setBackground(Color.black);
        Recuperacion.setBounds(90, 0, 300, 500);

        JLabel etiquetaAviso;
        etiquetaAviso = new JLabel("Modo recuperación de contraseña:");
        etiquetaAviso.setForeground(Color.white);
        etiquetaAviso.setBounds(60, 20, 400, 30);
        Recuperacion.add(etiquetaAviso);

        JLabel etiquetaEscribir;
        etiquetaEscribir = new JLabel("Por favor, escriba su correo empresarial aquí:");
        etiquetaEscribir.setForeground(Color.decode("#049cff"));
        etiquetaEscribir.setBounds(20, 50, 400, 30);
        Recuperacion.add(etiquetaEscribir);

        JTextField CampoCorreo;
        CampoCorreo = new JTextField();
        CampoCorreo.setBounds(20, 80, 265, 30);
        CampoCorreo.setForeground(Color.white);
        CampoCorreo.setBackground(Color.black);
        Recuperacion.add(CampoCorreo);

        JLabel etiqueta_validar_correo = new JLabel();
        etiqueta_validar_correo.setBounds(20, 110, 200, 30);
        Recuperacion.add(etiqueta_validar_correo);

        JLabel etiquetaUsuario = new JLabel("Ingrese su Usuario");
        etiquetaUsuario.setBounds(75, 120, 150, 30);
        etiquetaUsuario.setForeground(Color.decode("#049cff"));
        Recuperacion.add(etiquetaUsuario);

        JTextField usuario = new JTextField();
        usuario.setBounds(20, 150, 250, 30);
        Recuperacion.add(usuario);

        JLabel etiqueta_validar_usuario = new JLabel();
        etiqueta_validar_usuario.setBounds(20, 180, 200, 30);
        Recuperacion.add(etiqueta_validar_usuario);

        JLabel etiqueta_pasword = new JLabel("Ingresa tu nueva contraseña");
        etiqueta_pasword.setBounds(50, 240, 250, 30);
        etiqueta_pasword.setForeground(Color.decode("#049cff"));
        Recuperacion.add(etiqueta_pasword);

        JTextField pasword = new JTextField();
        pasword.setBounds(20, 270, 250, 30);
        Recuperacion.add(pasword);

        JLabel etiqueta_pasword_confirmar = new JLabel("Ingresa de Nuevo tu Contraseña");
        etiqueta_pasword_confirmar.setBounds(50, 300, 250, 30);
        etiqueta_pasword_confirmar.setForeground(Color.decode("#049cff"));
        Recuperacion.add(etiqueta_pasword_confirmar);

        JTextField confirmar_pasword = new JTextField();
        confirmar_pasword.setBounds(20, 330, 250, 30);
        Recuperacion.add(confirmar_pasword);

        JButton cambiar_contraseña = new JButton("Cambiar Contraseña");
        cambiar_contraseña.setBorder(new ComponenteBotonRedondo(40));
        cambiar_contraseña.setBackground(Color.black);
        cambiar_contraseña.setForeground(Color.decode("#049cff"));
        cambiar_contraseña.setBounds(30, 370, 250, 50);
        Recuperacion.add(cambiar_contraseña);

        etiqueta_pasword.setVisible(false);
        pasword.setVisible(false);
        etiqueta_pasword_confirmar.setVisible(false);
        confirmar_pasword.setVisible(false);
        cambiar_contraseña.setEnabled(false);

        /**Boton que se encarga de verificar que el usuario y correp
         * sean correctos
         */
        JButton verificar = new JButton("Verificar");
        verificar.setBackground(Color.black);
        verificar.setBounds(75, 190, 150, 50);
        verificar.setBorder(new ComponenteBotonRedondo(40));
        verificar.setForeground(Color.decode("#049cff"));
        Recuperacion.add(verificar);
        verificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    /**Realiza una consulta y si existe desbloqueara los campos si no mandara un msj de alerta*/
                    Connection cn = Clase_Conexion.getConexion();
                    Statement stmn = cn.createStatement();
                    ResultSet rs = stmn.executeQuery("SELECT*FROM Usuario WHERE CORREO ='" + CampoCorreo.getText() + "' AND USUARIOO = '" + usuario.getText() + "'");
                    rs.next();
                    usua = rs.getString("USUARIOO");
                    correo_e = rs.getString("CORREO");
                    if (CampoCorreo.getText().equalsIgnoreCase(correo_e)) {
                        if (usuario.getText().equalsIgnoreCase(usua)) {
                            etiqueta_pasword.setVisible(true);
                            pasword.setVisible(true);
                            etiqueta_pasword_confirmar.setVisible(true);
                            confirmar_pasword.setVisible(true);
                            cambiar_contraseña.setEnabled(true);

                        } else {
                            etiqueta_validar_usuario.setText("Usuario Incorrecto! Intentelo de nuevo");
                            etiquetaUsuario.setFont(new Font("Arial", Font.BOLD, 15));
                            etiqueta_validar_usuario.setForeground(Color.RED);
                        }
                    } else {
                        etiqueta_validar_correo.setText("Correo incorrecto! Intentelo de nuevo");
                        etiqueta_validar_correo.setFont(new Font("Arial", Font.BOLD, 15));
                        etiqueta_validar_correo.setForeground(Color.RED);
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            }
        });

        cambiar_contraseña.addActionListener(new ActionListener() {
            /**Este Evento permite que el usuario permita cambiar su contraseña*/
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pasword.getText().equals(confirmar_pasword.getText())) {
                    try {
                        Connection cn;
                        cn = Clase_Conexion.getConexion();
                        psd = cn.prepareStatement("UPDATE Usuario SET PASWORD=? WHERE USUARIOO= '" + usua + "'");
                        psd.setString(1, confirmar_pasword.getText());

                        int res = psd.executeUpdate();
                        if (res < 0) {
                            JOptionPane.showMessageDialog(null, "No se pudo Actualizar");
                        } else {
                            JOptionPane.showMessageDialog(null, "Se Actualizo Correctamente");
                        }
                        cn.close();
                        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        dispose();
                        LoginOriginal l = new LoginOriginal();
                        l.setVisible(true);
                    } catch (SQLException ee) {
                        JOptionPane.showMessageDialog(null, "Error en: " + ee);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden revise de nuevo");
                }
            }
        });
        ImageIcon background_image = new ImageIcon("C:\\Users\\Adan Sanchez\\Documents\\NetBeansProjects\\Fun_Ing_Soft\\src\\InterfacesConstructora\\neo3.jpg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);

        background.add(Recuperacion);
        background.setBounds(0, 0, 700, 700);
        add(background);

        setVisible(true);

    }
/**Descomentar el metodo main si se desea probar de forma independite*/
    /*public static void main(String[] args) {

        new Recuperador();
    }*/
}

//Esta es una ventana emergente para sustituir las otras se supone que JOption si acepta booleanos

import javax.swing.JOptionPane;

public class OpcionesEditar {

    public static void main(String[] args) {
        int Aviso = JOptionPane.showConfirmDialog(null,"¿ESTAS SEGURO GUARDAR LOS DATOS EDITADOS!?","",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (Aviso == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "¿SE HAN EDITADO LOS DATOS SATISFACTORIAMENTE!");
        } else {

            /////Aqui deberian ir todas las ventanas de editar

        }
    }
}

package cod_hashmap_interface;
//@author emendezduran

import java.util.Iterator;
import javax.swing.JOptionPane;



public class MostrarList {

    public static void mostrar(ClassList lista) {
        Iterator i = lista.miLista.iterator();
        String msj = "Lista: \n";
        while (i.hasNext()) {
            msj = msj + i.next() + "\n";
        }

        JOptionPane.showInputDialog(msj);
    }

}

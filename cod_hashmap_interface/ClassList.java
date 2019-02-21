package cod_hashmap_interface;
//@author emendezduran

import java.util.ArrayList;

public class ClassList implements InterfaceList {

    ArrayList<String> miLista = new ArrayList();

    @Override
    public void putElement(String cadena) {
        miLista.add(cadena);
    }

    @Override
    public String getElement(int indice) {
        return miLista.get(indice);
    }

}

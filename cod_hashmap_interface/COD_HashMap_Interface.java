package cod_hashmap_interface;
// @author emendezduran

import java.util.Iterator;

public class COD_HashMap_Interface {

    public static void main(String[] args) {

        ClassHash ch = new ClassHash();
        ch.putValue("emilio");
        ch.putValue("fran");
        ch.putValue("hector");


        ClassList cl = new ClassList();
        cl.putElement("mendez");
        cl.putElement("sanchez");
        cl.putElement("pose");


        //MostrarClassList.mostrar(cl);

        MostrarClassList.mostrar(new HashToList(ch));
        
    }

    private static class HashToList implements InterfaceList {

        private ClassHash hash;
        private ClassList list = new ClassList();

        public HashToList(ClassHash h) {
            hash = h;
            Iterator<Integer> it = hash.miHash.keySet().iterator();
            while (it.hasNext()) {
                list.putElement(hash.miHash.get(it.next()));
            }
        }

        @Override
        public void putElement(String cadena) {
           miLista.add(cadena);
        }

        @Override
        public String getElement(int indice) {
           return miLista.get(indice);
        }

        @Override
        public int size() {
          return miLista.size();
        }

    }
}

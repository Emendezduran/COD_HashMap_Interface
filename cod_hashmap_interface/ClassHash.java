package cod_hashmap_interface;
//@author emendezduran

import java.util.HashMap;

public class ClassHash implements InterfaceHash {

    HashMap<Integer, String> miHash = new HashMap<>();
    private static int cod = 1000;

    @Override
    public void putValue(String contenido) {
        int key = cod;
        miHash.put(key, contenido);
        cod++;
    }

    @Override
    public String getValue(int key) {
        return miHash.get(key);
    }

}

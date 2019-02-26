package cod_hashmap_interface;
//@author emendezduran




public class MostrarClassList {

    public static void mostrar(InterfaceList lista) {
        for (int i = 0; i < lista.size(); i++) {
             System.out.println(i + " " + lista.getElement(i));
    }
}
}

package cod_hashmap_interface;
// @author emendezduran

public class COD_HashMap_Interface {
    public static void main(String[] args) {
    
    ClassHash ch = new ClassHash();
    ch.putValue("emilio");
    ch.putValue("fran");
    ch.putValue("hector");
    ch.getValue(1000);
    ch.getValue(1001);
    ch.getValue(1002);
    
    ClassList cl = new ClassList();
    cl.putElement("mendez");
    cl.putElement("sanchez");
    cl.putElement("pose");
    cl.getElement(0);
    cl.getElement(1);
    cl.getElement(2);
    
    
    
    

    }

}

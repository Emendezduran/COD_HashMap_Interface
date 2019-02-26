/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_hashmap_interface;

import java.util.ArrayList;

/**
 *
 * @author emendezduran
 */
public interface InterfaceList {
    
    ArrayList<String> miLista = new ArrayList<>();

    public void putElement(String cadena);

    public String getElement(int indice);
    
    public int size();

}

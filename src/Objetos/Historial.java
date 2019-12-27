/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.LinkedList;

/**
 *
 * @author Haldamir
 */
public class Historial {
    
    public String idTransaccion="";
    public String idCliente="";
    public String fecha="";
    
    public LinkedList<String> productos = new LinkedList();
    public LinkedList<String> cantidades = new LinkedList();
    
    
    public void agregar(String p, String c){
        productos.addLast(p);
        cantidades.addLast(c);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Haldamir
 */
public class Empleado {
    public String id;
    public String dpi;
    public String nombres;
    public String apellidos;
    
    
    public String getValue() {
        return this.id;
    }

    public String getLabel() {
        return this.nombres + " " + this.apellidos;
    }

    @Override
    public String toString() {
        return this.nombres + " " + this.apellidos;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteStatico;

/**
 *
 * @author Haldamir
 */
public class VariablesEstaticas {
    static public String nombres="";
    static public String apellidos="";
    static public String puesto="";
    static public String id="";
    
    public static void setPuesto(String p){
        switch(p){
            case "0":
                puesto="Administrador";
                break;
            case "1":
                puesto="Mecanico";
                break;
        }
    }
}

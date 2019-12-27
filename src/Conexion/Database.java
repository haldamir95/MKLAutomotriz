/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Haldamir
 */
public class Database {
    
    
    public Connection conectar(){
        Connection conexion = null;
        try{
            //registrar el Driver de hsqldb
            Class.forName("org.hsqldb.jdbcDriver");
            conexion = DriverManager.getConnection("jdbc:hsqldb:file:MKLDB\\mkl", "haldamir_deb", "11235813");
            //System.out.println("EN LINEA");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se pudo conectar a la base de datos","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }
    
    public ResultSet consulta(String query){
        Connection conexion = conectar();
        ResultSet resultado = null;
        
        try{
            PreparedStatement consulta = conexion.prepareStatement(query);
            resultado = consulta.executeQuery();
            conexion.close();
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,"Error al ejecutar consulta\n"+error,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
                
            
        
        return resultado;
        
    }
    
    public ResultSet filtro(String query){
        Connection conexion = conectar();
        ResultSet resultado = null;
        
        try{
            PreparedStatement consulta = conexion.prepareStatement(query);
            resultado = consulta.executeQuery();
            conexion.close();
        }catch(Exception e){ 
            System.out.println(e);
        }
        
        return resultado;
    }
    
    public void Ejecutar(String query) throws SQLException{
        Connection conexion = conectar();
        Statement statement = conexion.createStatement();
        statement.executeUpdate(query);
        conexion.close();
    }
    
}



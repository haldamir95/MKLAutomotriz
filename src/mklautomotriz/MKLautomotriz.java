/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mklautomotriz;
import Interfaz.*;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import PaqueteStatico.VariablesEstaticas;
import java.awt.Window;
import java.lang.reflect.Method;

/**
 *
 * @author Haldamir
 */
public class MKLautomotriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        VariablesEstaticas.nombres="";
        VariablesEstaticas.apellidos="";
        VariablesEstaticas.puesto="";
        VariablesEstaticas.id="";
        String dir = System.getProperty("user.dir");
        JFrame welcome = new JFrame ();
        JLabel label = new JLabel();
        Image image;
        Icon icon = new ImageIcon();
        
        try{
            image = ImageIO.read(new File(dir+"\\Imagenes\\Logo.jpg"));
            icon = new ImageIcon(image);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se encontro imagen de inicio\n","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        label.setIcon(icon);
        welcome.setUndecorated(true);
        welcome.add (label);
        welcome.setSize (1000,785);
        welcome.setLocationRelativeTo ( null );
        welcome.setVisible ( true );
        
        try{
            Thread.sleep(500);
        }catch(Exception e){

        }
        for(int i =100; i>0; i--){
            setOpaque(welcome, i/100f);
            //AWTUtilities.setWindowOpacity(welcome, i/100f);
            try{
                Thread.sleep(20);
            }catch(Exception e){

            }
        }
        
        //-------
        
        
        
        //-------
        
        welcome.setVisible(false);
        
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setTitle("MKL Automotriz");
        login.setVisible(true);
        
//        Principal p = new Principal();
//        p.setVisible(true);
        
//        //encriptado de ALAN
//        String password = "11235813";
//        int clave = 2110;
//        for(int i=0;i<password.length();i++){
//            char[] car = password.toCharArray();
//            int ascii = (int)car[i];
//            System.out.println(car[i]+" -> "+ascii);
//        }
        
    }
    
    public static void setOpaque(Window window, float opaque) {

        try {

            Class<?> awtUtilsClass = Class.forName("com.sun.awt.AWTUtilities");
            if (awtUtilsClass != null) {

                Method method = awtUtilsClass.getMethod("setWindowOpacity", Window.class, float.class);
                method.invoke(null, window, opaque);

            }

        } catch (Exception exp) {
        }

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import PaqueteStatico.VariablesEstaticas;
import Conexion.Database;
import Objetos.Cliente;
import Objetos.Historial;
import Objetos.Empleado;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import java.util.Base64;
import java.util.Date;
import java.util.LinkedList;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import javax.swing.table.TableColumn;


/**
 *
 * @author Haldamir
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    
    int fila=-1;
    DefaultTableModel modeloFactura;
    double total = 0.0;
    double gtotal = 0.0;
    double anticipo = 0.0;
    double descuento = 0.0;
    
    Date date = new Date();
    String strDateFormat = "dd/MM/yyyy";
    SimpleDateFormat formato = new SimpleDateFormat(strDateFormat);
    String fechaHoy = formato.format(date);
    
    LinkedList<String> ids_Productos = new LinkedList();
    LinkedList<String> ids_Detalle = new LinkedList();
    String dir = System.getProperty("user.dir");
    
    //FUENTES
    private Font nTransaccion = new Font (Font.FontFamily.HELVETICA,12,Font.BOLD,BaseColor.RED);
    private Font tblHeader = new Font (Font.FontFamily.HELVETICA,10,Font.BOLD,BaseColor.RED);
    private Font negrita = new Font (Font.FontFamily.HELVETICA,10,Font.BOLD);
    private Font normal = new Font (Font.FontFamily.HELVETICA,9,Font.NORMAL);
    private Font cursiva = new Font (Font.FontFamily.HELVETICA,8,Font.ITALIC);
    boolean ot = false;
    String correlativoAModificar="";
    String idTransaccionAModificar="";
    
    public Principal() {
        initComponents();
        //this.setSize(ancho, alto);
        jButton29.setEnabled(false);
        jLabel61.setVisible(false);
        jLabel62.setVisible(false);
        jTextField46.setText("0.00");
        jTextField47.setText("0.00");
        
        jTextField31.setEnabled(false);
        jTextField32.setEnabled(false);
        jTextField33.setEnabled(false);
        jTextField34.setEnabled(false);
        jTextField35.setEnabled(false);
        jTextField36.setEnabled(false);
        jTextField37.setEnabled(false);
        //jTextField38.setEnabled(false);
        jTextField39.setEnabled(false);
        jTextField40.setEnabled(false);
        jTextField41.setEnabled(false);
        jTextField42.setEnabled(false);
        jTextField43.setEnabled(false);
        
        jTextField29.setEnabled(false);
        
        jTextField46.setText("0.00");
        jTextField47.setText("0.00");
        
        if(VariablesEstaticas.puesto.equals("Mecanico")){
           jTabbedPane1.remove(4);
        }
        
        //setExtendedState(JFrame.MAXIMIZED_BOTH);   
        jMenu2.setText("Usuario: "+VariablesEstaticas.nombres + " "+ VariablesEstaticas.apellidos);
        
        jFormattedTextField1.setText(fechaHoy);
        
        //llenar tabla de usuarios
        actualizarTablaClientes();
        
        //llenar tabla de empleados
        actualizarTablaEmpleados();

        //llenar tabla de vehiculos
        actualizarTablaVehiculos();
        
        //llenar tabla de productos
        actualizarTablaProducto();
        
        //iniciar tabla de factura
        IniciarTablaFactura();
        
        //llenar tabla de transacciones
        actualizarTablaListadoTransacciones();
        
        //actualizar nombres de botones
        actualizarBotones();
        
        //llenar combo box mecanicos
        llenarComboMecanicos();
        
        //llenar comboBox propietarios de vehiculos
        combo_Clientes_Autos();
        
       
        
        switch(VariablesEstaticas.puesto){
            case "Administrador":
                
                break;
            case "Mecanico":
                jPanel3.setVisible(false);
                break;
        }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroupLOC = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel44 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jTextField44 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jTextField45 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel22 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jTextField49 = new javax.swing.JTextField();
        jButton28 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jTextField48 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField18 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton19 = new javax.swing.JButton();
        jTextField27 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jTextField38 = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setPreferredSize(new java.awt.Dimension(1600, 900));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Generales"));
        jPanel16.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel16.setPreferredSize(new java.awt.Dimension(1100, 246));

        jLabel35.setText("Placa de Vehiculo");

        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField23KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField23KeyTyped(evt);
            }
        });

        jButton17.setText("Buscar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel61.setText("ID_VEHICULO");

        jLabel62.setText("ID_PROPIETARIO");

        jLabel37.setText("Marca");

        jLabel38.setText("Linea");

        jLabel39.setText("Modelo");

        jLabel40.setText("C.C Motor");

        jLabel41.setText("VIN");

        jLabel42.setText("Recorrido");

        jLabel43.setText("Color");

        jLabel45.setText("Proximo Servicio");

        jLabel46.setText("Propietario");

        jTextField40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField40ActionPerformed(evt);
            }
        });

        jLabel47.setText("NIT");

        jLabel48.setText("Direccion");

        jLabel49.setText("Telefono");

        jLabel25.setText("Mecanico:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBox4, 0, 269, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFormattedTextField1MouseClicked(evt);
            }
        });

        jLabel44.setText("Fecha");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(jButton17)
                    .addComponent(jLabel61)
                    .addComponent(jLabel62))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jTextField32)
                    .addComponent(jTextField31)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jTextField35)
                    .addComponent(jTextField34)
                    .addComponent(jLabel42)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel45)
                            .addComponent(jTextField37)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel43)))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextField1))
                    .addComponent(jLabel48)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel49)
                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel37)
                    .addComponent(jLabel40)
                    .addComponent(jLabel43)
                    .addComponent(jLabel46)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel62))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel41)
                            .addComponent(jLabel45)
                            .addComponent(jLabel47)
                            .addComponent(jLabel44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jLabel42)
                            .addComponent(jLabel48))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Productos y Servicios"));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jButton20.setText("Agregar >");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("< Quitar Seleccion");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("<< Quitar Todo");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar Por"));

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Categoria");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Descripcion");

        jTextField44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField44MouseClicked(evt);
            }
        });
        jTextField44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField44KeyTyped(evt);
            }
        });

        jButton23.setText("Quitar Filtro");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton5)
                .addGap(18, 18, 18)
                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButton4)
                .addComponent(jRadioButton5)
                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton23))
        );

        jTextField45.setText("1");

        jLabel51.setText("Cantidad");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel51)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 165, Short.MAX_VALUE)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles Finales"));

        jLabel52.setText("ANOTACIONES: ");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane7.setViewportView(jTextArea1);

        jLabel53.setText("TOTAL: ");

        jLabel55.setText("Anticipo");

        jLabel56.setText("Descuento");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel57.setText("GRAN TOTAL");

        jTextField46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField46KeyPressed(evt);
            }
        });

        jTextField47.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField47KeyPressed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel59.setText("Q.");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel54.setText("0.00");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel60.setText("Q. ");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel58.setText("0.00");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel59)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel57))
                .addContainerGap())
        );

        jButton25.setText("COTIZACION");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton24.setText("ORDEN");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton29.setText("MODIFICAR");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel52)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 1547, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Transacciones", jPanel1);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevos y Modificaciones"));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MANO DE OBRA", "ACEITES Y LUBRICANTES", "REPUESTOS" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        jLabel31.setText("Categoria");

        jLabel32.setText("Descripcion *");

        jLabel33.setText("Cantidad en Stock *");

        jLabel34.setText("Precio *");

        jButton9.setText("Agregar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton14.setText("Eliminar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Modificar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Limpiar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addGap(18, 18, 18)
                                .addComponent(jButton15)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton15)
                    .addComponent(jButton14))
                .addGap(33, 33, 33)
                .addComponent(jButton16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Clientes"));
        jPanel15.setPreferredSize(new java.awt.Dimension(1480, 954));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable4.setMaximumSize(new java.awt.Dimension(600, 64));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar por: "));
        jPanel21.setPreferredSize(new java.awt.Dimension(1100, 85));

        jLabel64.setText("Filtrar Producto y Servicio por: ");

        buttonGroup4.add(jRadioButton8);
        jRadioButton8.setText("Categoria");

        buttonGroup4.add(jRadioButton9);
        jRadioButton9.setText("Descripcion");

        jTextField49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField49KeyTyped(evt);
            }
        });

        jButton28.setText("Quitar Filtro");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton8)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton9)
                .addGap(18, 18, 18)
                .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton28)
                .addContainerGap(427, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 1179, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel15.getAccessibleContext().setAccessibleName("Lista de Productos y Servicios");

        jTabbedPane1.addTab("Productos y Servicios", jPanel13);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevos y Modificaciones"));

        jLabel6.setText("NIT");

        jLabel5.setText("Direccion");

        jLabel1.setText("DPI *");

        jLabel2.setText("Nombres *");

        jLabel3.setText("Apellidos *");

        jLabel4.setText("Telefono");

        jButton1.setText("Agregar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Clientes"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar Por:"));

        jLabel63.setText("Filtrar Cliente por: ");

        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setText("DPI");

        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setText("NIT");

        jTextField48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField48KeyTyped(evt);
            }
        });

        jButton27.setText("Quitar Filtro");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton6)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton7)
                .addGap(18, 18, 18)
                .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton27)
                .addContainerGap(578, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cliente", jPanel3);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevos y Modificaciones"));

        jLabel16.setText("Placa *");

        jLabel17.setText("Marca *");

        jLabel18.setText("Linea *");

        jLabel19.setText("Modelo *");

        jLabel20.setText("Color");

        jLabel21.setText("Serie Motor");

        jLabel22.setText("VIN");

        jLabel23.setText("Recorrido (KM)");

        jLabel24.setText("Propietario");

        jComboBox1.setMaximumSize(new java.awt.Dimension(200, 25));
        jComboBox1.setPreferredSize(new java.awt.Dimension(200, 25));

        jLabel26.setText("Proximo servicio");

        jButton10.setText("Agregar ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Modificar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Eliminar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Limpiar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel27.setText("Asientos");

        jLabel28.setText("C.C. Motor ");

        jLabel29.setText("Cilindros");

        jLabel30.setText("Tipo Transmision");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUTOMATICO", "MANUAL" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel27)
                            .addComponent(jLabel21)
                            .addComponent(jLabel30)
                            .addComponent(jLabel28)
                            .addComponent(jLabel20)
                            .addComponent(jLabel29)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField25)
                            .addComponent(jTextField24)
                            .addComponent(jTextField18)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField21)
                            .addComponent(jTextField20)
                            .addComponent(jTextField19)
                            .addComponent(jTextField17)
                            .addComponent(jTextField16)
                            .addComponent(jTextField15)
                            .addComponent(jTextField14)
                            .addComponent(jTextField22)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField26)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButton11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addGap(28, 28, 28)
                .addComponent(jButton13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Vehiculos"));
        jPanel12.setPreferredSize(new java.awt.Dimension(1480, 954));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(450, 402));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar Por: "));
        jPanel18.setPreferredSize(new java.awt.Dimension(1400, 76));

        jLabel36.setText("Filtrar Vehiculo por: ");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Placa");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("VIN");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("DPI Propietario");

        jButton19.setText("<< Enviar Vehiculo a Transaccion");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jTextField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField27KeyTyped(evt);
            }
        });

        jButton18.setText("Quitar Filtro");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton26.setText("Ver historial de Vehiculo");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19)
                        .addGap(18, 18, 18)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18))
                    .addComponent(jLabel36))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19)
                    .addComponent(jButton26)
                    .addComponent(jButton18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 740, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vehiculos", jPanel6);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevos y Modificaciones"));

        jLabel9.setText("DPI *");

        jLabel10.setText("Nombres *");

        jLabel11.setText("Apellidos *");

        jLabel12.setText("Telefono");

        jLabel8.setText("Direccion");

        jLabel7.setText("NIT");

        jLabel13.setText("Usuario");

        jLabel14.setText("Password");

        jLabel15.setText("Confirmacion");

        jButton8.setText("Eliminar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton6.setText("Modificar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setText("Agregar ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Limpiar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextField12)
                            .addComponent(jLabel10)
                            .addComponent(jTextField11)
                            .addComponent(jLabel11)
                            .addComponent(jTextField10)
                            .addComponent(jLabel12)
                            .addComponent(jTextField9)
                            .addComponent(jLabel8)
                            .addComponent(jTextField8)
                            .addComponent(jLabel7)
                            .addComponent(jTextField7)
                            .addComponent(jLabel13)
                            .addComponent(jTextField13)
                            .addComponent(jLabel14)
                            .addComponent(jPasswordField1)
                            .addComponent(jLabel15)
                            .addComponent(jPasswordField2))
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Empleados"));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable7);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Empleados", jPanel7);

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar Por: "));

        buttonGroupLOC.add(jRadioButton10);
        jRadioButton10.setText("Correlativo");

        buttonGroupLOC.add(jRadioButton11);
        jRadioButton11.setText("DPI Cliente");

        buttonGroupLOC.add(jRadioButton12);
        jRadioButton12.setText("Placa Vehiculo");

        jTextField38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField38KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton10)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton11)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton12)
                .addGap(18, 18, 18)
                .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(980, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton30.setText("Ver Documento");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("Modificar Transaccion");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listado de Ordenes y Cotizaciones", jPanel10);

        jMenu2.setText("Usuario: ");

        jMenuItem2.setText("Mi usuario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem1.setText("Cerrar Sesion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1576, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //LOG-OUT
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VariablesEstaticas.id="";
        VariablesEstaticas.nombres ="";
        VariablesEstaticas.apellidos ="";
        
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    
    
    //--------------------------------------------------------------------------------------CODIGO DE CLIENTE
    //AGREGAR CLIENTE
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dpi = jTextField1.getText();
        String nombres = jTextField2.getText();
        String apellidos = jTextField3.getText();
        String telefono = jTextField4.getText();
        String direccion = jTextField5.getText();
        String nit = jTextField6.getText().toUpperCase();
        boolean existe = existe("persona", "dpi", dpi);
        if(!dpi.equals("") && !nombres.equals("") && !apellidos.equals("")){
            if(existe){
                JOptionPane.showMessageDialog(null,"Ya existe un cliente con el DPI "+dpi,"ERROR", JOptionPane.ERROR_MESSAGE);
            }else{
                Database db = new Database();
                String consulta = "INSERT INTO persona(dpi, nombres, apellidos, telefono, direccion, nit, tipo)values('"+dpi+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+nit+"',2);";
                try{
                    db.Ejecutar(consulta);
                    JOptionPane.showMessageDialog(null,"Cliente agregado con exito","EXITO", JOptionPane.INFORMATION_MESSAGE);
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jTextField6.setText("");
                    //ACTUALIZAR TABLA
                    actualizarTablaClientes();
                    combo_Clientes_Autos();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error al crear cliente\nClase: Principal -> 1756\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Los campos con * son obligatorios","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    //SELECCIONAR CLIENTE
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        fila = jTable1.getSelectedRow();
        jTextField1.setText(jTable1.getValueAt(fila, 1).toString());
        jTextField2.setText(jTable1.getValueAt(fila, 2).toString());
        jTextField3.setText(jTable1.getValueAt(fila, 3).toString());
        jTextField4.setText(jTable1.getValueAt(fila, 4).toString());
        jTextField5.setText(jTable1.getValueAt(fila, 5).toString());
        jTextField6.setText(jTable1.getValueAt(fila, 6).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked
    //LIMPIAR CLIENTE
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        fila=-1;
        jTable1.clearSelection();
    }//GEN-LAST:event_jButton2ActionPerformed
    //MODIFICAR CLIENTE
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String dpi = jTextField1.getText();
        String nombres = jTextField2.getText();
        String apellidos = jTextField3.getText();
        String telefono = jTextField4.getText();
        String direccion = jTextField5.getText();
        String nit = jTextField6.getText();
        fila = jTable1.getSelectedRow();
        if(fila!=-1){
            if(!dpi.equals("") && !nombres.equals("") && !apellidos.equals("")){
                String id = jTable1.getValueAt(fila, 0).toString();
                Database db = new Database();
                String consulta = "UPDATE persona SET dpi = '"+dpi+"', nombres = '"+nombres+"', apellidos = '"+apellidos+"', telefono = '"+telefono+"', direccion = '"+direccion+"', nit = '"+nit+"' WHERE id = "+id;
                try {
                    db.Ejecutar(consulta);
                    JOptionPane.showMessageDialog(null,"Cliente modificado con exito","EXITO", JOptionPane.INFORMATION_MESSAGE);
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jTextField6.setText("");
                    actualizarTablaClientes();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null,"Error al modificar cliente\nClase: Principal -> 1808\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Los campos con * son obligatorios","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"No ha seleccionado ningun cliente","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed
    //ELIMINAR CLIENTE
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        fila = jTable1.getSelectedRow();
        if(fila!=-1){
            String id = jTable1.getValueAt(fila, 0).toString();
            Database db = new Database();
            String consulta = "DELETE FROM persona WHERE id = "+id;
            try {
                db.Ejecutar(consulta);
                JOptionPane.showMessageDialog(null,"Cliente eliminado con exito","EXITO", JOptionPane.INFORMATION_MESSAGE);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                actualizarTablaClientes();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error al eliminar cliente\nClase: Principal -> 1832\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"No ha seleccionado ningun cliente","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed


    
    
    
    
    
    
    
    //MI USUARIO
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        MiUsuario u = new MiUsuario();
        u.setLocationRelativeTo(null);
        u.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    
    
    
    
    
    
    
    
    //--------------------------------------------------------------------------------------CODIGO DE PRODUCTOS Y SERVICIOS
    //SELECCIONAR PRODUCTO O SERVICIO
    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        
        int f = jTable4.getSelectedRow();
        jTextField28.setText(jTable4.getValueAt(f, 2).toString());
        jTextField29.setText(jTable4.getValueAt(f, 3).toString());
        jTextField30.setText(jTable4.getValueAt(f, 4).toString());
        
        String tipo = jTable4.getValueAt(f, 1).toString();
        for (int i = 0; i < jComboBox3.getItemCount(); i++) {
            if(jComboBox3.getItemAt(i).equals(tipo)){
                jComboBox3.setSelectedIndex(i);
                break;
            }
        }
        
        
    }//GEN-LAST:event_jTable4MouseClicked
    //LIMPIAR PRODUCTOS O SERVICIOS
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        limpiarProductos();
    }//GEN-LAST:event_jButton16ActionPerformed
    //AGREGAR PRODUCTO O SERVICIO
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        try{
            
            String descripcion = jTextField28.getText().toUpperCase();
            String stock = jTextField29.getText().toUpperCase();
            String precio = jTextField30.getText().toUpperCase();
            String tipo = String.valueOf(jComboBox3.getSelectedIndex());
            
            if(tipo.equals("0")){
                stock="0";
            }
            
            Database db = new Database();
            String consulta = "INSERT INTO producto(descripcion, cantidad, precio, tipo)VALUES('"+descripcion+"',"+stock+",'"+precio+"',"+tipo+");";
            db.Ejecutar(consulta);
            JOptionPane.showMessageDialog(null,"Producto o Servicio agregado con exito","EXITO", JOptionPane.INFORMATION_MESSAGE);
            limpiarProductos();
            actualizarTablaProducto();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al agregar producto o servicio\nClase: Principal -> 2217\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton9ActionPerformed
    //MODIFICAR PRODUCTO O SERVICIO
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try{
            int f = jTable4.getSelectedRow();
            String idp = jTable4.getValueAt(f, 0).toString();
            String descripcion = jTextField28.getText().toUpperCase();
            String stock = jTextField29.getText().toUpperCase();
            String precio = jTextField30.getText().toUpperCase();
            String tipo = String.valueOf(jComboBox3.getSelectedIndex());
            
            if(tipo.equals("0")){
                stock="0";
            }
            
            Database db = new Database();
            String consulta = "UPDATE producto SET descripcion='"+descripcion+"',cantidad="+stock+",precio='"+precio+"',tipo="+tipo+" WHERE id = "+idp+";";
            db.Ejecutar(consulta);
            JOptionPane.showMessageDialog(null,"Producto o Servicio modificado con exito","EXITO", JOptionPane.INFORMATION_MESSAGE);
            limpiarProductos();
            actualizarTablaProducto();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al modificar producto o servicio\nClase: Principal -> 2244\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton15ActionPerformed
    //ELIMINAR PRODUCTO O SERVICIO
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int f = jTable4.getSelectedRow();
        if(f!=-1){
            String id = jTable4.getValueAt(f, 0).toString();
            Database db = new Database();
            String consulta = "DELETE FROM producto WHERE id = "+id;
            try {
                db.Ejecutar(consulta);
                JOptionPane.showMessageDialog(null,"Producto eliminado con exito","EXITO", JOptionPane.INFORMATION_MESSAGE);
                limpiarProductos();
                actualizarTablaProducto();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error al eliminar producto\nClase: Principal -> 2260\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"No ha seleccionado ningun producto","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    
    
    
    
    
    
    
    //COMBOBOX CHANGED
    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        if(jComboBox3.getSelectedIndex()==0){
            jTextField29.setEnabled(false);
        }else{
            jTextField29.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    
    
    
    
    
    
    
    
    //QUITAR FILTRO CLIENTES
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        buttonGroup3.clearSelection();
        jTextField48.setText("");
        actualizarTablaClientes();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jTextField48KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField48KeyTyped
        
        Database db = new Database();
        jTextField48.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e){
                if(e.getKeyCode()!=KeyEvent.VK_ENTER){
                    String texto = jTextField48.getText();
                    jTextField48.setText(texto.toUpperCase());
                    repaint();
                    String busqueda = jTextField48.getText().toUpperCase();
                    String consulta = "";
                    if(jRadioButton6.isSelected()){
                        consulta = "SELECT  id, dpi, nombres, apellidos, telefono, direccion, nit FROM persona WHERE tipo = 2 AND dpi LIKE '"+busqueda+"%';";
                    }else if(jRadioButton7.isSelected()){
                        consulta = "SELECT  id, dpi, nombres, apellidos, telefono, direccion, nit FROM persona WHERE tipo = 2 AND nit LIKE '"+busqueda+"%';";
                    }else{
                        consulta = "SELECT p.id, p.dpi, p.nombres, p.apellidos, p.telefono, p.direccion, p.nit FROM persona as p, tipo_persona as tp WHERE p.tipo = tp.id AND tp.id = 2;";
                       // JOptionPane.showMessageDialog(null,"Error, no selecciono ninguna opcion de filtrado\nClase: Principal ","ERROR", JOptionPane.ERROR_MESSAGE);
                    }


                    String[] columnNames = {"ID","DPI","NOMBRES","APELLIDOS","TELEFONO","DIRECCION","NIT"};
                    Object[][] dataVacia = {};
                    DefaultTableModel modelo = new DefaultTableModel(dataVacia, columnNames);
                    ResultSet res = db.filtro(consulta);
                    try{
                        while(res.next()){
                            Object[] newRowData = {res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)};
                            modelo.addRow(newRowData);
                        }
                    }catch(Exception er){  
                        System.out.println(er);
                    } 
                    jTable1.setModel(modelo);
                }
                
                

            }
        });
        
        
    }//GEN-LAST:event_jTextField48KeyTyped

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        buttonGroup4.clearSelection();
        jTextField49.setText("");
        actualizarTablaProducto();
        System.out.println("caca");
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jTextField49KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField49KeyTyped
        
        Database db = new Database();
        jTextField49.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e){
                if(e.getKeyCode()!=KeyEvent.VK_ENTER){
                    String texto = jTextField49.getText();
                    jTextField49.setText(texto.toUpperCase());
                    repaint();
                    String busqueda = jTextField49.getText().toUpperCase();
                    String consulta = "";
                    if(jRadioButton8.isSelected()){
                        consulta = "SELECT p.id, tp.nombre, p.descripcion, p.cantidad, p.precio FROM producto as p, tipo_producto as tp WHERE tp.id = p.tipo AND tp.nombre LIKE '%"+busqueda+"%';";
                    }else if(jRadioButton9.isSelected()){
                        consulta = "SELECT p.id, tp.nombre, p.descripcion, p.cantidad, p.precio FROM producto as p, tipo_producto as tp WHERE tp.id = p.tipo AND p.descripcion LIKE '%"+busqueda+"%';";
                    }else{
                        consulta = "SELECT p.id, tp.nombre, p.descripcion, p.cantidad, p.precio FROM producto as p, tipo_producto as tp WHERE tp.id = p.tipo;";
                       // JOptionPane.showMessageDialog(null,"Error, no selecciono ninguna opcion de filtrado\nClase: Principal","ERROR", JOptionPane.ERROR_MESSAGE);
                    }


                    String[] columnNames = {"ID","CATEGORIA","DESCRIPCION","CANTIDAD","PRECIO"};
                    Object[][] dataVacia = {};
                    DefaultTableModel modelo = new DefaultTableModel(dataVacia, columnNames);
                    ResultSet res = db.filtro(consulta);
                    try{
                        while(res.next()){
                            Object[] newRowData = {res.getString("id"),res.getString("nombre"),res.getString("descripcion"),res.getString("cantidad"),res.getString("precio"),};
                            modelo.addRow(newRowData);
                        }
                    }catch(Exception er){  

                    } 
                    jTable4.setModel(modelo);
                }
                
            }
        });
        
    }//GEN-LAST:event_jTextField49KeyTyped

    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //almacenar datos
        String placa = jTextField14.getText().toUpperCase();
        String marca = jTextField15.getText().toUpperCase();
        String linea = jTextField16.getText().toUpperCase();
        String modelo = jTextField17.getText().toUpperCase();
        String color = jTextField18.getText().toUpperCase();
        String asientos = jTextField19.getText().toUpperCase();
        String idMotor = jTextField20.getText().toUpperCase();
        String ccMotor = jTextField21.getText().toUpperCase();
        String cilindros = jTextField22.getText().toUpperCase();
        String vin = jTextField24.getText().toUpperCase();
        String recorrido = jTextField25.getText().toUpperCase();
        String fechaproximoservicio = jTextField26.getText();

        String transmision = jComboBox2.getSelectedItem().toString();
        Cliente c = (Cliente)jComboBox1.getSelectedItem();
        String idPropietario = c.id;

        if(!placa.equals("") && !marca.equals("") && !linea.equals("") && !modelo.equals("")){
            //crear objeto de data base
            Database db = new Database();
            
            
            //crear consulta de insercion
            String consulta = "INSERT INTO vehiculo(placa,marca,linea,modelo,transmision,color,asientos,id_motor,motor_cc,cilindros,vin,recorrido,propietario,fecha_proximo)values('"+placa+"','"+marca+"','"+linea+"','"+modelo+"','"+transmision+"','"+color+"','"+asientos+"','"+idMotor+"','"+ccMotor+"','"+cilindros+"','"+vin+"','"+recorrido+"',"+idPropietario+",'"+fechaproximoservicio+"');";
            try{
                db.Ejecutar(consulta);
                JOptionPane.showMessageDialog(null,"Vehiculo agregado con exito","EXITO", JOptionPane.INFORMATION_MESSAGE);
                limpiarVehiculos();
                //ACTUALIZAR TABLA
                actualizarTablaVehiculos();

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error al insertar vehiculo\nClase: Principal -> 2049\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Los campos con * son obligatorios","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int f = -1;
        f=jTable3.getSelectedRow();

        if(f>=0){
            String idv = jTable3.getValueAt(f, 0).toString();
            String placa = jTextField14.getText().toUpperCase();
            String marca = jTextField15.getText().toUpperCase();
            String linea = jTextField16.getText().toUpperCase();
            String modelo = jTextField17.getText().toUpperCase();
            String color = jTextField18.getText().toUpperCase();
            String asientos = jTextField19.getText().toUpperCase();
            String idMotor = jTextField20.getText().toUpperCase();
            String ccMotor = jTextField21.getText().toUpperCase();
            String cilindros = jTextField22.getText().toUpperCase();
            String vin = jTextField24.getText().toUpperCase();
            String recorrido = jTextField25.getText().toUpperCase();
            String fechaproximoservicio = jTextField26.getText();

            String transmision = jComboBox2.getSelectedItem().toString();
            Cliente c = (Cliente)jComboBox1.getSelectedItem();
            String idPropietario = c.id;

            if(!placa.equals("") && !marca.equals("") && !linea.equals("") && !modelo.equals("")){
                //crear objeto de data base
                Database db = new Database();

                //crear consulta de insercion
                String consulta = "UPDATE vehiculo SET placa='"+placa+"',marca='"+marca+"',linea='"+linea+"',modelo='"+modelo+"',transmision='"+transmision+"',color='"+color+"',asientos='"+asientos+"',id_motor='"+idMotor+"',motor_cc='"+ccMotor+"',cilindros='"+cilindros+"',vin='"+vin+"',recorrido='"+recorrido+"',propietario="+idPropietario+",fecha_proximo='"+fechaproximoservicio+"' WHERE id = "+idv+";";
                try{
                    db.Ejecutar(consulta);
                    JOptionPane.showMessageDialog(null,"Vehiculo modificado con exito","EXITO", JOptionPane.INFORMATION_MESSAGE);
                    limpiarVehiculos();
                    actualizarTablaVehiculos();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error al modificar vehiculo\nClase: Principal -> 2100\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Los campos con * son obligatorios","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"No ha seleccionado ningun cliente","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        fila = jTable3.getSelectedRow();
        if(fila!=-1){
            String id = jTable3.getValueAt(fila, 0).toString();
            Database db = new Database();
            String consulta = "DELETE FROM vehiculo WHERE id = "+id;
            try {
                db.Ejecutar(consulta);
                JOptionPane.showMessageDialog(null,"Vehiculo eliminado con exito","EXITO", JOptionPane.INFORMATION_MESSAGE);
                limpiarVehiculos();
                actualizarTablaVehiculos();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error al eliminar vehiculo\nClase: Principal -> 2117\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"No ha seleccionado ningun vehiculo","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        limpiarVehiculos();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        jButton11.setEnabled(true);
        int f = jTable3.getSelectedRow();
        jTextField14.setText(jTable3.getValueAt(f, 1).toString());
        jTextField15.setText(jTable3.getValueAt(f, 2).toString());
        jTextField16.setText(jTable3.getValueAt(f, 3).toString());
        jTextField17.setText(jTable3.getValueAt(f, 4).toString());
        jTextField18.setText(jTable3.getValueAt(f, 6).toString());
        jTextField19.setText(jTable3.getValueAt(f, 7).toString());
        jTextField20.setText(jTable3.getValueAt(f, 8).toString());
        jTextField21.setText(jTable3.getValueAt(f, 9).toString());
        jTextField22.setText(jTable3.getValueAt(f, 10).toString());
        jTextField24.setText(jTable3.getValueAt(f, 11).toString());
        jTextField25.setText(jTable3.getValueAt(f, 12).toString());
        //jFormattedTextField1.setText(jTable3.getValueAt(f, 14).toString());
        jTextField26.setText(jTable3.getValueAt(f, 14).toString());

        String transmision = jTable3.getValueAt(f, 5).toString();
        String dpi = jTable3.getValueAt(f, 13).toString();

        int aceptar=0;
        ComboBoxModel model = jComboBox1.getModel();
        
        for (int i = 0; i < model.getSize(); i++) {
            Cliente c = (Cliente)model.getElementAt(i);
            if(c.dpi.equals(dpi)){
                jComboBox1.setSelectedIndex(i);
                aceptar++;
                break;
            }
        }
        for (int i = 0; i < jComboBox2.getItemCount(); i++) {
            if(jComboBox2.getItemAt(i).equals(transmision)){
                jComboBox2.setSelectedIndex(i);
                aceptar++;
                break;
            }
        }
        if(aceptar<2){
            jButton11.setEnabled(false);
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        int f = -1;
        f = jTable3.getSelectedRow();
        if(f>=0){
            String placa = jTable3.getValueAt(f, 1).toString();
            agregarVehiculoaTransaccion(placa);
            jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTextField27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField27KeyTyped
        Database db = new Database();
        jTextField27.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e){
                if(e.getKeyCode()!=KeyEvent.VK_ENTER){
                    String texto = jTextField27.getText();
                    jTextField27.setText(texto.toUpperCase());
                    repaint();
                    String busqueda = jTextField27.getText().toUpperCase();
                    String consulta = "";
                    if(jRadioButton1.isSelected()){
                        consulta = "SELECT  v.id, v.placa, v.marca, v.linea, v.modelo, v.transmision, v.color, v.asientos, v.id_motor, v.motor_cc, v.cilindros, v.vin, v.recorrido, p.dpi, v.fecha_proximo FROM vehiculo as v, persona as p WHERE propietario = p.id AND placa LIKE '"+busqueda+"%';";
                    }else if(jRadioButton2.isSelected()){
                        consulta = "SELECT  v.id, v.placa, v.marca, v.linea, v.modelo, v.transmision, v.color, v.asientos, v.id_motor, v.motor_cc, v.cilindros, v.vin, v.recorrido, p.dpi, v.fecha_proximo FROM vehiculo as v, persona as p WHERE propietario = p.id AND p.dpi LIKE '"+busqueda+"%';";
                    }else if(jRadioButton3.isSelected()){
                        consulta = "SELECT  v.id, v.placa, v.marca, v.linea, v.modelo, v.transmision, v.color, v.asientos, v.id_motor, v.motor_cc, v.cilindros, v.vin, v.recorrido, p.dpi, v.fecha_proximo FROM vehiculo as v, persona as p WHERE propietario = p.id AND v.vin LIKE '"+busqueda+"%';";
                    }else{
                        consulta = "SELECT v.id, v.placa, v.marca, v.linea, v.modelo, v.transmision, v.color, v.asientos, v.id_motor, v.motor_cc, v.cilindros, v.vin, v.recorrido, p.dpi, v.fecha_proximo FROM vehiculo as v, persona as p WHERE p.id = v.propietario;";
                       // JOptionPane.showMessageDialog(null,"Error, no selecciono ninguna opcion de filtrado\nClase: Principal","ERROR", JOptionPane.ERROR_MESSAGE);
                    }

                    String[] columnNames = {"ID","PLACA","MARCA","LINEA","MODELO","TRANSMISION","COLOR","ASIENTOS","ID MOTOR","C.C.","CIL.","VIN", "KMs", "DPI DUEÑO","PROXIMO SERV."};
                    Object[][] dataVacia = {};
                    DefaultTableModel modelo = new DefaultTableModel(dataVacia, columnNames);
                    ResultSet res = db.filtro(consulta);
                    try{
                        while(res.next()){
                            Object[] newRowData = {res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10),res.getString(11),res.getString(12),res.getString(13),res.getString(14),res.getString(15),res.getString(16)};
                            modelo.addRow(newRowData);
                        }
                    }catch(Exception er){

                    }
                    jTable3.setModel(modelo);

                    jTable3.getColumnModel().getColumn(0).setPreferredWidth(10);
                    jTable3.getColumnModel().getColumn(1).setPreferredWidth(50);
                    jTable3.getColumnModel().getColumn(2).setPreferredWidth(100);
                    jTable3.getColumnModel().getColumn(3).setPreferredWidth(125);
                    jTable3.getColumnModel().getColumn(4).setPreferredWidth(40);
                    jTable3.getColumnModel().getColumn(5).setPreferredWidth(80);
                    jTable3.getColumnModel().getColumn(6).setPreferredWidth(125);
                    jTable3.getColumnModel().getColumn(7).setPreferredWidth(55);
                    jTable3.getColumnModel().getColumn(8).setPreferredWidth(90);
                    jTable3.getColumnModel().getColumn(9).setPreferredWidth(16);
                    jTable3.getColumnModel().getColumn(10).setPreferredWidth(16);
                    jTable3.getColumnModel().getColumn(11).setPreferredWidth(125);
                    jTable3.getColumnModel().getColumn(12).setPreferredWidth(50);
                    jTable3.getColumnModel().getColumn(13).setPreferredWidth(90);
                }

            }
        });
    }//GEN-LAST:event_jTextField27KeyTyped

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        buttonGroup1.clearSelection();
        jTextField27.setText("");
        actualizarTablaVehiculos();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

        int f = -1;
        f = jTable3.getSelectedRow();

        if(f>=0){
            try {
                //creando clase vehiculo temporal

                LinkedList<Historial> transacciones = new LinkedList();
                Database db = new Database();
                ResultSet res;
                String consulta = "";
                String id = jTable3.getValueAt(f, 0).toString();
                //obtener listado de transacciones para el vehiculo seleccionado
                consulta = "SELECT f.id, f.cliente, f.fecha FROM transaccion as f WHERE f.vehiculo = "+id;
                res = db.consulta(consulta);
                while(res.next()){
                    Historial nuevo = new Historial();
                    nuevo.idTransaccion = res.getString("id");
                    nuevo.idCliente = res.getString("cliente");
                    nuevo.fecha = res.getString("fecha");
                    transacciones.addLast(nuevo);
                }

                //buscando datos del historial
                for (int i = 0; i < transacciones.size(); i++) {
                    consulta = "SELECT producto, cantidad FROM detalle WHERE transaccion = "+transacciones.get(i).idTransaccion;
                    res = db.consulta(consulta);
                    while(res.next()){
                        transacciones.get(i).agregar(res.getString("producto"), res.getString("cantidad"));
                    }
                }

                generarPDFHistorial(transacciones,f);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error al crear historial del vehiculo\nClase: Principal -> 2595\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(null,"Error, no selecciono ningun vehiculo\nClase: Principal -> 2602\nExcepcion: ","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        fila = jTable7.getSelectedRow();
        if(fila!=-1){
            String id = jTable7.getValueAt(fila, 0).toString();
            Database db = new Database();
            String consulta = "DELETE FROM persona WHERE id = "+id;
            try {
                db.Ejecutar(consulta);
                JOptionPane.showMessageDialog(null,"Empleado eliminado con exito","EXITO", JOptionPane.INFORMATION_MESSAGE);
                jTextField13.setText("");
                jTextField12.setText("");
                jTextField11.setText("");
                jTextField10.setText("");
                jTextField9.setText("");
                jTextField8.setText("");
                jTextField7.setText("");
                jPasswordField1.setText("");
                jPasswordField2.setText("");
                jTable7.clearSelection();
                actualizarTablaEmpleados();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error al eliminar empleado\nClase: Principal -> 1962\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"No ha seleccionado ningun empleado","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        String dpi = jTextField12.getText();
        String nombres = jTextField11.getText();
        String apellidos = jTextField10.getText();
        String telefono = jTextField9.getText();
        String direccion = jTextField8.getText();
        String nit = jTextField7.getText();
        String usr = jTextField13.getText();
        String pass = jPasswordField1.getText();
        String conf = jPasswordField2.getText();
        String codificado = codificar(pass);

        fila = jTable7.getSelectedRow();
        if(fila!=-1){

            if(!dpi.equals("") && !nombres.equals("") && !apellidos.equals("")){
                if(pass.equals(conf)){
                    String id = jTable7.getValueAt(fila, 0).toString();
                    Database db = new Database();
                    String consulta = "UPDATE persona SET dpi = '"+dpi+"', nombres = '"+nombres+"', apellidos = '"+apellidos+"', telefono = '"+telefono+"', direccion = '"+direccion+"', nit = '"+nit+"', usuario = '"+usr+"', password = '"+codificado+"' WHERE id = "+id;
                    try {
                        db.Ejecutar(consulta);
                        JOptionPane.showMessageDialog(null,"Empleado modificado con exito","EXITO", JOptionPane.INFORMATION_MESSAGE);
                        jTextField12.setText("");
                        jTextField11.setText("");
                        jTextField10.setText("");
                        jTextField9.setText("");
                        jTextField8.setText("");
                        jTextField7.setText("");
                        jTextField13.setText("");
                        jPasswordField1.setText("");
                        jPasswordField2.setText("");
                        actualizarTablaEmpleados();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,"Error al modificar empleado\nClase: Principal -> 1918\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Contrasenias no coinciden","ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Los campos con * son obligatorios","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"No ha seleccionado ningun empleado","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String dpi = jTextField12.getText();
        String nombres = jTextField11.getText();
        String apellidos = jTextField10.getText();
        String telefono = jTextField9.getText();
        String direccion = jTextField8.getText();
        String nit = jTextField7.getText();
        String usr = jTextField13.getText();
        String pass = jPasswordField1.getText();
        String conf = jPasswordField2.getText();

        if(!dpi.equals("") && !nombres.equals("") && !apellidos.equals("")){
            if(pass.equals(conf)){
                String passcodificado = codificar(pass);
                Database db = new Database();
                String consulta = "INSERT INTO persona(dpi, nombres, apellidos, telefono, direccion, nit, usuario, password, tipo)values('"+dpi+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+nit+"','"+usr+"','"+passcodificado+"',1);";
                try{
                    db.Ejecutar(consulta);
                    JOptionPane.showMessageDialog(null,"Empleado agregado con exito","EXITO", JOptionPane.INFORMATION_MESSAGE);
                    jTextField7.setText("");
                    jTextField8.setText("");
                    jTextField9.setText("");
                    jTextField10.setText("");
                    jTextField11.setText("");
                    jTextField12.setText("");
                    jTextField13.setText("");
                    jPasswordField1.setText("");
                    jPasswordField2.setText("");
                    //ACTUALIZAR TABLA
                    actualizarTablaEmpleados();
                    llenarComboMecanicos();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error al agregar empleado\nClase: Principal -> 1876\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Los campos con * son obligatorios","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextField12.setText("");
        jTextField11.setText("");
        jTextField10.setText("");
        jTextField9.setText("");
        jTextField8.setText("");
        jTextField7.setText("");
        jTextField13.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        fila=-1;
        jTable7.clearSelection();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked

        int f = jTable7.getSelectedRow();
        jTextField12.setText(jTable7.getValueAt(f, 1).toString());
        jTextField11.setText(jTable7.getValueAt(f, 2).toString());
        jTextField10.setText(jTable7.getValueAt(f, 3).toString());
        jTextField9.setText(jTable7.getValueAt(f, 4).toString());
        jTextField8.setText(jTable7.getValueAt(f, 5).toString());
        jTextField7.setText(jTable7.getValueAt(f, 6).toString());
        jTextField13.setText(jTable7.getValueAt(f, 7).toString());
        String pass = decodificar(jTable7.getValueAt(f, 8).toString());
        jPasswordField1.setText(pass);
        jPasswordField2.setText(pass);
    }//GEN-LAST:event_jTable7MouseClicked

    private void jTextField23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyPressed

        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(!jTextField23.getText().equals("")){
                jButton17.doClick();
            }
        }
    }//GEN-LAST:event_jTextField23KeyPressed

    private void jTextField23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyTyped

        jTextField23.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e){
                String texto = jTextField23.getText();
                jTextField23.setText(texto.toUpperCase());
                repaint();
            }
        });
    }//GEN-LAST:event_jTextField23KeyTyped

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        agregarVehiculoaTransaccion(jTextField23.getText());
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTextField40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed

        int f = -1;
        f = jTable5.getSelectedRow();
        if(f>=0){
            double precioU = Double.parseDouble(jTable5.getValueAt(f, 3).toString());
            int cantidad = Integer.parseInt(jTextField45.getText());
            double subTotal = cantidad * precioU;
            Object[] newRowData = {cantidad,jTable5.getValueAt(f, 1),jTable5.getValueAt(f, 2),precioU,subTotal};
            ids_Detalle.addLast(jTable5.getValueAt(f, 0).toString());
            modeloFactura.addRow(newRowData);
            jTable5.clearSelection();
            calcularTotal();
            jTextField45.setText("1");
        }else{
            JOptionPane.showMessageDialog(null,"Error, no selecciono ningun producto\nClase: Principal -> 2440","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        int f = -1;
        f = jTable6.getSelectedRow();
        if(f>=0){
            modeloFactura.removeRow(f);
            ids_Detalle.remove(f);
            calcularTotal();
        }else{
            JOptionPane.showMessageDialog(null,"Errorn no selecciono ningun producto\nClase: Principal -> 2453","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        modeloFactura.setRowCount(0);
        ids_Detalle.clear();
        jLabel54.setText("0.00");
        jLabel58.setText("0.00");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTextField44KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField44KeyTyped

        Database db = new Database();
        jTextField44.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e){
                if(e.getKeyCode()!=KeyEvent.VK_ENTER){
                    String texto = jTextField44.getText();
                    jTextField44.setText(texto.toUpperCase());
                    repaint();
                    String busqueda = jTextField44.getText().toUpperCase();
                    String consulta = "";
                    if(jRadioButton4.isSelected()){
                        consulta = "SELECT p.id, tp.nombre, p.descripcion, p.cantidad, p.precio FROM producto as p, tipo_producto as tp WHERE tp.id = p.tipo AND tp.nombre LIKE '%"+busqueda+"%' ORDER BY p.descripcion;";
                    }else if(jRadioButton5.isSelected()){
                        consulta = "SELECT p.id, tp.nombre, p.descripcion, p.cantidad, p.precio FROM producto as p, tipo_producto as tp WHERE tp.id = p.tipo AND p.descripcion LIKE '%"+busqueda+"%' ORDER BY p.descripcion;";
                    }else{
                        consulta = "SELECT p.id, tp.nombre, p.descripcion, p.cantidad, p.precio FROM producto as p, tipo_producto as tp WHERE tp.id = p.tipo ORDER BY p.descripcion;";
                        //JOptionPane.showMessageDialog(null,"Error, no selecciono ninguna opcion de filtrado\nClase: Principal","ERROR", JOptionPane.ERROR_MESSAGE);
                    }

                    String[] columnNames = {"ID","CATEGORIA","DESCRIPCION","PRECIO"};
                    Object[][] dataVacia = {};
                    DefaultTableModel modelo = new DefaultTableModel(dataVacia, columnNames);
                    ResultSet res = db.filtro(consulta);
                    try{
                        while(res.next()){
                            Object[] newRowData = {res.getString("id"),res.getString("nombre"),res.getString("descripcion"),res.getString("precio"),};
                            modelo.addRow(newRowData);
                        }
                    }catch(Exception er){

                    }
                    jTable5.setModel(modelo);
                    TableColumn columna = jTable5.getColumn("ID");
                    columna.setMaxWidth(35);
                    columna.setMinWidth(9);
                    columna.setPreferredWidth(30);
                    columna = jTable5.getColumn("PRECIO");
                    columna.setMaxWidth(65);
                    columna.setMinWidth(9);
                    columna.setPreferredWidth(60);
                    columna = jTable5.getColumn("CATEGORIA");
                    columna.setMaxWidth(205);
                    columna.setMinWidth(9);
                    columna.setPreferredWidth(200);
                }

            }
        });
    }//GEN-LAST:event_jTextField44KeyTyped

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        buttonGroup2.clearSelection();
        jTextField44.setText("");
        actualizarTablaProducto();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jTextField46KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField46KeyPressed

        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(!jTextField46.getText().equals("")){
                anticipo = Double.parseDouble(jTextField46.getText());
                calcularGranTotal();
            }else{
                jTextField46.setText("0.00");
                anticipo = Double.parseDouble(jTextField46.getText());
                calcularGranTotal();
            }

        }
    }//GEN-LAST:event_jTextField46KeyPressed

    private void jTextField47KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField47KeyPressed

        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(!jTextField47.getText().equals("")){
                descuento = Double.parseDouble(jTextField47.getText());
                calcularGranTotal();
            }else{
                jTextField47.setText("0.00");
                descuento = Double.parseDouble(jTextField47.getText());
                calcularGranTotal();
            }

        }
    }//GEN-LAST:event_jTextField47KeyPressed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

        hacerTransaccion(1);
        actualizarBotones();
        actualizarTablaListadoTransacciones();
        ids_Detalle.clear();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        int tipo_transaccion=0;
        String consulta="";
        Database db = new Database();
        ResultSet res;
        boolean todoCorrecto = true;
        try {

            if(tipo_transaccion==0){//si es FACTURA descontar productos
                for (int i = 0; i < jTable6.getRowCount(); i++) {

                    //obtener cantidad en stock
                    consulta = "SELECT descripcion, cantidad, tipo FROM producto WHERE id = "+ids_Detalle.get(i);
                    res = db.consulta(consulta);
                    String stock="";
                    String tipo="";
                    String descripcion ="";
                    while(res.next()){
                        stock = res.getString("cantidad");
                        tipo = res.getString("tipo");
                        descripcion = res.getString("descripcion");
                    }
                    if(!tipo.equals("0")){//SI NO ES MANO DE OBRA
                        //cantidad a debitar
                        String cantidad = jTable6.getValueAt(i, 0).toString();
                        int restante = Integer.parseInt(stock)-Integer.parseInt(cantidad);
                        if(restante>=0){
                            consulta = "UPDATE producto SET cantidad = "+restante+" WHERE id ="+ids_Detalle.get(i);
                            db.Ejecutar(consulta);
                        }else{
                            todoCorrecto = false;
                            JOptionPane.showMessageDialog(null,"Error, No hay suficiente '"+descripcion+"' en Stock\nSolo existen "+stock+" unidades","ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                }
                actualizarTablaProducto();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al crear Factura\nClase: Principal -> 2548\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        }

        if(todoCorrecto){
            
            hacerTransaccion(tipo_transaccion);
        }
        actualizarBotones();
        actualizarTablaListadoTransacciones();
        ids_Detalle.clear();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jTextField38KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField38KeyTyped
       
        Database db = new Database();
        jTextField38.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e){
                if(e.getKeyCode()!=KeyEvent.VK_ENTER){
                    String texto = jTextField38.getText();
                    jTextField38.setText(texto.toUpperCase());
                    repaint();
                    String busqueda = jTextField38.getText().toUpperCase();
                    String consulta = "";
                    if(jRadioButton10.isSelected()){//correlativo
                        consulta = "SELECT t.id, t.correlativo, t.fecha, p.dpi, p.nombres, v.placa, t.gran_total FROM transaccion as t, persona as p, vehiculo as v WHERE p.id = t.cliente AND v.id = t.vehiculo AND t.correlativo LIKE '"+busqueda+"%';";
                    }else if(jRadioButton11.isSelected()){//dpi cliente
                        consulta = "SELECT t.id, t.correlativo, t.fecha, p.dpi, p.nombres, v.placa, t.gran_total FROM transaccion as t, persona as p, vehiculo as v WHERE p.id = t.cliente AND v.id = t.vehiculo AND p.dpi LIKE '"+busqueda+"%';";
                    }else if(jRadioButton12.isSelected()){//placa vehiculo
                        consulta = "SELECT t.id, t.correlativo, t.fecha, p.dpi, p.nombres, v.placa, t.gran_total FROM transaccion as t, persona as p, vehiculo as v WHERE p.id = t.cliente AND v.id = t.vehiculo AND v.placa LIKE '"+busqueda+"%';";
                    }else{
                        consulta = "SELECT t.id, t.correlativo, t.fecha, p.dpi, p.nombres, v.placa, t.gran_total FROM transaccion as t, persona as p, vehiculo as v WHERE p.id = t.cliente AND v.id = t.vehiculo;";
                        //JOptionPane.showMessageDialog(null,"Error, no selecciono ninguna opcion de filtrado\nClase: Principal","ERROR", JOptionPane.ERROR_MESSAGE);
                    }

                    String[] columnNames = {"ID","CORRELATIVO","FECHA","C. DPI","C. NOMBRE","V. PLACA","GRAN TOTAL"};
                    Object[][] dataVacia = {};
                    DefaultTableModel modelo = new DefaultTableModel(dataVacia, columnNames);
                    ResultSet res = db.filtro(consulta);
                    try{
                        while(res.next()){
                            Object[] newRowData = {res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)};
                            modelo.addRow(newRowData);
                        }
                    }catch(Exception er){

                    }
                    jTable2.setModel(modelo);
                }

            }
        });
        
    }//GEN-LAST:event_jTextField38KeyTyped

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        
        int f = -1;
        f = jTable2.getSelectedRow();
        if(f>-1){
            String correlativo = jTable2.getValueAt(f, 1).toString();
            String archivoFinal = dir+"\\PDFS\\"+correlativo+".pdf";
            File pdfFinal = new File(archivoFinal);
            try {
                Desktop.getDesktop().open(pdfFinal);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,"Error, no se pudo abrir pdf\nClase: Principal -> 3088\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Error, no selecciono ninguna transaccion\n","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        int f = -1;
        f = jTable2.getSelectedRow();
        if(f>-1){
            correlativoAModificar = jTable2.getValueAt(f, 1).toString();
            
            if(correlativoAModificar.contains("COT")){
                jButton24.setEnabled(false);
                jButton25.setEnabled(false);
                jButton29.setEnabled(true);
                Database db = new Database();
                ResultSet rs;
                String consulta ="";

                idTransaccionAModificar = jTable2.getValueAt(f, 0).toString();
                String dpiCliente = jTable2.getValueAt(f, 3).toString();
                String placaVehiculo = jTable2.getValueAt(f, 5).toString();

                agregarVehiculoaTransaccion(placaVehiculo);

                consulta = "SELECT total, anticipo, descuento, gran_total, anotaciones FROM transaccion WHERE id = "+idTransaccionAModificar+";";
                try {
                    rs = db.consulta(consulta);
                    while(rs.next()){
                        jLabel54.setText(rs.getString("total"));
                        jTextField46.setText(rs.getString("anticipo"));
                        jTextField47.setText(rs.getString("descuento"));
                        jLabel58.setText(rs.getString("gran_total"));
                        jTextArea1.setText(rs.getString("anotaciones"));
                    }
                } catch (Exception e) {
                }
                consulta = "SELECT d.cantidad, tp.nombre, p.descripcion, p.precio, p.id FROM detalle as d, tipo_producto as tp, producto as p WHERE tp.id = p.tipo AND p.id = d.producto AND d.transaccion =  "+idTransaccionAModificar+";";
                try {
                    rs = db.consulta(consulta);
                    while(rs.next()){
                        Double subtotal = Double.parseDouble(rs.getString(1))*Double.parseDouble(rs.getString(4));
                        Object[] newRowData = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),subtotal};
                        ids_Detalle.addLast(rs.getString(5));
                        modeloFactura.addRow(newRowData);
                    }
                } catch (Exception e) {
                }
                jTable6.setModel(modeloFactura);
                jTabbedPane1.setSelectedIndex(0);
                actualizarBotones();
            }else{
                JOptionPane.showMessageDialog(null,"Error, no se puede modificar una Orden de Trabajo\n","ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Error, no selecciono ninguna transaccion\n","ERROR", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed

        Paragraph c = correlativo(correlativoAModificar);
        modificarCOTIZACION(correlativoAModificar,c , 1);
        

        correlativoAModificar="";
        jButton24.setEnabled(true);
        jButton25.setEnabled(true);
        jButton29.setEnabled(false);
        actualizarTablaListadoTransacciones();
        ids_Detalle.clear();
        
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jComboBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox4MouseClicked
        
        Empleado p = (Empleado)jComboBox4.getSelectedItem();
        System.out.println(p.getValue());
        
    }//GEN-LAST:event_jComboBox4MouseClicked

    private void jTextField44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField44MouseClicked
        jTextField44.selectAll();
    }//GEN-LAST:event_jTextField44MouseClicked

    private void jFormattedTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextField1MouseClicked
        jFormattedTextField1.selectAll();
    }//GEN-LAST:event_jFormattedTextField1MouseClicked

    

    //--------------------------------------------------------------------------------------METODOS PROPIOS
    
    public void modificarCOTIZACION(String nombre, Paragraph correlativo, int tipo_transaccion){
        
        //---------------------------------------------------------------------------------------------
        //-----------------------------   HACER TRANSACCION -------------------------------------------
        //variables de fijas
        Database db = new Database();
        ResultSet res;
        String consulta ="";

        try{ 
            //eliminar datos de transaccion vieja
            consulta = "DELETE FROM detalle WHERE transaccion = "+idTransaccionAModificar+";";
            db.Ejecutar(consulta);

            //guardar detalles de Transaccion
            if(jTable6.getRowCount() == ids_Detalle.size()){
                for (int i = 0; i < jTable6.getRowCount(); i++) {
                    consulta = "INSERT INTO detalle(transaccion,producto,cantidad)VALUES("+idTransaccionAModificar+","+ids_Detalle.get(i)+","+jTable6.getValueAt(i, 0).toString()+");";
                    db.Ejecutar(consulta);
                    
                }
                
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al crear transaccion\nClase: Principal -> 1785\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        
        
        
        
        
        
        //---------------------------------------------------------------------------------------------
        //-----------------------------   CREAR PDF ---------------------------------------------------
        try {
            //-------------------------------------------------------------------CREANDO Y ABRIENDO PDF
            //creando archivo
            String archivoFinal = dir+"\\PDFS\\"+nombre+".pdf";
            FileOutputStream archivo = new FileOutputStream(archivoFinal);
            //creando docuemtno con tamanio de pagina y margenes 
            Document doc = new Document(PageSize.LETTER,58f,58f,48f,48f);
            //creando el escritor
            PdfWriter.getInstance(doc, archivo);
            //creando parrafo
            Paragraph p;
            //crando "pedazo"
            Chunk c;
            //abrir documento
            doc.open();
            
            //-------------------------------------------------------------------HACER ENCABEZADO
            
            Paragraph salto1 = new Paragraph("\n");
            doc.add(salto1);
            //CREANDO TABLA
            PdfPTable tabla = new PdfPTable(3);
            tabla.setWidthPercentage(100f);
            tabla.getDefaultCell().setBorderColor(BaseColor.WHITE);
            //creando imagen
            Image imagen = Image.getInstance(dir+"\\Imagenes\\LOGO2.jpeg");
            //tamanio imagen
            imagen.scaleAbsolute(182.8f, 115.2f);
            //agregando imagen a celda1
            PdfPCell celda1 = new PdfPCell(imagen);
            //agregando CORRELATIVO    
            PdfPCell celda2;
            celda2 = new PdfPCell(correlativo);
            //imagen de VISA
            imagen = Image.getInstance(dir+"\\Imagenes\\VISA.jpeg");
            imagen.setAlignment(Element.ALIGN_RIGHT);
            imagen.scaleAbsolute(78.8f, 23.5f);
            PdfPCell celda3 = new PdfPCell(imagen);
            //agregar celdas a la tabla
            celda1.setBorderColor(BaseColor.WHITE);
            celda2.setBorderColor(BaseColor.WHITE);
            celda3.setBorderColor(BaseColor.WHITE);
            celda1.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            celda1.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            celda1.setRowspan(2);
            celda2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            celda2.setVerticalAlignment(PdfPCell.ALIGN_BOTTOM);
            celda3.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
            celda3.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tabla.addCell(celda1);
            tabla.addCell(celda2);
            tabla.addCell(celda3);
            //tabla.addCell("");
            p = new Paragraph("12 calle 10-11 zona 11 \nColonia Roosevelt\nTEL: 2292-1579 \nNIT:4835837-1\n\n\n",normal);
            PdfPCell celdadir = new PdfPCell(p);
            celdadir.setBorderColor(BaseColor.WHITE);
            celdadir.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            celdadir.setVerticalAlignment(PdfPCell.ALIGN_BOTTOM);
            tabla.addCell(celdadir);
            //FECHA
            p = new Paragraph("FECHA: "+jFormattedTextField1.getText()+"\n\n\n\n",negrita);
            PdfPCell celfecha = new PdfPCell(p);
            celfecha.setBorderColor(BaseColor.WHITE);
            celfecha.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
            celfecha.setVerticalAlignment(PdfPCell.ALIGN_BOTTOM);
            tabla.addCell(celfecha);
            
           
            
            
            //agregando tabla al documento
            doc.add(tabla);
            
            
            //------------------------------------------------------------------SALTO DE LINEA
            Paragraph salto = new Paragraph("\n");
            Paragraph saltoDoble = new Paragraph("\n\n");
            doc.add(saltoDoble);
            
            //-------------------------------------------------------------------DATOS DEL VEHICULO
            PdfPTable tblDatos = new PdfPTable(8);
            tblDatos.setWidthPercentage(110f);
            tblDatos.getDefaultCell().setBorderColor(BaseColor.WHITE);
            //MECANICO
            p = new Paragraph("Mecanico: ", negrita);
            PdfPCell cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(VariablesEstaticas.nombres + " "+VariablesEstaticas.apellidos,normal);
            cell = new PdfPCell(p);
            cell.setColspan(3);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //PROPIETARIO
            p = new Paragraph("Propietario: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField40.getText(),normal);
            cell = new PdfPCell(p);
            cell.setColspan(3);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            
            //VEHICULO
            p = new Paragraph("Vehiculo: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField31.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //NIT
            p = new Paragraph("NIT: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField41.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //DIRECCION
            p = new Paragraph("Direccion: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField42.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            cell.setColspan(3);
            tblDatos.addCell(cell);
            
            
            //VIN
            p = new Paragraph("VIN: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField35.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //LINEA
            p = new Paragraph("Linea: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField32.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //COLOR
            p = new Paragraph("Color: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField37.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //MODELO
            p = new Paragraph("Modelo: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField33.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //RECORRIDO
            p = new Paragraph("Recorrido km: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField36.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //MOTOR
            p = new Paragraph("C.C. Motor: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField34.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //TELEFONO
            p = new Paragraph("Telefono: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField43.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //PLACA
            p = new Paragraph("Placa: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField23.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //PROXIMO SERVICIO
            p = new Paragraph("Proximo S.: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField39.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //CELDAS VACIAS
            tblDatos.addCell("");
            tblDatos.addCell("");
            tblDatos.addCell("");
            tblDatos.addCell("");
            tblDatos.addCell("");
            tblDatos.addCell("");
            
            //AGREGANDO TABLA DE DATOS
            doc.add(tblDatos);
            
            
            //------------------------------------------------------------------SALTO DE LINEA
            doc.add(salto);
            
            
            
            //------------------------------------------------------------------TABLA DE DETALLE
            
            //--------------------------------------------------------------MANO DE OBRA
            p = new Paragraph("MANO DE OBRA", negrita);
            p.setAlignment(Paragraph.ALIGN_LEFT);
            doc.add(p);
            
            PdfPTable tblDetalleM = new PdfPTable(4);
            tblDetalleM.setWidthPercentage(115f);
            tblDetalleM.getDefaultCell().setBorderColor(BaseColor.WHITE);
            
            //CANTIDAD
            p = new Paragraph("CANTIDAD", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleM.addCell(cell);
            //DETALLE
            p = new Paragraph("DETALLE", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleM.addCell(cell);
            //PRECIO UNITARIO
            p = new Paragraph("PRECIO UNITARIO", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleM.addCell(cell);
            //SUBTOTAL
            p = new Paragraph("SUBTOTAL", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleM.addCell(cell);
            
            Double totalM = 0.0;
            for (int i = 0; i < jTable6.getRowCount(); i++) {
                if(jTable6.getValueAt(i, 1).toString().equals("MANO DE OBRA")){
                    //CANTIDAD
                    p = new Paragraph(jTable6.getValueAt(i, 0).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleM.addCell(cell);
                    //DETALLE
                    p = new Paragraph(jTable6.getValueAt(i, 2).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleM.addCell(cell);
                    //PRECIO UNITARIO
                    p = new Paragraph(jTable6.getValueAt(i, 3).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleM.addCell(cell);
                    //SUBTOTAL
                    p = new Paragraph(jTable6.getValueAt(i, 4).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleM.addCell(cell);
                    totalM = totalM + Double.parseDouble(jTable6.getValueAt(i, 4).toString());
                }
            }
            //AGREGAR TABLA
            doc.add(tblDetalleM);
            p = new Paragraph("TOTAL MANO DE OBRA: Q "+totalM,normal);
            p.setAlignment(Paragraph.ALIGN_RIGHT);
            doc.add(p);
            doc.add(salto);
            
            //--------------------------------------------------------------ACEITES Y LUBRICANTES
            p = new Paragraph("ACEITES Y LUBRICANTES", negrita);
            p.setAlignment(Paragraph.ALIGN_LEFT);
            doc.add(p);
            
            PdfPTable tblDetalleA = new PdfPTable(4);
            tblDetalleA.setWidthPercentage(115f);
            tblDetalleA.getDefaultCell().setBorderColor(BaseColor.WHITE);
            
            //CANTIDAD
            p = new Paragraph("CANTIDAD", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleA.addCell(cell);
            //DETALLE
            p = new Paragraph("DETALLE", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleA.addCell(cell);
            //PRECIO UNITARIO
            p = new Paragraph("PRECIO UNITARIO", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleA.addCell(cell);
            //SUBTOTAL
            p = new Paragraph("SUBTOTAL", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleA.addCell(cell);
            
            Double totalA = 0.0;
            for (int i = 0; i < jTable6.getRowCount(); i++) {
                if(jTable6.getValueAt(i, 1).toString().equals("ACEITES Y LUBRICANTES")){
                    //CANTIDAD
                    p = new Paragraph(jTable6.getValueAt(i, 0).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleA.addCell(cell);
                    //DETALLE
                    p = new Paragraph(jTable6.getValueAt(i, 2).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleA.addCell(cell);
                    //PRECIO UNITARIO
                    p = new Paragraph(jTable6.getValueAt(i, 3).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleA.addCell(cell);
                    //SUBTOTAL
                    p = new Paragraph(jTable6.getValueAt(i, 4).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleA.addCell(cell);
                    totalA = totalA + Double.parseDouble(jTable6.getValueAt(i, 4).toString());
                }
            }
            //AGREGAR TABLA
            doc.add(tblDetalleA);
            p = new Paragraph("TOTAL ACEITES Y LUBRICANTES: Q "+totalA,normal);
            p.setAlignment(Paragraph.ALIGN_RIGHT);
            doc.add(p);
            doc.add(salto);
            
            //--------------------------------------------------------------REPUESTOS
            p = new Paragraph("REPUESTOS\n", negrita);
            p.setAlignment(Paragraph.ALIGN_LEFT);
            doc.add(p);
            
            PdfPTable tblDetalleR = new PdfPTable(4);
            tblDetalleR.setWidthPercentage(115f);
            tblDetalleR.getDefaultCell().setBorderColor(BaseColor.WHITE);
            
            //CANTIDAD
            p = new Paragraph("CANTIDAD", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleR.addCell(cell);
            //DETALLE
            p = new Paragraph("DETALLE", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleR.addCell(cell);
            //PRECIO UNITARIO
            p = new Paragraph("PRECIO UNITARIO", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleR.addCell(cell);
            //SUBTOTAL
            p = new Paragraph("SUBTOTAL", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleR.addCell(cell);
            
            Double totalR = 0.0;
            for (int i = 0; i < jTable6.getRowCount(); i++) {
                if(jTable6.getValueAt(i, 1).toString().equals("REPUESTOS")){
                    //CANTIDAD
                    p = new Paragraph(jTable6.getValueAt(i, 0).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleR.addCell(cell);
                    //DETALLE
                    p = new Paragraph(jTable6.getValueAt(i, 2).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleR.addCell(cell);
                    //PRECIO UNITARIO
                    p = new Paragraph(jTable6.getValueAt(i, 3).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleR.addCell(cell);
                    //SUBTOTAL
                    p = new Paragraph(jTable6.getValueAt(i, 4).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleR.addCell(cell);
                    totalR = totalR + Double.parseDouble(jTable6.getValueAt(i, 4).toString());
                }
            }
            //AGREGAR TABLA
            doc.add(tblDetalleR);
            p = new Paragraph("TOTAL REPUESTOS: Q "+totalR,normal);
            p.setAlignment(Paragraph.ALIGN_RIGHT);
            doc.add(p);
            
            
            //------------------------------------------------------------------SALTO DE LINEA
            doc.add(saltoDoble);
            
            
            //------------------------------------------------------------------TABLA DETALLES FINALES
            PdfPTable tblFinales = new PdfPTable(4);
            tblFinales.setWidthPercentage(115f);
            tblFinales.getDefaultCell().setBorderColor(BaseColor.WHITE);
            
            //ANOTACIONES
            p = new Paragraph("ANOTACIONES", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setRowspan(4);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            p = new Paragraph(jTextArea1.getText(), cursiva);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setRowspan(4);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            
            //TOTAL
            p = new Paragraph("Total: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            p = new Paragraph("Q. "+jLabel54.getText(), normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            
            //ANTICIPO
            p = new Paragraph("Anticipo: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            p = new Paragraph("Q. "+jTextField46.getText(), normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            
            //DESCUENTO
            p = new Paragraph("Descuento: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            p = new Paragraph("Q. "+jTextField47.getText(), normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            
            //GRAN TOTAL
            p = new Paragraph("GRAN TOTAL: ", tblHeader);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            p = new Paragraph("Q. "+jLabel58.getText(), tblHeader);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            
            
            
            doc.add(tblFinales);
            
            doc.close();
            File pdfFinal = new File(archivoFinal);
            Desktop.getDesktop().open(pdfFinal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al crear PDF\nClase: Principal -> 3316\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        ids_Detalle.clear();
        LimpiarTransaccion();
    }
    
    
    public void crearPDF(String nombre, Paragraph correlativo, int tipo_transaccion){
        try {
            //-------------------------------------------------------------------CREANDO Y ABRIENDO PDF
            //creando archivo
            String archivoFinal = dir+"\\PDFS\\"+nombre+".pdf";
            FileOutputStream archivo = new FileOutputStream(archivoFinal);
            //creando docuemtno con tamanio de pagina y margenes 
            Document doc = new Document(PageSize.LETTER,58f,58f,48f,48f);
            //creando el escritor
            PdfWriter.getInstance(doc, archivo);
            //creando parrafo
            Paragraph p;
            //crando "pedazo"
            Chunk c;
            //abrir documento
            doc.open();
            
            //-------------------------------------------------------------------HACER ENCABEZADO
            
            Paragraph salto1 = new Paragraph("\n");
            doc.add(salto1);
            //CREANDO TABLA
            PdfPTable tabla = new PdfPTable(3);
            tabla.setWidthPercentage(100f);
            tabla.getDefaultCell().setBorderColor(BaseColor.WHITE);
            //creando imagen
            Image imagen = Image.getInstance(dir+"\\Imagenes\\LOGO2.jpeg");
            //tamanio imagen
            imagen.scaleAbsolute(182.8f, 115.2f);
            //agregando imagen a celda1
            PdfPCell celda1 = new PdfPCell(imagen);
            //agregando CORRELATIVO    
            PdfPCell celda2;
            if(tipo_transaccion==0){
                celda2 = new PdfPCell(correlativo);
            }else{
                p = new Paragraph(" COTIZACION ",nTransaccion);
                celda2 = new PdfPCell(p);
                
            }
            //imagen de VISA
            imagen = Image.getInstance(dir+"\\Imagenes\\VISA.jpeg");
            imagen.setAlignment(Element.ALIGN_RIGHT);
            imagen.scaleAbsolute(78.8f, 23.5f);
            PdfPCell celda3 = new PdfPCell(imagen);
            //agregar celdas a la tabla
            celda1.setBorderColor(BaseColor.WHITE);
            celda2.setBorderColor(BaseColor.WHITE);
            celda3.setBorderColor(BaseColor.WHITE);
            celda1.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            celda1.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            celda1.setRowspan(2);
            celda2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            celda2.setVerticalAlignment(PdfPCell.ALIGN_BOTTOM);
            celda3.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
            celda3.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tabla.addCell(celda1);
            tabla.addCell(celda2);
            tabla.addCell(celda3);
            //tabla.addCell("");
            p = new Paragraph("12 calle 10-11 zona 11 \nColonia Roosevelt\nTEL: 2292-1579 \nNIT:4835837-1\n\n\n",normal);
            PdfPCell celdadir = new PdfPCell(p);
            celdadir.setBorderColor(BaseColor.WHITE);
            celdadir.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            celdadir.setVerticalAlignment(PdfPCell.ALIGN_BOTTOM);
            tabla.addCell(celdadir);
            //FECHA
            p = new Paragraph("FECHA: "+jFormattedTextField1.getText()+"\n\n\n\n",negrita);
            PdfPCell celfecha = new PdfPCell(p);
            celfecha.setBorderColor(BaseColor.WHITE);
            celfecha.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
            celfecha.setVerticalAlignment(PdfPCell.ALIGN_BOTTOM);
            tabla.addCell(celfecha);
            
           
            
            
            //agregando tabla al documento
            doc.add(tabla);
            
            
            //------------------------------------------------------------------SALTO DE LINEA
            Paragraph salto = new Paragraph("\n");
            Paragraph saltoDoble = new Paragraph("\n\n");
            doc.add(saltoDoble);
            
            //-------------------------------------------------------------------DATOS DEL VEHICULO
            PdfPTable tblDatos = new PdfPTable(8);
            tblDatos.setWidthPercentage(110f);
            tblDatos.getDefaultCell().setBorderColor(BaseColor.WHITE);
            //MECANICO
            p = new Paragraph("Mecanico: ", negrita);
            PdfPCell cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            Empleado per = (Empleado)jComboBox4.getSelectedItem();
            p = new Paragraph(per.nombres + " "+per.apellidos,normal);
            cell = new PdfPCell(p);
            cell.setColspan(3);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //PROPIETARIO
            p = new Paragraph("Propietario: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField40.getText(),normal);
            cell = new PdfPCell(p);
            cell.setColspan(3);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            
            //VEHICULO
            p = new Paragraph("Vehiculo: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField31.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //NIT
            p = new Paragraph("NIT: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField41.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //DIRECCION
            p = new Paragraph("Direccion: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField42.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            cell.setColspan(3);
            tblDatos.addCell(cell);
            
            
            //VIN
            p = new Paragraph("VIN: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField35.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //LINEA
            p = new Paragraph("Linea: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField32.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //COLOR
            p = new Paragraph("Color: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField37.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //MODELO
            p = new Paragraph("Modelo: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField33.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //RECORRIDO
            p = new Paragraph("Recorrido km: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField36.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //MOTOR
            p = new Paragraph("C.C. Motor: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField34.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //TELEFONO
            p = new Paragraph("Telefono: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField43.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //PLACA
            p = new Paragraph("Placa: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField23.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //PROXIMO SERVICIO
            p = new Paragraph("Proximo S.: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTextField39.getText(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //CELDAS VACIAS
            tblDatos.addCell("");
            tblDatos.addCell("");
            tblDatos.addCell("");
            tblDatos.addCell("");
            tblDatos.addCell("");
            tblDatos.addCell("");
            
            //AGREGANDO TABLA DE DATOS
            doc.add(tblDatos);
            
            
            //------------------------------------------------------------------SALTO DE LINEA
            doc.add(salto);
            
            
            
            //------------------------------------------------------------------TABLA DE DETALLE
            
            //--------------------------------------------------------------MANO DE OBRA
            p = new Paragraph("MANO DE OBRA", negrita);
            p.setAlignment(Paragraph.ALIGN_LEFT);
            doc.add(p);
            
            PdfPTable tblDetalleM = new PdfPTable(4);
            tblDetalleM.setWidthPercentage(115f);
            tblDetalleM.getDefaultCell().setBorderColor(BaseColor.WHITE);
            
            //CANTIDAD
            p = new Paragraph("CANTIDAD", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleM.addCell(cell);
            //DETALLE
            p = new Paragraph("DETALLE", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleM.addCell(cell);
            //PRECIO UNITARIO
            p = new Paragraph("PRECIO UNITARIO", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleM.addCell(cell);
            //SUBTOTAL
            p = new Paragraph("SUBTOTAL", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleM.addCell(cell);
            
            Double totalM = 0.0;
            for (int i = 0; i < jTable6.getRowCount(); i++) {
                if(jTable6.getValueAt(i, 1).toString().equals("MANO DE OBRA")){
                    //CANTIDAD
                    p = new Paragraph(jTable6.getValueAt(i, 0).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleM.addCell(cell);
                    //DETALLE
                    p = new Paragraph(jTable6.getValueAt(i, 2).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleM.addCell(cell);
                    //PRECIO UNITARIO
                    p = new Paragraph(jTable6.getValueAt(i, 3).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleM.addCell(cell);
                    //SUBTOTAL
                    p = new Paragraph(jTable6.getValueAt(i, 4).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleM.addCell(cell);
                    totalM = totalM + Double.parseDouble(jTable6.getValueAt(i, 4).toString());
                }
            }
            //AGREGAR TABLA
            doc.add(tblDetalleM);
            p = new Paragraph("TOTAL MANO DE OBRA: Q "+totalM,normal);
            p.setAlignment(Paragraph.ALIGN_RIGHT);
            doc.add(p);
            doc.add(salto);
            
            //--------------------------------------------------------------ACEITES Y LUBRICANTES
            p = new Paragraph("ACEITES Y LUBRICANTES", negrita);
            p.setAlignment(Paragraph.ALIGN_LEFT);
            doc.add(p);
            
            PdfPTable tblDetalleA = new PdfPTable(4);
            tblDetalleA.setWidthPercentage(115f);
            tblDetalleA.getDefaultCell().setBorderColor(BaseColor.WHITE);
            
            //CANTIDAD
            p = new Paragraph("CANTIDAD", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleA.addCell(cell);
            //DETALLE
            p = new Paragraph("DETALLE", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleA.addCell(cell);
            //PRECIO UNITARIO
            p = new Paragraph("PRECIO UNITARIO", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleA.addCell(cell);
            //SUBTOTAL
            p = new Paragraph("SUBTOTAL", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleA.addCell(cell);
            
            Double totalA = 0.0;
            for (int i = 0; i < jTable6.getRowCount(); i++) {
                if(jTable6.getValueAt(i, 1).toString().equals("ACEITES Y LUBRICANTES")){
                    //CANTIDAD
                    p = new Paragraph(jTable6.getValueAt(i, 0).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleA.addCell(cell);
                    //DETALLE
                    p = new Paragraph(jTable6.getValueAt(i, 2).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleA.addCell(cell);
                    //PRECIO UNITARIO
                    p = new Paragraph(jTable6.getValueAt(i, 3).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleA.addCell(cell);
                    //SUBTOTAL
                    p = new Paragraph(jTable6.getValueAt(i, 4).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleA.addCell(cell);
                    totalA = totalA + Double.parseDouble(jTable6.getValueAt(i, 4).toString());
                }
            }
            //AGREGAR TABLA
            doc.add(tblDetalleA);
            p = new Paragraph("TOTAL ACEITES Y LUBRICANTES: Q "+totalA,normal);
            p.setAlignment(Paragraph.ALIGN_RIGHT);
            doc.add(p);
            doc.add(salto);
            
            //--------------------------------------------------------------REPUESTOS
            p = new Paragraph("REPUESTOS\n", negrita);
            p.setAlignment(Paragraph.ALIGN_LEFT);
            doc.add(p);
            
            PdfPTable tblDetalleR = new PdfPTable(4);
            tblDetalleR.setWidthPercentage(115f);
            tblDetalleR.getDefaultCell().setBorderColor(BaseColor.WHITE);
            
            //CANTIDAD
            p = new Paragraph("CANTIDAD", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleR.addCell(cell);
            //DETALLE
            p = new Paragraph("DETALLE", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleR.addCell(cell);
            //PRECIO UNITARIO
            p = new Paragraph("PRECIO UNITARIO", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleR.addCell(cell);
            //SUBTOTAL
            p = new Paragraph("SUBTOTAL", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalleR.addCell(cell);
            
            Double totalR = 0.0;
            for (int i = 0; i < jTable6.getRowCount(); i++) {
                if(jTable6.getValueAt(i, 1).toString().equals("REPUESTOS")){
                    //CANTIDAD
                    p = new Paragraph(jTable6.getValueAt(i, 0).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleR.addCell(cell);
                    //DETALLE
                    p = new Paragraph(jTable6.getValueAt(i, 2).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleR.addCell(cell);
                    //PRECIO UNITARIO
                    p = new Paragraph(jTable6.getValueAt(i, 3).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleR.addCell(cell);
                    //SUBTOTAL
                    p = new Paragraph(jTable6.getValueAt(i, 4).toString(),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalleR.addCell(cell);
                    totalR = totalR + Double.parseDouble(jTable6.getValueAt(i, 4).toString());
                }
            }
            //AGREGAR TABLA
            doc.add(tblDetalleR);
            p = new Paragraph("TOTAL REPUESTOS: Q "+totalR,normal);
            p.setAlignment(Paragraph.ALIGN_RIGHT);
            doc.add(p);
            
            
            //------------------------------------------------------------------SALTO DE LINEA
            doc.add(saltoDoble);
            
            
            //------------------------------------------------------------------TABLA DETALLES FINALES
            PdfPTable tblFinales = new PdfPTable(4);
            tblFinales.setWidthPercentage(115f);
            tblFinales.getDefaultCell().setBorderColor(BaseColor.WHITE);
            
            //ANOTACIONES
            p = new Paragraph("ANOTACIONES", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setRowspan(4);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            p = new Paragraph(jTextArea1.getText(), cursiva);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setRowspan(4);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            
            //TOTAL
            p = new Paragraph("Total: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            p = new Paragraph("Q. "+jLabel54.getText(), normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            
            //ANTICIPO
            p = new Paragraph("Anticipo: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            p = new Paragraph("Q. "+jTextField46.getText(), normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            
            //DESCUENTO
            p = new Paragraph("Descuento: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            p = new Paragraph("Q. "+jTextField47.getText(), normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            
            //GRAN TOTAL
            p = new Paragraph("GRAN TOTAL: ", tblHeader);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            p = new Paragraph("Q. "+jLabel58.getText(), tblHeader);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tblFinales.addCell(cell);
            
            
            
            doc.add(tblFinales);
            
            doc.close();
            File pdfFinal = new File(archivoFinal);
            Desktop.getDesktop().open(pdfFinal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al crear PDF\nClase: Principal -> 3316\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    public void actualizarTablaListadoTransacciones(){
        Database db = new Database();
        String[] columnNames = {"ID","CORRELATIVO","FECHA","C. DPI","C. NOMBRE","V. PLACA","GRAN TOTAL"};
        Object[][] dataVacia = {};
        DefaultTableModel modelo = new DefaultTableModel(dataVacia, columnNames);            
        String consulta = "SELECT t.id, t.correlativo, t.fecha, p.dpi, p.nombres, v.placa, t.gran_total FROM transaccion as t, persona as p, vehiculo as v WHERE p.id = t.cliente AND v.id = t.vehiculo;";
        ResultSet res = db.filtro(consulta);
        try{
            while(res.next()){
                Object[] newRowData = {res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)};
                modelo.addRow(newRowData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al llenar tabla de listado de Transacciones\nClase: Principal -> 3051\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        jTable2.setModel(modelo);
    }
    
    public void hacerTransaccion(int tipo_transaccion){
        //variables de fijas
        Database db = new Database();
        ResultSet res;
        String consulta ="";
        
        //variables dinamicas
        String correlativo ="";
        String ncorrelativo ="";
        String cliente = jLabel62.getText();
        String vehiculo = jLabel61.getText();
        String placa = jTextField23.getText();
        String mecanico = "0";
        Empleado p = (Empleado)jComboBox4.getSelectedItem();
        mecanico = p.id;
        String nombremecanico = VariablesEstaticas.nombres +" "+VariablesEstaticas.apellidos;
        String totalFactura = jLabel54.getText();
        String anticipoFactura = jTextField46.getText();
        String descuentoFactura = jTextField47.getText();
        String gran_total = jLabel58.getText();
        String anotaciones = jTextArea1.getText();
        String idTransaccion="";
        try{
            
            //obtener correlativo de cotizacion
            consulta = "SELECT * FROM tipo_transaccion WHERE id = "+tipo_transaccion+";";
            res = db.consulta(consulta);
            while(res.next()){
                ncorrelativo = res.getString(3);
                correlativo = res.getString(2) + res.getString(3);
            }
            
            //guardar datos de Transaccion
            consulta = "INSERT INTO transaccion(tipo,correlativo,fecha,cliente,vehiculo,mecanico,total,anticipo,descuento,gran_total,anotaciones)VALUES("+tipo_transaccion+",'"+correlativo+"','"+jFormattedTextField1.getText()+"',"+cliente+","+vehiculo+","+mecanico+",'"+totalFactura+"','"+anticipoFactura+"','"+descuentoFactura+"','"+gran_total+"','"+anotaciones+"');";
            db.Ejecutar(consulta);
            
            //obtener id de la transaccion guardada
            consulta = "SELECT MAX(id) AS maximo FROM transaccion";
            res = db.consulta(consulta);
            while(res.next()){
                idTransaccion = res.getString("maximo");
            }
            //guardar detalles de Transaccion
            if(jTable6.getRowCount() == ids_Detalle.size()){
                for (int i = 0; i < jTable6.getRowCount(); i++) {
                    consulta = "INSERT INTO detalle(transaccion,producto,cantidad)VALUES("+idTransaccion+","+ids_Detalle.get(i)+","+jTable6.getValueAt(i, 0).toString()+");";
                    db.Ejecutar(consulta);
                    
                }
                
            }
            
            //aumentar correlativo de la transaccion
            int correlativoNuevo = Integer.parseInt(ncorrelativo) + 1;
            consulta ="UPDATE tipo_transaccion SET correlativo = "+correlativoNuevo+" WHERE id = "+tipo_transaccion;
            db.Ejecutar(consulta);
            
            //GENERAR PDF
            //nombre    correlativo+"_"+placa
            crearPDF(correlativo,correlativo(correlativo),tipo_transaccion);
            
            
            ids_Detalle.clear();
            LimpiarTransaccion();
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al crear transaccion\nClase: Principal -> 4785\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void LimpiarTransaccion(){
        //LIMPIAR TODOOOO
        jTextField23.setText("");
        jTextField31.setText("");
        jTextField32.setText("");
        jTextField33.setText("");
        jTextField34.setText("");
        jTextField35.setText("");
        jTextField36.setText("");
        jTextField37.setText("");
        jTextField39.setText("");
        jTextField40.setText("");
        jTextField41.setText("");
        jTextField42.setText("");
        jLabel61.setText("");            
        jLabel62.setText("");
        buttonGroup2.clearSelection();
        jTextField44.setText("");
        jTextField45.setText("1");
        jLabel54.setText("0.00");
        jTextField46.setText("0.00");
        jTextField47.setText("0.00");
        jLabel58.setText("0.00");
        jTextArea1.setText("");
        jTextField43.setText("");
        IniciarTablaFactura();
        actualizarTablaProducto();
    }
    
    public void llenarComboMecanicos(){
        Database db = new Database();
        ResultSet rs;
        Vector model = new Vector();
        String consulta = "SELECT id, nombres, apellidos FROM persona WHERE tipo = 1";
        try {
            rs = db.consulta(consulta);
            while(rs.next()){
                Empleado p = new Empleado();
                p.id = rs.getString("id");
                p.nombres = rs.getString("nombres");
                p.apellidos = rs.getString("apellidos");
                model.addElement(p);
            }
            jComboBox4.setModel(new DefaultComboBoxModel(model));
        } catch (Exception e) {
        }
    }
    
    public void limpiarVehiculos(){
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        //jFormattedTextField1.setText("");
        jTextField26.setText("");

    }
    
    public String codificar(String pass){
        return Base64.getEncoder().encodeToString(pass.getBytes());
    }
    
    public String decodificar(String codificado){
        byte[] decodedBytes = Base64.getDecoder().decode(codificado);
        return new String(decodedBytes);
    }
    
    public void actualizarTablaClientes(){
        Database db = new Database();
        String[] columnNames = {"ID","DPI","NOMBRES","APELLIDOS","TELEFONO","DIRECCION","NIT"};
        Object[][] dataVacia = {};
        DefaultTableModel modelo = new DefaultTableModel(dataVacia, columnNames);
        String consulta = "SELECT p.id, p.dpi, p.nombres, p.apellidos, p.telefono, p.direccion, p.nit FROM persona as p, tipo_persona as tp WHERE p.tipo = tp.id AND tp.id = 2;";
        ResultSet resultado = db.consulta(consulta);
        try{
            while(resultado.next()){
                Object[] newRowData = {resultado.getString("id"),resultado.getString("dpi"),resultado.getString("nombres"),resultado.getString("apellidos"),resultado.getString("telefono"),resultado.getString("direccion"),resultado.getString("nit")};
                modelo.addRow(newRowData);
            }
        }catch(Exception e){  
            JOptionPane.showMessageDialog(null,"Error al llenar tabla de clientes\nClase: Principal -> 2721\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        jTable1.setModel(modelo);
        
    }
    
    public void actualizarTablaEmpleados2(){
        Database db = new Database();
        String[] columnNames = {"ID","DPI","NOMBRES","APELLIDOS","TELEFONO","DIRECCION","NIT"};
        Object[][] dataVacia = {};
        DefaultTableModel modelo = new DefaultTableModel(dataVacia, columnNames);
        jTable7.setModel(modelo);
        String consulta = "SELECT p.id, p.dpi, p.nombres, p.apellidos, p.telefono, p.direccion, p.nit FROM persona as p, tipo_persona as tp WHERE p.tipo = tp.id AND tp.id = 2;";
        ResultSet resultado = db.consulta(consulta);
        try{
            while(resultado.next()){
                Object[] newRowData = {resultado.getString("id"),resultado.getString("dpi"),resultado.getString("nombres"),resultado.getString("apellidos"),resultado.getString("telefono"),resultado.getString("direccion"),resultado.getString("nit")};
                modelo.addRow(newRowData);
            }
        }catch(Exception e){  
            JOptionPane.showMessageDialog(null,"Error al llenar tabla de clientes\nClase: Principal -> 2721\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        jTable7.setModel(modelo);
        
    }
    
    public void actualizarTablaVehiculos(){
        Database db = new Database();
        String[] columnNames = {"ID","PLACA","MARCA","LINEA","MODELO","TRANSMISION","COLOR","ASIENTOS","ID MOTOR","C.C.","CIL.","VIN", "KMs", "DPI DUEÑO","PROXIMO SERV."};
        Object[][] dataVacia = {};
        DefaultTableModel modelo = new DefaultTableModel(dataVacia, columnNames);
        String consulta = "SELECT v.id, v.placa, v.marca, v.linea, v.modelo, v.transmision, v.color, v.asientos, v.id_motor, v.motor_cc, v.cilindros, v.vin, v.recorrido, p.dpi, v.fecha_proximo FROM vehiculo as v, persona as p WHERE p.id = v.propietario;";
        ResultSet res = db.consulta(consulta);
        try{
            while(res.next()){
                Object[] newRowData = {res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10),res.getString(11),res.getString(12),res.getString(13),res.getString(14),res.getString(15)};
                modelo.addRow(newRowData);
            }
        }catch(Exception e){  
            JOptionPane.showMessageDialog(null,"Error al llenar tabla vehiculos\nClase: Principal -> 2740\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        jTable3.setModel(modelo);
        
        
        jTable3.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable3.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable3.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable3.getColumnModel().getColumn(3).setPreferredWidth(125);
        jTable3.getColumnModel().getColumn(4).setPreferredWidth(40);
        jTable3.getColumnModel().getColumn(5).setPreferredWidth(80);
        jTable3.getColumnModel().getColumn(6).setPreferredWidth(125);
        jTable3.getColumnModel().getColumn(7).setPreferredWidth(55);
        jTable3.getColumnModel().getColumn(8).setPreferredWidth(90);
        jTable3.getColumnModel().getColumn(9).setPreferredWidth(16);
        jTable3.getColumnModel().getColumn(10).setPreferredWidth(16);
        jTable3.getColumnModel().getColumn(11).setPreferredWidth(125);
        jTable3.getColumnModel().getColumn(12).setPreferredWidth(50);
        jTable3.getColumnModel().getColumn(13).setPreferredWidth(90);
    }
    
    public void actualizarTablaProducto(){
        ids_Productos.clear();
        Database db = new Database();
        String[] columnNames = {"ID","CATEGORIA","DESCRIPCION","CANTIDAD","PRECIO"};
        String[] columnNames2 = {"ID","CATEGORIA","DESCRIPCION","PRECIO"};
        Object[][] dataVacia = {};
        DefaultTableModel modelo = new DefaultTableModel(dataVacia, columnNames);
        DefaultTableModel modelo2 = new DefaultTableModel(dataVacia, columnNames2);
        String consulta = "SELECT p.id, tp.nombre, p.descripcion, p.cantidad, p.precio FROM producto as p, tipo_producto as tp WHERE tp.id = p.tipo ORDER BY p.descripcion;";
        ResultSet resultado = db.consulta(consulta);
        try{
            while(resultado.next()){
                Object[] newRowData = {resultado.getString("id"),resultado.getString("nombre"),resultado.getString("descripcion"),resultado.getString("cantidad"),resultado.getString("precio"),};
                Object[] newRowData2 = {resultado.getString("id"),resultado.getString("nombre"),resultado.getString("descripcion"),resultado.getString("precio"),};
                ids_Productos.addLast(resultado.getString("id"));
                modelo.addRow(newRowData);
                modelo2.addRow(newRowData2);
            }
        }catch(Exception e){  
            JOptionPane.showMessageDialog(null,"Error al llenar tabla de productos y servicios\nClase: Principal -> 2780\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        jTable4.setModel(modelo);
        jTable5.setModel(modelo2);
        TableColumn columna = jTable5.getColumn("ID");
        columna.setMaxWidth(35);
        columna.setMinWidth(9);
        columna.setPreferredWidth(30);
        columna = jTable5.getColumn("PRECIO");
        columna.setMaxWidth(65);
        columna.setMinWidth(9);
        columna.setPreferredWidth(60);
        columna = jTable5.getColumn("CATEGORIA");
        columna.setMaxWidth(205);
        columna.setMinWidth(9);
        columna.setPreferredWidth(200);
//        jTable5.getColumnModel().getColumn(0).setPreferredWidth(5);
//        jTable5.getColumnModel().getColumn(1).setPreferredWidth(40);
//        jTable5.getColumnModel().getColumn(2).setPreferredWidth(50);
//        jTable5.getColumnModel().getColumn(3).setPreferredWidth(5);
    }
    
    public void actualizarTablaEmpleados(){
        Database db = new Database();
        String[] columnNames = {"ID","DPI","NOMBRES","APELLIDOS","TELEFONO","DIRECCION","NIT", "USUARIO", "PASSWORD"};
        Object[][] dataVacia = {};
        DefaultTableModel modelo = new DefaultTableModel(dataVacia, columnNames);
        String consulta = "SELECT p.id, p.dpi, p.nombres, p.apellidos, p.telefono, p.direccion, p.nit, p.usuario, p.password FROM persona as p, tipo_persona as tp WHERE p.tipo = tp.id AND tp.id = 1;";
        ResultSet resultado = db.consulta(consulta);
        try{
            while(resultado.next()){
                Object[] newRowData = {resultado.getString("id"),resultado.getString("dpi"),resultado.getString("nombres"),resultado.getString("apellidos"),resultado.getString("telefono"),resultado.getString("direccion"),resultado.getString("nit"),resultado.getString("usuario"),resultado.getString("password")};
                modelo.addRow(newRowData);
            }
        }catch(Exception e){  
            JOptionPane.showMessageDialog(null,"Error al actualizar tabla de empleados\nClase: Principal -> 2799\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        jTable7.setModel(modelo);
    }
    
    public void IniciarTablaFactura(){
        String[] columnNames = {"CANTIDAD","CATEGORIA","  DESCRIPCION  ","PRECIO UNITARIO","SUBTOTAL"};
        Object[][] dataVacia = {};
        modeloFactura = new DefaultTableModel(dataVacia, columnNames);
        jTable6.setModel(modeloFactura);
    }
    
    public void combo_Clientes_Autos(){
        //llenar combobox1 de DPI de clientes
        Database db = new Database();
        Vector model = new Vector();
        String consulta = "SELECT p.id, p.dpi, p.nombres, p.apellidos FROM persona as p WHERE p.tipo = 2";
        ResultSet res = db.consulta(consulta);
        
        try{
            while(res.next()){
                Cliente p = new Cliente();
                p.id = res.getString("id");
                p.dpi = res.getString("dpi");
                p.nombres = res.getString("nombres");
                p.apellidos = res.getString("apellidos");
                model.addElement(p);
                                
            }
            jComboBox1.setModel(new DefaultComboBoxModel(model));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al llenar opciones de propietarios en vehiculos\nClase: Principal -> 2829\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void limpiarProductos(){
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
    }
    
    public void agregarVehiculoaTransaccion(String placa){
        
        Database db = new Database();
        String busqueda = placa;
        String consulta = "SELECT  v.id, v.placa, v.marca, v.linea, v.modelo, v.transmision, v.color, v.asientos, v.id_motor, v.motor_cc, v.cilindros, v.vin, v.recorrido, p.dpi, v.fecha_proximo, p.nombres, p.apellidos, p.nit, p.direccion, p.telefono, p.id FROM vehiculo as v, persona as p WHERE propietario = p.id AND placa LIKE '"+busqueda+"%';";

        ResultSet res = db.filtro(consulta);
        boolean encontrado = false;
        try{
            while(res.next()){
                jTextField23.setText(placa);
                jTextField31.setText(res.getString(3));
                jTextField32.setText(res.getString(4));
                jTextField33.setText(res.getString(5));
                jTextField34.setText(res.getString(10));
                jTextField35.setText(res.getString(12));
                jTextField36.setText(res.getString(13));
                jTextField37.setText(res.getString(7));
                //jTextField38.setText(res.getString(15));
                jTextField39.setText(res.getString(15));
                jTextField40.setText(res.getString(16)+" "+res.getString(17));
                jTextField41.setText(res.getString(18));
                jTextField42.setText(res.getString(19));
                jTextField43.setText(res.getString(20));
                jLabel61.setText(res.getString(1));
                jLabel62.setText(res.getString(21));
                if(res.getString(2).equals(placa)){
                   encontrado = true; 
                }
            }
            if(!encontrado){
                JOptionPane.showMessageDialog(null,"No se encontro el vehiculo con la placa: "+placa,"ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al agregar vehiculo a transaccion\nClase: Principal -> 2884\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void calcularTotal(){
        total=0;
        for(int i =0; i<jTable6.getRowCount(); i++){
            double subtotal = Double.parseDouble(jTable6.getValueAt(i, 4).toString());
            total += subtotal;
            gtotal = total;
        }
        jLabel54.setText(""+total);
        jLabel58.setText(""+gtotal);
        calcularGranTotal();
    }
    
    public void calcularGranTotal(){
        gtotal = total - anticipo - descuento;
        jLabel58.setText(""+gtotal);
    }
    
    
    public Paragraph correlativo(String Correlativo){
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_RIGHT);
        c.append("Orden de Trabajo "+Correlativo);
        c.setFont(nTransaccion);
        p.add(c);
        return p;
    }
    
    public void generarPDFHistorial(LinkedList<Historial> transacciones, int f){
        
        //TITULO CORRELATIVO
        String titulo = "HI-"+jTable3.getValueAt(f,1).toString();
        //clase interna cliente para buscar sus datos
        class cliente{
            public String nombre="";
            public String nit="";
            public String direccion="";
            public String telefono="";
        }
        Database db = new Database();
        ResultSet res;
        String consulta="";
        cliente cli = new cliente();
        //lleando datos del cliente
        try {
            consulta = "SELECT nombres, apellidos, nit, direccion, telefono FROM persona WHERE id = "+transacciones.get(0).idCliente;
            res = db.consulta(consulta);
            while(res.next()){
                cli.nombre = res.getString("nombres")+" "+res.getString("apellidos");
                cli.nit = res.getString("nit");
                cli.direccion = res.getString("direccion");
                cli.telefono = res.getString("telefono");
            }
            
            
            
            //-------------------------------------------------------------------CREANDO Y ABRIENDO PDF
            //creando archivo
            String archivoFinal = dir+"\\PDFS\\"+titulo+".pdf";
            FileOutputStream archivo = new FileOutputStream(archivoFinal);
            //creando docuemtno con tamanio de pagina y margenes 
            Document doc = new Document(PageSize.LETTER,58f,58f,48f,48f);
            //creando el escritor
            PdfWriter.getInstance(doc, archivo);
            //creando parrafo
            Paragraph p;
            //crando "pedazo"
            Chunk c;
            //abrir documento
            doc.open();
            
            //-------------------------------------------------------------------HACER ENCABEZADO
            
            Paragraph salto1 = new Paragraph("\n");
            doc.add(salto1);
            //CREANDO TABLA
            PdfPTable tabla = new PdfPTable(3);
            tabla.setWidthPercentage(100f);
            tabla.getDefaultCell().setBorderColor(BaseColor.WHITE);
            //creando imagen
            Image imagen = Image.getInstance(dir+"\\Imagenes\\LOGO2.jpeg");
            //tamanio imagen
            imagen.scaleAbsolute(182.8f, 115.2f);
            //agregando imagen a celda1
            PdfPCell celda1 = new PdfPCell(imagen);
            //agregando TITULO
            p = new Paragraph();
            c = new Chunk();
            p.setAlignment(Element.ALIGN_RIGHT);
            c.append(titulo);
            c.setFont(nTransaccion);
            p.add(c);
            PdfPCell celda2 = new PdfPCell(p);
            //imagen de VISA
            imagen = Image.getInstance(dir+"\\Imagenes\\VISA.jpeg");
            imagen.setAlignment(Element.ALIGN_RIGHT);
            imagen.scaleAbsolute(78.8f, 23.5f);
            PdfPCell celda3 = new PdfPCell(imagen);
            //agregar celdas a la tabla
            celda1.setBorderColor(BaseColor.WHITE);
            celda2.setBorderColor(BaseColor.WHITE);
            celda3.setBorderColor(BaseColor.WHITE);
            celda1.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            celda1.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            celda1.setRowspan(2);
            celda2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            celda2.setVerticalAlignment(PdfPCell.ALIGN_BOTTOM);
            celda3.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
            celda3.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            tabla.addCell(celda1);
            tabla.addCell(celda2);
            tabla.addCell(celda3);
            //tabla.addCell("");
            p = new Paragraph("12 calle 10-11 zona 11 \nColonia Roosevelt\nTEL: 2292-1579 \nNIT:4835837-1\n\n\n",normal);
            PdfPCell celdadir = new PdfPCell(p);
            celdadir.setBorderColor(BaseColor.WHITE);
            celdadir.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            celdadir.setVerticalAlignment(PdfPCell.ALIGN_BOTTOM);
            tabla.addCell(celdadir);
            //FECHA
            p = new Paragraph("FECHA: "+jFormattedTextField1.getText()+"\n\n\n\n",negrita);
            PdfPCell celfecha = new PdfPCell(p);
            celfecha.setBorderColor(BaseColor.WHITE);
            celfecha.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
            celfecha.setVerticalAlignment(PdfPCell.ALIGN_BOTTOM);
            tabla.addCell(celfecha);
            
           
            
            
            //agregando tabla al documento
            doc.add(tabla);
            
            
            //------------------------------------------------------------------SALTO DE LINEA
            Paragraph salto = new Paragraph("\n\n");
            doc.add(salto);
            
            
            //-------------------------------------------------------------------DATOS DEL VEHICULO
            PdfPTable tblDatos = new PdfPTable(8);
            tblDatos.setWidthPercentage(110f);
            tblDatos.getDefaultCell().setBorderColor(BaseColor.WHITE);
            PdfPCell cell;

            //PROPIETARIO
            p = new Paragraph("Propietario: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(cli.nombre,normal);
            cell = new PdfPCell(p);
            cell.setColspan(7);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            
            //VEHICULO
            p = new Paragraph("Vehiculo: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTable3.getValueAt(f, 2).toString(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //NIT
            p = new Paragraph("NIT: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(cli.nit,normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //DIRECCION
            p = new Paragraph("Direccion: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(cli.direccion,normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            cell.setColspan(3);
            tblDatos.addCell(cell);
            
            
            //VIN
            p = new Paragraph("VIN: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTable3.getValueAt(f, 11).toString(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //LINEA
            p = new Paragraph("Linea: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTable3.getValueAt(f, 3).toString(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //COLOR
            p = new Paragraph("Color: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTable3.getValueAt(f, 6).toString(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //MODELO
            p = new Paragraph("Modelo: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTable3.getValueAt(f, 4).toString(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //RECORRIDO
            p = new Paragraph("Recorrido km: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTable3.getValueAt(f, 12).toString(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //MOTOR
            p = new Paragraph("C.C. Motor: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTable3.getValueAt(f, 9).toString(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //TELEFONO
            p = new Paragraph("Telefono: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(cli.telefono,normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //PLACA
            p = new Paragraph("Placa: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTable3.getValueAt(f, 1).toString(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //PROXIMO SERVICIO
            p = new Paragraph("Proximo S.: ", negrita);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            tblDatos.addCell(cell);
            p = new Paragraph(jTable3.getValueAt(f, 14).toString(),normal);
            cell = new PdfPCell(p);
            cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            tblDatos.addCell(cell);
            
            //CELDAS VACIAS
            tblDatos.addCell("");
            tblDatos.addCell("");
            tblDatos.addCell("");
            tblDatos.addCell("");
            tblDatos.addCell("");
            tblDatos.addCell("");
            
            //AGREGANDO TABLA DE DATOS
            doc.add(tblDatos);
            
            
            //------------------------------------------------------------------SALTO DE LINEA
            doc.add(salto);
            
            
            //------------------------------------------------------------------TABLA DE DETALLE
            PdfPTable tblDetalle = new PdfPTable(4);
            tblDetalle.setWidthPercentage(115f);
            tblDetalle.getDefaultCell().setBorderColor(BaseColor.WHITE);
            
            //ENCABEZADO
            //CANTIDAD
            p = new Paragraph("FECHA", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalle.addCell(cell);
            //TIPO
            p = new Paragraph("TIPO PRODUCTO", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalle.addCell(cell);
            //DETALLE
            p = new Paragraph("DETALLE", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalle.addCell(cell);
            //PRECIO UNITARIO
            p = new Paragraph("CANTIDAD", tblHeader);
            cell = new PdfPCell(p);
            //cell.setBorderColor(BaseColor.WHITE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tblDetalle.addCell(cell);
            
            
            for (int i = 0; i < transacciones.size(); i++) {
                for (int j = 0; j < transacciones.get(i).productos.size(); j++) {
                    //OBTENIENDO NOMBRE DEL PRODUCTO
                    consulta = "SELECT tp.nombre, p.descripcion FROM producto AS p, tipo_producto AS tp WHERE tp.id = p.tipo AND p.id ="+transacciones.get(i).productos.get(j);
                    res = db.consulta(consulta);
                    String tipo = "";
                    String prod = "";
                    while(res.next()){
                        prod = res.getString("descripcion");
                        tipo = res.getString("nombre");
                    }
                    //FECHA
                    p = new Paragraph(transacciones.get(i).fecha,cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalle.addCell(cell);
                    //TIPO PRODUCTO
                    p = new Paragraph(tipo,cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalle.addCell(cell);
                    //DETALLE
                    p = new Paragraph(prod,cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalle.addCell(cell);
                    //CANTIDAD
                    p = new Paragraph(transacciones.get(i).cantidades.get(j),cursiva);
                    cell = new PdfPCell(p);
                    //cell.setBorderColor(BaseColor.WHITE);
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    tblDetalle.addCell(cell);
                }
                
                
                
                
                
                
            }
            
            //AGREGAR TABLA
            doc.add(tblDetalle);
            
            
            
            
            //------------------------------------------------------------------SALTO DE LINEA
            doc.add(salto);

            doc.close();
            File pdfFinal = new File(archivoFinal);
            Desktop.getDesktop().open(pdfFinal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al crear PDF historial\nClase: Principal -> 3704\nExcepcion: "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    public boolean existe(String tabla, String condicion, String valor){
        boolean existe = false;
        Database db = new Database();
        String consulta = "SELECT * FROM "+tabla+" WHERE "+condicion+" = '"+valor+"';";
        ResultSet rs = db.consulta(consulta);
        try {
            while(rs.next()){
                existe = true;
            }
        } catch (Exception e) {
        }
        return existe;
    }
    
    public void actualizarBotones(){
        Database db = new Database();
        String consulta = "SELECT correlativo FROM tipo_transaccion WHERE id = 0;";
        String correlativoOT = "";
        String correlativoCOT="";
        ResultSet rs;
        
        
        
        rs = db.consulta(consulta);
        try {
            while(rs.next()){
                correlativoOT =rs.getString("correlativo");
            }
        } catch (Exception e) {
        }
        
        consulta = "SELECT correlativo FROM tipo_transaccion WHERE id = 1;";
        rs = db.consulta(consulta);
        try {
            while(rs.next()){
                correlativoCOT =rs.getString("correlativo");
            }
        } catch (Exception e) {
        }
        jButton24.setText("<html><p align=\"center\">ORDEN</p><br><p align=\"center\">"+correlativoOT+"</p></html>");
        jButton25.setText("<html><p align=\"center\">COTIZACION</p><br><p align=\"center\">"+correlativoCOT+"</p></html>");
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroupLOC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}

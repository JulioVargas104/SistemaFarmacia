/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
package Clases;
import Clases.Producto;
import Clases.Proveedor;
import Clases.Cliente;
import Clases.Venta;
import Clases.Plantilla;
import Clases.RegistroVentas;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.awt.Desktop;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import com.itextpdf.text.Image;

/**
 *
 * @author Julio Vargas
 */
public class Interfaz extends javax.swing.JFrame {
   
    List<RegistroVentas> registroVentas;
    public static int in;
    DefaultTableModel modelo;
    DefaultTableModel modeloProv;
    DefaultTableModel modeloClie;
    DefaultTableModel modeloVent;
    DefaultTableModel modeloVentas;
    String EncabezadosProd[] = {"Código","Descripción","Cantidad","Precio","Proveedor"};
    String EncabezadosProv[] = {"RUC","NOMBRE","TELÉFONO","DIRECCIÓN","RAZÓN SOCIAL"};
    String EncabezadosClie[] = {"DNI/RUC","NOMBRE","TELÉFONO","DIRECCIÓN","RAZÓN SOCIAL"};
    String EncabezadosVent[] = {"Código","Descripción","Cantidad","Precio","Total"};
    String EncabezadosVentas[] = {"ID","Cliente","Vendedor","Total"};
    
    
    public Interfaz() {
        initComponents();
        modelo = new DefaultTableModel(null,EncabezadosProd);
        modeloProv = new DefaultTableModel(null,EncabezadosProv);
        modeloClie = new DefaultTableModel(null,EncabezadosClie);
        modeloVent = new DefaultTableModel(null,EncabezadosVent);
        modeloVentas = new DefaultTableModel(null,EncabezadosVentas);
        TableProducto.setModel(modelo);
        TableProveedor.setModel(modeloProv);
        TableCliente.setModel(modeloClie);
        TableVenta.setModel(modeloVent);
        TableVentas1.setModel(modeloVentas);
        btnBorrarConfi.setVisible(false);
        registroVentas = new ArrayList<>();
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEliminarVenta = new javax.swing.JButton();
        txtCodigoVenta = new javax.swing.JTextField();
        txtCantidadVenta = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVenta = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtStockVenta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDNIVenta = new javax.swing.JTextField();
        txtNombreVenta = new javax.swing.JTextField();
        btnGenerarVenta = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblTotalVenta = new javax.swing.JLabel();
        txtTelefonoVenta = new javax.swing.JTextField();
        txtDireccionVenta = new javax.swing.JTextField();
        txtRazonVenta = new javax.swing.JTextField();
        txtIDPro = new javax.swing.JTextField();
        cbxDescripcionVenta = new javax.swing.JComboBox<>();
        cboNombreVenta = new javax.swing.JComboBox<>();
        cboNonbreProveedor = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDNICliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        btnGuardarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        txtIDCliente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtTelefonoProveedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        txtRUCProveedor = new javax.swing.JTextField();
        txtRazonSocialProveedor = new javax.swing.JTextField();
        txtDireccionProveedor = new javax.swing.JTextField();
        btnGuardarProveedor = new javax.swing.JButton();
        btnEditarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnNuevoProveedor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableProveedor = new javax.swing.JTable();
        txtIDProveedor = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        txtDescripcionProducto = new javax.swing.JTextField();
        txtCantidadProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        cbxProveedorProducto = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableProducto = new javax.swing.JTable();
        btnGuardarProducto = new javax.swing.JButton();
        btnEditarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnNuevoProducto = new javax.swing.JButton();
        txtIDProducto = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableVentas1 = new javax.swing.JTable();
        btnPdfVentas = new javax.swing.JButton();
        txtIDVentas = new javax.swing.JTextField();
        GenerarPDF = new javax.swing.JButton();
        AbrirPDF = new javax.swing.JButton();
        cboNonbreProveedor1 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtRucConfi = new javax.swing.JTextField();
        txtNombreConfi = new javax.swing.JTextField();
        txtTelefonoConfi = new javax.swing.JTextField();
        txtDireccionConfi = new javax.swing.JTextField();
        txtRazonSocialConfi = new javax.swing.JTextField();
        btnActualizarConfi = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        btnBorrarConfi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 10, 760, 0);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nventa.png"))); // NOI18N
        jButton1.setText("Nueva venta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 210, 183, 48);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.png"))); // NOI18N
        jButton2.setText("Clientes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 270, 183, 34);

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedor.png"))); // NOI18N
        jButton3.setText("Proveedor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 330, 183, 38);

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto.png"))); // NOI18N
        jButton4.setText("Productos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 380, 183, 31);

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compras.png"))); // NOI18N
        jButton5.setText("Ventas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(20, 430, 183, 34);

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/config.png"))); // NOI18N
        jButton6.setText("Configuración");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(20, 480, 183, 38);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/Logo_doccccc.png"))); // NOI18N
        jPanel1.add(jButton7);
        jButton7.setBounds(30, 10, 170, 190);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 10, 220, 560);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/encabezado.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 10, 760, 180);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Código");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(24, 6, 94, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Descripción");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(124, 6, 69, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Cantidad");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(224, 6, 66, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Precio");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(324, 6, 67, 15);

        btnEliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarVenta);
        btnEliminarVenta.setBounds(640, 24, 36, 29);

        txtCodigoVenta.setEditable(false);
        jPanel2.add(txtCodigoVenta);
        txtCodigoVenta.setBounds(24, 28, 94, 24);

        txtCantidadVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyTyped(evt);
            }
        });
        jPanel2.add(txtCantidadVenta);
        txtCantidadVenta.setBounds(224, 28, 94, 24);

        txtPrecioVenta.setEditable(false);
        jPanel2.add(txtPrecioVenta);
        txtPrecioVenta.setBounds(324, 28, 94, 24);

        TableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane1.setViewportView(TableVenta);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(24, 59, 652, 207);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Stock Disponible");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(424, 6, 102, 15);

        txtStockVenta.setEditable(false);
        jPanel2.add(txtStockVenta);
        txtStockVenta.setBounds(424, 28, 94, 24);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Proveedor");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(220, 350, 74, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Cliente");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 350, 120, 15);
        jPanel2.add(txtDNIVenta);
        txtDNIVenta.setBounds(24, 305, 74, 24);
        jPanel2.add(txtNombreVenta);
        txtNombreVenta.setBounds(116, 305, 156, 24);

        btnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/print.png"))); // NOI18N
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenerarVenta);
        btnGenerarVenta.setBounds(457, 284, 52, 48);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money.png"))); // NOI18N
        jLabel10.setText("Total a pagar");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(527, 285, 111, 24);

        lblTotalVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalVenta.setText("---------");
        jPanel2.add(lblTotalVenta);
        lblTotalVenta.setBounds(644, 284, 84, 27);
        jPanel2.add(txtTelefonoVenta);
        txtTelefonoVenta.setBounds(278, 305, 15, 24);
        jPanel2.add(txtDireccionVenta);
        txtDireccionVenta.setBounds(299, 305, 15, 24);
        jPanel2.add(txtRazonVenta);
        txtRazonVenta.setBounds(320, 305, 15, 24);
        jPanel2.add(txtIDPro);
        txtIDPro.setBounds(530, 27, 17, 26);

        cbxDescripcionVenta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxDescripcionVentaItemStateChanged(evt);
            }
        });
        cbxDescripcionVenta.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                cbxDescripcionVentaHierarchyChanged(evt);
            }
        });
        cbxDescripcionVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxDescripcionVentaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxDescripcionVentaMousePressed(evt);
            }
        });
        cbxDescripcionVenta.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                cbxDescripcionVentaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                cbxDescripcionVentaInputMethodTextChanged(evt);
            }
        });
        cbxDescripcionVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDescripcionVentaActionPerformed(evt);
            }
        });
        cbxDescripcionVenta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbxDescripcionVentaPropertyChange(evt);
            }
        });
        cbxDescripcionVenta.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                cbxDescripcionVentaVetoableChange(evt);
            }
        });
        jPanel2.add(cbxDescripcionVenta);
        cbxDescripcionVenta.setBounds(124, 27, 94, 26);

        cboNombreVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione)" }));
        jPanel2.add(cboNombreVenta);
        cboNombreVenta.setBounds(20, 370, 150, 26);

        cboNonbreProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione)" }));
        jPanel2.add(cboNonbreProveedor);
        cboNonbreProveedor.setBounds(220, 370, 140, 26);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Nombre");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(116, 284, 75, 15);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("DNI/RUC");
        jPanel2.add(jLabel33);
        jLabel33.setBounds(24, 284, 74, 15);

        jTabbedPane1.addTab("Nueva Venta", jPanel2);

        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("DNI/RUC");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(18, 24, 77, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Nombre");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(18, 55, 77, 15);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Télefono");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(18, 91, 77, 15);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Dirección");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(18, 132, 77, 15);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Razón Social");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(18, 169, 77, 15);
        jPanel3.add(txtDNICliente);
        txtDNICliente.setBounds(120, 19, 156, 24);
        jPanel3.add(txtNombreCliente);
        txtNombreCliente.setBounds(120, 55, 156, 24);

        txtTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoClienteKeyTyped(evt);
            }
        });
        jPanel3.add(txtTelefonoCliente);
        txtTelefonoCliente.setBounds(120, 91, 156, 24);
        jPanel3.add(txtDireccionCliente);
        txtDireccionCliente.setBounds(120, 127, 156, 24);
        jPanel3.add(txtRazonSocial);
        txtRazonSocial.setBounds(120, 169, 156, 24);

        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI/RUC", "NOMBRE", "TÉLEFONO", "DIRECCIÓN", "RAZÓN SOCIAL"
            }
        ));
        jScrollPane2.setViewportView(TableCliente);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(294, 41, 453, 293);

        btnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        btnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardarCliente);
        btnGuardarCliente.setBounds(119, 226, 37, 33);

        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        btnEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditarCliente);
        btnEditarCliente.setBounds(196, 226, 37, 32);

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarCliente);
        btnEliminarCliente.setBounds(119, 277, 36, 29);

        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevoCliente);
        btnNuevoCliente.setBounds(196, 277, 37, 33);
        jPanel3.add(txtIDCliente);
        txtIDCliente.setBounds(294, 11, 15, 24);

        jTabbedPane1.addTab("Clientes", jPanel3);

        jPanel4.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("RUC");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(22, 11, 25, 15);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Nombre");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(22, 53, 47, 15);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Télefono");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(22, 95, 53, 15);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Dirección");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(22, 137, 55, 15);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Razón Social");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(22, 179, 77, 15);

        txtTelefonoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoProveedorKeyTyped(evt);
            }
        });
        jPanel4.add(txtTelefonoProveedor);
        txtTelefonoProveedor.setBounds(105, 90, 138, 24);
        jPanel4.add(txtNombreProveedor);
        txtNombreProveedor.setBounds(105, 48, 138, 24);
        jPanel4.add(txtRUCProveedor);
        txtRUCProveedor.setBounds(105, 6, 138, 24);
        jPanel4.add(txtRazonSocialProveedor);
        txtRazonSocialProveedor.setBounds(105, 174, 138, 24);
        jPanel4.add(txtDireccionProveedor);
        txtDireccionProveedor.setBounds(105, 132, 138, 24);

        btnGuardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });
        jPanel4.add(btnGuardarProveedor);
        btnGuardarProveedor.setBounds(84, 229, 37, 33);

        btnEditarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        btnEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveedorActionPerformed(evt);
            }
        });
        jPanel4.add(btnEditarProveedor);
        btnEditarProveedor.setBounds(170, 230, 37, 32);

        btnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminarProveedor);
        btnEliminarProveedor.setBounds(84, 284, 36, 29);

        btnNuevoProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveedorActionPerformed(evt);
            }
        });
        jPanel4.add(btnNuevoProveedor);
        btnNuevoProveedor.setBounds(170, 280, 37, 33);

        TableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUC", "Nombre", "Télefono", "Dirección", "Razón Social"
            }
        ));
        jScrollPane3.setViewportView(TableProveedor);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(261, 36, 491, 290);
        jPanel4.add(txtIDProveedor);
        txtIDProveedor.setBounds(261, 6, 15, 24);

        jTabbedPane1.addTab("Proveedor", jPanel4);

        jPanel5.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Código");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(6, 11, 43, 15);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Descripción");
        jPanel5.add(jLabel22);
        jLabel22.setBounds(6, 53, 69, 15);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Cantidad");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(6, 95, 55, 15);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Precio");
        jPanel5.add(jLabel24);
        jLabel24.setBounds(6, 137, 37, 15);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Proveedor");
        jPanel5.add(jLabel25);
        jLabel25.setBounds(6, 180, 63, 15);
        jPanel5.add(txtCodigoProducto);
        txtCodigoProducto.setBounds(87, 6, 136, 24);
        jPanel5.add(txtDescripcionProducto);
        txtDescripcionProducto.setBounds(87, 48, 136, 24);

        txtCantidadProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadProductoKeyTyped(evt);
            }
        });
        jPanel5.add(txtCantidadProducto);
        txtCantidadProducto.setBounds(87, 90, 136, 24);

        txtPrecioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioProductoKeyTyped(evt);
            }
        });
        jPanel5.add(txtPrecioProducto);
        txtPrecioProducto.setBounds(87, 132, 136, 24);

        cbxProveedorProducto.setEditable(true);
        jPanel5.add(cbxProveedorProducto);
        cbxProveedorProducto.setBounds(87, 174, 136, 26);

        TableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Stock", "Precio", "Proveedor"
            }
        ));
        jScrollPane4.setViewportView(TableProducto);

        jPanel5.add(jScrollPane4);
        jScrollPane4.setBounds(256, 48, 496, 274);

        btnGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });
        jPanel5.add(btnGuardarProducto);
        btnGuardarProducto.setBounds(25, 227, 37, 33);

        btnEditarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });
        jPanel5.add(btnEditarProducto);
        btnEditarProducto.setBounds(186, 227, 37, 32);

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        jPanel5.add(btnEliminarProducto);
        btnEliminarProducto.setBounds(26, 278, 36, 29);

        btnNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });
        jPanel5.add(btnNuevoProducto);
        btnNuevoProducto.setBounds(186, 278, 37, 29);
        jPanel5.add(txtIDProducto);
        txtIDProducto.setBounds(256, 6, 15, 24);

        jTabbedPane1.addTab("Productos", jPanel5);

        jPanel6.setLayout(null);

        TableVentas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Vendedor", "Total"
            }
        ));
        jScrollPane5.setViewportView(TableVentas1);

        jPanel6.add(jScrollPane5);
        jScrollPane5.setBounds(30, 50, 684, 225);

        btnPdfVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        btnPdfVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfVentasActionPerformed(evt);
            }
        });
        jPanel6.add(btnPdfVentas);
        btnPdfVentas.setBounds(6, 6, 36, 32);
        jPanel6.add(txtIDVentas);
        txtIDVentas.setBounds(60, 14, 15, 24);

        GenerarPDF.setText("Generar PDF");
        GenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarPDFActionPerformed(evt);
            }
        });
        jPanel6.add(GenerarPDF);
        GenerarPDF.setBounds(590, 310, 110, 50);

        AbrirPDF.setText("Abrir PDF");
        AbrirPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirPDFActionPerformed(evt);
            }
        });
        jPanel6.add(AbrirPDF);
        AbrirPDF.setBounds(60, 310, 110, 50);

        cboNonbreProveedor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione)" }));
        jPanel6.add(cboNonbreProveedor1);
        cboNonbreProveedor1.setBounds(320, 10, 140, 26);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Escoja nombre del Proveedor: ");
        jPanel6.add(jLabel34);
        jLabel34.setBounds(120, 10, 190, 15);

        jTabbedPane1.addTab("Ventas", jPanel6);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("RUC");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Nombre");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Télefono");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Dirección");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Razón Social");

        btnActualizarConfi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        btnActualizarConfi.setText("Actualizar");
        btnActualizarConfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarConfiActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel31.setText("DATOS DE LA EMPRESA TUFARMA");

        btnBorrarConfi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnBorrarConfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarConfiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel29)
                                    .addComponent(txtRucConfi, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtDireccionConfi))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel30)
                                    .addComponent(txtNombreConfi)
                                    .addComponent(txtRazonSocialConfi, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(txtTelefonoConfi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnActualizarConfi)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarConfi)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRucConfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreConfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoConfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionConfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazonSocialConfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBorrarConfi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarConfi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Configuración", jPanel7);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(220, 200, 760, 430);

        setSize(new java.awt.Dimension(1063, 722));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
           try{
               if(txtCodigoProducto.getText().equals("") || txtDescripcionProducto.getText().equals("") ||
                  txtCantidadProducto.getText().equals("") || txtPrecioProducto.getText().equals("") ||
                  cbxProveedorProducto.getSelectedItem().toString().equals("")){
                    JOptionPane.showMessageDialog(null, "Error de Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
               }
               else{
                String cod = txtCodigoProducto.getText();
                String des = txtDescripcionProducto.getText();
                int can = Integer.parseInt(txtCantidadProducto.getText());
                double pre = Double.parseDouble(txtPrecioProducto.getText());
                String pro = cbxProveedorProducto.getSelectedItem().toString();
                Producto proD = new Producto(cod,des,can,pre,pro);
                Object Datos[] = {proD.codigo,proD.descripcion,proD.cantidad,proD.precio,proD.proveedor};
                modelo.addRow(Datos);
                cbxDescripcionVenta.addItem(proD.descripcion);
               }
           }
           catch(Exception ex){
               JOptionPane.showMessageDialog(null, "error","Error",JOptionPane.ERROR_MESSAGE);
           }
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        txtCodigoProducto.setText("");
        txtDescripcionProducto.setText("");
        txtCantidadProducto.setText("");
        txtPrecioProducto.setText("");
        cbxProveedorProducto.setSelectedItem("");
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        int fila = TableProducto.getSelectedRow();
        
        if(fila>=0){
           cbxDescripcionVenta.removeItem(modelo.getValueAt(TableProducto.getSelectedRow(), 1));
           modelo.removeRow(fila);
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        int FilaSelect = TableProducto.getSelectedRow();
        if(FilaSelect >= 0 ){
            txtCodigoProducto.setText(TableProducto.getValueAt(FilaSelect, 0).toString());
            txtDescripcionProducto.setText(TableProducto.getValueAt(FilaSelect, 1).toString());
            txtCantidadProducto.setText(TableProducto.getValueAt(FilaSelect, 2).toString());
            txtPrecioProducto.setText(TableProducto.getValueAt(FilaSelect, 3).toString());
            cbxProveedorProducto.setSelectedItem(TableProducto.getValueAt(FilaSelect, 4).toString());
            modelo.removeRow(FilaSelect);
        }
        else{
            JOptionPane.showMessageDialog(this, "Fila no seleccionada");
        }
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed
        try{
        String dni = txtRUCProveedor.getText();
        String nom = txtNombreProveedor.getText();
        String tel = txtTelefonoProveedor.getText();
        String dir = txtDireccionProveedor.getText();
        String raz = txtRazonSocialProveedor.getText();
        Proveedor prov = new Proveedor(dni,nom,tel,dir,raz);
        Object DatosProv[] = {prov.dni,prov.nombre,prov.telefono,prov.direccion,prov.razonS};
        modeloProv.addRow(DatosProv);
        cbxProveedorProducto.addItem(prov.nombre);
        cboNonbreProveedor.addItem(prov.nombre);
        cboNonbreProveedor1.addItem(prov.nombre);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed
        int FilaSelect = TableProveedor.getSelectedRow();
        if(FilaSelect >= 0 ){
            txtRUCProveedor.setText(TableProveedor.getValueAt(FilaSelect, 0).toString());
            txtNombreProveedor.setText(TableProveedor.getValueAt(FilaSelect, 1).toString());
            txtTelefonoProveedor.setText(TableProveedor.getValueAt(FilaSelect, 2).toString());
            txtDireccionProveedor.setText(TableProveedor.getValueAt(FilaSelect, 3).toString());
            txtRazonSocialProveedor.setText(TableProveedor.getValueAt(FilaSelect, 4).toString());
            modeloProv.removeRow(FilaSelect);
        }
        else{
            JOptionPane.showMessageDialog(this, "Fila no seleccionada");
        }
    }//GEN-LAST:event_btnEditarProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        try{
            int fila = TableProveedor.getSelectedRow();
            
            if(fila>=0){
            
            cbxProveedorProducto.removeItem(modeloProv.getValueAt(TableProveedor.getSelectedRow(),1));
            cboNonbreProveedor.removeItem(modeloProv.getValueAt(TableProveedor.getSelectedRow(), 1));
            cboNonbreProveedor1.removeItem(modeloProv.getValueAt(TableProveedor.getSelectedRow(), 1));
            modeloProv.removeRow(fila);
            }
            else{
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
            }
        }
        catch (Exception ex){
            System.out.println("Error: "+ex.getMessage().toString());
        }
        
        
        
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveedorActionPerformed
        txtRUCProveedor.setText("");
        txtNombreProveedor.setText("");
        txtTelefonoProveedor.setText("");
        txtDireccionProveedor.setText("");
        txtRazonSocialProveedor.setText("");
    }//GEN-LAST:event_btnNuevoProveedorActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        try{
            if (txtDNICliente.getText().equals("") || txtNombreCliente.getText().equals("") || txtTelefonoCliente.getText().equals("") ||
                txtDireccionCliente.getText().equals("") || txtRazonSocial.getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "Error de Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                String dni = txtDNICliente.getText();
                String nom = txtNombreCliente.getText();
                String tel = txtTelefonoCliente.getText();
                String dir = txtDireccionCliente.getText();
                String raz = txtRazonSocial.getText();
                Cliente clie = new Cliente(dni,nom,tel,dir,raz);
                Object DatosClie[] = {clie.dni,clie.nombre,clie.telefono,clie.direccion,clie.razonS};
                modeloClie.addRow(DatosClie);
                cboNombreVenta.addItem(clie.nombre);
                
            }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        int FilaSelect = TableCliente.getSelectedRow();
        if(FilaSelect >= 0 ){
            txtDNICliente.setText(TableCliente.getValueAt(FilaSelect, 0).toString());
            txtNombreCliente.setText(TableCliente.getValueAt(FilaSelect, 1).toString());
            txtTelefonoCliente.setText(TableCliente.getValueAt(FilaSelect, 2).toString());
            txtDireccionCliente.setText(TableCliente.getValueAt(FilaSelect, 3).toString());
            txtRazonSocial.setText(TableCliente.getValueAt(FilaSelect, 4).toString());
            modeloClie.removeRow(FilaSelect);
        }
        else{
            JOptionPane.showMessageDialog(this, "Fila no seleccionada");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        int fila = TableCliente.getSelectedRow();
        if(fila>=0){
            cboNombreVenta.removeItem(modeloClie.getValueAt(fila, 1));
            modeloClie.removeRow(fila);
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        txtDNICliente.setText("");
        txtNombreCliente.setText("");
        txtTelefonoCliente.setText("");
        txtDireccionCliente.setText("");
        txtRazonSocial.setText("");
    }//GEN-LAST:event_btnNuevoClienteActionPerformed
    
    
    
    void SeleccionarCasillas(){
        
        
        
        
        //Producto[] product;
        //product = new Producto[TableProducto.getRowCount()];
       
        /*if (cbxDescripcionVenta.getSelectedItem().toString() == TableProducto.) {
            
            txtCodigoVenta.setText(proD.codigo);
            txtStockVenta.setText(String.valueOf(proD.cantidad));
            txtPrecioVenta.setText(String.valueOf(proD.precio));
        }
        */
        for (int i = 0; i < TableProducto.getRowCount(); i++) {
            if ( String.valueOf(modelo.getValueAt(i, 1)) == cbxDescripcionVenta.getSelectedItem().toString() ) {   // String.valueOf(modelo.getValueAt(i, 1))         
                
                String cod = String.valueOf(modelo.getValueAt(i, 0));
                String des = String.valueOf(modelo.getValueAt(i, 1));
                int can = Integer.parseInt(String.valueOf(modelo.getValueAt(i, 2)));
                double pre = Double.parseDouble(String.valueOf(modelo.getValueAt(i, 3)));
                String pro = String.valueOf(modelo.getValueAt(i, 4));
                Producto proD = new Producto(cod,des,can,pre,pro);
                
                 txtCodigoVenta.setText(proD.codigo);
                 txtStockVenta.setText(String.valueOf(proD.cantidad));
                 txtPrecioVenta.setText(String.valueOf(proD.precio));
                 
                 //break;
            }
            else if (String.valueOf(modelo.getValueAt(i, 1)) != cbxDescripcionVenta.getSelectedItem().toString()) {
                cbxDescripcionVenta.removeItem(cbxDescripcionVenta.getSelectedIndex());
            }
            
        }
        
        
        
        
    }
    private void cbxDescripcionVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDescripcionVentaActionPerformed
           //SeleccionarCasillas();
    }//GEN-LAST:event_cbxDescripcionVentaActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
           
        try{
            
           /*(if(txtCantidadVenta.getText().equals("") || txtDNIVenta.getText().equals("") ||  txtNombreVenta.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Error de Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
            }
           */           
           String cod = txtCodigoVenta.getText();
           String des = cbxDescripcionVenta.getSelectedItem().toString();
           int can = Integer.parseInt(txtCantidadVenta.getText());
           double pre = Double.parseDouble(txtPrecioVenta.getText());
           int stk = Integer.parseInt(txtStockVenta.getText());
           String dni = txtDNIVenta.getText();
           String Proveedor = cboNonbreProveedor.getSelectedItem().toString();
           //String nom = txtNombreVenta.getText();
           String nombreCliente = cboNombreVenta.getSelectedItem().toString();
           
           Venta vnt = new Venta(cod,des,can,pre,stk,dni,nombreCliente);
           Object DatosVen[] = {vnt.codigo,vnt.descripcion,vnt.cantidad,vnt.precio,vnt.precioFin()};
           
           int totall;
           modeloVent.addRow(DatosVen);
           //modeloVentas.addRow(DatosVen);
           
           for (int i = 0; i < TableProducto.getRowCount(); i++) {
            if ( String.valueOf(modelo.getValueAt(i, 1)) == cbxDescripcionVenta.getSelectedItem().toString() ) {   // String.valueOf(modelo.getValueAt(i, 1))         
                
                totall = Integer.parseInt(modelo.getValueAt(i, 2).toString())  - can ;
                
                modelo.setValueAt(totall, i, 2);
                 //break;
            }
            
        }
            double suma;
            double cn = 0;
            
               for (int i = 0; i < TableVenta.getRowCount(); i++) {//suma 
               cn += Double.parseDouble(modeloVent.getValueAt(i, 4).toString());
        }
               suma = cn;
           txtStockVenta.setText(String.valueOf(vnt.stockDispo()));
           
           
           lblTotalVenta.setText("S/"+cn);
           
           
           RegistroVentas registroNew = new RegistroVentas();
           
           registroNew.setCodigo(cod);
           registroNew.setCliente(nombreCliente);
           registroNew.setVendedor(Proveedor);
           registroNew.setTotal(cn);
           Object DatosVentas[] = {registroNew.getCodigo(),registroNew.getCliente(),registroNew.getVendedor(),registroNew.getTotal()};
           
           registroVentas.add(registroNew);
           modeloVentas.addRow(DatosVentas);
        
        }   
        catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null, "Error de Ingreso de Datos " + ex.getMessage().toString(),"Error",JOptionPane.ERROR_MESSAGE);
        }
           
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        txtCodigoVenta.setText("");
        cbxDescripcionVenta.setSelectedItem("");
        txtCantidadVenta.setText("");
        txtPrecioVenta.setText("");
        txtStockVenta.setText("");
        txtDNIVenta.setText("");
        txtNombreVenta.setText("");
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void btnBorrarConfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarConfiActionPerformed
        txtRucConfi.setText("");
        txtNombreConfi.setText("");
        txtTelefonoConfi.setText("");
        txtDireccionConfi.setText("");
        txtRazonSocialConfi.setText("");
        
        txtRucConfi.setEditable(true);
        txtNombreConfi.setEditable(true);
        txtTelefonoConfi.setEditable(true);
        txtDireccionConfi.setEditable(true);
        txtRazonSocialConfi.setEditable(true);
        
        
    }//GEN-LAST:event_btnBorrarConfiActionPerformed

    private void btnActualizarConfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarConfiActionPerformed
        try{
            if(txtRucConfi.getText().equals("")||  txtNombreConfi.getText().equals("") ||
               txtTelefonoConfi.getText().equals("") || txtDireccionConfi.getText().equals("")||
                txtRazonSocialConfi.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Error de Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                        txtRucConfi.setEditable(false);
                        txtNombreConfi.setEditable(false);
                        txtTelefonoConfi.setEditable(false);
                        txtDireccionConfi.setEditable(false);
                        txtRazonSocialConfi.setEditable(false);
                        btnBorrarConfi.setVisible(true);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error de Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarConfiActionPerformed
    public void abrir(String ClienteNombre) {
        try {
            File path = new File(ClienteNombre + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Atención", 2);
        }
    }
    
    private void btnPdfVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfVentasActionPerformed
        // TODO add your handling code here:
        try{
            /*PDDocument documento = new PDDocument();
            PDPage pagina = new PDPage(PDRectangle.A1);
            documento.addPage(pagina);
            PDPageContentStream contenido = new PDPageContentStream(documento,pagina);
            
            contenido.beginText();
            contenido.setFont(PDType1Font.TIMES_BOLD, 12);
            contenido.newLineAtOffset(20, pagina.getMediaBox().getHeight()-52);
            contenido.showText(modeloVent.getValueAt(0,1).toString());
            contenido.showText(modeloVent.getValueAt(1,1).toString());
            contenido.showText(modeloVent.getValueAt(2,1).toString());
            contenido.showText(modeloVent.getValueAt(3,1).toString());
            contenido.showText(modeloVent.getValueAt(4,1).toString());  */
            
            String patch="";//PARCHE
            JFileChooser j = new JFileChooser();//
            j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);//SELECCION DE ARCHIVO
            int x = j.showSaveDialog(this);//GUARDAR ARCHIVO 
            
            
            if (x == JFileChooser.APPROVE_OPTION) {
                patch = j.getSelectedFile().getPath();
            }
            
            Document doc = new Document();//CONTENDRA LA TABLA DEL REGISTRO DE LAS VENTAS
            
            PdfWriter.getInstance(doc, new FileOutputStream(patch+"registro.pdf"));//ASOCIAMOS
            
            doc.open();
            PdfPTable tbl = new PdfPTable(5);
            
            //añadiendo
            tbl.addCell("Código");
            tbl.addCell("Descripción");
            tbl.addCell("Cantidad");
            tbl.addCell("Precio");
            tbl.addCell("Total");
            
            for (int i = 0; i < TableVenta.getRowCount(); i++) {
                String Codigo = TableVentas1.getValueAt(i, 0).toString();
                String Descripcion = TableVentas1.getValueAt(i, 1).toString();
                String Cantidad = TableVentas1.getValueAt(i, 2).toString();
                String Precio = TableVentas1.getValueAt(i, 3).toString();
                String Total = TableVentas1.getValueAt(i, 4).toString();
                
                tbl.addCell(Codigo);
                tbl.addCell(Descripcion);
                tbl.addCell(Cantidad);
                tbl.addCell(Precio);
                tbl.addCell(Total);
            }
            
            doc.add(tbl);
            doc.close();
            
        }
        
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage().toString());
        }
        
    
    }//GEN-LAST:event_btnPdfVentasActionPerformed

    private void cbxDescripcionVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxDescripcionVentaMouseClicked
        // TODO add your handling code here:
        SeleccionarCasillas();
        
    }//GEN-LAST:event_cbxDescripcionVentaMouseClicked

    private void cbxDescripcionVentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxDescripcionVentaMousePressed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_cbxDescripcionVentaMousePressed

    private void cbxDescripcionVentaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbxDescripcionVentaPropertyChange
        // TODO add your handling code here:
        SeleccionarCasillas();
    }//GEN-LAST:event_cbxDescripcionVentaPropertyChange

    private void cbxDescripcionVentaVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_cbxDescripcionVentaVetoableChange
        // TODO add your handling code here:
        SeleccionarCasillas();
    }//GEN-LAST:event_cbxDescripcionVentaVetoableChange

    private void cbxDescripcionVentaHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_cbxDescripcionVentaHierarchyChanged
        // TODO add your handling code here:
        SeleccionarCasillas();
    }//GEN-LAST:event_cbxDescripcionVentaHierarchyChanged

    private void cbxDescripcionVentaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cbxDescripcionVentaInputMethodTextChanged
        // TODO add your handling code here:
        SeleccionarCasillas();
    }//GEN-LAST:event_cbxDescripcionVentaInputMethodTextChanged

    private void cbxDescripcionVentaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cbxDescripcionVentaCaretPositionChanged
        // TODO add your handling code here:
        SeleccionarCasillas();
    }//GEN-LAST:event_cbxDescripcionVentaCaretPositionChanged

    private void cbxDescripcionVentaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxDescripcionVentaItemStateChanged
        // TODO add your handling code here:
        SeleccionarCasillas();
    }//GEN-LAST:event_cbxDescripcionVentaItemStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCantidadProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadProductoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros por favor");
        }
    }//GEN-LAST:event_txtCantidadProductoKeyTyped

    private void txtPrecioProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioProductoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros por favor");
        }
    }//GEN-LAST:event_txtPrecioProductoKeyTyped

    private void txtTelefonoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros por favor");
        }
    }//GEN-LAST:event_txtTelefonoProveedorKeyTyped

    private void txtTelefonoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoClienteKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros por favor");
        }
    }//GEN-LAST:event_txtTelefonoClienteKeyTyped

    private void txtCantidadVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyTyped
        // TODO add your handling code here:
        
        
        char validar = evt.getKeyChar();//capturar el caracter 
        if (Character.isLetter(validar)) {
            getToolkit().beep();//emite un sonido 
            evt.consume();// consume este evento para que no sea procesado de manera predeterminada por la fuente que lo originó
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros por favor");
        }
    }//GEN-LAST:event_txtCantidadVentaKeyTyped

    private void GenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarPDFActionPerformed
        // TODO add your handling code here:
        
        Plantilla plantilla = new Plantilla(cboNonbreProveedor1.getSelectedItem().toString(),
                new Date().toString(),
                "C:\\Users\\PC\\Documents\\ANASHE\\LOGO.png",
                this.registroVentas);
        plantilla.CrearPlantilla();
    }//GEN-LAST:event_GenerarPDFActionPerformed

    private void AbrirPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirPDFActionPerformed
        // TODO add your handling code here:
        try{
            abrir(cboNonbreProveedor1.getSelectedItem().toString());
        }
        catch(Exception e){
            
        }
        
    }//GEN-LAST:event_AbrirPDFActionPerformed

    /**
     * @param args the command line argument
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirPDF;
    private javax.swing.JButton GenerarPDF;
    private javax.swing.JTable TableCliente;
    private javax.swing.JTable TableProducto;
    private javax.swing.JTable TableProveedor;
    private javax.swing.JTable TableVenta;
    private javax.swing.JTable TableVentas1;
    private javax.swing.JButton btnActualizarConfi;
    private javax.swing.JButton btnBorrarConfi;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.JButton btnNuevoProveedor;
    private javax.swing.JButton btnPdfVentas;
    private javax.swing.JComboBox<String> cboNombreVenta;
    private javax.swing.JComboBox<String> cboNonbreProveedor;
    private javax.swing.JComboBox<String> cboNonbreProveedor1;
    private javax.swing.JComboBox<String> cbxDescripcionVenta;
    private javax.swing.JComboBox<String> cbxProveedorProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTotalVenta;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtDNICliente;
    private javax.swing.JTextField txtDNIVenta;
    private javax.swing.JTextField txtDescripcionProducto;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDireccionConfi;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtDireccionVenta;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtIDPro;
    private javax.swing.JTextField txtIDProducto;
    private javax.swing.JTextField txtIDProveedor;
    private javax.swing.JTextField txtIDVentas;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreConfi;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtNombreVenta;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtRUCProveedor;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRazonSocialConfi;
    private javax.swing.JTextField txtRazonSocialProveedor;
    private javax.swing.JTextField txtRazonVenta;
    private javax.swing.JTextField txtRucConfi;
    private javax.swing.JTextField txtStockVenta;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoConfi;
    private javax.swing.JTextField txtTelefonoProveedor;
    private javax.swing.JTextField txtTelefonoVenta;
    // End of variables declaration//GEN-END:variables
}

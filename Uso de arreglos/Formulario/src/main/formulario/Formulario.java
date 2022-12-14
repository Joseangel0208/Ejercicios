
package main.formulario;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Formulario extends javax.swing.JFrame {
public ArrayList<main.Principal>Listalibros;

    public Formulario() {
        initComponents();
        Listalibros=new ArrayList<>();
        this.setLocationRelativeTo(null);
    }
    
    public void listar()
    {
        DefaultListModel modelo=new DefaultListModel();
        for(int i=0;i<Listalibros.size();i++)
        {
            modelo.addElement("ID : "+ Listalibros.get(i).getId()+" | "
            +"Nombre : "+Listalibros.get(i).getNombre()
            +" | "+"Precio : "+Listalibros.get(i).getPrecio());
        }
        lista1.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbltitulo = new javax.swing.JLabel();
        btnagregar = new javax.swing.JButton();
        jblid = new javax.swing.JLabel();
        jblnombre = new javax.swing.JLabel();
        jblautor = new javax.swing.JLabel();
        jbldescrip = new javax.swing.JLabel();
        jblprecio = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtdescrip = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>();
        btnlimpiar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libros");

        jbltitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbltitulo.setText("INGRESO DE PRODUCTOS");

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/agregar-archivo.png"))); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jblid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jblid.setText("ID");

        jblnombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jblnombre.setText("Nombre");

        jblautor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jbldescrip.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbldescrip.setText("Existencia");

        jblprecio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jblprecio.setText("Precio");

        txtdescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lista1);

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/limpiar.png"))); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnmostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/mostrar.png"))); // NOI18N
        btnmostrar.setText("Mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/boton-eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbldescrip)
                        .addComponent(jblid, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jblnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jblautor, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jblprecio, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnEliminar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnombre)
                            .addComponent(txtdescrip)
                            .addComponent(txtprecio)
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnagregar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnlimpiar)
                        .addGap(75, 75, 75)
                        .addComponent(btnmostrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblid)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblnombre)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblautor)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblprecio))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtdescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbldescrip))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlimpiar)
                            .addComponent(btnmostrar)
                            .addComponent(btnagregar)
                            .addComponent(btnEliminar))
                        .addGap(30, 30, 30))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        main.Principal libro=new main.Principal();
        String nombre,idS,precioS;
        int id = 0;
        int descripcion=0;
        int precio =0;
        String descripcionS;
        
        idS=txtid.getText();
        try
        {
            id=Integer.parseInt(idS);
        }catch(NumberFormatException e )
        {
            JOptionPane.showMessageDialog(null, "El dato debe de ser numerico",
                    "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        nombre=txtnombre.getText();
        descripcionS=txtdescrip.getText();
        try
        {
            descripcion=Integer.parseInt(descripcionS);
        }catch(NumberFormatException e )
        {
            JOptionPane.showMessageDialog(null, "El dato debe de ser numerico",
                    "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        precioS=txtprecio.getText();
        try
        {
            precio=Integer.parseInt(precioS);
        }catch(NumberFormatException e )
        {
            JOptionPane.showMessageDialog(null, "El dato debe de ser numerico",
                    "Error", JOptionPane.ERROR_MESSAGE);
            
        }

        libro.setId(id);
        libro.setNombre(nombre);
        libro.setDescripcion(descripcion);
        libro.setPrecio(precio);
        Listalibros.add(libro);
        listar();
        JOptionPane.showMessageDialog(null, "Se agrego correctamente","AGREGAR"
        ,JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtid.setText(null);
        txtnombre.setText(null);
        txtdescrip.setText(null);
        txtprecio.setText(null);
        lista1.clearSelection();
        txtid.requestFocus();
        
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        int row=lista1.getSelectedIndex();
        if (row==-1)
        {
            JOptionPane.showMessageDialog(null
            ,"Seleccione un elemento de la lista", "AVISO", 
            JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,Listalibros.get(row).getDatos(),
                    "Mostrar", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void txtdescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int row=lista1.getSelectedIndex();
        if (row==-1)
        {
            JOptionPane.showMessageDialog(null
            ,"Seleccione un elemento de la lista", "AVISO", 
            JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            lista1.remove(row);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

  
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblautor;
    private javax.swing.JLabel jbldescrip;
    private javax.swing.JLabel jblid;
    private javax.swing.JLabel jblnombre;
    private javax.swing.JLabel jblprecio;
    private javax.swing.JLabel jbltitulo;
    private javax.swing.JList<String> lista1;
    private javax.swing.JTextField txtdescrip;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}

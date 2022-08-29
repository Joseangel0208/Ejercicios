
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
            +"Nombre : "+Listalibros.get(i).getNombre()+" | "+"Autor : "
            +Listalibros.get(i).getAutor()
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
        txtautor = new javax.swing.JTextField();
        txtdescrip = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>();
        btnlimpiar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libros");

        jbltitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbltitulo.setText("INGRESO DE LIBROS");

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
        jblautor.setText("Autor");

        jbldescrip.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbldescrip.setText("Descripcion");

        jblprecio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jblprecio.setText("Precio");

        jScrollPane1.setViewportView(lista1);

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnmostrar.setText("Mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbldescrip)
                            .addComponent(jblid, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jblnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jblautor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jblprecio, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnombre)
                            .addComponent(txtautor)
                            .addComponent(txtdescrip)
                            .addComponent(txtprecio)
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnagregar)
                        .addGap(89, 89, 89)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnlimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnmostrar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblid)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblnombre)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblautor)
                            .addComponent(txtautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbldescrip)
                            .addComponent(txtdescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblprecio)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(btnlimpiar)
                    .addComponent(btnmostrar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        main.Principal libro=new main.Principal();
        String nombre,autor,descripcion,idS,precioS;
        int id = 0;
        int precio =0;
        
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
        autor=txtautor.getText();
        descripcion=txtdescrip.getText();
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
        libro.setAutor(autor);
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
        txtautor.setText(null);
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
    private javax.swing.JTextField txtautor;
    private javax.swing.JTextField txtdescrip;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Library.Objetos;
import ViewModels.ClientesVM;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Sistema extends javax.swing.JFrame {

    /**
     * Creates new form Sistema
     */
    public Sistema() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tpnlPrincipal = new javax.swing.JTabbedPane();
        pnlVentas = new javax.swing.JPanel();
        pnlClientes = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlFotoCliente = new javax.swing.JPanel();
        lblFotoCliente = new javax.swing.JLabel();
        lblClienteDni = new javax.swing.JLabel();
        txtClienteDni = new javax.swing.JTextField();
        lblClienteNom = new javax.swing.JLabel();
        txtClienteNom = new javax.swing.JTextField();
        lblClienteApe = new javax.swing.JLabel();
        txtClienteApe = new javax.swing.JTextField();
        lblClienteEmail = new javax.swing.JLabel();
        txtClienteEmail = new javax.swing.JTextField();
        lblClienteTel = new javax.swing.JLabel();
        lblClienteDir = new javax.swing.JLabel();
        txtClienteTel = new javax.swing.JTextField();
        txtClienteDir = new javax.swing.JTextField();
        txtClienteCancel = new javax.swing.JButton();
        btnClienteAdd = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        tpnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        tpnlPrincipal.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        pnlVentas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlVentasLayout = new javax.swing.GroupLayout(pnlVentas);
        pnlVentas.setLayout(pnlVentasLayout);
        pnlVentasLayout.setHorizontalGroup(
            pnlVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        pnlVentasLayout.setVerticalGroup(
            pnlVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        tpnlPrincipal.addTab("Ventas", pnlVentas);

        pnlClientes.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Clientes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Buscar:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Información cliente");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 355, -1));

        pnlFotoCliente.setBackground(new java.awt.Color(255, 255, 255));

        lblFotoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_user_127px.png"))); // NOI18N
        lblFotoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        lblFotoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFotoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlFotoClienteLayout = new javax.swing.GroupLayout(pnlFotoCliente);
        pnlFotoCliente.setLayout(pnlFotoClienteLayout);
        pnlFotoClienteLayout.setHorizontalGroup(
            pnlFotoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFotoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFotoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFotoClienteLayout.setVerticalGroup(
            pnlFotoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFotoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFotoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(pnlFotoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 150, -1));

        lblClienteDni.setBackground(new java.awt.Color(255, 255, 255));
        lblClienteDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClienteDni.setForeground(new java.awt.Color(102, 102, 102));
        lblClienteDni.setText("DNI");
        jPanel6.add(lblClienteDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 168, -1, -1));

        txtClienteDni.setToolTipText("");
        txtClienteDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteDniKeyTyped(evt);
            }
        });
        jPanel6.add(txtClienteDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 191, 158, -1));

        lblClienteNom.setBackground(new java.awt.Color(255, 255, 255));
        lblClienteNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClienteNom.setForeground(new java.awt.Color(102, 102, 102));
        lblClienteNom.setText("Nombre");
        jPanel6.add(lblClienteNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 168, -1, -1));

        txtClienteNom.setToolTipText("");
        txtClienteNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteNomKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteNomKeyTyped(evt);
            }
        });
        jPanel6.add(txtClienteNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 191, 158, -1));

        lblClienteApe.setBackground(new java.awt.Color(255, 255, 255));
        lblClienteApe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClienteApe.setForeground(new java.awt.Color(102, 102, 102));
        lblClienteApe.setText("Apellidos");
        jPanel6.add(lblClienteApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, -1, -1));

        txtClienteApe.setToolTipText("");
        txtClienteApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteApeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteApeKeyTyped(evt);
            }
        });
        jPanel6.add(txtClienteApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 158, -1));

        lblClienteEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblClienteEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClienteEmail.setForeground(new java.awt.Color(102, 102, 102));
        lblClienteEmail.setText("Email");
        jPanel6.add(lblClienteEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 217, -1, -1));

        txtClienteEmail.setToolTipText("");
        txtClienteEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteEmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteEmailKeyTyped(evt);
            }
        });
        jPanel6.add(txtClienteEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 240, 158, -1));

        lblClienteTel.setBackground(new java.awt.Color(255, 255, 255));
        lblClienteTel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClienteTel.setForeground(new java.awt.Color(102, 102, 102));
        lblClienteTel.setText("Teléfono");
        jPanel6.add(lblClienteTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 266, -1, -1));

        lblClienteDir.setBackground(new java.awt.Color(255, 255, 255));
        lblClienteDir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClienteDir.setForeground(new java.awt.Color(102, 102, 102));
        lblClienteDir.setText("Dirección");
        jPanel6.add(lblClienteDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 266, -1, -1));

        txtClienteTel.setToolTipText("");
        txtClienteTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteTelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteTelKeyTyped(evt);
            }
        });
        jPanel6.add(txtClienteTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 289, 158, -1));

        txtClienteDir.setToolTipText("");
        txtClienteDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteDirKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteDirKeyTyped(evt);
            }
        });
        jPanel6.add(txtClienteDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 289, 158, -1));

        txtClienteCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_cancel_24px_1.png"))); // NOI18N
        txtClienteCancel.setText("Cancelar");
        txtClienteCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(txtClienteCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, 30));

        btnClienteAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_plus_+_24px.png"))); // NOI18N
        btnClienteAdd.setText("Agregar");
        btnClienteAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(btnClienteAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 30));

        jTabbedPane2.addTab("Registro de clientes", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Pagos", jPanel7);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnlPrincipal.addTab("Clientes", pnlClientes);

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_users_28px.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tpnlPrincipal)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnClientes)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpnlPrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="CODIGO DE CLIENTE">
    private ClientesVM cliente;
    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        
        ArrayList<JLabel> label = new ArrayList();
        label.add(lblClienteDni);
        label.add(lblClienteNom);
        label.add(lblClienteApe);
        label.add(lblClienteEmail);
        label.add(lblClienteTel);
        label.add(lblClienteDir);
        
        ArrayList<JTextField> textField = new ArrayList();
        textField.add(txtClienteDni);
        textField.add(txtClienteNom);
        textField.add(txtClienteApe);
        textField.add(txtClienteEmail);
        textField.add(txtClienteTel);
        textField.add(txtClienteDir);
        Object[] objects = {};
        cliente = new ClientesVM(objects, label, textField);
        
        tpnlPrincipal.setSelectedIndex(1);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void lblFotoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoClienteMouseClicked
        Objetos.uploadImage.CargarImagen(lblFotoCliente);
    }//GEN-LAST:event_lblFotoClienteMouseClicked

    private void txtClienteDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteDniKeyReleased
        if(txtClienteDni.getText().equals("")){
            lblClienteDni.setForeground(new Color(102, 102, 102));
        }else{
            lblClienteDni.setText("DNI");
            lblClienteDni.setForeground(new Color(0, 153, 51));
            
        }
    }//GEN-LAST:event_txtClienteDniKeyReleased

    private void txtClienteDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteDniKeyTyped
        Objetos.eventos.numberKeyPress(evt);
    }//GEN-LAST:event_txtClienteDniKeyTyped

    private void txtClienteNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteNomKeyReleased
        if(txtClienteNom.getText().equals("")){
            lblClienteNom.setForeground(new Color(102, 102, 102));
        }else{
            lblClienteNom.setText("Nombre");
            lblClienteNom.setForeground(new Color(0, 153, 51));
            
        }
    }//GEN-LAST:event_txtClienteNomKeyReleased

    private void txtClienteNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteNomKeyTyped
        Objetos.eventos.textKeyPress(evt);
    }//GEN-LAST:event_txtClienteNomKeyTyped

    private void txtClienteApeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteApeKeyReleased
        if(txtClienteApe.getText().equals("")){
            lblClienteApe.setForeground(new Color(102, 102, 102));
        }else{
            lblClienteApe.setText("Apellido");
            lblClienteApe.setForeground(new Color(0, 153, 51));
            
        }
    }//GEN-LAST:event_txtClienteApeKeyReleased

    private void txtClienteApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteApeKeyTyped
        Objetos.eventos.textKeyPress(evt);
    }//GEN-LAST:event_txtClienteApeKeyTyped

    private void txtClienteEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteEmailKeyReleased
        if(txtClienteEmail.getText().equals("")){
            lblClienteEmail.setForeground(new Color(102, 102, 102));
        }else{
            lblClienteEmail.setText("Email");
            lblClienteEmail.setForeground(new Color(0, 153, 51));
            
        }
    }//GEN-LAST:event_txtClienteEmailKeyReleased

    private void txtClienteEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteEmailKeyTyped

    private void txtClienteTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteTelKeyReleased
        if(txtClienteTel.getText().equals("")){
            lblClienteTel.setForeground(new Color(102, 102, 102));
        }else{
            lblClienteTel.setText("Teléfono");
            lblClienteTel.setForeground(new Color(0, 153, 51));
            
        }
    }//GEN-LAST:event_txtClienteTelKeyReleased

    private void txtClienteTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteTelKeyTyped
        Objetos.eventos.numberKeyPress(evt);
    }//GEN-LAST:event_txtClienteTelKeyTyped

    private void txtClienteDirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteDirKeyReleased
        if(txtClienteDir.getText().equals("")){
            lblClienteDir.setForeground(new Color(102, 102, 102));
        }else{
            lblClienteDir.setText("Dirección");
            lblClienteDir.setForeground(new Color(0, 153, 51));
            
        }
    }//GEN-LAST:event_txtClienteDirKeyReleased

    private void txtClienteDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteDirKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteDirKeyTyped
    
    // </editor-fold>
    
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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClienteAdd;
    private javax.swing.JButton btnClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblClienteApe;
    private javax.swing.JLabel lblClienteDir;
    private javax.swing.JLabel lblClienteDni;
    private javax.swing.JLabel lblClienteEmail;
    private javax.swing.JLabel lblClienteNom;
    private javax.swing.JLabel lblClienteTel;
    private javax.swing.JLabel lblFotoCliente;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlFotoCliente;
    private javax.swing.JPanel pnlVentas;
    private javax.swing.JTabbedPane tpnlPrincipal;
    private javax.swing.JTextField txtClienteApe;
    private javax.swing.JButton txtClienteCancel;
    private javax.swing.JTextField txtClienteDir;
    private javax.swing.JTextField txtClienteDni;
    private javax.swing.JTextField txtClienteEmail;
    private javax.swing.JTextField txtClienteNom;
    private javax.swing.JTextField txtClienteTel;
    // End of variables declaration//GEN-END:variables
}

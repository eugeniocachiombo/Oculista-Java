
import Dao.CadastroDao;
import Dao.CompraDao;
import Oculista.Cadastro;
import Oculista.Compr;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eugenio
 */
public class EdicaoCompra extends javax.swing.JFrame {

    /**
     * Creates new form Edicao
     */
    public EdicaoCompra() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actualizar dados das compras");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jDesktopPane1.add(jTextField1);
        jTextField1.setBounds(120, 140, 210, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Qd:");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(80, 210, 40, 50);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jDesktopPane1.add(jTextField6);
        jTextField6.setBounds(120, 180, 80, 30);

        jButton1.setText("Actualizar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(130, 330, 90, 23);

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(Cancelar);
        Cancelar.setBounds(440, 330, 100, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Cod_prod:");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(20, 90, 110, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("Pesquise o Cod_Prod:");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(70, 60, 210, 50);

        jTextField8.setBackground(new java.awt.Color(204, 204, 204));
        jTextField8.setForeground(new java.awt.Color(204, 204, 204));
        jTextField8.setDisabledTextColor(new java.awt.Color(51, 51, 255));
        jTextField8.setEnabled(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jTextField8);
        jTextField8.setBounds(120, 100, 40, 30);

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jDesktopPane1.add(jTextField4);
        jTextField4.setBounds(270, 70, 80, 30);

        jButton2.setText("Pesquisar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(360, 70, 90, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setText("Tipo:");
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(60, 130, 60, 50);
        jDesktopPane1.add(jTextField2);
        jTextField2.setBounds(120, 220, 80, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Preço:");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(50, 170, 110, 50);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1500.jpg"))); // NOI18N
        jDesktopPane1.add(jLabel11);
        jLabel11.setBounds(0, 0, 650, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
          char limite = evt.getKeyChar();
        
        
        if (Character.isDigit(limite)){
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Admite apenas letras");
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed

    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        int cod_prod = Integer.parseInt(jTextField8.getText());
        String tipo = jTextField1.getText();
        int preco = Integer.parseInt(jTextField6.getText());
        int Qd =  Integer.parseInt(jTextField2.getText());
        
        
        Compr compra = new Compr();
        compra.setCod_Prod(cod_prod);
        compra.setTipo(tipo);
        compra.setPreco(preco);
        compra.setQd(Qd);

        CompraDao dao = new CompraDao();
        dao.editar(compra);
        
        jTextField8.setText("");
        jTextField1.setText("");
        jTextField6.setText("");
        jTextField2.setText("");

        JOptionPane.showMessageDialog(rootPane, "Dados Guardados");

        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Você cancelou");
        new TelaActualizar().setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int idPesquisa = Integer.parseInt(jTextField4.getText());
        
        CompraDao dao = new CompraDao();
        Compr compra = dao.getPesquisa(idPesquisa);
        
        if (compra == null){
            
            JOptionPane.showMessageDialog(this, "Não encontrado");
            
        } else {
     
        jTextField8.setText(String.valueOf(compra.getCod_Prod()));       
        jTextField1.setText(compra.getTipo());
                        
        jTextField6.setText(String.valueOf(compra.getPreco()));             
        jTextField2.setText(String.valueOf(compra.getQd())); 
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
          char limite = evt.getKeyChar();
        
        
        if (Character.isLetter(limite)){
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Admite apenas números");
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
          char limite = evt.getKeyChar();
        
        
        if (Character.isLetter(limite)){
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Admite apenas números");
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed

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
            java.util.logging.Logger.getLogger(Edicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
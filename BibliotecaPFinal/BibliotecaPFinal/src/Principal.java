
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuPessoa = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuLivro = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuEmprestimo = new javax.swing.JMenuItem();
        menuPendencias = new javax.swing.JMenu();
        menuPendenciasListar = new javax.swing.JMenuItem();
        jMenuFerramenta = new javax.swing.JMenu();
        jMenuT_usuario = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/biblioteca-virtual-unitpac-saiba-como-acessar-noticia-887.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 16, 111));
        jLabel2.setText("BIBLIOTECA ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 630));

        jMenu3.setText("Pessoas");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuPessoa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuPessoa.setText("Cadastrar/Listar");
        jMenuPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPessoaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuPessoa);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Livros");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuLivro.setText("Cadastrar/Listar");
        jMenuLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLivroActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuLivro);

        jMenuBar2.add(jMenu4);

        jMenu6.setText("Empréstimo");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuEmprestimo.setText("Cadastrar/Listar");
        jMenuEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEmprestimoActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuEmprestimo);

        jMenuBar2.add(jMenu6);

        menuPendencias.setText("Pendências");
        menuPendencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPendenciasActionPerformed(evt);
            }
        });

        menuPendenciasListar.setText("Cadastrar/Listar");
        menuPendenciasListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPendenciasListarActionPerformed(evt);
            }
        });
        menuPendencias.add(menuPendenciasListar);

        jMenuBar2.add(menuPendencias);

        jMenuFerramenta.setText("Ferramenta");
        jMenuFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFerramentaActionPerformed(evt);
            }
        });

        jMenuT_usuario.setText("Troca de usuario");
        jMenuT_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuT_usuarioActionPerformed(evt);
            }
        });
        jMenuFerramenta.add(jMenuT_usuario);

        jMenuBar2.add(jMenuFerramenta);

        setJMenuBar(jMenuBar2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
       
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPessoaActionPerformed
       CadPessoa cp;
        try {
            cp = new CadPessoa();
            cp.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jMenuPessoaActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed
 
    private void jMenuLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLivroActionPerformed
         CadLivro cl;
        try {
            cl = new CadLivro();
            cl.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuLivroActionPerformed

    private void jMenuEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEmprestimoActionPerformed
        CadEmp ce;
        try {
            ce = new CadEmp();
            ce.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuEmprestimoActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuT_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuT_usuarioActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);        
    }//GEN-LAST:event_jMenuT_usuarioActionPerformed

    private void jMenuFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFerramentaActionPerformed
         
    }//GEN-LAST:event_jMenuFerramentaActionPerformed

    private void menuPendenciasListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPendenciasListarActionPerformed
        CadPendencia cpe;
        cpe = new CadPendencia(); // TODO add your handling code here:
        cpe.setVisible(true);
    }//GEN-LAST:event_menuPendenciasListarActionPerformed

    private void menuPendenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPendenciasActionPerformed
        

    }//GEN-LAST:event_menuPendenciasActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuEmprestimo;
    private javax.swing.JMenu jMenuFerramenta;
    private javax.swing.JMenuItem jMenuLivro;
    private javax.swing.JMenuItem jMenuPessoa;
    private javax.swing.JMenuItem jMenuT_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuPendencias;
    private javax.swing.JMenuItem menuPendenciasListar;
    // End of variables declaration//GEN-END:variables
}

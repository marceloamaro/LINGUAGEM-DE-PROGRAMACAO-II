
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno
 */
public class CadLivro extends javax.swing.JFrame {

    /**
     * Creates new form CadPessoa
     */
    public CadLivro() throws SQLException {
        initComponents();
        popularTabelaPessoas();
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
        jLabel1 = new javax.swing.JLabel();
        jTextAutor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextAno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboGenero = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnSalvarLivro = new javax.swing.JButton();
        jTextNomePesquisa = new javax.swing.JTextField();
        jComboTipoLivro = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLivro = new javax.swing.JTable();
        jTextEdicao = new javax.swing.JTextField();
        jTextEstoque = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Autor:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ano:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Genero:");

        jComboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Científico", "Filosofia", "Ficção", "História", "Poesia" }));
        jComboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboGeneroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Edicao:");

        btnSalvarLivro.setBackground(new java.awt.Color(34, 16, 111));
        btnSalvarLivro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalvarLivro.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarLivro.setText("Salvar Livro");
        btnSalvarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarLivroActionPerformed(evt);
            }
        });

        jTextNomePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomePesquisaActionPerformed(evt);
            }
        });
        jTextNomePesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextNomePesquisaKeyPressed(evt);
            }
        });

        jComboTipoLivro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboTipoLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Científico", "Filosofia", "Ficção", "História", "Poesia" }));
        jComboTipoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoLivroActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(153, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(34, 16, 111));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tabelaLivro.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        tabelaLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID LIVRO", "AUTOR", "ANO", "GENERO", "EDICAO", "ESTOQUE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaLivroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaLivro);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Estoque:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5)
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextAno, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboTipoLivro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboTipoLivro)
                            .addComponent(jTextNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcluir)
                            .addComponent(btnEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextAno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addComponent(btnSalvarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboGeneroActionPerformed

    private void btnSalvarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarLivroActionPerformed
        String autor= jTextAutor.getText();
        String ano =  jTextAno.getText();
        String edicao = jTextEdicao.getText();
        String genero = jComboGenero.getSelectedItem().toString();
        String estoque = jTextEstoque.getText();
        

        

        if (autor.equals("") || ano.equals("")|| edicao.equals("")|| genero.equals("")|| estoque.equals("")) {
            JOptionPane.showMessageDialog(null, "OPS! Preencha todos os campos corretamente.");
        } else {
            try {
                Conexao con = new Conexao();

                Statement st = con.conexao.createStatement();

                String sql = "INSERT INTO livro (autor, ano, genero, edicao, estoque) VALUES ('" + autor+ "', '" + ano + "', '" + genero + "', '" + edicao + "', '" + estoque + "')";

                if (st.execute(sql)) {
                    JOptionPane.showMessageDialog(null, "OPS! Tivemos um erro aqui.");
                    System.out.println("Teste erro");
                } else {
                    JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                    System.out.println("Teste sucesso");
                    livro_limpar();
                    popularTabelaPessoas();
                }

            } catch (Exception e) {
                System.out.println("Erro no try");
            }
        }
    }//GEN-LAST:event_btnSalvarLivroActionPerformed

    private void jTextNomePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomePesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomePesquisaActionPerformed

    private void jTextNomePesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomePesquisaKeyPressed
        try {
            popularTabelaPessoas();
        } catch (SQLException ex) {
            Logger.getLogger(ListPessoas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextNomePesquisaKeyPressed

    private void jComboTipoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoLivroActionPerformed
        try {
            popularTabelaPessoas();
        } catch (SQLException ex) {
            Logger.getLogger(ListPessoas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboTipoLivroActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabelaLivro.getSelectedRow();
        String id_livro = tabelaLivro.getValueAt(linha, 0).toString();

        int confirmacao = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir a linha?");

        if (confirmacao == 0) {
            try {
                Conexao con = new Conexao();
                Statement st = con.conexao.createStatement();
                String sqlDelete = "DELETE FROM livro WHERE id_livro = " + id_livro;

                if (st.execute(sqlDelete)) {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir a linha!");
                } else {
                    JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
                    livro_limpar();
                    popularTabelaPessoas();
                    btnSalvarLivro.setEnabled(true);
                    
                    btnEditar.setEnabled(false);
                    btnExcluir.setEnabled(false);
                }

            } catch (SQLException ex) {
                Logger.getLogger(ListPessoas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaLivroMouseClicked
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnSalvarLivro.setEnabled(false);
        

        int row = tabelaLivro.getSelectedRow();
        String id_livro = tabelaLivro.getValueAt(row, 0).toString();
        String autor= tabelaLivro.getValueAt(row, 1).toString();
        String ano = tabelaLivro.getValueAt(row, 2).toString();
        String genero = tabelaLivro.getValueAt(row, 3).toString();
        String edicao = tabelaLivro.getValueAt(row, 4).toString();
        String estoque = tabelaLivro.getValueAt(row, 5).toString();

        jTextAutor.setText(autor);
        jTextAno.setText(ano);
        jComboGenero.setSelectedItem(genero);
        jTextEdicao.setText(edicao);
        jTextEstoque.setText(estoque);

    }//GEN-LAST:event_tabelaLivroMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        btnSalvarLivro.setEnabled(true);
     
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        livro_limpar();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int row = tabelaLivro.getSelectedRow();
        String id_livro = tabelaLivro.getValueAt(row, 0).toString();
        String autor= jTextAutor.getText();
        String ano =  jTextAno.getText();
        String genero = jComboGenero.getSelectedItem().toString();
        String edicao = jTextEdicao.getText();
        String estoque = jTextEstoque.getText();

        if (autor.equals("") || ano.equals("") || edicao.equals("") || genero.equals("")|| estoque.equals("")) {
            JOptionPane.showMessageDialog(null, "OPS! Preencha todos os campos corretamente.");
        } else {
            try {
                Conexao con = new Conexao();
                Statement st = con.conexao.createStatement();

                String sql = "UPDATE livro SET "
                        + "nome='" + autor+ "',"
                        + "ano='" + ano + "',"
                        + "genero='" + genero + "',"
                        + "edicao='" + edicao + "',"
                        + "estoque='" + estoque + "'"
                        + " WHERE id_livro = " + id_livro;
                System.out.println(sql);
                

                if (st.executeUpdate(sql) == 1) {
                    JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
                    popularTabelaPessoas();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar");
                }

            } catch (SQLException ex) {
                Logger.getLogger(CadLivro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(CadLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadLivro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadLivro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvarLivro;
    private javax.swing.JComboBox<String> jComboGenero;
    private javax.swing.JComboBox<String> jComboTipoLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAno;
    private javax.swing.JTextField jTextAutor;
    private javax.swing.JTextField jTextEdicao;
    private javax.swing.JTextField jTextEstoque;
    private javax.swing.JTextField jTextNomePesquisa;
    private javax.swing.JTable tabelaLivro;
    // End of variables declaration//GEN-END:variables
    public void popularTabelaPessoas() throws SQLException {
        String nomeBuscado = jTextNomePesquisa.getText();
        String tipoPessoa = jComboTipoLivro.getSelectedItem().toString();

        DefaultTableModel model = (DefaultTableModel) tabelaLivro.getModel();
        model.setNumRows(0);

        Conexao con = new Conexao();

        Statement st = con.conexao.createStatement();

        String sql = "SELECT * FROM livro";

        if (!nomeBuscado.isEmpty() && !tipoPessoa.equals("Tipo pessoa")) {
            sql += " WHERE autorLIKE '" + nomeBuscado + "%' AND genero = '" + tipoPessoa + "'";
        } else if (!tipoPessoa.equals("Tipo pessoa")) {
            sql += " WHERE genero = '" + tipoPessoa + "'";
        } else if (!nomeBuscado.isEmpty()) {
            sql += " WHERE autorLIKE '" + nomeBuscado + "%'";
        }

        ResultSet resultado = st.executeQuery(sql);

        while (resultado.next()) {
            model.addRow(new Object[]{
                resultado.getString("id_livro"),
                resultado.getString("nome"),
                resultado.getString("ano"),
                resultado.getString("genero"),
                resultado.getString("edicao"),
                resultado.getString("estoque"),});
        }

    }

    public void livro_limpar() {
        jTextAno.setText("");
        jTextAutor.setText("");
        jTextEdicao.setText("");
        jTextEstoque.setText("");
        jComboGenero.setSelectedIndex(0);
        jTextNomePesquisa.setText("");
    }
}

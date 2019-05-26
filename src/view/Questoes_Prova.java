/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.ArrayList;

import controller.ControleDisciplina;
import controller.ControleProQues;
import controller.ControleQuestao;
import controller.ControleTurma;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.DisciplinaBEAN;
import model.DisciplinaDAO;
import model.ProQuesBEAN;
import model.ProfessorBEAN;
import model.ProfessorDAO;
import model.ProvaBEAN;
import model.QuestaoBEAN;
import model.TurmaBEAN;

/**
 *
 * @author Eduardo Parreira
 */
public class Questoes_Prova extends javax.swing.JFrame {

    int codigo = 1;
    int codigoProva=0;
    static ProvaBEAN prova = new ProvaBEAN();
    QuestaoBEAN questao= new QuestaoBEAN();
    DisciplinaBEAN disciplina = new DisciplinaBEAN();
    
    public Questoes_Prova(ProvaBEAN prova) {
        initComponents();
        listaComboDisciplina();
        this.prova = prova;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboDisc = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        gravar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        reativar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        inativar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        carregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(0, 4));

        jLabel1.setText("Escolha de Questões");

        comboDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDiscActionPerformed(evt);
            }
        });

        jLabel3.setText("Disciplina");

        gravar.setText("Inserir");
        gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarActionPerformed(evt);
            }
        });

        cancelar.setText("Voltar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        reativar.setMnemonic('A');
        reativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reativarActionPerformed(evt);
            }
        });
        reativar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                reativarKeyPressed(evt);
            }
        });

        jButton1.setMnemonic('I');
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        inativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inativarActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Descricao"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        carregar.setText("Carregar questoes");
        carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(reativar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(gravar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(385, 385, 385)
                                        .addComponent(carregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cancelar))
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inativar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboDisc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                        .addComponent(inativar)
                        .addGap(153, 153, 153))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gravar)
                        .addComponent(cancelar)
                        .addComponent(carregar))
                    .addComponent(jButton1))
                .addGap(14, 14, 14)
                .addComponent(reativar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarTable(ArrayList<QuestaoBEAN> questoes) {
        for (int i = 0; i < questoes.size(); i++) {
            this.tabela.setValueAt(questoes.get(i).getId_Questao(), i, 0);
            this.tabela.setValueAt(questoes.get(i).getDescricao_Questao(), i, 1);
            
        }

    }
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Prova frame = new Prova();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarActionPerformed
          if (this.codigo!=0) {
            disciplina = (DisciplinaBEAN) comboDisc.getSelectedItem();
            ControleProQues controleQuestao = new ControleProQues();

            ProQuesBEAN questao = new ProQuesBEAN(this.prova, this.questao);
              System.out.println("Codigo Q1:"+this.questao.getId_Questao());
            controleQuestao.addQuestao(questao);
            JOptionPane.showMessageDialog(null, "Questao cadastrada com sucesso!");
            
        } 
    }//GEN-LAST:event_gravarActionPerformed

    private void reativarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reativarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_reativarKeyPressed

    private void reativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reativarActionPerformed

    }//GEN-LAST:event_reativarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void inativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativarActionPerformed

    }//GEN-LAST:event_inativarActionPerformed

    private void comboDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDiscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDiscActionPerformed

    private void carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarActionPerformed
        disciplina = (DisciplinaBEAN) comboDisc.getSelectedItem();
        ControleQuestao cq = new ControleQuestao();
        ArrayList<QuestaoBEAN> questoes = new ArrayList();
        System.out.println("Codigo 1:"+disciplina.getId_Disciplina());
        questoes = cq.listaQuestaoDiscilina(disciplina.getId_Disciplina());
        this.listarTable(questoes);
    }//GEN-LAST:event_carregarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        try{
            
            codigo = Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
            ControleQuestao cq = new ControleQuestao();
            ArrayList<QuestaoBEAN> questoes = new ArrayList();
            QuestaoBEAN questao = new QuestaoBEAN();
            questoes = cq.listaQuestoes();
            System.out.println(codigo);
            for (int i = 0; i < questoes.size(); i++) {
                if(questoes.get(i).getId_Questao()==codigo){
                    this.questao = questoes.get(i);
                }
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_tabelaMouseClicked

    public void listaComboDisciplina() {
        DisciplinaDAO daoDisc = new DisciplinaDAO();
        for (DisciplinaBEAN disc : daoDisc.findAllDisciplina()) {
            if (disc.getStatus_Disciplina() == 0) {
                comboDisc.addItem(disc);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(Questoes_Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questoes_Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questoes_Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questoes_Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questoes_Prova(prova).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton carregar;
    private javax.swing.JComboBox<Object> comboDisc;
    private javax.swing.JButton gravar;
    private javax.swing.JButton inativar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reativar;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControleDisciplina;
import controller.ControleProva;
import controller.ControleQuestao;
import controller.ControleTurma;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.DisciplinaBEAN;
import model.DisciplinaDAO;
import model.ProQuesDAO;
import model.ProfessorBEAN;
import model.ProfessorDAO;
import model.ProvaBEAN;
import model.QuestaoBEAN;
import model.QuestaoDAO;
import model.TurmaBEAN;
import model.TurmaDAO;

/**
 *
 * @author Eduardo Parreira
 */
public class Prova extends javax.swing.JFrame {
    int status=0;
    ProfessorBEAN professor = new ProfessorBEAN();
    TurmaBEAN turma = new TurmaBEAN();
    ProvaBEAN prova = new ProvaBEAN();
    public Prova() {
        initComponents();
        listaComboTurma();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboTurma = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        gravar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        reativar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        inativar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        questoes = new javax.swing.JButton();
        pdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(0, 4));

        jLabel1.setText("Provas");

        comboTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTurmaActionPerformed(evt);
            }
        });

        jLabel3.setText("Turma:");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        gravar.setText("Inserir");
        gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarActionPerformed(evt);
            }
        });

        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        cancelar.setText("Voltar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Código");

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

        jLabel6.setText("Data:");

        questoes.setText("Escolher Questoes");
        questoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questoesActionPerformed(evt);
            }
        });

        pdf.setText("Gerar PDF");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reativar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar)
                        .addGap(40, 40, 40)
                        .addComponent(inativar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gravar)
                                        .addGap(61, 61, 61)
                                        .addComponent(alterar)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 40, Short.MAX_VALUE)
                                        .addComponent(questoes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pdf)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelar)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(jLabel5)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inativar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(questoes)
                            .addComponent(pdf))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(gravar)
                                .addComponent(alterar))
                            .addComponent(jButton1)))
                    .addComponent(cancelar))
                .addGap(14, 14, 14)
                .addComponent(reativar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if(!this.codigo.getText().equals("")){
            ControleProva ct = new ControleProva();
            ProvaBEAN prova = ct.listaUm(Integer.parseInt(codigo.getText()));
            data.setText(prova.getData_Prova());
            comboTurma.setSelectedItem(prova.getId_Turma());
            this.prova = ct.listaUm(Integer.parseInt(codigo.getText()));
        } 
        if(this.codigo.getText().equals("")){
            BuscaProva frame = new BuscaProva();
            frame.setVisible(true);
            this.dispose();
        }
        
        
        
        
    }//GEN-LAST:event_buscarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Menu frame = new Menu();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarActionPerformed
        if(!this.data.getText().equals("")){
            turma = (TurmaBEAN) comboTurma.getSelectedItem();
            ControleProva cp = new ControleProva();
            ProvaBEAN prova = new ProvaBEAN(turma,this.data.getText());
            cp.addProva(prova);
            JOptionPane.showMessageDialog(null, "Prova cadastrada com sucesso!");
            this.data.setText("");
        } else{
            JOptionPane.showMessageDialog(null, "Prencha as informações para cadastrar!");
        }
    }//GEN-LAST:event_gravarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        if(!this.data.getText().equals("")){
            turma = (TurmaBEAN) comboTurma.getSelectedItem();
            ControleProva cp = new ControleProva();
            int id = Integer.parseInt(codigo.getText());
            ProvaBEAN prova = new ProvaBEAN(id,turma,this.data.getText());
            cp.updateProva(prova);
            JOptionPane.showMessageDialog(null, "Prova alterada com sucesso!");
            this.data.setText("");
        } else{
            JOptionPane.showMessageDialog(null, "Prencha as informações para alterar!");
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void reativarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reativarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_reativarKeyPressed

    private void reativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reativarActionPerformed
      /* if (!this.semestre.getText().equals("") || !this.codigo.getText().equals("")) {
            int idTurmas = Integer.parseInt(this.codigo.getText());
            ControleTurma controleTurma = new ControleTurma();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controleTurma.reativarTurma(idTurmas);
            JOptionPane.showMessageDialog(null, "Disciplina reativada com sucesso!");
        }*/
    }//GEN-LAST:event_reativarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       /* if (!this.semestre.getText().equals("") || !this.codigo.getText().equals("")) {
            int idTurmas = Integer.parseInt(this.codigo.getText());
            ControleTurma controleTurma = new ControleTurma();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controleTurma.inativarTurma(idTurmas);
            JOptionPane.showMessageDialog(null, "Disciplina inativada com sucesso!");
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativarActionPerformed
       /* if (!this.semestre.getText().equals("") || !this.codigo.getText().equals("")) {
            int idTurmas = Integer.parseInt(this.codigo.getText());
            ControleTurma controleTurma = new ControleTurma();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controleTurma.inativarTurma(idTurmas);
            JOptionPane.showMessageDialog(null, "Disciplina inativada com sucesso!");
        }*/
    }//GEN-LAST:event_inativarActionPerformed

    private void comboTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTurmaActionPerformed

    private void questoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questoesActionPerformed
        Questoes_Prova frame = new Questoes_Prova(this.prova);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_questoesActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
        ProQuesDAO ques = new ProQuesDAO();
        ques.pdf(this.prova);
    }//GEN-LAST:event_pdfActionPerformed

    public void listaComboTurma(){
        TurmaDAO daoTurma = new TurmaDAO();
        for (TurmaBEAN turma:daoTurma.listaTodos()) {
            if(turma.getStatus_Turma()==0){
                comboTurma.addItem(turma);
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
            java.util.logging.Logger.getLogger(Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prova().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox<Object> comboTurma;
    private javax.swing.JTextField data;
    private javax.swing.JButton gravar;
    private javax.swing.JButton inativar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton pdf;
    private javax.swing.JButton questoes;
    private javax.swing.JButton reativar;
    // End of variables declaration//GEN-END:variables
}

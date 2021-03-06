/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControleDisciplina;
import controller.ControleProfessor;
import javax.swing.JOptionPane;
import model.DisciplinaBEAN;

/**
 *
 * @author Eduardo Parreira
 */
public class Disciplina extends javax.swing.JFrame {
    int status=0;
    /**
     * Creates new form Disciplina
     */
    public Disciplina() {
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

        jLabel1 = new javax.swing.JLabel();
        alterar = new javax.swing.JButton();
        codigoDisciplina = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nomeDisciplina = new javax.swing.JTextField();
        gravar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        inativar = new javax.swing.JButton();
        ativda = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro de Disciplina");

        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        codigoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoDisciplinaActionPerformed(evt);
            }
        });

        jLabel2.setText("Código");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

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

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        inativar.setText("jButton1");
        inativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inativarActionPerformed(evt);
            }
        });

        ativda.setText("jButton1");
        ativda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativdaActionPerformed(evt);
            }
        });

        jButton1.setMnemonic('A');
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setMnemonic('I');
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gravar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(alterar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(excluir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(codigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(buscar))
                                            .addComponent(nomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(ativda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cancelar)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(inativar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(inativar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ativda)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(gravar)
                    .addComponent(excluir)
                    .addComponent(alterar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        if (!this.nomeDisciplina.getText().equals("") || !this.codigoDisciplina.getText().equals("")) {
            int idDisciplina = Integer.parseInt(this.codigoDisciplina.getText());
            ControleDisciplina controleDisciplina = new ControleDisciplina();
            DisciplinaBEAN professor = new DisciplinaBEAN(idDisciplina, this.nomeDisciplina.getText(), status);

            controleDisciplina.updateDisciplina(professor);

            JOptionPane.showMessageDialog(null, "Disciplina alterado com sucesso!");

            this.nomeDisciplina.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Preencha o código antes de alterar");
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void codigoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoDisciplinaActionPerformed

    }//GEN-LAST:event_codigoDisciplinaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if (!this.codigoDisciplina.equals("") || !this.codigoDisciplina.equals("Código")) {
            BuscaDisciplina frame = new BuscaDisciplina();
            frame.setVisible(true);
            this.dispose();
        } else {

        }
    }//GEN-LAST:event_buscarActionPerformed

    private void gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarActionPerformed
        if (!this.nomeDisciplina.getText().equals("")) {
            ControleDisciplina controleDisciplina = new ControleDisciplina();
            DisciplinaBEAN professor = new DisciplinaBEAN(this.nomeDisciplina.getText(), status);
            controleDisciplina.addDisciplina(professor);
            JOptionPane.showMessageDialog(null, "Disciplina cadastrado com sucesso!");
            this.nomeDisciplina.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Preencha o nome de cadastrar");
        }
    }//GEN-LAST:event_gravarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Menu frame = new Menu();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        if (!this.nomeDisciplina.getText().equals("") || !this.codigoDisciplina.getText().equals("")) {
            int idDisciplina = Integer.parseInt(this.codigoDisciplina.getText());
            ControleDisciplina controleDisciplina = new ControleDisciplina();
            DisciplinaBEAN professor = new DisciplinaBEAN(idDisciplina, this.nomeDisciplina.getText(), status);
            controleDisciplina.deleteDisciplina(idDisciplina);
            JOptionPane.showMessageDialog(null, "Disciplina excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Preencha o código antes de excluir");
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void inativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativarActionPerformed
        if (!this.nomeDisciplina.getText().equals("") || !this.codigoDisciplina.getText().equals("")) {
            int id = Integer.parseInt(this.codigoDisciplina.getText());
            ControleDisciplina controle = new ControleDisciplina();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controle.inativar(id);
            JOptionPane.showMessageDialog(null, "Disciplina inativada com sucesso!");
        }
    }//GEN-LAST:event_inativarActionPerformed

    private void ativdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativdaActionPerformed
        if (!this.nomeDisciplina.getText().equals("") || !this.codigoDisciplina.getText().equals("")) {
            int id = Integer.parseInt(this.codigoDisciplina.getText());
            ControleDisciplina controle = new ControleDisciplina();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controle.reativar(id);
            JOptionPane.showMessageDialog(null, "Disciplina reativada com sucesso!");
        }
    }//GEN-LAST:event_ativdaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (!this.nomeDisciplina.getText().equals("") || !this.codigoDisciplina.getText().equals("")) {
            int id = Integer.parseInt(this.codigoDisciplina.getText());
            ControleDisciplina controle = new ControleDisciplina();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controle.reativar(id);
            JOptionPane.showMessageDialog(null, "Disciplina reativada com sucesso!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!this.nomeDisciplina.getText().equals("") || !this.codigoDisciplina.getText().equals("")) {
            int id = Integer.parseInt(this.codigoDisciplina.getText());
            ControleDisciplina controle = new ControleDisciplina();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controle.inativar(id);
            JOptionPane.showMessageDialog(null, "Disciplina inativada com sucesso!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Disciplina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton ativda;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField codigoDisciplina;
    private javax.swing.JButton excluir;
    private javax.swing.JButton gravar;
    private javax.swing.JButton inativar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nomeDisciplina;
    // End of variables declaration//GEN-END:variables
}

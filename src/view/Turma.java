/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControleDisciplina;
import controller.ControleTurma;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.DisciplinaBEAN;
import model.DisciplinaDAO;
import model.ProfessorBEAN;
import model.ProfessorDAO;
import model.TurmaBEAN;

/**
 *
 * @author Eduardo Parreira
 */
public class Turma extends javax.swing.JFrame {
    int status=0;
    ProfessorBEAN professor = new ProfessorBEAN();
    DisciplinaBEAN disciplina = new DisciplinaBEAN();
    public Turma() {
        initComponents();
        listaComboProfessor();
        listaComboDisciplina();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        semestre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboDisc = new javax.swing.JComboBox<>();
        comboProf = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        gravar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        reativar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        inativar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(0, 4));

        jLabel1.setText("Cadastro de Turmas");

        jLabel2.setText("Semestre");

        comboDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDiscActionPerformed(evt);
            }
        });

        jLabel3.setText("Disciplina");

        jLabel4.setText("Professor");

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

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscar)
                                .addGap(40, 40, 40)
                                .addComponent(inativar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addComponent(comboDisc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboProf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(semestre)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reativar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(gravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(jLabel5)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inativar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gravar)
                        .addComponent(alterar)
                        .addComponent(excluir)
                        .addComponent(cancelar))
                    .addComponent(jButton1))
                .addGap(14, 14, 14)
                .addComponent(reativar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        BuscaTurma frame = new BuscaTurma();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buscarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Menu frame = new Menu();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        if (!this.semestre.getText().equals("") || !this.codigo.getText().equals("")) {
            int idTurmas = Integer.parseInt(this.codigo.getText());
            ControleTurma controleTurma = new ControleTurma();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controleTurma.deleteTurma(idTurmas);
            JOptionPane.showMessageDialog(null, "Disciplina excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Preencha o código antes de excluir");
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarActionPerformed
        if(!this.semestre.getText().equals("")){
            professor = (ProfessorBEAN) comboProf.getSelectedItem();
            disciplina = (DisciplinaBEAN) comboDisc.getSelectedItem();
            ControleTurma controleTurma = new ControleTurma();
            
            TurmaBEAN turma = new TurmaBEAN(this.semestre.getText(),professor,disciplina,status);
            controleTurma.addTurma(turma);
            JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso!");
            this.semestre.setText("");
        } else{
            JOptionPane.showMessageDialog(null, "Prencha o semestre para cadastrar!");
        }
    }//GEN-LAST:event_gravarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        if(!this.semestre.getText().equals("")){
            professor = (ProfessorBEAN) comboProf.getSelectedItem();
            disciplina = (DisciplinaBEAN) comboDisc.getSelectedItem();
            int id = Integer.parseInt(this.codigo.getText());
            System.out.println("Codigo:"+id);
            ControleTurma controle = new ControleTurma();
            TurmaBEAN turma = new TurmaBEAN(id,disciplina,professor,this.semestre.getText(),status);
            controle.updateTurma(turma);
            JOptionPane.showMessageDialog(null, "Turma alterada com sucesso!");
            this.semestre.setText("");
        } else{
            JOptionPane.showMessageDialog(null, "Prencha o semestre para alterar!");
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void reativarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reativarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_reativarKeyPressed

    private void reativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reativarActionPerformed
       if (!this.semestre.getText().equals("") || !this.codigo.getText().equals("")) {
            int idTurmas = Integer.parseInt(this.codigo.getText());
            ControleTurma controleTurma = new ControleTurma();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controleTurma.reativarTurma(idTurmas);
            JOptionPane.showMessageDialog(null, "Disciplina reativada com sucesso!");
        }
    }//GEN-LAST:event_reativarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!this.semestre.getText().equals("") || !this.codigo.getText().equals("")) {
            int idTurmas = Integer.parseInt(this.codigo.getText());
            ControleTurma controleTurma = new ControleTurma();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controleTurma.inativarTurma(idTurmas);
            JOptionPane.showMessageDialog(null, "Disciplina inativada com sucesso!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativarActionPerformed
        if (!this.semestre.getText().equals("") || !this.codigo.getText().equals("")) {
            int idTurmas = Integer.parseInt(this.codigo.getText());
            ControleTurma controleTurma = new ControleTurma();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controleTurma.inativarTurma(idTurmas);
            JOptionPane.showMessageDialog(null, "Disciplina inativada com sucesso!");
        }
    }//GEN-LAST:event_inativarActionPerformed

    private void comboDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDiscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDiscActionPerformed

    public void listaComboProfessor(){
        ProfessorDAO daoProf = new ProfessorDAO();
        for (ProfessorBEAN prof:daoProf.findAllProfessor()) {
            if(prof.getStatus_Professor()==0){
                comboProf.addItem(prof);
            }
            
        }
    }
    
    public void listaComboDisciplina(){
        DisciplinaDAO daoDisc = new DisciplinaDAO();
        for (DisciplinaBEAN disc:daoDisc.findAllDisciplina()) {
            if(disc.getStatus_Disciplina()==0){
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
            java.util.logging.Logger.getLogger(Turma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Turma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Turma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Turma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Turma().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox<Object> comboDisc;
    private javax.swing.JComboBox<Object> comboProf;
    private javax.swing.JButton excluir;
    private javax.swing.JButton gravar;
    private javax.swing.JButton inativar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton reativar;
    private javax.swing.JTextField semestre;
    // End of variables declaration//GEN-END:variables
}

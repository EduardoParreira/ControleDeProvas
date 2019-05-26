/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControleDisciplina;
import controller.ControleQuestao;
import controller.ControleTurma;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.DisciplinaBEAN;
import model.DisciplinaDAO;
import model.ProfessorBEAN;
import model.ProfessorDAO;
import model.QuestaoBEAN;
import model.TurmaBEAN;

/**
 *
 * @author Eduardo Parreira
 */
public class Questao extends javax.swing.JFrame {
    int status=0;
    ProfessorBEAN professor = new ProfessorBEAN();
    DisciplinaBEAN disciplina = new DisciplinaBEAN();
    public Questao() {
        initComponents();
        listaComboDisciplina();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboDisc = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoQuestao = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        alternativaA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        alternativaB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        alternativaC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        alternativaD = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        resposta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        dificuldade = new javax.swing.JComboBox<>();
        alternativaE = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(0, 4));

        jLabel1.setText("Cadastro de Questão");

        jLabel2.setText("Descrição:");

        comboDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDiscActionPerformed(evt);
            }
        });

        jLabel3.setText("Disciplina");

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

        descricaoQuestao.setColumns(20);
        descricaoQuestao.setRows(5);
        jScrollPane1.setViewportView(descricaoQuestao);

        jLabel6.setText("Alternativas:");

        jLabel7.setText("A:");

        jLabel8.setText("B:");

        jLabel9.setText("C:");

        jLabel10.setText("D:");

        jLabel11.setText("Resposta:");

        jLabel12.setText("Dificuldade:");

        dificuldade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fácil", "Médio", "Dificil" }));
        dificuldade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificuldadeActionPerformed(evt);
            }
        });

        jLabel13.setText("E:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar)
                        .addGap(51, 51, 51))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(comboDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 566, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(reativar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alternativaB))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(13, 13, 13)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alternativaD, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alternativaC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alternativaE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alternativaA)))
                .addGap(20, 20, 20)
                .addComponent(inativar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(jLabel5)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inativar)
                        .addGap(168, 168, 168))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alternativaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alternativaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alternativaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alternativaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(alternativaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(resposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(dificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gravar)
                            .addComponent(alterar)
                            .addComponent(excluir)
                            .addComponent(cancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton1)
                .addGap(14, 14, 14)
                .addComponent(reativar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if (!this.resposta.getText().equals("") || !this.codigo.getText().equals("")){
            ControleQuestao cq = new ControleQuestao();
            QuestaoBEAN questao = cq.listaUm(Integer.parseInt(codigo.getText()));
            descricaoQuestao.setText(questao.getDescricao_Questao());
            alternativaA.setText(questao.getA_questao());
            alternativaB.setText(questao.getB_questao());
            alternativaC.setText(questao.getC_questao());
            alternativaD.setText(questao.getD_questao());
            resposta.setText(questao.getResposta_Questao());
        } else {
            BuscaQuestao frame = new BuscaQuestao();
            frame.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_buscarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Menu frame = new Menu();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        if (!this.resposta.getText().equals("") || !this.codigo.getText().equals("")) {
            int idQuestao = Integer.parseInt(this.codigo.getText());
            ControleQuestao controleQuestao = new ControleQuestao();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controleQuestao.deleteQuestao(idQuestao);
            JOptionPane.showMessageDialog(null, "Disciplina excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Preencha o código antes de excluir");
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarActionPerformed
        if(!this.descricaoQuestao.getText().equals("")){
            disciplina = (DisciplinaBEAN) comboDisc.getSelectedItem();
            int dificuldades=0; 
            if(dificuldade.getSelectedItem().equals("Fácil")){
                dificuldades=1;
            }
            if(dificuldade.getSelectedItem().equals("Médio")){
                dificuldades=2;
            }
            if(dificuldade.getSelectedItem().equals("Dificil")){
                dificuldades=3;
            }
            ControleQuestao controleQuestao = new ControleQuestao();
            QuestaoBEAN questao = new QuestaoBEAN(disciplina, this.descricaoQuestao.getText(),dificuldades,resposta.getText(),0,alternativaA.getText(),alternativaB.getText(),alternativaC.getText(),alternativaD.getText(),alternativaE.getText());
            controleQuestao.addQuestao(questao);
            JOptionPane.showMessageDialog(null, "Questao cadastrada com sucesso!");
            this.descricaoQuestao.setText("");
            this.resposta.setText("");
            this.alternativaA.setText("");
            this.alternativaB.setText("");
            this.alternativaC.setText("");
            this.alternativaD.setText("");
            this.descricaoQuestao.setText("");
        } else{
            JOptionPane.showMessageDialog(null, "Prencha as informações!");
        }
    }//GEN-LAST:event_gravarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        if(!this.descricaoQuestao.getText().equals("")){
             int id = Integer.parseInt(this.codigo.getText());
             System.out.println("Codigo 1:"+id);
            disciplina = (DisciplinaBEAN) comboDisc.getSelectedItem();
            int dificuldades=0; 
            if(dificuldade.getSelectedItem().equals("Fácil")){
                dificuldades=1;
            }
            if(dificuldade.getSelectedItem().equals("Médio")){
                dificuldades=2;
            }
            if(dificuldade.getSelectedItem().equals("Dificil")){
                dificuldades=3;
            }
            ControleQuestao controleQuestao = new ControleQuestao();
//            QuestaoBEAN questao = new QuestaoBEAN(id,disciplina, this.descricaoQuestao.getText(),dificuldades,resposta.getText(),0,alternativaA.getText(),alternativaB.getText(),alternativaC.getText(),alternativaD.getText());
  //          controleQuestao.updateQuestao(questao);
            JOptionPane.showMessageDialog(null, "Questão alterada com sucesso!");
            this.descricaoQuestao.setText("");
            this.resposta.setText("");
            this.alternativaA.setText("");
            this.alternativaB.setText("");
            this.alternativaC.setText("");
            this.alternativaD.setText("");
            this.descricaoQuestao.setText("");
        } else{
            JOptionPane.showMessageDialog(null, "Prencha as inforamções!");
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void reativarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reativarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_reativarKeyPressed

    private void reativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reativarActionPerformed
/*       if (!this.semestre.getText().equals("") || !this.codigo.getText().equals("")) {
            int idTurmas = Integer.parseInt(this.codigo.getText());
            ControleTurma controleTurma = new ControleTurma();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controleTurma.reativarTurma(idTurmas);
            JOptionPane.showMessageDialog(null, "Disciplina reativada com sucesso!");
        }*/
    }//GEN-LAST:event_reativarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*if (!this.semestre.getText().equals("") || !this.codigo.getText().equals("")) {
            int idTurmas = Integer.parseInt(this.codigo.getText());
            ControleTurma controleTurma = new ControleTurma();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controleTurma.inativarTurma(idTurmas);
            JOptionPane.showMessageDialog(null, "Disciplina inativada com sucesso!");
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativarActionPerformed
      /*  if (!this.semestre.getText().equals("") || !this.codigo.getText().equals("")) {
            int idTurmas = Integer.parseInt(this.codigo.getText());
            ControleTurma controleTurma = new ControleTurma();
            //TurmaBEAN turma = new TurmaBEAN(idTurmas, this.semestre.getText(), status);
            controleTurma.inativarTurma(idTurmas);
            JOptionPane.showMessageDialog(null, "Disciplina inativada com sucesso!");
        }*/
    }//GEN-LAST:event_inativarActionPerformed

    private void comboDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDiscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDiscActionPerformed

    private void dificuldadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificuldadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dificuldadeActionPerformed

        
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
            java.util.logging.Logger.getLogger(Questao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questao().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JTextField alternativaA;
    private javax.swing.JTextField alternativaB;
    private javax.swing.JTextField alternativaC;
    private javax.swing.JTextField alternativaD;
    private javax.swing.JTextField alternativaE;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox<Object> comboDisc;
    private javax.swing.JTextArea descricaoQuestao;
    private javax.swing.JComboBox<String> dificuldade;
    private javax.swing.JButton excluir;
    private javax.swing.JButton gravar;
    private javax.swing.JButton inativar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reativar;
    private javax.swing.JTextField resposta;
    // End of variables declaration//GEN-END:variables
}

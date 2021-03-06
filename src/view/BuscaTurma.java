/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControleDisciplina;
import controller.ControleProfessor;
import controller.ControleTurma;
import java.util.ArrayList;
import model.DisciplinaBEAN;
import model.ProfessorBEAN;
import model.TurmaBEAN;
import model.TurmaBEAN;

/**
 *
 * @author Eduardo Parreira
 */
public class BuscaTurma extends javax.swing.JFrame {

    /**
     * Creates new form BuscaTurma
     */
    public BuscaTurma() {
        initComponents();
        ArrayList<TurmaBEAN> listTurma = new ArrayList();
        ArrayList<DisciplinaBEAN> disciplinas = new ArrayList();
        ArrayList<ProfessorBEAN> professores = new ArrayList();
        ControleTurma controleTurma = new ControleTurma();
        ControleProfessor controleProfessor = new ControleProfessor();
        ControleDisciplina controleDisciplina = new ControleDisciplina();
        listTurma = controleTurma.listaTurma();
        professores = controleProfessor.listaProfessor();
        disciplinas = controleDisciplina.listaDisciplina();
        limparTable();
        listarTable(listTurma,professores,disciplinas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atualizar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atualizar.setText("Listar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Status", "Professor", "Disciplina"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(voltar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(atualizar)
                        .addGap(0, 206, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(voltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        ArrayList<TurmaBEAN> listTurma = new ArrayList();
        ArrayList<DisciplinaBEAN> disciplinas = new ArrayList();
        ArrayList<ProfessorBEAN> professores = new ArrayList();
        ControleTurma controleTurma = new ControleTurma();
        ControleProfessor controleProfessor = new ControleProfessor();
        ControleDisciplina controleDisciplina = new ControleDisciplina();
        listTurma = controleTurma.listaTurma();
        professores = controleProfessor.listaProfessor();
        disciplinas = controleDisciplina.listaDisciplina();
        limparTable();
        listarTable(listTurma,professores,disciplinas);
    }//GEN-LAST:event_atualizarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        Turma frame = new Turma();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaMouseClicked

    private void listarTable(ArrayList<TurmaBEAN> listTurma,ArrayList<ProfessorBEAN> professores,ArrayList<DisciplinaBEAN> disciplinas) {
        for (int i = 0; i < listTurma.size(); i++) {
            this.tabela.setValueAt(listTurma.get(i).getId_Turmas(), i, 0);
            this.tabela.setValueAt(listTurma.get(i).getSemestre_Turma(), i, 1);
            if(listTurma.get(i).getStatus_Turma()==0){
                this.tabela.setValueAt("Ativo", i, 2);
            } else{
                this.tabela.setValueAt("Inativo", i, 2);
            }
            this.tabela.setValueAt(listTurma.get(i).getId_Professor().getNome_Professor(), i, 3);
            this.tabela.setValueAt(listTurma.get(i).getId_Disciplina().getNome_Disciplina(), i, 4);
        }
    }

    public void limparTable() {

        for (int i = 0; i < this.tabela.getRowCount(); i++) {
            this.tabela.setValueAt("", i, 0);
            this.tabela.setValueAt("", i, 1);
            this.tabela.setValueAt("", i, 2);
        }
    }
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(BuscaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}

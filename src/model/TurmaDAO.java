/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.ControleDisciplina;
import controller.ControleProfessor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Eduardo Parreira
 */
public class TurmaDAO {
    
    private static TurmaDAO instance;

    public TurmaDAO() {
        MySQL.getConnection();
    }
    
    public static TurmaDAO getInstance() {
        if (instance == null) {
            instance = new TurmaDAO();
        }
        return instance;
    }
    
     public long create(TurmaBEAN Turma) {
        String query = "INSERT INTO Turmas (id_Disciplina,id_Professor,semestre_Turma,status_Turma) values(?,?,?,?)";
        return MySQL.executeQuery(query, Turma.id_Disciplina.getId_Disciplina(),Turma.id_Professor.getId_Professor(),Turma.semestre_Turma, Turma.status_Turma);
    }

    public ArrayList<TurmaBEAN> listaTurma(ResultSet rs) {
        String query = "select * from Turmas";
        ArrayList<ProfessorBEAN> professores = new ArrayList();
        ArrayList<DisciplinaBEAN> disciplinas = new ArrayList();
        ControleProfessor cp = new ControleProfessor();
        professores = cp.listaProfessor();
        ProfessorBEAN prof = new ProfessorBEAN();
        DisciplinaBEAN disc = new DisciplinaBEAN();
        ControleDisciplina cd = new ControleDisciplina();
        disciplinas = cd.listaDisciplina();
        ArrayList<TurmaBEAN> lista = new ArrayList<TurmaBEAN>();
        //ResultSet rs = null;
        rs = MySQL.getResultSet(query);
        try {
            while (rs.next()) {
                for (int i = 0; i < professores.size(); i++) {
                    if(professores.get(i).id_Professor == rs.getInt("id_Professor")){
                        prof = professores.get(i);
                    }
                }
                for (int i = 0; i < disciplinas.size(); i++) {
                    if(disciplinas.get(i).id_Disciplina == rs.getInt("id_Disciplina")){
                        disc = disciplinas.get(i);
                    }
                }
                lista.add(new TurmaBEAN(rs.getInt("id_Turmas"), disc,prof,rs.getString("semestre_Turma"), rs.getInt("status_Turma")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<TurmaBEAN> listaTodos() {
        String query = "SELECT * FROM Turmas";
        ArrayList<TurmaBEAN> list = new ArrayList();
        list = listaTurma(MySQL.getResultSet(query));
        return list;
    }

    public void update(TurmaBEAN Turma) {
        String query = "UPDATE Turmas SET semestre_Turma=?,id_Professor=?,id_Disciplina=?, status_Turma=? WHERE id_Turmas=?";
        MySQL.executeQuery(query, Turma.getSemestre_Turma(),Turma.getId_Professor(),Turma.getId_Disciplina(), Turma.getStatus_Turma(), Turma.getId_Turmas());
    }

    public void delete(int idTurma) {
        String query = "UPDATE Turmas SET status_Turma=? WHERE id_Turmas=?";
        MySQL.executeQuery(query, 1, idTurma);
    }
    
    public void reativa(int idTurma) {
        String query = "UPDATE Turmas SET status_Turma=0 WHERE id_Turmas=?";
        MySQL.executeQuery(query, idTurma);
    }
    
    public void inativa(int idTurma) {
        String query = "UPDATE Turmas SET status_Turma=1 WHERE id_Turmas=?";
        MySQL.executeQuery(query, idTurma);
    }
    

    
}

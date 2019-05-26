package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DisciplinaDAO {

    private static DisciplinaDAO instance;

    public DisciplinaDAO() {
        MySQL.getConnection();
    }

    public static DisciplinaDAO getInstance() {
        if (instance == null) {
            instance = new DisciplinaDAO();
        }
        return instance;
    }

    public long create(DisciplinaBEAN Disciplina) {
        String query = "INSERT INTO Disciplina (nome_Disciplina,status_Disciplina) values(?,?)";
        return MySQL.executeQuery(query, Disciplina.nome_Disciplina, Disciplina.status_Disciplina);
    }

    public ArrayList<DisciplinaBEAN> listaDisciplina(ResultSet rs) {
        String query = "select * from Disciplina";
        ArrayList<DisciplinaBEAN> lista = new ArrayList<DisciplinaBEAN>();
        //ResultSet rs = null;
        rs = MySQL.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new DisciplinaBEAN(rs.getInt("id_Disciplina"), rs.getString("nome_Disciplina"), rs.getInt("status_Disciplina")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<DisciplinaBEAN> listaTodos() {
        String query = "SELECT * FROM Disciplina";
        ArrayList<DisciplinaBEAN> list = new ArrayList();
        list = listaDisciplina(MySQL.getResultSet(query));
        return list;
    }
    public ArrayList<DisciplinaBEAN> listaAtivos() {
        String query = "SELECT * FROM Disciplina where status_Disciplina=0";
        ArrayList<DisciplinaBEAN> list = new ArrayList();
        list = listaDisciplina(MySQL.getResultSet(query));
        return list;
    }

    public void update(DisciplinaBEAN Disciplina) {
        String query = "UPDATE Disciplina SET nome_Disciplina=?, status_Disciplina=? WHERE id_Disciplina=?";
        MySQL.executeQuery(query, Disciplina.getNome_Disciplina(), Disciplina.getStatus_Disciplina(), Disciplina.getId_Disciplina());
    }

    public void delete(int idDisciplina) {
        String query = "UPDATE Disciplina SET status_Disciplina=? WHERE id_Disciplina=?";
        MySQL.executeQuery(query, 1, idDisciplina);
    }
    
    public ArrayList<DisciplinaBEAN> findAllDisciplina(){
        return listaAtivos();
    }

     public void reativa(int idTurma) {
        String query = "UPDATE Disciplina SET status_Disciplina=0 WHERE id_Disciplina=?";
        MySQL.executeQuery(query, idTurma);
    }

    public void inativa(int idTurma) {
        String query = "UPDATE Disciplina SET status_Disciplina=1 WHERE id_Disciplina=?";
        MySQL.executeQuery(query, idTurma);
    }

}


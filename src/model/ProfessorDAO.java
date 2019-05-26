package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProfessorDAO {

    private static ProfessorDAO instance;

    public ProfessorDAO() {
        MySQL.getConnection();
    }

    public static ProfessorDAO getInstance() {
        if (instance == null) {
            instance = new ProfessorDAO();
        }
        return instance;
    }

    public long create(ProfessorBEAN professor) {
        String query = "INSERT INTO professor (nome_Professor,status_Professor) values(?,?)";
        return MySQL.executeQuery(query, professor.nome_Professor, professor.status_Professor);
    }

    public ArrayList<ProfessorBEAN> listaProfessor(ResultSet rs) {
        String query = "select * from professor";
        ArrayList<ProfessorBEAN> lista = new ArrayList<ProfessorBEAN>();
        //ResultSet rs = null;
        rs = MySQL.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new ProfessorBEAN(rs.getInt("id_Professor"), rs.getString("nome_Professor"), rs.getInt("status_Professor")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    
    public ArrayList<ProfessorBEAN> listaTodos() {
        String query = "SELECT * FROM professor";
        ArrayList<ProfessorBEAN> list = new ArrayList();
        list = listaProfessor(MySQL.getResultSet(query));
        return list;
    }

    public ArrayList<ProfessorBEAN> listaAtivos() {
        String query = "SELECT * FROM professor where status_Professor=0";
        ArrayList<ProfessorBEAN> list = new ArrayList();
        list = listaProfessor(MySQL.getResultSet(query));
        return list;
    }
    
    public void update(ProfessorBEAN professor) {
        String query = "UPDATE professor SET nome_Professor=?, status_Professor=? WHERE id_Professor=?";
        MySQL.executeQuery(query, professor.getNome_Professor(), professor.getStatus_Professor(), professor.getId_Professor());
    }

    public void delete(int idProfessor) {
        String query = "UPDATE professor SET status_Professor=? WHERE id_Professor=?";
        MySQL.executeQuery(query, 1, idProfessor);
    }

    public ArrayList<ProfessorBEAN> findAllProfessor() {
        return listaAtivos();
    }

    public void reativa(int idTurma) {
        String query = "UPDATE Professor SET status_Professor=0 WHERE id_Professor=?";
        MySQL.executeQuery(query, idTurma);
    }

    public void inativa(int idTurma) {
        String query = "UPDATE Professor SET status_Professor=1 WHERE id_Professor=?";
        MySQL.executeQuery(query, idTurma);
    }
    
    

}

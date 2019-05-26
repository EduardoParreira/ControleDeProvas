package model;

import controller.ControleDisciplina;
import controller.ControleTurma;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import view.Turma;

public class ProvaDAO {

    private static ProvaDAO instance;

    public ProvaDAO() {
        MySQL.getConnection();
    }

    public static ProvaDAO getInstance() {
        if (instance == null) {
            instance = new ProvaDAO();
        }
        return instance;
    }

    public long create(ProvaBEAN prova) {
        String query = "INSERT INTO prova (id_Turma,data_Prova) values(?,?)";
        return MySQL.executeQuery(query, prova.getId_Turma().getId_Turmas(),prova.getData_Prova());
    }

    public ArrayList<ProvaBEAN> listaProva(ResultSet rs) {
        String query = "select * from prova";
        ArrayList<ProvaBEAN> lista = new ArrayList<ProvaBEAN>();
        ControleTurma ct = new ControleTurma();
        ArrayList<TurmaBEAN> turmas = new ArrayList();
        turmas = ct.listaTurma();
        TurmaBEAN turma = new TurmaBEAN();
        //ResultSet rs = null;
        rs = MySQL.getResultSet(query);
        try {
            while (rs.next()) {
                for (int i = 0; i < turmas.size(); i++) {
                    if(rs.getInt("id_Turma")==turmas.get(i).id_Turmas){
                        turma = turmas.get(i);
                    }
                }
                lista.add(new ProvaBEAN(rs.getInt("id_Prova"), turma, rs.getString("data_Prova")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<ProvaBEAN> listaTodos() {
        String query = "SELECT * FROM prova";
        ArrayList<ProvaBEAN> list = new ArrayList();
        list = listaProva(MySQL.getResultSet(query));
        return list;
    }
    
    public ProvaBEAN listaUm(int codigo) {
        String query = "select * from prova where id_Prova=?";
        ProvaBEAN lista = null;
        ArrayList<TurmaBEAN> turmas = new ArrayList<TurmaBEAN>();
        ControleTurma ct = new ControleTurma();
        turmas = ct.listaTurma();
        TurmaBEAN tur = new TurmaBEAN();
        ResultSet rs = null;
        rs = MySQL.getResultSet(query,codigo);
        try {
            while (rs.next()) {
                for (int i = 0; i < turmas.size(); i++) {
                    if(turmas.get(i).id_Turmas ==rs.getInt("id_Turma") ){
                        tur = turmas.get(i);
                    }
                }
                lista = new ProvaBEAN(rs.getInt("id_Prova"), tur,rs.getString("data_Prova"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public void update(ProvaBEAN prova) {
        String query = "UPDATE Prova SET id_Turma=?, data_prova=? WHERE id_Prova=?";
        MySQL.executeQuery(query, prova.getId_Turma().getId_Turmas(),prova.getData_Prova(),prova.getId_Prova());
    }

    /*public void delete(int idDisciplina) {
        String query = "UPDATE Disciplina SET status_Disciplina=? WHERE id_Disciplina=?";
        MySQL.executeQuery(query, 1, idDisciplina);
    }*/
    
}


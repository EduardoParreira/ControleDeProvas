
package model;

import controller.ControleDisciplina;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QuestaoDAO {
    
    private static QuestaoDAO instance;
    
    public QuestaoDAO() {
        MySQL.getConnection();
    }

    public static QuestaoDAO getInstance() {
        if (instance == null) {
            instance = new QuestaoDAO();
        }
        return instance;
    }
    
    public long create(QuestaoBEAN questao) {
        String query = "INSERT INTO questoes (id_Disciplina,descricao_Questao,dificuldade_Questao,resposta_Questao,status_Questao,"
                + "alternativaA,alternativaB,alternativaC,alternativaD,alternativa_e) values(?,?,?,?,?,?,?,?,?,?)";
        return MySQL.executeQuery(query, questao.getDisciplina_Questao().getId_Disciplina(),questao.getDescricao_Questao(),
                questao.getDificuldade_Questao(),questao.getResposta_Questao(),questao.getStatus_Questao(),questao.getA_questao(),questao.getB_questao(),
                questao.getC_questao(),questao.getD_questao(),questao.getE_questao());
    }
    
    public ArrayList<QuestaoBEAN> listaQuestao(ResultSet rs) {
        String query = "select * from questoes";
        ArrayList<QuestaoBEAN> lista = new ArrayList<QuestaoBEAN>();
        ArrayList<DisciplinaBEAN> disciplinas = new ArrayList<DisciplinaBEAN>();
        ControleDisciplina cd = new ControleDisciplina();
        disciplinas = cd.listaDisciplina();
        DisciplinaBEAN disc = new DisciplinaBEAN();
        //ResultSet rs = null;
        rs = MySQL.getResultSet(query);
        try {
            while (rs.next()) {
                for (int i = 0; i < disciplinas.size(); i++) {
                    if(disciplinas.get(i).getId_Disciplina() ==rs.getInt("id_Disciplina") ){
                        disc = disciplinas.get(i);
                    }
                }
                lista.add(new QuestaoBEAN(rs.getInt("id_Questao"), disc, rs.getString("descricao_Questao"),rs.getInt("dificuldade_Questao"),rs.getString("resposta_Questao"),rs.getInt("status_Questao"),rs.getString("alternativaA"),rs.getString("alternativaB"),rs.getString("alternativaC"),rs.getString("alternativaD"),rs.getString("alternativa_e")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    

    
    public ArrayList<QuestaoBEAN> listaTodos() {
        String query = "SELECT * FROM questoes";
        ArrayList<QuestaoBEAN> list = new ArrayList();
        list = listaQuestao(MySQL.getResultSet(query));
        return list;
    }
    public QuestaoBEAN listaUm(int codigo) {
        String query = "select * from questoes where id_Questao=?";
        QuestaoBEAN lista = null;
        ArrayList<DisciplinaBEAN> disciplinas = new ArrayList<DisciplinaBEAN>();
        ControleDisciplina cd = new ControleDisciplina();
        disciplinas = cd.listaDisciplina();
        DisciplinaBEAN disc = new DisciplinaBEAN();
        ResultSet rs = null;
        rs = MySQL.getResultSet(query,codigo);
        try {
            while (rs.next()) {
                for (int i = 0; i < disciplinas.size(); i++) {
                    if(disciplinas.get(i).getId_Disciplina() ==rs.getInt("id_Disciplina") ){
                        disc = disciplinas.get(i);
                    }
                }
                lista = new QuestaoBEAN(rs.getInt("id_Questao"), disc, rs.getString("descricao_Questao"),rs.getInt("dificuldade_Questao"),rs.getString("resposta_Questao"),rs.getInt("status_Questao"),rs.getString("alternativaA"),rs.getString("alternativaB"),rs.getString("alternativaC"),rs.getString("alternativaD"),rs.getString("alternativa_e"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<QuestaoBEAN> questaoDisciplina(int codigo) {
        System.out.println("Código 3: "+codigo);
        String query = "select * from questoes where id_Disciplina=?";
        ArrayList<QuestaoBEAN> lista = new ArrayList();
        ArrayList<DisciplinaBEAN> disciplinas = new ArrayList<DisciplinaBEAN>();
        ControleDisciplina cd = new ControleDisciplina();
        disciplinas = cd.listaDisciplina();
        DisciplinaBEAN disc = new DisciplinaBEAN();
        ResultSet rs = null;
        rs = MySQL.getResultSet(query,codigo);
        try {
            while (rs.next()) {
                for (int i = 0; i < disciplinas.size(); i++) {
                    if(disciplinas.get(i).getId_Disciplina() ==rs.getInt("id_Disciplina") ){
                        disc = disciplinas.get(i);
                    }
                }
                lista.add(new QuestaoBEAN(rs.getInt("id_Questao"), disc, rs.getString("descricao_Questao"),rs.getInt("dificuldade_Questao"),rs.getString("resposta_Questao"),rs.getInt("status_Questao"),rs.getString("alternativaA"),rs.getString("alternativaB"),rs.getString("alternativaC"),rs.getString("alternativaD"),rs.getString("alternativa_e")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<QuestaoBEAN> listaAtivos() {
        String query = "SELECT * FROM questoes where status_Questao=0";
        ArrayList<QuestaoBEAN> list = new ArrayList();
        list = listaQuestao(MySQL.getResultSet(query));
        return list;
    }
    
    public void update(QuestaoBEAN questao) {
        System.out.println("Codigo 3:"+questao.getId_Questao());
        String query = "UPDATE questoes SET descricao_Questao=?,"
                + "dificuldade_Questao=?,resposta_Questao=?,"
                + "alternativaA=?,alternativaB=?,alternativaC=?,alternativaC=?"
                + "WHERE id_Questao=?";
        MySQL.executeQuery(query, questao.getDescricao_Questao(),questao.getDificuldade_Questao(),questao.getResposta_Questao(),questao.getA_questao(),questao.getB_questao(),questao.getC_questao(),questao.getD_questao(),questao.getId_Questao());
    }

    public void delete(int idQuestao) {
        String query = "UPDATE questoes SET status_Questao=? WHERE id_Questao=?";
        MySQL.executeQuery(query, 1, idQuestao);
    }

    public ArrayList<QuestaoBEAN> findAllQuestoes() {
        return listaAtivos();
    }

    public void reativa(int idTurma) {
        String query = "UPDATE Questoes SET status_Questao=0 WHERE id_Questao=?";
        MySQL.executeQuery(query, idTurma);
    }

    public void inativa(int idTurma) {
        String query = "UPDATE Questoes SET status_Questao=1 WHERE id_Questao=?";
        MySQL.executeQuery(query, idTurma);
    }
}


package controller;

import java.util.ArrayList;
import model.ProQuesBEAN;
import model.ProQuesDAO;
import model.QuestaoBEAN;
import model.QuestaoDAO;

public class ControleProQues {
    public void addQuestao(ProQuesBEAN questao) {
        ProQuesDAO.getInstance().create(questao);
    }
    public ArrayList<QuestaoBEAN> listaQuestoes() {
        return QuestaoDAO.getInstance().listaTodos();
    }
    public QuestaoBEAN listaUm(int codigo) {
        return QuestaoDAO.getInstance().listaUm(codigo);
    }
    public ArrayList<QuestaoBEAN> listaQuestaoDiscilina(int codigo) {
        System.out.println("Código 2: "+codigo);
        return QuestaoDAO.getInstance().questaoDisciplina(codigo);
    }
    public void updateQuestao(QuestaoBEAN questao) {
        System.out.println("Questao 2: "+questao.getId_Questao());
        QuestaoDAO.getInstance().update(questao);
    }
    public void deleteQuestao(int idQuestao) {
        QuestaoDAO.getInstance().delete(idQuestao);
    }
    public void reativarQuestao(int idQuestao) {
        QuestaoDAO.getInstance().reativa(idQuestao);
    }
    public void inativarQuestao(int idQuestao) {
        QuestaoDAO.getInstance().inativa(idQuestao);
    }
}

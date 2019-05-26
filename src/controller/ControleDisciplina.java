
package controller;

import java.util.ArrayList;
import model.DisciplinaBEAN;
import model.DisciplinaDAO;
import model.DisciplinaDAO;

public class ControleDisciplina {

    public void addDisciplina(DisciplinaBEAN Disciplina) {
        DisciplinaDAO.getInstance().create(Disciplina);
    }

    public ArrayList<DisciplinaBEAN> listaDisciplina() {
        return DisciplinaDAO.getInstance().listaTodos();
    }
    
    public void updateDisciplina(DisciplinaBEAN Disciplina) {
        DisciplinaDAO.getInstance().update(Disciplina);
    }
    
    public void deleteDisciplina(int idDisciplina) {
        DisciplinaDAO.getInstance().delete(idDisciplina);
    }
    
      public void reativar(int idTurma) {
        DisciplinaDAO.getInstance().reativa(idTurma);
    }
    public void inativar(int idTurma) {
        DisciplinaDAO.getInstance().inativa(idTurma);
    }
        
}

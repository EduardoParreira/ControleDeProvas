package controller;

import java.util.ArrayList;
import model.ProfessorBEAN;
import model.ProfessorDAO;
import model.TurmaDAO;

public class ControleProfessor {

    public ControleProfessor() {
    }

    public void addProfessor(ProfessorBEAN professor) {
        ProfessorDAO.getInstance().create(professor);
    }

    public ArrayList<ProfessorBEAN> listaProfessor() {
        return ProfessorDAO.getInstance().listaTodos();
    }
    
    public void updateProfessor(ProfessorBEAN professor) {
        ProfessorDAO.getInstance().update(professor);
    }
    
    public void deleteProfessor(int idProfessor) {
        ProfessorDAO.getInstance().delete(idProfessor);
    }
      public void reativarProfessor(int idTurma) {
        ProfessorDAO.getInstance().reativa(idTurma);
    }
    public void inativarProfessor(int idTurma) {
        ProfessorDAO.getInstance().inativa(idTurma);
    }
    
    
}

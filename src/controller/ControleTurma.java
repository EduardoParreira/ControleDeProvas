
package controller;

import java.util.ArrayList;
import model.TurmaBEAN;
import model.TurmaDAO;

public class ControleTurma {

    public void addTurma(TurmaBEAN professor) {
        TurmaDAO.getInstance().create(professor);
    }

    public ArrayList<TurmaBEAN> listaTurma() {
        return TurmaDAO.getInstance().listaTodos();
    }
    
    public void updateTurma(TurmaBEAN professor) {
        TurmaDAO.getInstance().update(professor);
    }
    
    public void deleteTurma(int idTurma) {
        TurmaDAO.getInstance().delete(idTurma);
    }
    public void reativarTurma(int idTurma) {
        TurmaDAO.getInstance().reativa(idTurma);
    }
    public void inativarTurma(int idTurma) {
        TurmaDAO.getInstance().inativa(idTurma);
    }
    
    
}

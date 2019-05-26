
package controller;

import java.util.ArrayList;
import model.ProvaBEAN;
import model.ProvaDAO;



public class ControleProva {

    public void addProva(ProvaBEAN prova) {
        ProvaDAO.getInstance().create(prova);
    }

    public ArrayList<ProvaBEAN> listaProva() {
        return ProvaDAO.getInstance().listaTodos();
    }
    
    public void updateProva(ProvaBEAN prova) {
        ProvaDAO.getInstance().update(prova);
    }
    
    public ProvaBEAN listaUm(int codigo) {
        return ProvaDAO.getInstance().listaUm(codigo);
    }
    
    
    
}

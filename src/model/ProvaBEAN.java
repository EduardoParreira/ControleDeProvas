package model;

import java.util.Date;
import view.Turma;

public class ProvaBEAN {

    int id_Prova;
    TurmaBEAN id_Turma;
    String data_Prova;

    public ProvaBEAN(int id_Prova, TurmaBEAN id_Turma, String data_Prova) {
        this.id_Prova = id_Prova;
        this.id_Turma = id_Turma;
        this.data_Prova = data_Prova;
    }

    public ProvaBEAN(TurmaBEAN id_Turma, String data_Prova) {
        this.id_Turma = id_Turma;
        this.data_Prova = data_Prova;
    }

    public ProvaBEAN() {
        
    }

    
    public int getId_Prova() {
        return id_Prova;
    }

    public void setId_Prova(int id_Prova) {
        this.id_Prova = id_Prova;
    }

    public TurmaBEAN getId_Turma() {
        return id_Turma;
    }

    public void setId_Turma(TurmaBEAN id_Turma) {
        this.id_Turma = id_Turma;
    }

    public String getData_Prova() {
        return data_Prova;
    }

    public void setData_Prova(String data_Prova) {
        this.data_Prova = data_Prova;
    }
}

    
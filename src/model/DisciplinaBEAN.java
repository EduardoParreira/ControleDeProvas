package model;

public class DisciplinaBEAN {

    int id_Disciplina;
    String nome_Disciplina;
    int status_Disciplina;

    public DisciplinaBEAN(String nome_Disciplina, int status_Disciplina) {

        this.nome_Disciplina = nome_Disciplina;
        this.status_Disciplina = status_Disciplina;

    }

    public DisciplinaBEAN(int id_Disciplina, String nome_Disciplina, int status_Disciplina) {
        this.id_Disciplina = id_Disciplina;
        this.nome_Disciplina = nome_Disciplina;
        this.status_Disciplina = status_Disciplina;
    }

    public DisciplinaBEAN() {
        
    }

    public int getId_Disciplina() {
        return id_Disciplina;
    }

    public void setId_Disciplina(int id_Disciplina) {
        this.id_Disciplina = id_Disciplina;
    }

    public String getNome_Disciplina() {
        return nome_Disciplina;
    }

    public void setNome_Disciplina(String nome_Disciplina) {
        this.nome_Disciplina = nome_Disciplina;
    }

    public int getStatus_Disciplina() {
        return status_Disciplina;
    }

    public void setStatus_Disciplina(int status_Disciplina) {
        this.status_Disciplina = status_Disciplina;
    }

    @Override
    public String toString() {
        return getNome_Disciplina(); //To change body of generated methods, choose Tools | Templates.
    }
    
}


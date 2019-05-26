package model;

public class ProfessorBEAN {
    int id_Professor;
    String nome_Professor;
    int status_Professor;


    public ProfessorBEAN(String nome_Professor, int status_Professor) {
        
        this.nome_Professor = nome_Professor;
        this.status_Professor = status_Professor;

    }

    public ProfessorBEAN(int id_Professor, String nome_Professor, int status_Professor) {
        this.id_Professor = id_Professor;
        this.nome_Professor = nome_Professor;
        this.status_Professor = status_Professor;
    }

    public ProfessorBEAN() {

    }

    public int getId_Professor() {
        return id_Professor;
    }

    public void setId_Professor(int id_Professor) {
        this.id_Professor = id_Professor;
    }

    public String getNome_Professor() {
        return nome_Professor;
    }

    public void setNome_Professor(String nome_Professor) {
        this.nome_Professor = nome_Professor;
    }

    public int getStatus_Professor() {
        return status_Professor;
    }

    public void setStatus_Professor(int status_Professor) {
        this.status_Professor = status_Professor;
    }
    
    @Override
    public String toString() {
        return getNome_Professor(); //To change body of generated methods, choose Tools | Templates.
    }

      
}

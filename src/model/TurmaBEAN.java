package model;



public class TurmaBEAN {

    int id_Turmas;
    DisciplinaBEAN id_Disciplina;
    ProfessorBEAN id_Professor;
    String semestre_Turma;
    int status_Turma;

    public TurmaBEAN(int id_Turmas, DisciplinaBEAN id_Disciplina, ProfessorBEAN id_Professor, String semestre_Turma, int status_Turma) {
        this.id_Turmas = id_Turmas;
        this.id_Disciplina = id_Disciplina;
        this.id_Professor = id_Professor;
        this.semestre_Turma = semestre_Turma;
        this.status_Turma = status_Turma;
    }

    public TurmaBEAN(String text, ProfessorBEAN id_Professor, DisciplinaBEAN id_Disciplina) {
        this.id_Disciplina = id_Disciplina;
        this.id_Professor = id_Professor;
        this.semestre_Turma = text;

    }

    public TurmaBEAN(String text, ProfessorBEAN id_Professor, DisciplinaBEAN id_Disciplina, int status) {
        this.id_Disciplina = id_Disciplina;
        this.id_Professor = id_Professor;
        this.semestre_Turma = text;
        this.status_Turma = status;
    }

    public TurmaBEAN() {
        
    }

    public int getId_Turmas() {
        return id_Turmas;
    }

    public void setId_Turmas(int id_Turmas) {
        this.id_Turmas = id_Turmas;
    }

    public DisciplinaBEAN getId_Disciplina() {
        return id_Disciplina;
    }

    public void setId_Disciplina(DisciplinaBEAN id_Disciplina) {
        this.id_Disciplina = id_Disciplina;
    }

    public ProfessorBEAN getId_Professor() {
        return id_Professor;
    }

    public void setId_Professor(ProfessorBEAN id_Professor) {
        this.id_Professor = id_Professor;
    }

    public String getSemestre_Turma() {
        return semestre_Turma;
    }

    public void setSemestre_Turma(String semestre_Turma) {
        this.semestre_Turma = semestre_Turma;
    }

    public int getStatus_Turma() {
        return status_Turma;
    }

    public void setStatus_Turma(int status_Turma) {
        this.status_Turma = status_Turma;
    }
    
    @Override
    public String toString() {
        return getSemestre_Turma(); //To change body of generated methods, choose Tools | Templates.
    }

}

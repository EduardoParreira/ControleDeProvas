
package model;

public class QuestaoBEAN {
    int id_Questao;
    DisciplinaBEAN disciplina_Questao;
    String descricao_Questao;
    int dificuldade_Questao;
    String resposta_Questao;
    int status_Questao;
    String a_questao;
    String b_questao;
    String c_questao;
    String d_questao;
    String e_questao;

    public QuestaoBEAN(int id_Questao,DisciplinaBEAN disciplina_Questao, String descricao_Questao, int dificuldade_Questao, String resposta_Questao, int status_Questao, String a_questao, String b_questao, String c_questao, String d_questao,String e_questao) {
        this.id_Questao = id_Questao;
        this.disciplina_Questao = disciplina_Questao;
        this.descricao_Questao = descricao_Questao;
        this.dificuldade_Questao = dificuldade_Questao;
        this.resposta_Questao = resposta_Questao;
        this.status_Questao = status_Questao;
        this.a_questao = a_questao;
        this.b_questao = b_questao;
        this.c_questao = c_questao;
        this.d_questao = d_questao;
        this.e_questao=e_questao;
    }
    
    public QuestaoBEAN(DisciplinaBEAN disciplina_Questao, String descricao_Questao, int dificuldade_Questao, String resposta_Questao, int status_Questao, String a_questao, String b_questao, String c_questao, String d_questao,String e_questao) {
        
        this.disciplina_Questao = disciplina_Questao;
        this.descricao_Questao = descricao_Questao;
        this.dificuldade_Questao = dificuldade_Questao;
        this.resposta_Questao = resposta_Questao;
        this.status_Questao = status_Questao;
        this.a_questao = a_questao;
        this.b_questao = b_questao;
        this.c_questao = c_questao;
        this.d_questao = d_questao;
        this.e_questao = e_questao;
    }

    public QuestaoBEAN(int id_Questao, DisciplinaBEAN disciplina_Questao, String descricao_Questao, int dificuldade_Questao, String resposta_Questao, int status_Questao) {
        this.id_Questao = id_Questao;
        this.disciplina_Questao = disciplina_Questao;
        this.descricao_Questao = descricao_Questao;
        this.dificuldade_Questao = dificuldade_Questao;
        this.resposta_Questao = resposta_Questao;
        this.status_Questao = status_Questao;
    }

    public QuestaoBEAN() {
        
    }

    public int getId_Questao() {
        return id_Questao;
    }

    public void setId_Questao(int id_Questao) {
        this.id_Questao = id_Questao;
    }

    public DisciplinaBEAN getDisciplina_Questao() {
        return disciplina_Questao;
    }

    public void setDisciplina_Questao(DisciplinaBEAN disciplina_Questao) {
        this.disciplina_Questao = disciplina_Questao;
    }

    public String getDescricao_Questao() {
        return descricao_Questao;
    }

    public void setDescricao_Questao(String descricao_Questao) {
        this.descricao_Questao = descricao_Questao;
    }

    public int getDificuldade_Questao() {
        return dificuldade_Questao;
    }

    public void setDificuldade_Questao(int dificuldade_Questao) {
        this.dificuldade_Questao = dificuldade_Questao;
    }

    public String getResposta_Questao() {
        return resposta_Questao;
    }

    public void setResposta_Questao(String resposta_Questao) {
        this.resposta_Questao = resposta_Questao;
    }

    public int getStatus_Questao() {
        return status_Questao;
    }

    public void setStatus_Questao(int status_Questao) {
        this.status_Questao = status_Questao;
    }

    public String getA_questao() {
        return a_questao;
    }

    public void setA_questao(String a_questao) {
        this.a_questao = a_questao;
    }

    public String getB_questao() {
        return b_questao;
    }

    public void setB_questao(String b_questao) {
        this.b_questao = b_questao;
    }

    public String getC_questao() {
        return c_questao;
    }

    public void setC_questao(String c_questao) {
        this.c_questao = c_questao;
    }

    public String getD_questao() {
        return d_questao;
    }

    public void setD_questao(String d_questao) {
        this.d_questao = d_questao;
    }
    public String getE_questao() {
        return e_questao;
    }

    public void setE_questao(String e_questao) {
        this.e_questao = d_questao;
    }
    
    
    
}

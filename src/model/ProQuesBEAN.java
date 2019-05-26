package model;

public class ProQuesBEAN {
    int id_ProQues;
    ProvaBEAN nome_Professor;
    QuestaoBEAN questoes_Prova;

    public ProQuesBEAN(int id_ProQues, ProvaBEAN nome_Professor, QuestaoBEAN questoes_Prova) {
        this.id_ProQues = id_ProQues;
        this.nome_Professor = nome_Professor;
        this.questoes_Prova = questoes_Prova;
    }

    public ProQuesBEAN(ProvaBEAN nome_Professor, QuestaoBEAN questoes_Prova) {
        this.nome_Professor = nome_Professor;
        this.questoes_Prova = questoes_Prova;
    }

    
    public int getId_ProQues() {
        return id_ProQues;
    }

    public void setId_ProQues(int id_ProQues) {
        this.id_ProQues = id_ProQues;
    }

    public ProvaBEAN getNome_Professor() {
        return nome_Professor;
    }

    public void setNome_Professor(ProvaBEAN nome_Professor) {
        this.nome_Professor = nome_Professor;
    }

    public QuestaoBEAN getQuestoes_Prova() {
        return questoes_Prova;
    }

    public void setQuestoes_Prova(QuestaoBEAN questoes_Prova) {
        this.questoes_Prova = questoes_Prova;
    }


    
}
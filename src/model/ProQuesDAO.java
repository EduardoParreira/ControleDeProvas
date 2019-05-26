package model;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import controller.ControleProva;
import controller.ControleQuestao;
import controller.ControleTurma;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProQuesDAO {

    private static ProQuesDAO instance;

    public ProQuesDAO() {
        MySQL.getConnection();
    }

    public static ProQuesDAO getInstance() {
        if (instance == null) {
            instance = new ProQuesDAO();
        }
        return instance;
    }

    public long create(ProQuesBEAN questao) {
        String query = "INSERT INTO questoes_provas (id_Prova,id_Questao) values(?,?)";
        return MySQL.executeQuery(query, questao.getNome_Professor().getId_Prova(),questao.getQuestoes_Prova().getId_Questao());
    }
    
    public ArrayList<ProQuesBEAN> umaProva(int codigo) {
        String query = "select * from questoes_provas where id_Prova=?";
        ArrayList<ProQuesBEAN> lista = new ArrayList();
        ArrayList<QuestaoBEAN> questoes = new ArrayList<QuestaoBEAN>();
        ControleQuestao cq = new ControleQuestao();
        questoes = cq.listaQuestoes();
        QuestaoBEAN questao = new QuestaoBEAN();
        ArrayList<ProvaBEAN> provas = new ArrayList<ProvaBEAN>();
        ControleProva cp = new ControleProva();
        provas = cp.listaProva();
        ProvaBEAN prova = new ProvaBEAN();
        ResultSet rs = null;
        rs = MySQL.getResultSet(query,codigo);
        try {
            while (rs.next()) {
                for (int i = 0; i < questoes.size(); i++) {
                    if(questoes.get(i).id_Questao ==rs.getInt("id_Questao") ){
                        questao = questoes.get(i);
                    }
                }
                lista.add(new ProQuesBEAN(rs.getInt("id_Questoes_Provas"),prova ,questao)) ;
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    public void pdf(ProvaBEAN prova){
        ArrayList<ProQuesBEAN> questoesProva = new ArrayList();
        System.out.println("Codigo P: "+prova.getId_Prova());
        questoesProva = this.umaProva(prova.getId_Prova());
        
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Eduardo Parreira\\Desktop\\FaSoft\\6º Período\\Práticas de Engenharia de Software\\Provas\\Prova_"+prova.getId_Prova()+".pdf"));
            doc.open();
            doc.add(new Paragraph("Prova"));
            doc.add(new Paragraph("Disciplina: "+questoesProva.get(0).getQuestoes_Prova().getDisciplina_Questao().getNome_Disciplina()));
            doc.add(new Paragraph("Turma: "+prova.getId_Turma().getSemestre_Turma()));
            doc.add(new Paragraph("---------------------------------------------------------------------------------------------"));
            doc.add(new Paragraph("Professor: "+prova.getId_Turma().getId_Professor().getNome_Professor()));
            doc.add(new Paragraph("Aluno:_____________________________________________"));
            doc.add(new Paragraph("---------------------------------------------------------------------------------------------"));
            for (int i = 0; i < questoesProva.size(); i++) {
                 doc.add(new Paragraph("0"+(i+1)+" - "+questoesProva.get(i).getQuestoes_Prova().getDescricao_Questao()));
                 doc.add(new Paragraph("a)"+questoesProva.get(i).getQuestoes_Prova().getA_questao()));
                 doc.add(new Paragraph("b)"+questoesProva.get(i).getQuestoes_Prova().getB_questao()));
                 doc.add(new Paragraph("c)"+questoesProva.get(i).getQuestoes_Prova().getC_questao()));
                 doc.add(new Paragraph("d)"+questoesProva.get(i).getQuestoes_Prova().getD_questao()));
                 doc.add(new Paragraph(""));
                 doc.add(new Paragraph(""));
            }
            
            JOptionPane.showMessageDialog(null, "PDF gerado!");
            doc.close();
        } catch (Exception ex) {
            System.out.println("ERRO!");
        }
        
    }
}

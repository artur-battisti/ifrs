/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs;

/**
 *
 * @author 05200250
 */
public class Curso {
    private String nome;
    private Disciplina disciplinas[];
    private String ppc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getPpc() {
        return ppc;
    }

    public void setPpc(String ppc) {
        this.ppc = ppc;
    }
    
    
    
    boolean novaDisciplina(Disciplina disciplina){
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i] == null){
                disciplinas[i] = disciplina ;
                return true;
            }
        }
        return false;
    }
    
    boolean removerDisc(Disciplina disciplina){
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i] != null && disciplinas[i].equals(disciplina)){
                disciplinas[i] = null;
                return true;
            }
        }
        return false;
    }
    
    void alterarPPC(String novoPPC){        
        ppc = novoPPC;        
    }
}

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
    String nome;
    Disciplina disciplinas[];
    String ppc;
    
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

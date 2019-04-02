/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs;

/**
 *
 * @author artur
 */
public class Disciplina {

    Aluno alunos[];
    Professor professor;
    String Nome;
    int ano;
    float notas[];

    boolean registrarNota(float nota, Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].equals(aluno)) {
                notas[i] = nota;
                return true;
            }
        }
        return false;
    }

    boolean novoAluno(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
            }
            return true;
        }
        return false;
    }

    boolean removerAluno(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].equals(aluno)) {
                alunos[i] = null;
                return true;
            }
        }
        return false;
    }
    
    boolean alterarNota(float novaNota, Aluno aluno){
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i] != null && alunos[i].equals(aluno)){
                notas[i] = novaNota;
                return true;
            }
        }
        return false;
    }

}

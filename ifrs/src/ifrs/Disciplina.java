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

    private Aluno alunos[];
    private Professor professor;
    private String Nome;
    private int ano;
    private float notas[];

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    
    
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

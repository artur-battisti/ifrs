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
public class SetorEnsino {

    private Aluno[] alunos = new Aluno[1000];
    private Curso cursos[];
    private Professor professores[];
    private String diretor;
    private String coordenador;

    public boolean novoProfessor(String nome, long siape) {
        for (int i = 0; i < professores.length; i++) {
            if (professores[i] != null) {
                professores[i] = new Professor();
                professores[i].setSiape(siape);
                professores[i].setNome(nome);
                return true;
            }
        }
        return false;
    }

    public boolean demitirProfessor(long siape) {
        for (int i = 0; i < professores.length; i++) {
            if (professores[i] != null && professores[i].getSiape() == siape) {
                professores[i] = null;
                return true;
            }
        }
        return false;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public SetorEnsino(Curso[] cursos, Professor[] professores, String diretor, String coordenador) {
        this.cursos = cursos;
        this.professores = professores;
        this.diretor = diretor;
        this.coordenador = coordenador;
    }

    public SetorEnsino(String diretor, String coordenador) {
        this.diretor = diretor;
        this.coordenador = coordenador;
    }

    public void verCursos() {
        if (cursos != null) {
            for (Curso curso : cursos) {
                if (curso != null) {
                    System.out.println(curso.getNome());
                    System.out.println(curso.getPpc());
                }
            }
        }
    }

    public void verNotas(String nome_curso, String disciplina, long matricula) {
        if (cursos != null) {
            for (Curso curso : cursos) {
                if (curso != null && curso.getNome().equals(nome_curso)) {
                    Disciplina[] disciplinas = curso.getDisciplinas();

                    if (disciplinas != null) {
                        for (Disciplina d : disciplinas) {
                            if (d != null && d.getNome().equals(disciplina)) {                                
                                Aluno[] lista_alunos = d.getAlunos();

                                if (lista_alunos != null) {
                                    for (int j = 0; j < lista_alunos.length; j++) {
                                        Aluno aluno = lista_alunos[j];

                                        if (aluno != null && aluno.getMatricula() == matricula) {
                                            if (d.getNotas() != null) {
                                                System.out.println(d.getNotas()[j]);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

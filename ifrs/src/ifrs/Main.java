/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Long.parseLong;
import java.util.Scanner;

/**
 *
 * @author 05200250
 */
public class Main {

    public static BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        SetorEnsino ensino = new SetorEnsino("Pâmela Perini", "Vitor Valente");
        Aluno[] alunos = new Aluno[1000];
        int opcao = 4;

        do {
            opcao = menu("MENU 1: \n "
                    + "[1] Aluno \n "
                    + "[2] Professor \n "
                    + "[3] Setor de Ensino \n "
                    + "[4] Sair");
            switch (opcao) {
                case 1:
                    menu_alunos("MENU 2: \n "
                            + "[1] Ver Cursos \n "
                            + "[2] Ver notas",
                            ensino);
                    break;
                case 2:
                    menu_professor("MENU 2: \n "
                            + "[1] Dar Notas de uma disciplina \n"
                            + "[2] Alterar uma nota \n"
                            + "[3] Adicionar Área \n"
                            + "[4] Remover Área",
                            ensino);
                    break;
                case 3:
                    menu_ensino("MENU 2: \n "
                            + "[1] Cadastrar Aluno \n"
                            + "[2] Cadastrar Curso \n"
                            + "[3] Adicionar Disciplina ao Curso \n"
                            + "[4] Cadastrar Professor",
                            ensino);
            }
        } while (opcao != 4);
    }

    private static int menu(String opcoes) throws IOException {
        System.out.println(opcoes);
        String texto = s.readLine();
        int opcao = Integer.parseInt(texto);
        return opcao;
    }

    private static void menu_alunos(String opcoes, SetorEnsino ensino) throws IOException {
        int opcao = menu(opcoes);
        switch (opcao) {
            case 1: {   //VER CURSOS OK
                ensino.verCursos();
            }
            case 2: {   //VER NOTAS OK
                System.out.println("Qual o nome do curso?");
                String nome_curso = s.readLine();
                System.out.println("Qual o nome da disciplina?");
                String disciplina = s.readLine();
                System.out.println("Qual a sua matrícula?");
                long matricula = Long.parseLong(s.readLine());

                ensino.verNotas(nome_curso, disciplina, matricula);
            }

        }
    }

    private static void menu_professor(String opcoes, SetorEnsino ensino) throws IOException {
        int opcao = menu(opcoes);
        switch (opcao) {
            case 1: {   //Dar Notas de uma disciplina OK
                dar_notas(ensino);
            }

            case 2: {   //Alterar uma nota OK
                dar_notas(ensino);
            }

            case 3: {   //Adicionar Área
                System.out.println("Qual o nome do professor?");
                String nomeProfessor = s.readLine();
                System.out.println("Qual o nome da área?");
                String area = s.readLine();
                
                ensino.adicionar_area(area,nomeProfessor);
            }

            case 4: {   //Remover Área
                System.out.println("Qual o nome do professor?");
                String nomeProfessor = s.readLine();
                System.out.println("Qual o nome da área?");
                String area = s.readLine();
                
                ensino.remover_area(area,nomeProfessor);
            }
        }

    }

    private static void menu_ensino(String opcoes, SetorEnsino ensino) throws IOException {
        int opcao = menu(opcoes);
        switch (opcao) {
            case 1: {   //Cadastrar Aluno
                System.out.println("Qual o nome do aluno?");
                String nomeAluno = s.readLine();
                System.out.println("Qual o nome do curso?");
                String nome_curso = s.readLine();
                System.out.println("Qual o número da matrícula?");
                long nMatricula = parseLong(s.readLine());
                System.out.println("Qual o ano de ingresso?");
                int anoIngresso = parseint(s.readLine());
                

                ensino.cadastrarAluno(nomeAluno, nome_curso, nMatricula, anoIngresso);
            }

            case 2: {   //Cadastrar Curso
                System.out.println("Qual o nome do curso?");
                String nomeCurso = s.readLine();
                System.out.println("Qual o número do PPC?");
                 = s.readLine();
                System.out.println("Qual o nome do curso?");
                String a = s.readLine();
                
                ensino.cadastrarCurso(nomeCurso);
            }

            case 3: {   //Adicionar Disciplina ao Curso
                
                ensino.addDisciplinaAoCurso();
            }

            case 4: {   //Cadastrar Professor
                
                ensino.cadastrarProfessor();
            }
        }

    }

    private static void dar_notas(SetorEnsino ensino) throws IOException {
        System.out.println("Qual o nome da disciplina?");
        String nome_disciplina = s.readLine();
        System.out.println("Qual o nome do aluno?");
        String nome_aluno = s.readLine();
        System.out.println("Qual a nota do aluno " + nome_aluno + " para a disciplina " + nome_disciplina + "?");
        float nota = Float.parseFloat(s.readLine());
        ensino.darNotas(nome_disciplina, nome_aluno, nota);
    }

    private static int parseint(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

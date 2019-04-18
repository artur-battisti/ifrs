/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author 05200250
 */
public class Main {
    
    static BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

    
    public static void main(String[] args) throws IOException{       
        SetorEnsino ensino = new SetorEnsino("Pâmela Perini", "Vitor Valente");
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

    private static int menu(String opcoes) throws IOException{
        System.out.println(opcoes);
        String texto = s.readLine();
        int opcao = Integer.parseInt(texto);
        return opcao;
    }

    private static void menu_alunos(String opcoes, SetorEnsino ensino) throws IOException{
        int opcao = menu(opcoes);
        switch (opcao){
            case 1: {   //VER CURSOS
                    ensino.verCursos();
                }            
            case 2: {   //VER NOTAS
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

    private static void menu_professor(String opcoes, SetorEnsino ensino) throws IOException{
        int opcao = menu(opcoes);
        switch (opcao){
            case 1:{   //Dar Notas de uma disciplina
                
            }
            
            case 2:{   //Alterar uma nota
                
            }
            
            case 3:{   //Adicionar Área
                
            }
            
            case 4:{   //Remover Área
                
            }
        }

    }

    private static void menu_ensino(String opcoes, SetorEnsino ensino) throws IOException{
        int opcao = menu(opcoes);
        switch (opcao){
            case 1:{   //Cadastrar Aluno
                
            }
            
            case 2:{   //Cadastrar Curso
                
            }
            
            case 3:{   //Adicionar Disciplina ao Curso
                
            }
            
            case 4:{   //Cadastrar Professor
                
            }
        }

    }
}

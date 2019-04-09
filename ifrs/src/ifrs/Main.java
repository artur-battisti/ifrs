/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs;

import java.util.Scanner;

/**
 *
 * @author 05200250
 */
public class Main {
    
    public static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        Aluno []alunos = new Aluno[1000];
        Professor []professores = new Professor[60];
        
        int funcao = verificaFuncao();
        
        
        if (funcao == 1){
            menuAluno();
        }
        if (funcao == 2){
            menuProfessor();
        }
        if (funcao == 3){
            menuSetorDeEnsino();
        }
        
    }
    public static int verificaFuncao(){
        System.out.println("Digite [1] para Aluno, [2] para Professor, [3] para Setor De Ensino, ou [0] para sair.");
        int opcao = s.nextInt();
        if (opcao < 0 && opcao > 3){
            System.out.println("Opção inválida!");
        }
        return opcao;
    }
    
    public static void menuAluno(){
        
    }
    public static void menuProfessor(){
        
    }
    public static void menuSetorDeEnsino(){
        
    }
}

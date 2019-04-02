/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs;

import static ifrs.Teste1.criaAluno;
import static ifrs.Teste3.criaProfessor;
import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Teste4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha [1] para professor e [2] para aluno:");
        int opcao = s.nextInt();
        s.nextLine();
        if (opcao == 1) {
            
            System.out.println("Nome:");
            String nome = s.nextLine();
            
            System.out.println("SIAPE:");
            long siape = s.nextLong();
            
            System.out.println("Quantas áreas?");
            int quantAreas = s.nextInt();
            
            String []areas = new String[quantAreas];
            System.out.println("Informe as áreas:");
            
            for (int i = 0; i < quantAreas; i++) {
                areas[i] = s.nextLine();
            }
            Professor p = criaProfessor(nome, siape, areas);
            
        } else {
            
            System.out.println("Nome:");
            String nome = s.nextLine();
            
            System.out.println("Curso:");
            String curso = s.nextLine();
            
            System.out.println("Matricula:");
            long matricula = s.nextLong();
            
            System.out.println("Ingresso:");
            int anoIngresso = s.nextInt();
            
            boolean ehFormado = false;
            
            Aluno a = criaAluno(nome, curso, anoIngresso, ehFormado, matricula);
        }
    }
}

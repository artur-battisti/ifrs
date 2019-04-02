/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs;

import static ifrs.Teste1.criaAluno;
import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Teste2 {
    
    public static Scanner s = new Scanner(System.in);
        

    public static void main(String[] args) {
        //String aluno = s.nextLine();
        Aluno aluno = criaAluno("Maria da Graça Souza",
                "Análise e Desenvolvimento de Sistemas (ADS)",
                2013,
                true,
                154090);
    }
}

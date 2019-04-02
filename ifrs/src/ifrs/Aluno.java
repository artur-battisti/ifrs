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
public class Aluno {
    String nome;
    String curso;
    int anoIngresso;
    boolean ehFormado;
    long matricula;

    String verificaStatus(){
        if (!ehFormado){
            return "O aluno ainda não concluiu o curso";
        }
        return "O aluno entrou no ano" + anoIngresso + "e se formou";
    }
    long obtemMatricula(){
        return matricula;
    }
}

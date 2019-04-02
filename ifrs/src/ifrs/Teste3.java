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
public class Teste3 {

    public static void main(String[] args) {
        String[] areas = new String[]{"Programação de Computadores",
                "Redes de Computadores",
                "Segurança de Sistemas"};
        Professor coelho = criaProfessor(
                "Rafael Vieira Coelho",
                1804250,
                areas);
    }
    public static Professor criaProfessor(String nome, long siape, String[] areas ){
        Professor coelho = new Professor();
        coelho.setNome(nome);
        coelho.setSiape(siape);
        coelho.setAreas(areas) ;
        return coelho;
    }
}
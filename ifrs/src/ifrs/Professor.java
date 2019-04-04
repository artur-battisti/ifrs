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
public class Professor {
    private String nome;
    private String areas[];
    private long siape;

    void alterarNome(String novoNome) {
        this.setNome(novoNome);
    }

    boolean novaArea(String area) {
        for (int i = 0; i < getAreas().length; i++) {
            if (getAreas()[i] == null) {
                getAreas()[i] = area;
                return true;
            }
        }
        return false;
    }
    
    boolean removerArea(String area) {
        for (int i = 0; i < getAreas().length; i++) {
            if (getAreas()[i].equals(area)) {
                getAreas()[i] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the areas
     */
    public String[] getAreas() {
        return areas;
    }

    /**
     * @param areas the areas to set
     */
    public void setAreas(String[] areas) {
        this.areas = areas;
    }

    /**
     * @return the siape
     */
    public long getSiape() {
        return siape;
    }

    /**
     * @param siape the siape to set
     */
    public void setSiape(long siape) {
        this.siape = siape;
    }
}

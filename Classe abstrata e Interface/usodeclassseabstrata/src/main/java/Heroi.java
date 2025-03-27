/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 14676810
 */
public abstract class Heroi extends Personagem{
    private int nSalvamentos;
    private String poderes;

    public Heroi(int nSalvamentos, String poderes, String nome, int nivel) {
        super(nome, nivel);
        this.nSalvamentos = nSalvamentos;
        this.poderes = poderes;
    }

    public int getnSalvamentos() {
        return nSalvamentos;
    }

    public void setnSalvamentos(int nSalvamentos) {
        this.nSalvamentos = nSalvamentos;
    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }
    
    public abstract void salva();
    
}

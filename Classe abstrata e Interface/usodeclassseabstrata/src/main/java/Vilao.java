/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 14676810
 */
public abstract class Vilao extends Personagem{
    private int nVitimas;
    private String fraqueza;

    public Vilao(int nSalvamentos, String poderes, String nome, int nivel) {
        super(nome, nivel);
        this.nVitimas = nSalvamentos;
        this.fraqueza = poderes;
    }

    public int getnVitimas() {
        return nVitimas;
    }

    public void setnVitimas(int nVitimas) {
        this.nVitimas = nVitimas;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }
    
    public abstract void rouba();
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 14676810
 */
public class Monstro extends Vilao{
    private String monstruosidade;

    public Monstro(String monstruosidade, int nSalvamentos, String poderes, String nome, int nivel) {
        super(nSalvamentos, poderes, nome, nivel);
        this.monstruosidade = monstruosidade;
    }

    public String getMonstruosidade() {
        return monstruosidade;
    }

    public void setMonstruosidade(String monstruosidade) {
        this.monstruosidade = monstruosidade;
    }
    
    public void fala(){
        System.out.println("HAHAHA ninguem resiste a minha " + getMonstruosidade());
        System.out.println("Mesmo com minha " + super.getFraqueza() + " eu ja fiz " + super.getnVitimas()+ " vitimas.");
    }
    
    public void rouba(){
        System.out.println("A aberração chamada " + super.getNome() + " de nivel " + super.getNivel() + " roubou mais uma velinha.");
    }
}

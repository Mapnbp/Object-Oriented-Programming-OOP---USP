/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 14676810
 */
public class Humano extends Vilao{
    private String artimanha;

    public Humano(String artimanha, int nSalvamentos, String poderes, String nome, int nivel) {
        super(nSalvamentos, poderes, nome, nivel);
        this.artimanha = artimanha;
    }

    public String getArtimanha() {
        return artimanha;
    }

    public void setArtimanha(String artimanha) {
        this.artimanha = artimanha;
    }
    
    public void fala(){
        System.out.println("HAHAHA ninguem se safa da minha " + getArtimanha());
        System.out.println("Mesmo com minha " + super.getFraqueza() + " eu ja fiz " + super.getnVitimas()+ " vitimas.");
    }
    
    public void rouba(){
        System.out.println("O ladrao chamado " + super.getNome() + " de nivel " + super.getNivel() + " assaltou mais um banco hoje.");
    }
}

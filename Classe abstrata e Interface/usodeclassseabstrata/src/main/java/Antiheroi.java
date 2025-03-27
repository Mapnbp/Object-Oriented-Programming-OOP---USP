/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 14676810
 */
public class Antiheroi extends Heroi{
    private String arma;

    public Antiheroi(String arma, int nSalvamentos, String poderes, String nome, int nivel) {
        super(nSalvamentos, poderes, nome, nivel);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    
    public void fala(){
        System.out.println("Ola mocinhas, relaxem que o " + super.getNome() + " e meu poder incrivel de " + super.getPoderes() + " vai salvar voces");
    }
    
    public void salva() {
        System.out.println("O impressionante " + super.getNome() + " ja salvou " + super.getnSalvamentos() + " pessoas so essa semana usando sua arma " + getArma());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 14676810
 */
public class Superheroi extends Heroi{
    private int cidadesSalvas;

    public Superheroi(int cidadesSalvas, int nSalvamentos, String poderes, String nome, int nivel) {
        super(nSalvamentos, poderes, nome, nivel);
        this.cidadesSalvas = cidadesSalvas;
    }

    public int getCidadesSalvas() {
        return cidadesSalvas;
    }

    public void setCidadesSalvas(int cidadesSalvas) {
        this.cidadesSalvas = cidadesSalvas;
    }
    
    public void fala(){
        System.out.println("Fiquem tranquilos porque eu, o  " + super.getNome() + " e meu poder " + super.getPoderes() + " de nivel " + super.getNivel() + " vai salvar voces.");
    }
    
    public void salva() {
        System.out.println("O nosso superheroi " + super.getNome() + " ja salvou " + super.getnSalvamentos() + " pessoas e " + getCidadesSalvas() + " cidades so hoje.");
    }
}

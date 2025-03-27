/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 14676810
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Antiheroi antiheroi = new Antiheroi("espada", 8, "super velocidade", "Vingador Sombrio", 8);
        Superheroi superheroi = new Superheroi(10, 213, "super força", "Blastoise", 20);
        Monstro monstro = new Monstro("cauda de jacare", 6, "escama quebrada", " Jacare Sombrio", 15);
        Humano humano = new Humano("habilidade de disfarce", 4, "marca passo pifando", "Sem Rosto", 3);
        
                // Para o Antiheroi
        antiheroi.fala();
        antiheroi.salva();
        
        // Para o Superheroi
        superheroi.fala();
        superheroi.salva();
        
        // Para o Monstro
        monstro.fala();
        monstro.rouba();
        
        // Para o Humano
        humano.fala();
        humano.rouba();
        
    }
    
}

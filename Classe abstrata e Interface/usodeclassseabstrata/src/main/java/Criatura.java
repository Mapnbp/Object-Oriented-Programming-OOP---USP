/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author 14676810
 */
public interface Criatura {
    String getNome();
    String getDescricao();
    int getVida();
    void updateVida(int iAnUpdate);
    int getAtaque();
    int getDefesa();
    int atacar();
    int defender();
    boolean estaVivo();
    void reset();
}

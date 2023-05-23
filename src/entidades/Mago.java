/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Jeferson Fano
 */
public class Mago extends Personaje {

    private int magia;
    private int sabiduria;

    /**
     * @return the magia
     */
    public int getMagia() {
        return magia;
    }

    /**
     * @param magia the magia to set
     */
    public void setMagia(int magia) {
        this.magia = magia;
    }

    /**
     * @return the sabiduria
     */
    public int getSabiduria() {
        return sabiduria;
    }

    /**
     * @param sabiduria the sabiduria to set
     */
    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public void ataqueHechizo(Personaje atacado) {
        //Implementar
        int nivelActualDeVida = atacado.getVida();
        if (this.magia > 5 && this.sabiduria > 8) {
            atacado.setVida(nivelActualDeVida - 45);
        } else {
            atacado.setVida(nivelActualDeVida - 20);
        }
    }

    @Override
    public void atacar(Personaje atacado) {
        int nivelActualDeVida = atacado.getVida();
        atacado.setVida(nivelActualDeVida - 8);
        atacado.defender(this);
    }

    @Override
    public void defender(Personaje atacante) {
        int nivelActualDeVida = atacante.getVida();
        if (this.sabiduria > 8) {
            atacante.setVida(nivelActualDeVida + 20);
        } else {
            atacante.setVida(nivelActualDeVida + 15);
        }
    }
}

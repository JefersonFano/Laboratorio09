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
public class Guerrero extends Personaje {

    private int fuerza;
    private int resistencia;

    /**
     * @return the fuerza
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * @param fuerza the fuerza to set
     */
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * @return the resistencia
     */
    public int getResistencia() {
        return resistencia;
    }

    /**
     * @param resistencia the resistencia to set
     */
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void ataqueEspecial(Personaje atacado) {
        //Implementar
        int nivelActualDeVida = atacado.getVida();
        if (this.fuerza > 5) {
            atacado.setVida(nivelActualDeVida - 50);
        } else {
            atacado.setVida(nivelActualDeVida - 30);
        }
    }

    @Override
    public void atacar(Personaje atacado) {
        int nivelActualDeVida = atacado.getVida();
        atacado.setVida(nivelActualDeVida - 10);
        atacado.defender(this);
    }

    @Override
    public void defender(Personaje atacante) {
        int nivelActualDeVida = atacante.getVida();
        if (this.resistencia > 10) {
            atacante.setVida(nivelActualDeVida + 10);
        } else {
            atacante.setVida(nivelActualDeVida + 5);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio09;

import entidades.Arquero;
import entidades.Guerrero;
import entidades.Mago;
import entidades.Personaje;
import java.util.Scanner;

/**
 *
 * @author Jeferson Fano
 */
public class Laboratorio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Guerrero guerrero = new Guerrero();
        Mago mago = new Mago();
        Arquero arquero = new Arquero();

        System.out.println("Bienvenido jugador");
        int player;
        System.out.println("Escoje tu personaje");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");
        player = leer.nextInt();

        Personaje person = new Personaje() {
            @Override
            public void atacar(Personaje atacado) {
            }
        };

        int accion;
        switch (player) {
            case 1:
                System.out.println("\nTu personaje es un guerrero");
                System.out.println("Nivel " + guerrero.getNivel());
                System.out.println("Fuerza " + guerrero.getFuerza());
                System.out.println("Resistencia " + guerrero.getResistencia());
                System.out.println("Vida " + guerrero.getVida());

                System.out.println("\n¿Que accion deseas hacer?");
                System.out.println("1. Atacar");
                System.out.println("2. Ataque especial");
                System.out.println("3. Ataque especial combox2");
                System.out.println("4. Defender");
                accion = leer.nextInt();

                switch (accion) {
                    case 1:
                        System.out.println("Acabas de atacar");
                        guerrero.atacar(person);
                        break;
                    case 2:
                        System.out.println("Usaste una habilidad potenciada");
                        guerrero.ataqueEspecial(person);
                        break;
                    case 3:
                        System.out.println("Usaste un ataque especialx2");
                        guerrero.ataqueEspecialCombox2(person);
                        break;

                    case 4:
                        System.out.println("Te defendiste");
                        guerrero.defender(person);
                        break;
                    default:
                        System.out.println("No existe esta acción");
                }
                break;
            case 2:
                System.out.println("\nTu personaje es un mago");
                System.out.println("Nivel " + mago.getNivel());
                System.out.println("Magia " + mago.getMagia());
                System.out.println("Sabiduria " + mago.getSabiduria());
                System.out.println("Vida " + mago.getVida());

                System.out.println("\n¿Que accion deseas hacer?");
                System.out.println("1. Atacar");
                System.out.println("2. Ataque especial");
                System.out.println("3. Ataque especial combox2");
                System.out.println("4. Defender");
                accion = leer.nextInt();

                switch (accion) {
                    case 1:
                        System.out.println("Acabas de atacar");
                        mago.atacar(person);
                        break;
                    case 2:
                        System.out.println("Usaste una habilidad potenciada");
                        mago.ataqueHechizo(person);
                        break;
                    case 3:
                        System.out.println("Usaste un ataque especialx2");
                        mago.ataqueEspecialCombox2(person);
                        break;
                    case 4:
                        System.out.println("Te defendiste");
                        mago.defender(person);
                        break;
                    default:
                        System.out.println("No existe esta acción");
                }
                break;
            case 3:
                System.out.println("Tu personaje es un arquero");
                System.out.println(arquero.getVida());

                System.out.println("\n¿Que accion deseas hacer?");
                System.out.println("1. Atacar");
                System.out.println("2. Ataque especial");
                System.out.println("3. Ataque especial combox2");
                accion = leer.nextInt();

                switch (accion) {
                    case 1:
                        System.out.println("Acabas de atacar");
                        arquero.atacar(person);
                        break;
                    case 2:
                        System.out.println("Usaste una habilidad potenciada");
                        arquero.dispararFlecha(person);
                        break;
                    case 3:
                        System.out.println("Usaste un ataque especialx2");
                        arquero.ataqueEspecialCombox2(person);
                        break;
                    default:
                        System.out.println("No existe esta acción");
                }
                break;
            default:
                System.out.println("No existe este personaje");
        }
    }
}

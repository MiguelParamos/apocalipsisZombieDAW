/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juanlu.Josema;

import Jacob.Daniel.FuncionesJD;
import Juanlu.Josema.FuncionesJLJM;
import ale.nico.FuncionesNA;
import alvaro.FuncionesA;
import pedro.isaac.FuncionesPI;
import java.util.Scanner;
import noelia.silvia.FuncionesNS;
import raul.javier.FuncionesRJ;

/**
 * Clase Funciones personaje
 *
 * @author Jose Martin Martinez
 * @author Juan Luis Ceacero
 * @version 0.1
 * @since 0.1
 */
public class FuncionesJLJM {

    public static String nombre;// Nombre del personaje
    public static byte fuerza;//Velocidad del personaje entre 0 y 100
    public static byte velocidad;//Fuerza del personaje entre 0 y 100
    public static byte intuición;//Intuición del personaje entre 0 y 100
    public static byte percepción;//Percepción del personaje entre 0 y 100
    public static byte vida;//Vide del personaje con 100 de base
    
    public static boolean comprobacionInicial(byte v, byte f, byte i, byte p) {

        if (v + f + i + p == 200) {
            return true;
        } else {
            return false;
        }

    }

    /**
     *
     * @param turno turno en el que esta el juego
     * @param accion acción que se realiza
     * @param p la estadistica de percepción
     * @return devuelve un string dependiendo de nuestros puntos de percepción
     */
    public static String descripcionReaccion(byte turno, String accion, byte p) {
        if (turno == 1 && accion == "mirar por la ventana") {
            if (p < 30) {
                return "No veo nada extraño";
            } else if (p >= 30 && p <= 90) {
                return "Veo que el grito viene de la derecha";
            } else {
                return "Veo gente corriendo por la plaza de la derecha";
            }

        }
        return "";
    }
/**
 * 
 * @param distancia velocidad a la que se mueve el jugador
 * @param mensaje ubicación del personaje
 * @return 
 */
    public static String dondeLlego(int distancia, String mensaje) {

        if (distancia >= 3) {
            switch (mensaje) {

                case "ventana":
                    return "Estás en mitad del aula";
                case "Estás en mitad del aula":
                    return "Estás en la puerta";
                case "Estás en la puerta":
                    return "Has bajado las escaleras, estás en la 1ª planta";
                case "Estás en la primera planta":
                    
                    return"Estás en la puerta de la calle";
               
            }
        } else {
            switch (mensaje) {
                case "ventana":
                    return "Estás en la fila 3";
                case "Estás en mitad del aula":
                    return "Estás por la última fila";
                case "Estás en la puerta":

                    return "Estás en medio de las escaleras";
                case "Estás en el tablón":
                   
                    return "Estás en medio de las escaleras";
                case "Estás en medio de las escaleras":
                        
                     return "Estás en la primera planta";
                     
                case "Estas en la primera planta":
                    
                    return "Estás en secretaría";
                        
            }
        }

        return "";
    }

}

/**
 *
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ale.nico;

import java.util.Scanner;

/**
 *datos  del personaje 
 * @autor Ale,Nico
 * @version 0.1
 * @since 0.1
 */
public class FuncionesNA {
    
    public static String nombre; //Nombre del personaje
    public static byte velocidad;//Velocidad del personaje entre 0 y 100
    public static byte fuerza;// fuerza del personaje entre 0 y 100
    public static byte intuicion; //intuicion del personaje entre 0 y 100
    public static byte percepcion;//intuicion del personaje entre 0 y 100
    public static byte vida;//vida que tiene nuestro personaje (100)
    public static boolean  comprobacionInicial (byte velocidad,byte fuerza, byte intuicion, byte percepcion){
        if (velocidad+fuerza+intuicion+percepcion==200) {
            return true;
    }else
     return false;
        
}
    /**
     * Esta función sirve para desplazarte hasta el baño en funcion de tu velocidad
     * @param velocidad velocidad del personaje
     * @return nos devuelve el resultado de los metros que se desplaza en int
     */
    public static int desplazamiento(byte velocidad){
   
       int otroResultado=velocidad*5/100;
        return otroResultado;
        
    }
    public static String dondeLlego (int distancia,String mensaje){

       
        if (distancia>=2&&mensaje.equals("final del aula 5")) {
            return "Estoy por el tablón de anuncios de la primera planta";
        }
        
        if (distancia >= 3) {
            switch (mensaje) {
                case "ventana":
                    return "mitad aula";
                case "mitad del aula":
                    return "en la puerta";
                   case "en la puerta":
                case "en el tablon":
                    return "escalera bajada primera planta";
                case "en mitad de la escalera":
                    return "estoy en la puerta";
                case "mitad del pasillo 1º planta":
                    return "estoy fuera del centro";
            }
        }else{
            switch(mensaje){
                case "ventana":
                    return "por la fila 3";
                case "mitad del aula":
                    return "por la ultima fila";
                case "en la puerta":
                case "en el tablon":
                    return "en mitad de la escalera";
                case "en mitad de la escalera":  
                    return "estoy en mitad de la sala";
                case  "mitad del pasillo 1º planta":
                    return "estoy en la puerta";
            }
        }
            return "";
        
    }
}


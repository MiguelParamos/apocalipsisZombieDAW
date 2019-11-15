/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvaro;

/**
 * Clase para las funciones de Alvaro
 * @author alvaro
 * @version 0.1
 * @since 0.1
 */
public class FuncionesA {
    public static String nombre; //Nombre del personaje (Jhonny Minmax)
    public static byte velocidad;//Velocidad del personaje entre 0 y 100 (75)
    public static byte fuerza;// fuerza del personaje entre 0 y 100 (10)
    public static byte intuicion; //intuicion del personaje entre 0 y 100 (55)
    public static byte percepcion;//intuicion del personaje entre 0 y 100 (60)
    
    /**
     *  Imprime la situación actual de un personaje a través de sus variables
     * pre: v,f,i y p tienen que estar entre 0 y 100
     * @param velocidad velocidad del personaje
     * @param fuerza fuerza del personaje
     * @param intuicion intuición del personaje
     * @param percepcion percepción del personaje
     * @return String con el informe de situación del personaje.
     */
    public static boolean situacionActual(byte velocidad,byte fuerza,byte intuicion, byte percepcion){
        if(velocidad+fuerza+intuicion+percepcion==200){
            return true;
        }else{
            return false;
        }    
    }
}


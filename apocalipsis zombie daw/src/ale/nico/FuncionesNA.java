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
    public static int descripcionDesplazamiento(byte velocidad){
   
       int otroResultado=velocidad*5/100;
        return otroResultado;
        
    }
}


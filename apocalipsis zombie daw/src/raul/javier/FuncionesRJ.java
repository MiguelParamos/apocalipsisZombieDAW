/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raul.javier;

import java.util.Scanner;

/**
 * Funcion que establece las caracteristicas de nuestro personaje.
 * @author raul y javier
 * @version 0.1
 * @since 0.1
 */
public class FuncionesRJ {
    
    public static String nombre;//Nombre del personaje
    public static byte velocidad;//Velocidad del personaje entre 0 y 100
    public static byte fuerza;//Fuerza del personaje entre 0 y 100
    public static byte intuicion;//Intuicion del personaje entre 0 y 100
    public static byte percepcion;//Percepcion del personaje entre 0 y 100
   
    
    /**
     * Funcion que devuelve un mensaje, en funcion del turno y la accion.
     * @param turno variable que establece el turno en el que hare la accion.
     * @param accion variable que establece la accion que se va a realizar.
     * @return Devuelve la accion que se va a realizar.
     */
    public static String descripcionReaccion(byte turno, String accion){
        
        if(turno==1&&accion.equals("esperar")){
            
            return "Me quedo mirando las musarañas";
               
        }else{
        
            if (turno==2&&accion.equals("mirar las noticias")){
            
            return "No veo nada anormal";
            
        }
            
        return"";
        
        
        }
        
     
        
    }
}

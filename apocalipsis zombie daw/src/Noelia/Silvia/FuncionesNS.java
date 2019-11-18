/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noelia.silvia;

import java.util.Scanner;

/**
 *clase del personaje Noelia y Silvia
 *@author Noelia
 *@author Silvia
 *@verison 0.1
 *@since 0.1
 */
public class FuncionesNS {
    public static String nombre; //Nombre del personaje
    public static byte velocidad; //Velocidad del personaje entre 0 y 100 70
    public static byte fuerza; //Fuerza del personaje entre 0 y 100 30
    public static byte intuicion; //Intuición del personaje entre 0 y 100 50
    public static byte percepcion; //Percepción del personaje entre 0 y 100 50

    
    /**
     * comprobar que los parámetros suma 200
     * @param velocidad velocidad del personaje
     * @param fuerza fuerza del personaje
     * @param intuicion intuicion del personaje
     * @param percepcion percepcion del personaje
     * @return  true si la suma es 200 y false si es diferente
     */
    
     public static boolean comprobacionInical (byte velocidad, byte fuerza, byte intuicion, byte percepcion){
     
         if (velocidad+fuerza+intuicion+percepcion==200){
             return true;
            }
            return false;
     
     }
     
     /** 1ª if
      * Respuesta al grito de la calle
      * @param turno vez en que se realiza una acción
      * @param accion respuesta ante el suceso del turno
      * @return mensaje con la acción realizada, estar quieto
      */   
     /** 2ª if
       * Pregunta a Rick qué pasa
       * @param turno es la segunda vez que se realizar una opción
       * @param accion respuesta ante los gritos de la calle
       * @return mensaje preguntar qué pasa?
       */        
            
       public static String descripcionReaccion (byte turno, String accion){
     
        if (turno==1&&accion.equals("esperar")){
           return ("Me quedo mirando musarañas");
            }  
            if (turno==2&&accion.equals("Pregunto qué está pasando")){
                    return "¿Qué está pasando Rick?";
                }else{
                    return "";
       }    
    }
}
    
    
    
 
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
    public static byte punteria; //Puntería que tiene nuestro personaje entre 0 y 100
    public static boolean  comprobacionInicial (byte velocidad,byte fuerza, byte intuicion, byte percepcion, byte punteria){
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
    /**
     * Este metodo sirve para saber a donde vas a llegar
     * @param distancia en metros que puede recorrer
     * @param mensaje anuncia la posicion en la que se quedad el personaje
     * @return devuelve uno de los posibles posicionamiento que ofrece los distintos casos
     */
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
                    return "estoy en la puerta de la calle";
            }
        }
            return "";
        
    }
    /**
     * 
     * @param turno
     * @param accion
     * @return 
     */
        public static String descripcionReaccion (byte turno, String accion){
     
        if (turno==6 && accion.equals("abrimos la puerta y preguntamos qué pasa")){
           return ("El hombre que estaba fuera intenta empujaros y os grita \"¡Déjame entrar!¡Déjame entrar!\"");
            
            }else if (turno==7 &&accion.equals("no dejar pasar y preguntar qué pasa")) {
                return ("Responde: El hombre intenta explicaros algo nervioso, y veis como lo que parece un zombie le muerde el cuello y lo tira al suelo");
                
            }else if(turno==8 && velocidad<85 && accion.equals("intento huir hacia la calle")){
                    return ("Conforme escapabas, el zombie te agarra de una pierna. Rick carga contra el, y os libera.");
                    }
        
        return ("");
        }
}


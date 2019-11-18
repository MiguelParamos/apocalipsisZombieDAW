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
     *  Comprueba que la suma de sus estadisticas sume 200
     * @param velocidad velocidad del personaje
     * @param fuerza fuerza del personaje
     * @param intuicion intuición del personaje
     * @param percepcion percepción del personaje
     * @return boolean con true si es correcta la suma o false si estan mal los datos
     */
    public static boolean comprobacionInicial
        (byte velocidad,byte fuerza,byte intuicion, byte percepcion){
        if(velocidad+fuerza+intuicion+percepcion==200){
            return true;
        }else{
            return false;
        }    
    }
        
    public static String descripcionReaccion (byte turno, String accion){
     
        if (turno==3&&accion.equals("escuchar")){
           return ("Jhonny Minmax se despierta, no es como si estuviera dormido en clase ni nada parecido...");
            } else if(turno==4&&accion.equals("preguntar que pasa")){
                return("Todos estan en caos y Natalia esta en el suelo recibiendo una paliza. Pregunto tranquilamente que esta pasando aqui.");
            }else if(turno==5&&accion.equals("ayudar")){
                return("Ayudo a Natalia a levantarse.");
            }else if(turno==6&&accion.equals("coger el telefono")){
                return("Ahora que tengo las manos libres, cojo el teléfono que estaba sonando.");
            }
        return "";
 

    }
}



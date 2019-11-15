/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedro.isaac;

/**
 * clase del personaje de pedro e isaac
 *
 * @author Pedro
 * @author Isaac
 * @version 0.1
 * @since 0.1
 */
public class FuncionesPI {

    public static String nombre; //Nombre del personaje
    public static byte velocidad; //Velocidad del personaje entre 0 y 100
    public static byte fuerza; //Fuerza del personaje entre 0 y 100
    public static byte intuicion; //Intuición del personaje entre 0 y 100
    public static byte percepcion; //Percepción del personaje entre 0 y 100

    
    static public boolean comprobar(byte velocidad, byte fuerza, byte intuicion, byte percepcion) {
        if (velocidad + fuerza + intuicion + percepcion == 200) {
            return true;
        }
        return false;
    }
    /**
     * @author pedro
     * @author isaac
     * @param turno indica el turno en el que estamos
     * @param accion es la accion que tenemos asignada(percepcion, fuerza...)
     * @param percepcion es la variable con la que trabajamos en esta funcion
     * @return devuelve un string con lo que ocurre dependiendo de la percepcion
     * Esta funcion comprueba nuestro nivel de percepcion y los casos que ocurren dependiendo del valor de esta
     */
    
    public static String descripcionReaccion(byte turno, String accion, byte percepcion){
        accion="mirar por la ventana";
        if(turno==1&&accion.equals(accion)){
            if(percepcion<30){
                return "No veo nada extraño";
            }else if(percepcion>=30&&percepcion<=90){
                return "Veo que el grito viene de la derecha";
            }else{
                return "Veo gente corriendo por la plaza de la derecha";
            }
        }
        return "";
    
    }
    
}

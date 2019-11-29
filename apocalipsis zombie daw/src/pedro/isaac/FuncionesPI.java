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
    public static byte vida; //La vida de personaje entre 0 y 100
    public static byte punteria;//La punteria entre 0 100, es random
    
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
        if(turno==1&&accion.equals("mirar por la ventana")){
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
    
    
    public static String descripcionReaccion(byte turno, String accion){
        if(turno==2&&accion.equals("pregunto no se rick, parece falso")){
            return "No me responde nadie nada.";
        }else if(turno==4&&accion.equals("Consultar redes sociales")){
            return "He visto el mensaje";
        }
        return "";
    
    }
    
    /**
     * Esta función dice la distancia a la que llegamos según la posición inicial
     * @author pedro
     * @author isaac
     * @param distancia variable que entra de otra funcion e indica lo que haces dependiendo de la distancia
     * @param mensaje es un String para indicar donde estamos
     * @return String
     */
    public static String dondeLlego (int distancia,String mensaje){
        
        if(distancia>=3&&mensaje.equals("puerta del aula")){
          return "Estoy abajo";
        }else{
            return "Estoy en mitad de las escaleras"; 
            }
        
        
    }
    /**
     * Funcion lanzar que nos indica si podemos lanzar o no un objeto dependiendo de la fuerza, punteria y peso del objeto.
     * @param fuerza nuestra fuerza
     * @param punteria nuestra punteria
     * @param peso del objeto
     * @return devulve un booleano false si no lo puedes lanzar, true si lo lanzas
     */
    public static boolean lanzar(byte fuerza, byte punteria, float peso){
        float pesoLanzable=(fuerza*20)/100;
        if(pesoLanzable>peso){
            return false;
        }else{
            float dif=pesoLanzable-peso;
            if(dif<5){
                if(punteria<50){
                    return false;
                }else{
                    return true;
                }  
            }else{
                if(punteria<20){
                    return false;
                }else return true;
                
            }
        }
        
    }
    
}

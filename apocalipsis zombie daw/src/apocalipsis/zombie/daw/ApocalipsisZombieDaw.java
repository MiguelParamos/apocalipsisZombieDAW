/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apocalipsis.zombie.daw;
import alvaro.FuncionesA;
/**
 *  Clase principal, que lanza el programa del apocalipsis zombie
 * @author Miguel Páramos
 * @version 0.1
 * @since 0.1
 */
public class ApocalipsisZombieDaw {

    /**
     *  Programa del apocalipsis zombie que vamos programando
     * @param args the command line arguments
     * @author Miguel Páramos
     * @author Noelia Rodríguez 
     * @author Silvia Sales 
     * @version 0.1
     * @since 0.1
     */
    public static void main(String[] args) {
        System.out.println("Cerebroooos!");
        System.out.println("Juanlu y Jose");
        System.out.println("pedro isaak");
                
                
        System.out.println("NoeliaSilvia");
        System.out.println("raul y javi");
        System.out.println("ale,nico");
        
        System.out.println("Jacob,Daniel");
        System.out.println("alvaro");
        System.out.println("Miguel");
        
        System.out.println(situacionActual(
                "Miguel",(byte)50,(byte)50,(byte)50,(byte)50));
        
    }
    
    /**
     *  Imprime la situación actual de un personaje a través de sus variables
     * pre: v,f,i y p tienen que estar entre 0 y 100
     * @param n nombre del personaje
     * @param v velocidad del personaje
     * @param f fuerza del personaje
     * @param i intuición del personaje
     * @param p percepción del personaje
     * @return String con el informe de situación del personaje.
     */
    public static String situacionActual(String n, byte v,byte f,byte i, byte p){
            return "\n-----------------\n|\t"+n+"\t|\n-----------------\nVelocidad:\t"+v+"\nFuerza: \t"+f+
                    "\nIntuición:\t"+i+"\nPercepción:\t"+p+"\n-----------------\n";
    }
    
}

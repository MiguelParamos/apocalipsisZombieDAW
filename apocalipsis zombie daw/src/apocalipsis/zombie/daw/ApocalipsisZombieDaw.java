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
     * @param args the command line arguments
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
    
    
    public static String situacionActual(String n, byte v,byte f,byte i, byte p){
            return "\n-----------------\n|\t"+n+"\t|\n-----------------\nVelocidad:\t"+v+"\nFuerza: \t"+f+
                    "\nIntuición:\t"+i+"\nPercepción:\t"+p+"\n-----------------\n";
    }
    
}

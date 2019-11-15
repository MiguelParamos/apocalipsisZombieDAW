/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apocalipsis.zombie.daw;
import Jacob.Daniel.FuncionesJD;
import Juanlu.Josema.FuncionesJLJM;
import ale.nico.FuncionesNA;
import alvaro.FuncionesA;
import pedro.isaac.FuncionesPI;
import java.util.Scanner;
import noelia.silvia.FuncionesNS;
import raul.javier.FuncionesRJ;
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
        
            byte turno=1;
        
            FuncionesJD.nombre="Sam";
            FuncionesJD.velocidad=70;
            FuncionesJD.fuerza=30;
            FuncionesJD.intuicion=60;
            FuncionesJD.percepcion=40;
                    
           FuncionesJLJM.nombre="Rick";
           FuncionesJLJM.velocidad=40;
           FuncionesJLJM.fuerza=40;
           FuncionesJLJM.percepción=60;
           FuncionesJLJM.intuición=60;
           
           FuncionesNS.nombre="Bryony";
           FuncionesNS.velocidad=70;
           FuncionesNS.fuerza=30;
           FuncionesNS.intuicion=50;
           FuncionesNS.percepcion=50;
           
           FuncionesNA.nombre="Puigdemont";
           FuncionesNA.velocidad=55;
           FuncionesNA.fuerza=30;
           FuncionesNA.percepcion=65;
           FuncionesNA.intuicion=50;
           
           FuncionesA.nombre="Jhonny Minmax";
           FuncionesA.velocidad=75;
           FuncionesA.fuerza=10;
           FuncionesA.intuicion=55;
           FuncionesA.percepcion=60;
           
           FuncionesPI.nombre="Foyonero";
           FuncionesPI.velocidad=50;
           FuncionesPI.fuerza=100;
           FuncionesPI.intuicion=50;
           FuncionesPI.percepcion=0;
           
           FuncionesRJ.nombre="CabezaNuca";
           FuncionesRJ.fuerza=50;
           FuncionesRJ.intuicion=50;
           FuncionesRJ.velocidad=50;
           FuncionesRJ.percepcion=50;
           
            //Aquí se cuenta todo lo que pasa
           String historia="Es 15 de Noviembre en Cenec, "+FuncionesJD.nombre+", "+FuncionesJLJM.nombre+",\n "+FuncionesNS.nombre+", " +FuncionesNA.nombre+", "+FuncionesPI.nombre+", "+FuncionesA.nombre+"\ny "+FuncionesRJ.nombre+" están en clase de programación.";
           
           //Comprobación inicial
           if(!FuncionesA.comprobacionInicial(
                    FuncionesA.velocidad,
                    FuncionesA.fuerza,
                    FuncionesA.intuicion,
                    FuncionesA.percepcion
                    )){
               System.out.println("El jugador "+FuncionesA.nombre+" es incoherente!");
           }
           
            if(!FuncionesA.comprobacionInicial(
                    FuncionesJLJM.velocidad,
                    FuncionesJLJM.fuerza,
                    FuncionesJLJM.intuición,
                    FuncionesJLJM.percepción
                    )){
               System.out.println("El jugador "+FuncionesJLJM.nombre+" es incoherente!");
           }
            if(!FuncionesA.comprobacionInicial(
                    FuncionesPI.velocidad,
                    FuncionesPI.fuerza,
                    FuncionesPI.intuicion,
                    FuncionesPI.percepcion
                    )){
               System.out.println("El jugador "+FuncionesPI.nombre+" es incoherente!");
           }
            
            if(!FuncionesA.comprobacionInicial(
                    FuncionesJD.velocidad,
                    FuncionesJD.fuerza,
                    FuncionesJD.intuicion,
                    FuncionesJD.percepcion
                    )){
               System.out.println("El jugador "+FuncionesJD.nombre+" es incoherente!");
           }
            
            if(!FuncionesA.comprobacionInicial(
                    FuncionesNS.velocidad,
                    FuncionesNS.fuerza,
                    FuncionesNS.intuicion,
                    FuncionesNS.percepcion
                    )){
               System.out.println("El jugador "+FuncionesNS.nombre+" es incoherente!");
           }
            
            if(!FuncionesA.comprobacionInicial(
                    FuncionesNA.velocidad,
                    FuncionesNA.fuerza,
                    FuncionesNA.intuicion,
                    FuncionesNA.percepcion
                    )){
               System.out.println("El jugador "+FuncionesNA.nombre+" es incoherente!");
           }
            
            if(!FuncionesA.comprobacionInicial(
                    FuncionesRJ.velocidad,
                    FuncionesRJ.fuerza,
                    FuncionesRJ.intuicion,
                    FuncionesRJ.percepcion
                    )){
               System.out.println("El jugador "+FuncionesRJ.nombre+" es incoherente!");
           }
            
            //Turno 1
            historia+="\n\n Escuchamos todos un grito desde la calle.";
           
            
            
           System.out.println(historia);
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
    
    /**
     * función que pide por teclado un String y lo devuelve
     * @param mensaje mensaje que se muestra por teclado para pedir el String
     * @return string metido por teclado
     */
    public static String pedirDatoTexto(String mensaje){
        Scanner sc=new Scanner(System.in);
        System.out.println(mensaje);
        String nombre=sc.nextLine();
        return nombre;
    }
        
    /**
     * función que pide por teclado un byte y lo devuelve
     * post: el valor devuelto es positivo menor que 128
     * @param mensaje mensaje que se muestra por teclado para pedir el byte
     * @return byte positivo menor que 128
     */
    public static byte pedirDatoByte(String mensaje){
        Scanner sc=new Scanner(System.in);
        byte dato;
        do{
            System.out.println(mensaje);
            dato=Byte.parseByte(sc.nextLine());
        }while(dato<0||dato>127);
        return dato;
    }

    
}

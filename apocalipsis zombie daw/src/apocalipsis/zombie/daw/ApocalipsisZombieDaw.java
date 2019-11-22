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
            FuncionesJD.vida=100;
                    
           FuncionesJLJM.nombre="Rick";
           FuncionesJLJM.velocidad=40;
           FuncionesJLJM.fuerza=40;
           FuncionesJLJM.percepción=60;
           FuncionesJLJM.intuición=60;
           FuncionesJLJM.vida=100;
           
           FuncionesNS.nombre="Bryony";
           FuncionesNS.velocidad=70;
           FuncionesNS.fuerza=30;
           FuncionesNS.intuicion=50;
           FuncionesNS.percepcion=50;
           FuncionesNS.vida=100;
           
           FuncionesNA.nombre="Puigdemont";
           FuncionesNA.velocidad=55;
           FuncionesNA.fuerza=30;
           FuncionesNA.percepcion=65;
           FuncionesNA.intuicion=50;
           FuncionesNA.vida=100;
           
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
           FuncionesPI.vida=100;
           
           FuncionesRJ.nombre="CabezaNuca";
           FuncionesRJ.vida=100;
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
            historia+="\n\n--------------Turno 1--------------\n Escuchamos todos un grito desde la calle.";
            historia+="\n"+FuncionesNS.nombre+": "+FuncionesNS.descripcionReaccion(turno,"esperar");
            historia+="\n"+FuncionesRJ.nombre+": "+FuncionesRJ.descripcionReaccion(turno,"esperar");
            historia+="\n"+FuncionesJLJM.nombre+": "+FuncionesJLJM.descripcionReaccion(turno,"mirar por la ventana",FuncionesJLJM.percepción);
            historia+="\n"+FuncionesPI.nombre+": "+FuncionesPI.descripcionReaccion(turno,"mirar por la ventana",FuncionesPI.percepcion);
            historia+="\n"+FuncionesJD.nombre+": "+FuncionesJD.descripcionReaccion(turno,"Mirar internet");
            historia+="\n"+FuncionesNA.nombre+": "+FuncionesNA.nombre+" avanza "+FuncionesNA.desplazamiento(FuncionesNA.velocidad)+" metros hacia el baño.\nEstás en la última fila de ordenadores del aula";

            turno++;
            
            historia+="\n\n--------------Turno 2--------------\n";
             historia+="Empezáis a escuchar más gente gritando. \nRick se da cuenta de que \nhay gente corriendo en dirección a calle comedias. ";
             historia+="\n"+FuncionesNS.nombre+": "+FuncionesNS.descripcionReaccion(turno,"Pregunto qué está pasando");
            historia+="\n"+FuncionesRJ.nombre+": "+FuncionesRJ.descripcionReaccion(turno,"mirar las noticias");
            historia+="\n"+FuncionesJLJM.nombre+": "+FuncionesJLJM.dondeLlego(FuncionesNA.desplazamiento(FuncionesJLJM.velocidad),"ventana");
           historia+="\n"+FuncionesPI.nombre+": "+FuncionesPI.descripcionReaccion(turno,"pregunto no se rick, parece falso");
            historia+="\n"+FuncionesJD.nombre+": "+FuncionesJD.descripcionReaccion(turno,"llamar a mis padres");
            historia+="\n"+FuncionesNA.nombre+": "+FuncionesNA.dondeLlego(FuncionesNA.desplazamiento(FuncionesNA.velocidad),"final del aula 5");

            turno++;
                historia+="\n\n--------------Turno 3--------------\n";
            historia+="Natalia sube a las aulas a decir que \ntodo el mundo fuera, que la gente está\n huyendo de algo que viene, que cree\n que es un loco que anda por ahí";
            historia+="\n"+FuncionesNS.nombre+": "+FuncionesNS.dondeLlego(FuncionesNA.desplazamiento(FuncionesNS.velocidad),"ventana");
            historia+="\n"+FuncionesRJ.nombre+": "+FuncionesRJ.dondeLlego(FuncionesNA.desplazamiento(FuncionesRJ.velocidad),"ventana");
            historia+="\n"+FuncionesJLJM.nombre+": "+FuncionesJLJM.dondeLlego(FuncionesNA.desplazamiento(FuncionesJLJM.velocidad),"Estás en mitad del aula");
            historia+="\n"+FuncionesPI.nombre+": "+FuncionesPI.dondeLlego(FuncionesNA.desplazamiento(FuncionesPI.velocidad),"ventana");
            historia+="\n"+FuncionesJD.nombre+": "+FuncionesJD.combate(FuncionesJD.nombre,"Natalia",FuncionesJD.fuerza,(byte)100,FuncionesJD.velocidad,(byte)40);
            historia+="\n"+FuncionesNA.nombre+": "+FuncionesNA.dondeLlego(FuncionesNA.desplazamiento(FuncionesNA.velocidad),"en el tablon");
            historia+="\n"+FuncionesA.nombre+": "+FuncionesA.descripcionReaccion(turno,"escuchar");
     
            turno++;
                historia+="\n\n--------------Turno 4--------------\n";
            historia+="Natalia yace inconsciente en el suelo del aula 5,\n por un golpe de "+FuncionesJD.nombre+".\n Los que están abajo en las escaleras\n ven mucha gente agolpada cerca de la puerta.";
            historia+="\n"+FuncionesNS.nombre+": "+FuncionesNS.descripcionReaccion(turno,"Coger nuestros abrigos");
            historia+="\n"+FuncionesRJ.nombre+": "+FuncionesRJ.descripcionReaccion(turno,"coger llaves de natalia junto a sam");
            historia+="\n"+FuncionesJLJM.nombre+": "+FuncionesJLJM.dondeLlego(FuncionesNA.desplazamiento(FuncionesJLJM.velocidad),"Estás en la puerta");
            historia+="\n"+FuncionesPI.nombre+": "+FuncionesPI.descripcionReaccion(turno,"Consultar redes sociales");
            historia+="\n"+FuncionesJD.nombre+": "+FuncionesJD.descripcionReaccion(turno,"coger llaves de natalia junto a cabezanuca");
            historia+="\n"+FuncionesNA.nombre+": "+FuncionesNA.dondeLlego(FuncionesNA.desplazamiento(FuncionesNA.velocidad),"en mitad de la escalera");
            historia+="\n"+FuncionesA.nombre+": "+FuncionesA.descripcionReaccion(turno,"preguntar que pasa");
     
            turno++;
                historia+="\n\n--------------Turno 5--------------\n";
                historia+=((recibeNotificación(FuncionesJD.percepcion)?FuncionesJD.nombre+" nota que le vibra el teléfono ":""))+"\n";
                historia+=((recibeNotificación(FuncionesJLJM.percepción)?FuncionesJLJM.nombre+" nota que le vibra el teléfono ":""))+"\n";
                historia+=((recibeNotificación(FuncionesNS.percepcion)?FuncionesNS.nombre+" nota que le vibra el teléfono ":""))+"\n";
                historia+=((recibeNotificación(FuncionesNA.percepcion)?FuncionesNA.nombre+" nota que le vibra el teléfono ":""))+"\n";
                historia+=((recibeNotificación(FuncionesA.percepcion)?FuncionesA.nombre+" nota que le vibra el teléfono ":""))+"\n";
                historia+=((recibeNotificación(FuncionesRJ.percepcion)?FuncionesRJ.nombre+" nota que le vibra el teléfono ":""))+"\n";
                
                historia+="\n"+FuncionesA.nombre+": "+FuncionesA.descripcionReaccion(turno,"ayudar")+"\n";
                historia+=FuncionesJD.dondeLlego (FuncionesNA.desplazamiento(FuncionesJD.velocidad),"mitad del aula")+"\n";
                historia+=FuncionesNS.nombre+": "+FuncionesNS.dondeLlego (FuncionesNA.desplazamiento(FuncionesNS.velocidad),"ventana")+" y veis el mensaje";
                historia+="\n"+FuncionesNA.nombre+": "+FuncionesNA.dondeLlego(FuncionesNA.desplazamiento(FuncionesNA.velocidad),"mitad del pasillo 1º planta");
                historia+="\n"+FuncionesJLJM.nombre+": "+FuncionesJLJM.dondeLlego(FuncionesNA.desplazamiento(FuncionesJLJM.velocidad),"Estás en medio de las escaleras")+" y veis el mensaje";
                historia+="\n"+FuncionesPI.nombre+": "+FuncionesJD.combate(FuncionesPI.nombre,FuncionesRJ.nombre,FuncionesPI.fuerza,FuncionesRJ.fuerza,FuncionesPI.velocidad,FuncionesRJ.velocidad);
                FuncionesPI.vida-=50;
               historia+="\n"+FuncionesRJ.nombre+": "+FuncionesRJ.dondeLlego (FuncionesNA.desplazamiento(FuncionesJD.velocidad),"mitad del aula")+"\n";
            
                turno++;
                historia+="\n\n--------------Turno 6--------------\n";
                historia+="Puigdemont va a salir a la calle, y a la misma vez un hombre con pinta de asustado\n empuja la puerta para entrar.\n"
                        + "El empujón por fuera y por dentro se anulan, y la puerta no se abre.\n Rick nota ruido abajo. \n---------------\n";
                       historia+="\n"+FuncionesNA.nombre+": "+FuncionesNA.descripcionReaccion(turno,"abrimos la puerta y preguntamos qué pasa"); //El hombre que estaba fuera intenta empujaros y os grita "¡Déjame entrar!¡Déjame entrar!"
                       historia+="\n"+FuncionesJLJM.nombre+": "+FuncionesJLJM.dondeLlego(FuncionesNA.desplazamiento(FuncionesJLJM.velocidad),"primera planta"); //si distancia es menor que 3, estoy a la altura de secretaria, si es más, estoy en la puerta
                       historia+="\n"+FuncionesNS.nombre+": "+FuncionesNS.dondeLlego(FuncionesNA.desplazamiento(FuncionesNS.velocidad), "mitad de clase"); //Igual que funcionesRJ
                       historia+="\n"+FuncionesJD.nombre+": "+FuncionesJD.dondeLlego(FuncionesNA.desplazamiento(FuncionesJD.velocidad),"en la puerta hacia el gallinero"); //que imprima "llegáis a la puerta del gallinero"
                      historia+="\n"+FuncionesRJ.nombre+": "+FuncionesRJ.dondeLlego(FuncionesNA.desplazamiento(FuncionesRJ.velocidad),"puerta del aula"); //que imprima "llegáis a la puerta del gallinero"
                      
                
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
    
   public static boolean recibeNotificación(byte percepcion){
       if(percepcion>=50){
           return true;
       }
       return false;
   }

    
}

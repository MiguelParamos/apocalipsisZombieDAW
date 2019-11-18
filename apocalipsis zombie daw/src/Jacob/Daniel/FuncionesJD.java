/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jacob.Daniel;

/**
 * Funcion del personaje con sus parámetros.
 *
 * @author Daniel
 * @author Jacob
 * @version 0.1
 * @since 0.1
 */
public class FuncionesJD {

    public static String nombre; //Nombre del personaje.
    public static byte velocidad; //Velocidad del personaje.
    public static byte fuerza; //Fuerza de personaje.
    public static byte intuicion; //Intuicion del personaje.
    public static byte percepcion; //Percepcion del personaje.

    public static String descripcionReaccion(byte turno, String accion) {

        if (turno == 1 && accion.equals("Mirar internet")) {
            System.out.println("No encuentro nada anormal");
            return "No veo nada anormal";
        } else {
            if (turno == 2 && accion.equals("llamar a mis padres")) {
                System.out.println("Mis padres no saben nada raro");
                return "No saben nada raro";
            }
            return "";
        }
    }

    public static int combate(byte turno, String accion, byte velocidad,
            byte fuerza, byte velocidad2, byte fuerza2, String Natalia) {

        velocidad2 = 40;
        fuerza2 = 100;
        if (FuncionesJD.velocidad > velocidad2) {
            System.out.println(FuncionesJD.nombre + "golpea a " + Natalia);
            return fuerza2 - FuncionesJD.fuerza;
        } else {
            System.out.println(Natalia + " golpea a" + FuncionesJD.nombre);
            return fuerza2 - FuncionesJD.fuerza;
        }
    }
}

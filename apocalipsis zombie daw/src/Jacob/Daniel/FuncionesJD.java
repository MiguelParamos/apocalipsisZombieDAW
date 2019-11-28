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
    public static byte vida; //Vida del personaje.
    public static byte punteria;//Puntería del personaje

    public static String descripcionReaccion(byte turno, String accion) {

        if (turno == 1 && accion.equals("Mirar internet")) {
            System.out.println("No encuentro nada anormal");
            return "No veo nada anormal";
        } else {
            if (turno == 2 && accion.equals("llamar a mis padres")) {
                System.out.println("Mis padres no saben nada raro");
                return "No saben nada raro";
            }else{
                if (turno== 4 && accion.equals("coger llaves de natalia junto a cabezanuca")){
                    return FuncionesJD.nombre+" ha cogido las llaves junto a Cabezanuca.";
                }else{
                if (turno== 7 && accion.equals("intento abrir el gallinero con las llaves de Natalia")){
                    return FuncionesJD.nombre+" La llave no abre la puerta.";
                }

            }
            return "";
        }
    }
}
    public static String combate(String nombre1,String nombre2,byte fuerza1,byte fuerza2,byte velocidad1 ,byte velocidad2) {
        if (velocidad1 > velocidad2) {
            return nombre1 + " golpea a "+nombre2+" y pierde "+Math.abs(fuerza2 - fuerza1)+" de vida";
        } else {
            System.out.println(nombre2+" golpea a" + nombre1);
            return nombre2 + " golpea a "+nombre1+" y pierde "+Math.abs(fuerza2 - fuerza1)+" de vida";
        }
    
   }
public static String dondeLlego (int distancia,String mensaje){
        
        if(distancia>=3){
            switch(mensaje){
                case "ventana": return "Estoy en mitad del aula";
                     
                case "mitad del aula": return "Estoy en la puerta";
                
                case "en la puerta": return "He bajado las escaleras, estoy en la 1ª planta";
                    
                case "en el tablon": return "He bajado las escaleras, estoy en la 1ª planta"; 
                
                case "en la puerta hacia el gallinero": return "Estoy en la puerta del gallinero";
                
                case "puerta del gallinero": return "Estoy en mitad de las escaleras";
            }
        }else{
            switch(mensaje){
                case "ventana": return "Voy por la fila 3";
                     
                case "mitad del aula": return "Voy por la ultima fila";
                
                case "en la puerta": return "Voy por mitad de las escaleras";
                    
                case "en el tablon": return "Voy por mitad de las escaleras"; 
                    
                case "en la puerta hacia el gallinero": return "Estoy en la puerta hacia el gallinero"; 
                
                case "puerta del gallinero": return "Estoy en el principio de las escaleras";
            }
        }
        return "";
    }


}


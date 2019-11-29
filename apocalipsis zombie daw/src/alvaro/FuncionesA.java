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
    public static byte vida= 100; //Puesta a mano por miguel
    public static byte punteria;//Punteria del pèrsonaje entre 0 y 100 (24)
    
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
            }else if(turno==7&&accion.equals("miro el mensaje")){
                return("Ahora que tengo las manos libres, cojo el teléfono que estaba sonando.");
            }else if(turno==8&&accion.equals("miro el mensaje")){
                return("Ahora que tengo las manos libres, cojo el teléfono que estaba sonando.");
            }
        return "";
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
                case "ventana":
                    return "Estoy en mitad del aula";
                case "mitad del aula":
                    return "Estoy en la puerta";
                case "en la puerta":
                    return "He bajado las escaleras, estoy en la 1ª planta";
                case "en el tablon":
                    return "He bajado las escaleras, estoy en la 1ª planta"; 
                case "en la puerta hacia el gallinero":
                    return "Estoy en la puerta del gallinero"; 
            }
        }else{
            switch(mensaje){
                case "ventana":
                    return "Voy por la fila 3";
                case "mitad del aula": 
                    return "Voy por la ultima fila";
                case "en la puerta":
                    return "Voy por mitad de las escaleras";
                case "en el tablon":
                    return "Voy por mitad de las escaleras"; 
                case "en la puerta hacia el gallinero":
                    return "Estoy en la puerta hacia el gallinero"; 
            }
        }
        return"";
    }
}



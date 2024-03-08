import java.util.Scanner;
/**
 Tarea documentada por Adrián Lourido Prieto
 Este programa simula una interación con un personaje ficticio
 @autor: Adrián Lourido Prieto
 @date: 08/03/24
 */

 public class Videojuego {
 

    public static void main(String[] args) {

        /* Inicializamos unas variable donde dependiendo de lo que haga el usuario cambiarán su valor */
        
        /* Instanciamos una variable de tipo Scanner que recolecta lo que seleccione el usuario a través del teclado */
        Scanner leer = new Scanner(System.in);
        int opcion;
        int numero;

        System.out.println("Bienvenido, está hablando con Linx -_-, en que puedo ayudarte:");
        System.out.println("1-Saludar");
        System.out.println("2-Golpear");
        System.out.println("3-Saltar");
        System.out.println("4-Beber vodka");
        opcion = leer.nextInt();

        /* Dependiendo de la opción del usuario mostrará una cosa o otra */
        switch (opcion) {
            case 1:
            /**
                Esta opción imprime un saludo
             
             */
                System.out.println("Hola soy Linx º_º");
                break;
            
            case 2:

            /**
                Esta opcion imprime cuantas veces quiso golpear al usuario
                @param numero Es el numero que coloca el usuario para golpear el objecto
             
             */

                System.out.println("Cuantas veces quieres golpear al muñeco de pruebas:");
                numero = leer.nextInt();
                System.out.println("Golpeaste "+numero+" veces al muñeco de pruebas.(No es Linx)");
                break;
            case 3:
                System.out.println("HOP");
            break;
            
            case 4:

            /**
                Esta opcion imprime distinta respuesta dependiendo de cuanto quiso beber el usuario
                @param: numero Es el numero que coloca el usuario para beber el vodka
             
             */
                System.out.println("Cuanto tragos quieres beber");
                numero = leer.nextInt();
                if( numero >2 ){
                    System.out.println("Glup Glup, ... EPAAAAAAAAA");
                } else { System.out.println("Glup glup glup, rico");}
            break;

            default:
            System.out.println("SIU");
            break;
        }

    }
 }
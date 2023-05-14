package Semana1;
import java.util.Scanner;
public class juego {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //Inicializacion variables jugadas, puntajes y resultado

            String jugada1 = "";
            String jugada2 = "";
            int puntaje1 = 0;
            int puntaje2 = 0;
            int resultado = 0;

//Pedir nombre ambos jugadores y guardas en variables

            System.out.println("Nombre Jugador 1");
            String nombre = scanner.nextLine();

            System.out.println("Nombre Jugador 2");
            String nombre2 = scanner.nextLine();

//Ingresar jugada Jugador1

            System.out.println("Ingresa Opcion Jugador 1 (piedra, papel o tijeras)");
            jugada1 = scanner.nextLine();

//Si jugador 1 ingresa "*" termina el programa
            while(!jugada1.equals("*")){

                //Jugada jugador 2
                System.out.println("Ingresa Opcion Jugador 2 (piedra, papel o tijeras)");
                jugada2 = scanner.nextLine();

                //Funcion que da el resultado entre Jugador 1 vs Jugador 2
                resultado = (cualGana(jugada1, jugada2));

                //Reparto de puntos segun ganador
                if(resultado == 1){
                    System.out.println("Gana " +nombre);
                    puntaje1 ++;
                }else if(resultado == 2){
                    System.out.println("Gana "+ nombre2);
                    puntaje2 ++;
                }

                //Imprimir Marcador
                System.out.println("\nMarcador: " + nombre + " = " +puntaje1 + " v/s "+ puntaje2 + " = " +nombre2);

                System.out.println("\nIngresa Opcion Jugador 1");
                jugada1 = scanner.nextLine();

            }

            System.out.println("END");

        }

        public static int cualGana(String jugada1, String jugada2){
            Scanner scanner = new Scanner(System.in);
            int ganador = 0;

            if(jugada1.equals(jugada2)){
                ganador = 0;

            }else if((jugada1.equals("tijeras") && jugada2.equals("piedra")) || (jugada1.equals("papel") && jugada2.equals("tijeras")) || (jugada1.equals("piedra") && jugada2.equals("papel"))){
                ganador = 2;

            }else if((jugada1.equals("piedra") && jugada2.equals("tijeras")) || (jugada1.equals("tijeras") && jugada2.equals("papel")) || (jugada1.equals("papel") && jugada2.equals("piedra"))){
                ganador= 1;
            }
            return ganador;
        }

    }



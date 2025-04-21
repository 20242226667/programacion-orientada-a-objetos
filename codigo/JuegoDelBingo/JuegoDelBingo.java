package JuegoDelBingo;
import java.util.Scanner;

public class JuegoDelBingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos jugadores? ");
        int n = sc.nextInt();

        ICarton[] jugadores = new ICarton[n];
        for (int i = 0; i < n; i++) {
            jugadores[i] = new CartonBingo();
        }

        boolean[] bolasSacadas = new boolean[61]; // del 1 al 60
        boolean hayGanador = false;

        while (!hayGanador) {
            int bola;
            do {
                bola = (int)(Math.random() * 60) + 1;
            } while (bolasSacadas[bola]);
            bolasSacadas[bola] = true;

            System.out.println("\nBola extraída: " + bola);

            for (int i = 0; i < n; i++) {
                boolean acierto = jugadores[i].comprobarNumero(bola);
                if (acierto) {
                    System.out.println("Jugador " + (i + 1) + " ha tachado el número.");
                }

                if (jugadores[i].estaCompleto()) {
                    System.out.println("\n🎉 ¡Jugador " + (i + 1) + " ha ganado el Bingo!");
                    hayGanador = true;
                    break;
                }
            }
        }

        System.out.println("\nCartones finales:");
        for (int i = 0; i < n; i++) {
            System.out.print("Jugador " + (i + 1) + ": ");
            jugadores[i].mostrarCarton();
        }

        
    }
}
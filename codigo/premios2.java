import java.util.Scanner;

public class premios2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, participantes;
        int contador = 1;
        System.out.println("Ingrese la cantidad de participantes: ");
        participantes = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= participantes; i++) {
            System.out.println("participante " + i + "  Ingresa un numero del 1 al 10: ");
            numero = sc.nextInt();
            sc.nextLine();
            switch (numero) {
                case 1:
                    System.out.println("Felicidades ganaste un gato");
                    break;
                case 2:
                    System.out.println("Felicidades gaanste un cerdito");
                    i++;
                    break;
                case 5:
                    System.out.println("Felicidades ganaste una vaca");
                    break;
                case 8:
                    System.out.println("Felicidade ganaste un perrito");
                    break;
                default:
                    System.out.println("Perdiste, Intentalo de nuevo");
                    break;
            }
        }
    }
}

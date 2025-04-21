import java.util.Scanner;

/* una persona quiere recordar diez numeros pero no sabe donde guardarlos, crea una matriz que pueda almacenar esos datos  */
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double matriz[] = new double[10];
        int contador = 0;
        System.out.println("Ingresa los diez datos ");
        while (contador < 10) {
            double numeros = sc.nextDouble();
            sc.nextLine();
            matriz[contador]=numeros;//contador=0  matriz[0];  contador=1 matriz[1];
            contador++; 
        }
        contador=0;
        System.out.println("los numeros guardados son : ");
        while (contador<10) {
            System.out.println(matriz[contador]);
            contador++;
        }
        

    }
    
}

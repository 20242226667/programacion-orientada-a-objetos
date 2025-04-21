import java.util.Scanner;
/* crea una matriz que tenga una cantida de 30 numeros aleatorios y la muestre */
public class random {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double matriz[]=new double[30];// matriz[]=vector matriz[][]=matriz 
        int contador=0;
        while (contador<30) {
            matriz[contador]=Math.random()*100+1;// este comando acepta double
            System.out.println(matriz[contador]);// se imprime la matriz a la vez que se llena la matriz en la linea anterior 
            contador++;
        }
        int mateo=spiderman();
    }
    public static int spiderman() {
        int suma=56+75;
        return suma;
    }
    public static double bisonte() {
        double resta=456.432-234.34;
        return resta;
    }
    public static String mateos() {
        String mateo="mateo";
        return mateo;
    }
}

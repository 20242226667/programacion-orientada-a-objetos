/* En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.*/

import java.util.Scanner;

public class VentaComputadores {

    public static void main(String[] args) {
        double  descuento, total;
        System.out.println("Ingrese la cantidad de computadoras que se van a comprar :");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        sc.nextLine();

        if (i<5) {
            descuento=(i*500)*0.1;
            total=(i*500)-descuento; 
        }
        else{
            if (i>=10) {
              
                descuento=(i*500)*0.4;
                total=(i*500)-descuento;
            }
            else{
                descuento=(i*500)*0.2;
                total=(i*500)-descuento;
            }
        }
        System.out.println("Descuento que se le aplica a la compra  : "+descuento);
        System.out.println("El total a pagar : "+total);
        }
}
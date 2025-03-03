/* En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra. */

import java.util.Scanner;

public class PromocionMarcaPinchadas {
       public static void main(String[] args) {
        double  preciolla, total;
        System.out.println("Ingrese la cantidad de llantas que se van a comprar :");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        sc.nextLine();

        if (i<5) {
            preciolla =100;
            total=i*preciolla; 
        }
        else{
            if (i>10) {
              
                preciolla =50;
                total=i*preciolla;
            }
            else{
                preciolla =75;
                total=i*preciolla;
            }
        }
        System.out.println("El precio de cada llanta es de   : "+preciolla);
        System.out.println("El total a pagar es de : "+total);
        }
    }

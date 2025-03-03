/*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2 0%
2.01 - 5 10%
5.01 - 10 15%
10.01 en adelante 20% */

import java.util.Scanner;

public class VentaFruteria {
    public static void main(String[] args) {
        double  precio, total,valor;

        
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el valor de un kilos de manzana :");
        precio=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese los kilos de manzana que se van a comprar :");
        int i=sc.nextInt();
        sc.nextLine();

        if (i<=2) {
            total=(i*precio);
        }
        else{
            if (i<=5) {
                valor=i*precio;
                total=valor-(valor*0.1);
            }
            else{
                if (i>10) {
                    valor=i*precio;
                    total=valor-(valor*0.2);
                }
                else{
                     valor=i*precio;
                     total=valor-(valor*0.15);
                    }
                }
            }
            System.out.println("El precio de un kilos de manzana   : "+precio);
        System.out.println("El total a pagar es de : "+total);
        }
        
    }


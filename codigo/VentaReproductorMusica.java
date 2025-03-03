/*Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19%. */

import java.util.Scanner;

public class VentaReproductorMusica {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double descuento, total, i, total2 , IVA, totalfinal;
        String marca, nosy="NOSY";
        System.out.println("Ingrese la marca del producto :");
        marca=sc.nextLine();
        System.out.println("Ingrese el precio del producto : ");
        i=sc.nextInt();
        sc.nextLine();
        boolean resultado = marca.toUpperCase().equals(nosy);
        if (i>=500) {
            total=i-(i*0.1);
        }
        else{
            total=i;
        }
        if (resultado==true) {
            total2=total-(total*0.05);
            totalfinal=total2+(total2*0.19);
        }
        else{
            totalfinal=total+(total*0.19);
        }
        System.out.println("El precio del producto es de : "+totalfinal);

    }
}

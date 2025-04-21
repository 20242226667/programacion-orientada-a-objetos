/*15. Una clínica de maternidad necesita un sistema para determinar cuántos bebés han nacido
recientemente. Dicho sistema solicita al usuario capturar la cantidad de nacimientos (N), el
nombre de cada bebé y su sexo (implemente un ciclo do-while para validar la captura, siendo M

para masculino y F para femenino). Al final, debe imprimir la cantidad de bebés de cada sexo. */

import java.util.Scanner;

public class NacimientoHospital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,hombres=0 ,mujeres=0 ;
        System.out.println("ingrese la cantidad de recien nacidos : ");
        int rn=sc.nextInt();
        sc.nextLine();
        String nacidos []=new String[rn];
        String sexo1 []=new String[rn];
        
        while (i<rn) {
            System.out.println("Ingrese el sexo del recien nacido "+i);
            System.out.println("F o M");
            String sexo=sc.nextLine();
            if (sexo.toUpperCase().equals("F")) {
                System.out.println("Ingrese el nombre del recien nacido ");
                nacidos[i]=sc.nextLine();
                sexo1[i]=sexo.toUpperCase();
                hombres=hombres+1;
                i++;
            }
            else{
                System.out.println("Ingrese el nombre de la recien nacida ");
                nacidos[i]=sc.nextLine();
                sexo1[i]=sexo.toUpperCase();
                mujeres=mujeres+1;
                i++;
            }

        }
        System.out.println("cantidad de recien nacidos hombres :   "+hombres+"      mujeres :  "+mujeres);
        i=0;
        while (i<rn) {
            System.out.println("recien nacido :   "+(i+1)+"  nombre :   "+nacidos[i]+"   sexo :   "+sexo1[i]);
            i++;
        }


    }
}

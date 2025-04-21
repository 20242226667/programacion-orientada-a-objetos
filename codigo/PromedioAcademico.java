import java.util.Scanner;
public class PromedioAcademico {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
         double total;
         total=Promedio();
         System.out.println("El valor de la matricula del estudiantes es : "+total);
    }
    public static double Promedio() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int h = 0;
        int j = 0;
        int k=0;
        double credito=0;
        while (i < 1) {
            System.out.println("El estudiante es 1. tecnologico  2. profecional   :  ");
            int test = sc.nextInt();
            sc.nextLine();
            switch (test) {
                case 1:
                    while (h < 1) {
                        System.out.println(
                                "el promedio del estudiante es  1: 9.5 o más  2: mayor o igual a 9 pero menor que 9.5  3: mayor que 7 y menor que 9  4: 7 o menor,");
                        int promedio = sc.nextInt();
                        sc.nextLine();
                        switch (promedio) {
                            case 1:
                              credito = ((55 / 5) * 18000) * 0.75;
                                h++;
                                break;
                            case 2:
                                credito = ((50 / 5) * 18000) * 0.90;
                            h++;
                                break;
                            case 3:
                                credito = (50 / 5) * 18000;
                                h++;
                                break;
                            case 4:
                                while (j < 1) {
                                    System.out
                                            .println("el estudiante perdio  1: de 0 a 3 materias  2: de 4 o más materias");
                                    int materisa = sc.nextInt();
                                    sc.nextLine();
                                    switch (materisa) {
                                        case 1:
                                            credito = (45 / 5) * 18000;
                                            j++;
                                            break;
                                        case 2:
                                            credito = (40 / 5) * 18000;
                                            j++;
                                            break;
                                        default:
                                            System.out.println("ingrese un valor valido ");
                                            break;
                                    }
                                }
                                h++;
                                break;
                            default:
                                System.out.println("ingrese un valor valido ");
                                break;
                        }
                    }
                    i++;
                    break;
                case 2:
                    while (k<1) {
                        System.out.println(
                            "el promedio del estudiante es  1: mayor o igual a 9.5  2: menor de 9.5 ");
                    int promedio = sc.nextInt();
                    sc.nextLine();
                        switch (promedio) {
                            case 1:
                              credito = ((55 / 5) * 30000)*0.8;
                                k++;
                                break;
                            case 2:
                                credito = (55 / 5) * 30000;
                                k++;
                                break;
                            default:
                                System.out.println("ingrese un valor valido ");
                                break;
                        }
                    }
                    i++;
                    break;
                default:
                    System.out.println("ingrese un valor valido ");
                    break;
            }
        }
        return credito;
    }
}


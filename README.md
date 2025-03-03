# desarrollo de codigo de proyectos

## codigo de taller #1
**LoteriaSuper.java **
Un supermercado realiza una tómbola con todos los clientes, si son hombres tienen que sacar
de una canasta una bolita la cual tiene un número grabado y si son mujeres lo mismo pero de
otra canasta, los premios se dan bajo la siguiente tabla:
HOMBRES 
# Bolita   Premio 
1          Desodorante 
2          Six-Pack de cerveza 
3          Camiseta 
4          Pantaloneta 
5          Sudadera 
MUJERES
 # bolita   Premio
1           Loción 
2           Bikini 
3           Crema para la cara 
4           Plancha para el cabello 
5           Esmal
```java

import java.util.Scanner;

public class LoteriaSuper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eres hombre o mujer ");
        String g=sc.nextLine();
        System.out.println("Ingrese la numero de la bola que saco ");
        int v=sc.nextInt();
        sc.nextLine();
        boolean resultado=g.toUpperCase().equals("HOMBRE");
        if (resultado==true) {
            switch (v) {
                case 1:
                    System.out.println("Felicidades es el ganador de un Desodorante ");
                    break;
                case 2:
                    System.out.println("Felicidades es el ganador de un Six-Pack de cerveza ");
                    break;
                case 3:
                    System.out.println("Felicidades es el ganador de una Camiseta");
                    break;
                case 4:
                    System.out.println("Felicidades es el ganador de una Pantaloneta"); 
                    break;
                case 5:
                    System.out.println("Felicidades es el ganador de una Sudadera");   
                    break;
                default:
                     System.out.println("Lastimosamente no se gano nada ");
            }
        }else{
            switch (v) {
                case 1:
                    System.out.println("Felicidades es la ganadora de una Loción");
                    break;
                case 2:
                    System.out.println("Felicidades es la ganadora de un Bikini"); 
                    break;
                case 3:
                    System.out.println("Felicidades es la ganadora de una  Crema para la cara  ");
                    break;
                case 4:
                    System.out.println("Felicidades es la ganadora de una Plancha para el cabello "); 
                    break;
                case 5:
                    System.out.println("Felicidades es la ganadora de un Esmalte de uñas"); 
                    break;
                default:
                   System.out.println("Lastimosamente no se gano nada ");
            }

        }
        
        
    }
}


```

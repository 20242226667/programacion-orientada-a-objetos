//toca sacar el promedio de temperatura al año, mensuales, cual fue la temperatura minima y maxima del año, tambien de cada mes 
import java.util.Scanner;

public class temperraturas {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Menú para seleccionar el tipo de carro
            System.out.println("Seleccione el tipo de carro:");
            System.out.println("1. Auto");
            System.out.println("2. SUV");
            System.out.println("3. Camioneta");
            System.out.print("Ingrese su opción (1-3): ");
            int tipoCarro = scanner.nextInt();
            
            String tipoSeleccionado = "";
            
            // Estructura de selección múltiple para el tipo de carro
            switch (tipoCarro) {
                case 1:
                    tipoSeleccionado = "Auto";
                    break;
                case 2:
                    tipoSeleccionado = "SUV";
                    break;
                case 3:
                    tipoSeleccionado = "Camioneta";
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return; // Salir del programa si la opción es inválida
            }
            
            // Menú para seleccionar el color
            System.out.println("Seleccione el color:");
            System.out.println("1. Negro");
            System.out.println("2. Blanco");
            System.out.println("3. Rojo");
            System.out.print("Ingrese su opción (1-3): ");
            int colorCarro = scanner.nextInt();
            
            String colorSeleccionado = "";
            
            // Estructura de selección múltiple para el color
            switch (colorCarro) {
                case 1:
                    colorSeleccionado = "Negro";
                    break;
                case 2:
                    colorSeleccionado = "Blanco";
                    break;
                case 3:
                    colorSeleccionado = "Rojo";
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return; // Salir del programa si la opción es inválida
            }
            
            // Mostrar la selección realizada
            System.out.println("Usted ha seleccionado un " + tipoSeleccionado + " de color " + colorSeleccionado + ".");
            
            
    }
    
        
    }


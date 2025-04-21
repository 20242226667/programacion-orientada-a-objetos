import java.util.Scanner;

public class arreglo {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int i=0;
    String carro="", color=""; 
    while (i<1) {
    System.out.println("Seleccione el tipo de carro: 1. Auto   2. SUV   3. Camioneta");
    int tipocarro=sc.nextInt();
    sc.nextLine();
    switch (tipocarro) {
        case 1:
            carro="auto";
            color=listadecolores();
            i++;
            break;
        case 2:
            carro="SUV";
            color=listadecolores();
            i++;
            break;
        case 3:
            carro="Camioneta";
            color=listadecolores();
            i++;
            break;
            
    
        default:
        System.out.println("El numero ingresado no es valido");
            break;
    }
} 
System.out.println("La seleccion es la siguiente: Tipo de Carro: " +carro+ " Tipo de Color: " +color);

    
} 
public static String listadecolores() {
   Scanner sc=new Scanner(System.in);
    int i=0;
    String autocolor="";
    while (i<1) {
        System.out.println("Seleccione el color del carro: 1. Negro  2. Blanco  3. Rojo");
        int color=sc.nextInt();
        sc.nextLine();
        switch (color) {
            case 1 :
                autocolor="negro";
                i++;
                break;
            case 2 :
                autocolor="blanco";
                i++;
                break; 
            case 3 :
                autocolor="rojo";
                i++;
                break;
        
            default: 
            System.out.println("El numero ingresado no es valido");
                break;  
    }
    
    }
    return autocolor;
}

}
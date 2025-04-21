package JuegoDelBingo;

public class CartonBingo implements ICarton {
    private int[] numeros;
    private boolean[] tachados;

    public CartonBingo() {
        numeros = new int[15];
        tachados = new boolean[15];
        rellenarCarton();
    }


    public void rellenarCarton() {
        int count = 0;
        while (count < 15) {
            int num = (int)(Math.random() * 60) + 1;
            boolean repetido = false;
            for (int i = 0; i < count; i++) {
                if (numeros[i] == num) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                numeros[count] = num;
                count++;
            }
        }
    }

    public boolean comprobarNumero(int numero) {
        for (int i = 0; i < numeros.length; i++) {// numeros.length: es para saber cuántas columnas hay en una fila
            if (numeros[i] == numero) {
                tachados[i] = true;
                return true;
            }
        }
        return false;
    }


    public boolean estaCompleto() {
        for (boolean t : tachados) {
            if (!t) return false;
        }
        return true;
    }

  
    public void mostrarCarton() {
        for (int i = 0; i < numeros.length; i++) {
            if (tachados[i]) {
                System.out.print("[" + numeros[i] + "] ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();
    }
}


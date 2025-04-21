package JuegoDelBingo;

public interface ICarton {
    void rellenarCarton();
    boolean comprobarNumero(int numero);
    boolean estaCompleto();
    void mostrarCarton();
}

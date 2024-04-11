import FuncionamientoApp.*;
import InterfazGrafica.*;
import BibliotecaDePrueba.IniciarBiblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Reproductor reproductor = new Reproductor(IniciarBiblioteca.iniciarBiblioteca(biblioteca));
        reproductor.setVisible(true);
    }
}
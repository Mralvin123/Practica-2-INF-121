package Ejercicio3;

public class App {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 747", "Boeing");

        avion.agregarParte(new Parte("Motor", 1800.0));
        avion.agregarParte(new Parte("Alas", 2500.5));
        avion.agregarParte(new Parte("Tren de aterrizaje", 800.3));

        avion.mostrarAvion();
    }
}

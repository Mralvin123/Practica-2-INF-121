package ejercicio1;

public class Habitacion {
    private String nombre;
    private double tamano;

    public Habitacion(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public void mostrarInfo() {
        System.out.println("Habitación: " + nombre + " | Tamaño: " + tamano + " m²");
    }
}

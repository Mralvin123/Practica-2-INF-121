package Ejercicio1java;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precioBase;

    public Vehiculo(String marca, String modelo, int anio, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    public void mostrarInfo() {
        System.out.printf("Marca: %s, Modelo: %s, Año: %d, Precio Base: %.2f\n",
                marca, modelo, anio, precioBase);
    }

    public int getAnio() {
        return anio;
    }
}

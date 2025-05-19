package Ejercicio1java;


public class Coche extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    public Coche(String marca, String modelo, int anio, double precioBase, int numPuertas, String tipoCombustible) {
        super(marca, modelo, anio, precioBase);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.printf("Puertas: %d, Combustible: %s\n", numPuertas, tipoCombustible);
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}


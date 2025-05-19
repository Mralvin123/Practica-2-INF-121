package ejercicio3;

public class Estudiante extends Persona {
    private String ru;
    private String fechaIngreso;
    private int semestre;

    public Estudiante() {
        super();
        this.ru = "";
        this.fechaIngreso = "";
        this.semestre = 0;
    }

    public Estudiante(String ci, String nombre, String apellido, String celular, String fechaNac,
                      String ru, String fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.printf("RU: %s, Fecha Ingreso: %s, Semestre: %d\n", ru, fechaIngreso, semestre);
    }
}

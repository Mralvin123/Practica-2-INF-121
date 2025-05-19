package ejercicio3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected LocalDate fechaNac;

    public Persona() {
        this.ci = "";
        this.nombre = "";
        this.apellido = "";
        this.celular = "";
        this.fechaNac = LocalDate.now();
    }

    public Persona(String ci, String nombre, String apellido, String celular, String fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.fechaNac = LocalDate.parse(fechaNac, fmt);
    }

    public int getEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public String getApellido() {
        return apellido;
    }

    public void mostrar() {
        System.out.printf("CI: %s, Nombre: %s %s, Celular: %s, Fecha Nac: %s, Edad: %d\n",
                ci, nombre, apellido, celular, fechaNac, getEdad());
    }
}


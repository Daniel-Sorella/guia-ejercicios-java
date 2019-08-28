package Ejercicio2;

public class Administrativo extends Empleado {

    private int horasExtra;
    private int horasMes;

    public Administrativo(String dni, String nombre, String apellido, String email, float sueldoBase, int horasExtra, int horasMes) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.horasExtra = horasExtra;
        this.horasMes = horasMes;
    }

    @Override
    public float getSueldo() {
        return getSueldoBase() * (horasExtra * 1.5f + horasMes) / horasMes;
    }
}

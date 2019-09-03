package Ejercicio32;

public class Empleado {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String fechaDeContrato;

    public Empleado(String nombre, String apellido, String fechaDeNacimiento, String fechaDeContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.fechaDeContrato = fechaDeContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getFechaDeContrato() {
        return fechaDeContrato;
    }

    public void setFechaDeContrato(String fechaDeContrato) {
        this.fechaDeContrato = fechaDeContrato;
    }
}

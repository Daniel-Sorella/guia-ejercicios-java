package Ejercicio32;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String anioFundacion;

    private List<Empleado> empleados;

    public Empresa(String nombre, String anioFundacion) {
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(String anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void aniadirEmpleados(Empleado e) {
        empleados.add(e);
    }

    public boolean trabajaAca(Empleado e) {

        return empleados.contains(e);
    }
}

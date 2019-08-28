package Ejercicio2;

import java.util.Objects;

public class Vendedor extends Empleado {

    private float porcentaje;
    private float totalVenta;

    public Vendedor(String dni, String nombre, String apellido, String email, float sueldoBase, float porcentaje, float totalVenta) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.porcentaje = porcentaje;
        this.totalVenta = totalVenta;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public float getTotalVenta() {
        return totalVenta;
    }

    @Override
    public float getSueldo() {
        return getSueldoBase() + (porcentaje*totalVenta / 100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vendedor)) return false;
        Vendedor vendedor = (Vendedor) o;
        return Float.compare(vendedor.getPorcentaje(), getPorcentaje()) == 0 &&
                Float.compare(vendedor.getTotalVenta(), getTotalVenta()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPorcentaje(), getTotalVenta());
    }
}
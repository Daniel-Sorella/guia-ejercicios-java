package Ejercicio2;

import Ejercicio2.Administrativo;
import Ejercicio2.Empleado;
import Ejercicio2.Vendedor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static org.testng.Assert.*;

public class EmpleadoTest {

    private List<Empleado> empleados;

    @BeforeTest
    public void setup() {
        empleados = new LinkedList<>();

        Empleado vendedor1 = new Vendedor("1221",
                "J" , "P",
                "@@@", 1000,20, 40);

        Empleado vendedor2 = new Vendedor("1321",
                "H" , "O",
                "@@", 2000, 30, 50);

        Empleado administrativo = new Administrativo("4242",
                "P" , "X",
                "@", 3000, 10, 100);

        empleados.add(vendedor1);
        empleados.add(vendedor2);
        empleados.add(administrativo);


    }

    @Test
    public void test2() {
        for (Empleado e: empleados) {
            System.out.println(e.getSueldo());
        }

        /* empleados.stream().forEach(e -> System.out.println(e.getSueldo() ) );// */
    }
}
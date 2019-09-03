package Ejercicio32;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.*;

public class EmpresaTest {

    private List<Empresa> empresas;
    private Empresa tucasa;
    private Empleado empleado1;

    @BeforeTest
    public void setup() {
        tucasa = new Empresa("Roselloff", "1998");

        empleado1 = new Empleado("Julian", "Villano",
                                          "1999", "2010");
        empresas = new LinkedList<>();

        tucasa.aniadirEmpleados(empleado1);
        empresas.add(tucasa);
    }

    @Test
    public void testDeListaEmpleados() {
        assertTrue(tucasa.trabajaAca(empleado1));
    }

    @Test
    public void testDeListaEmpresas(){
        assertTrue(empresas.contains(tucasa));
    }
}
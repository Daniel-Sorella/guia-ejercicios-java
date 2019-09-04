package Rocola;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Rocola {
    private List<Disco> discos;

    public List<Disco> listaDeDiscosDisponibles() {
        discos.stream().flatMap(d -> d.getCanciones()).collect(Collectors.toList());
    }
}

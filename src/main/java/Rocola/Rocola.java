package Rocola;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Rocola {
    private List<Disco> discos;

    public Rocola(List<Disco> discos) {
        this.discos = discos;
    }

    public List<Disco> listaDeDiscosDisponibles() {
        return discos;
    }
}

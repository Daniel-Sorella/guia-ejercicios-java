package Rocola;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nombre;
    private List<Disco> discos;

    public Artista(String nombre) {
        this.nombre = nombre;
        this.discos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public void setDiscos(List<Disco> discos) {
        this.discos = discos;
    }
}

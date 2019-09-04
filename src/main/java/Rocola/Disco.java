package Rocola;

import java.util.ArrayList;
import java.util.List;

public class Disco {
    private String titulo;
    private String autor;
    private List<Canciones> canciones;

    public Disco(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.canciones = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Canciones> canciones) {
        this.canciones = canciones;
    }
}

package Rocola;

import java.util.ArrayList;
import java.util.List;

public class Canciones {
    private String titulo;
    private float duracion;
    private String autor;
    private Generos genero;

    private List<Disco> listaDeDiscos;

    public Canciones(String titulo, float duracion, String autor,Generos genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.autor = autor;
        this.listaDeDiscos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Disco> getListaDeDiscos() {
        return listaDeDiscos;
    }

    public void setListaDeDiscos(List<Disco> listaDeDiscos) {
        this.listaDeDiscos = listaDeDiscos;
    }
}

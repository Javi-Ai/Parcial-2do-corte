package com.example.parcial.clases;

public class Personaje {
    private String nombre;
    private String especie;
    private String habilidades;
    private String genero;
    private String imagen;

    public Personaje(String nombre, String especie, String habilidades, String genero, String imagen) {
        this.nombre = nombre;
        this.especie = especie;
        this.habilidades = habilidades;
        this.genero = genero;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}

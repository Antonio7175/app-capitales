package com.miempresa.dam2_00.libro;

public class Libro {
    private Long id;
    private String titulo;
    private String autor;
    private int ejemplares;
    private Genero genero;

    // Constructor, getters y setters

    public Libro(Long id, String titulo, String autor, int ejemplares, Genero genero) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}


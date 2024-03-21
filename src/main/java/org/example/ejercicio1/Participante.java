package org.example.ejercicio1;

public class Participante {
    private String nombre;
    private Integer puntaje;

    public Participante(String nombre) {
        this.puntaje = 0;

    }

    public void SumarPuntaje(Integer puntos) {
        this.puntaje += puntos;
    }

    public String getDatos() {
        StringBuilder copiaDatos = new StringBuilder();
        copiaDatos.append(this.nombre).append("\n").append(this.puntaje);
        return copiaDatos.toString();
    }

}

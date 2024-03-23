package org.example.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {
    private LocalDate fechaInicio;
    private LocalDate fechaCierre;
    private String nombre;
    private ArrayList<Participante> inscriptos;

    public Concurso(LocalDate inicio, LocalDate fin, String nombre) {
        this.fechaCierre = fin;
        this.fechaInicio = inicio;
        this.nombre = nombre;
        this.inscriptos = new ArrayList<Participante>();

    }

    public void InscribirParticipante(Participante unParticipante, LocalDate fechaInscripcion) {
        if (estaLaIncripcionEnTermino(fechaInscripcion)) {
            if (!estaInscripto(unParticipante)) {
                this.inscriptos.add(unParticipante);
                ganaPuntosExtras(unParticipante, fechaInscripcion);
            }
        }
    }

    public boolean estaLaIncripcionEnTermino(LocalDate fechaInscripcion) {
        if (!fechaInscripcion.isBefore(this.fechaCierre)) {
            throw new RuntimeException("La inscripcion ha terminado");
        }
        return true;
    }

    public void ganaPuntosExtras(Participante unParticipante, LocalDate fechaInscripcion) {
        if (fechaInscripcion.isEqual(this.fechaInicio) || fechaInscripcion.isAfter(this.fechaInicio)) {
            unParticipante.SumarPuntaje(10);
        }
    }

    public boolean estaInscripto(Participante unParticipante) {
        if (this.inscriptos.contains(unParticipante)) {
            throw new RuntimeException("Ya esta inscripto");
        }
        return false;
    }

    public String mostrarParticipantes() {
        StringBuilder sb = new StringBuilder();
        for (Participante participante : inscriptos) {
            sb.append(participante.getDatos()).append("\n");
        }
        return sb.toString();
    }

}

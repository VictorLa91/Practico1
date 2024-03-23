package org.example.ejercicio1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestEjercicio {

    @Test
    public void inscripcionEnTermino() {
        Participante participante1 = new Participante("Victor");
        Concurso concurso1 = new Concurso(LocalDate.now().minusDays(1), LocalDate.now().plusDays(4), "10KH");
        concurso1.InscribirParticipante(participante1, LocalDate.now());

        assertThrows(RuntimeException.class, () -> {
            concurso1.estaInscripto(participante1);
        });
    }

    @Test
    public void incripcionFueraDeTermino() {
        Participante participante1 = new Participante("Antonio");
        Concurso concurso1 = new Concurso(LocalDate.now().minusDays(1), LocalDate.now().plusDays(4), "10KH");

        assertThrows(RuntimeException.class, () -> {
            concurso1.InscribirParticipante(participante1, LocalDate.now().plusDays(6));
            ;
        });
    }

    @Test
    public void participanteRepetido() {
        Participante participante1 = new Participante("Victor");
        Concurso concurso1 = new Concurso(LocalDate.now().minusDays(1), LocalDate.now().plusDays(4), "10KH");
        concurso1.InscribirParticipante(participante1, LocalDate.now());

        assertThrows(RuntimeException.class, () -> {
            concurso1.estaInscripto(participante1);
        });
    }

    @Test
    public void obtenerCopiaDeDatosDeParticipante() {
        Participante participante1 = new Participante("Victor");
        Participante participante2 = new Participante("Hugo");
        Participante participante3 = new Participante("Carlos");
        Concurso concurso1 = new Concurso(LocalDate.now().minusDays(1), LocalDate.now().plusDays(4), "10KH");
        concurso1.InscribirParticipante(participante1, LocalDate.now());
        concurso1.InscribirParticipante(participante2, LocalDate.now().plusDays(2));

        Concurso concurso2 = new Concurso(LocalDate.now().minusDays(1), LocalDate.now().plusDays(4), "10KH");
        concurso2.InscribirParticipante(participante1, LocalDate.now());
        concurso2.InscribirParticipante(participante2, LocalDate.now().plusDays(2));

        assertEquals(concurso1.mostrarParticipantes(), concurso2.mostrarParticipantes());

    }
}

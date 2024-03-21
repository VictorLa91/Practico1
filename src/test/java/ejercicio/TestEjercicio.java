package ejercicio;

import org.example.ejercicio1.Concurso;
import org.example.ejercicio1.Participante;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class TestEjercicio {

    @Test
    public void inscripcionEnTermino() {
        Participante participante1 = new Participante("Victor");
        Concurso concurso1 = new Concurso(LocalDate.now().minusDays(1), LocalDate.now().plusDays(4), "10KH");
        concurso1.InscribirParticipante(participante1, LocalDate.now());

        assertTrue(concurso1.estaInscripto(participante1));
    }

    @Test
    public void incripcionFueraDeTermino() {
        Participante participante1 = new Participante("Antonio");
        Concurso concurso1 = new Concurso(LocalDate.now().minusDays(1), LocalDate.now().plusDays(4), "10KH");
        concurso1.InscribirParticipante(participante1, LocalDate.now().plusDays(6));

        assertFalse(concurso1.estaInscripto(participante1));
    }

    @Test
    public void participanteRepetido() {
        Participante participante1 = new Participante("Victor");
        Concurso concurso1 = new Concurso(LocalDate.now().minusDays(1), LocalDate.now().plusDays(4), "10KH");
        concurso1.InscribirParticipante(participante1, LocalDate.now());

        assertTrue(concurso1.estaInscripto(participante1));
    }

    @Test
    public void obtenerCopiaDeDatosDeParticipante() {
        Participante participante1 = new Participante("Victor");
        Participante participante2 = new Participante("Hugo");
        Participante participante3 = new Participante("Carlos");
        Concurso concurso1 = new Concurso(LocalDate.now().minusDays(1), LocalDate.now().plusDays(4), "10KH");
        concurso1.InscribirParticipante(participante1, LocalDate.now());
        concurso1.InscribirParticipante(participante2, LocalDate.now().plusDays(2));
        concurso1.InscribirParticipante(participante3, LocalDate.now().plusDays(5));

        Concurso concurso2 = new Concurso(LocalDate.now().minusDays(1), LocalDate.now().plusDays(4), "10KH");
        concurso2.InscribirParticipante(participante1, LocalDate.now());
        concurso2.InscribirParticipante(participante2, LocalDate.now().plusDays(2));

        assertEquals(concurso1.mostrarParticipantes(), concurso2.mostrarParticipantes());

    }
}

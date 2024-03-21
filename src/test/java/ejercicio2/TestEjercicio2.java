package ejercicio2;

import org.example.ejercicio2.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestEjercicio2 {

    @Test
    public void testReservaMesa() {
        Mesa mesa = new Mesa(1, 5);
        mesa.reservarMesa(5);

        assertTrue(mesa.estaReservada());
    }

    @Test
    public void testDesocuparMesa() {
        Mesa mesa = new Mesa(1, 5);
        mesa.reservarMesa(5);
        mesa.desocuparMesa();

        assertFalse(mesa.estaReservada());
    }

    @Test
    public void testPagoTarjetaVisa() {
        ItemMenu plato = new ItemMenu("Milanesa", 1500);
        ItemMenu plato2 = new ItemMenu("Pure de Papas", 3500);
        ItemMenu plato3 = new ItemMenu("Asado", 5500);
        ItemMenu bebida1 = new ItemMenu("Agua saborizada", 1000);
        ItemMenu bebida2 = new ItemMenu("Gaseosa", 1500);
        ItemMenu bebida3 = new ItemMenu("Vino", 2500);

        Mesa mesa1 = new Mesa(1, 10);
        Mesa mesa2 = new Mesa(2, 8);
        Mesa mesa3 = new Mesa(3, 5);
        Mesa mesa4 = new Mesa(4, 8);

        Pedido pedido1 = new Pedido(1);
        pedido1.asignarItem(plato);
        pedido1.asignarItem(plato2);
        pedido1.asignarItem(bebida3);
        pedido1.confirmarPedido();
        mesa1.asignarPedido(pedido1);

        Tarjeta visa = new Visa();
        visa.cobrar(pedido1.cuantoSale());

        assertEquals(2725, visa.verSaldo());


    }

    public void testPagoTarjetaMastercard() {

    }

    public void testPagoTargetaComarca() {

    }

    public void testPagoTarjetaComun() {

    }
}

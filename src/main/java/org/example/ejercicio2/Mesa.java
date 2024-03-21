package org.example.ejercicio2;

import java.util.ArrayList;

public class Mesa {
    private Integer numero;
    private Integer lugares;
    private Boolean reservado;
    private ArrayList<Pedido> listaPedidos;

    public Mesa(Integer numero, Integer cantidadLugares) {
        this.numero = numero;
        this.lugares = cantidadLugares;
        this.reservado = false;
        this.listaPedidos = new ArrayList<Pedido>();
    }

    public void reservarMesa(int cantidadLugaresAreservar) {
        if (this.lugares >= cantidadLugaresAreservar) {
            this.lugares -= cantidadLugaresAreservar;
            this.reservado = true;
        } else {
            System.out.println("No hay tantos lugares disponibles");
        }

    }

    public void desocuparMesa() {
        this.reservado = false;
    }

    public void asignarPedido(Pedido unPedido) {
        this.listaPedidos.add(unPedido);
    }

    public String mostrarInformacion() {
        StringBuilder copiaDatos = new StringBuilder();
        copiaDatos.append(this.numero).append("\n").append(this.lugares);
        return copiaDatos.toString();
    }

    public boolean estaReservada() {
        return this.reservado;
    }

}

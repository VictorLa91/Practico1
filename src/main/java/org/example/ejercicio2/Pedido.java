package org.example.ejercicio2;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Plato> listadoPlatos;
    private ArrayList<Bebida> listadoBebidas;
    private boolean confirmado;
    private double precioP;
    private double precioB;
    private int numero;

    public Pedido() {
    }

    public Pedido(int numero) {
        this.listadoPlatos = new ArrayList<Plato>();
        this.listadoBebidas = new ArrayList<Bebida>();
        this.numero = numero;
        this.precioP = 0L;
        this.precioB = 0L;

    }

    public void asignarPlato(Plato plato) {
        this.listadoPlatos.add(plato);
    }

    public void asignarBebida(Bebida bebida) {
        this.listadoBebidas.add(bebida);
    }

    public void confirmarPedido() {
        this.confirmado = true;
        for (Plato item : listadoPlatos) {
            this.precioP += item.precio();
        }
        for (Bebida item : listadoBebidas) {
            this.precioB += item.precio();
        }
    }

    public double aplicarDescuentoBebidas(double descuento) {
        this.precioB = this.precioB - this.precioB * descuento;
        return precioB;
    }

    public double aplicarDescuentoPlatos(double descuento) {
        this.precioP = this.precioP - this.precioP * descuento;
        return precioP;
    }

    public double aplicarDescuentoSobreTotal(double descuento) {
        double total = (this.precioP + this.precioB) - (this.precioP + this.precioB) * descuento;
        return total;
    }

    public double cuantoSalenLasBebidas() {
        double copiaValor = this.precioB;
        return copiaValor;
    }

    public double cuantoSalenLosPlatos() {
        double copiaValor = this.precioP;
        return copiaValor;
    }


}

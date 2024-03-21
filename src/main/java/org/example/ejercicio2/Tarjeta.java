package org.example.ejercicio2;

public abstract class Tarjeta {
    protected double descuento;
    protected String nombre;
    protected float credito;

    public Tarjeta(String nombre, double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.credito = (long) 10000F;

    }

    public void cobrar(double monto) {
    }

    public double aplicarDescuento(double monto) {
        double descuento = monto * this.descuento; // 3% de descuento
        return monto - descuento;
    }

    public float verSaldo() {
        return this.credito;
    }

}

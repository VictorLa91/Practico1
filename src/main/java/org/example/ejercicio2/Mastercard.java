package org.example.ejercicio2;

public class Mastercard extends Tarjeta {

    public Mastercard() {
        super("Mastercard", 0.3);
    }

    @Override
    public void cobrar(double monto) {
        double montoConDescuento = super.aplicarDescuento(monto);

        if (super.credito > montoConDescuento) {
            credito -= montoConDescuento;
        } else {
            System.out.println("No posee el crédito suficiente");
        }
    }
}

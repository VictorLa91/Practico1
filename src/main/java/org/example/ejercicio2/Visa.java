package org.example.ejercicio2;

public class Visa extends Tarjeta {


    public Visa() {
        super("Visa", 0.03);
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

package org.example.ejercicio2;

public class ComarcaPlus extends Tarjeta {


    public ComarcaPlus() {
        super("ComarcaPlus", 0.02);

    }

    @Override
    public void cobrar(double monto) {
        double montoConDescuento = super.aplicarDescuento(monto);

        if (this.credito > montoConDescuento) {
            credito -= montoConDescuento;
        } else {
            System.out.println("No posee el crédito suficiente");
        }
    }


}

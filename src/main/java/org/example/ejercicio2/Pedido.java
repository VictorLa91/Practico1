package org.example.ejercicio2;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemMenu> listado;
    private boolean confirmado;
    private float precio;
    private Integer numero;

    public Pedido(Integer numero) {
        this.listado = new ArrayList<ItemMenu>();
        this.numero = numero;
        this.precio = 0L;
    }

    public void asignarItem(ItemMenu item) {
        this.listado.add(item);
    }

    public void confirmarPedido() {
        this.confirmado = true;
        for (ItemMenu item : listado) {
            this.precio += item.precio();
        }
    }

    public float cuantoSale() {
        return precio;
    }
    
}

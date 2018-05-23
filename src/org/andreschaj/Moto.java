package org.andreschaj;

public class Moto extends Transporte {

    private String reclinador;

    public Moto() {

    }

    public Moto(String color, String modelo, String marca, float tamanio, float recorrido) {
        super(color, modelo, marca, tamanio, recorrido);
    }

    public String getReclinador() {
        return reclinador;
    }

    public void setReclinador(String reclinador) {
        this.reclinador = reclinador;
    }

}

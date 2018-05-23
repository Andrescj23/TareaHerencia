package org.andreschaj;

public class Carro extends Transporte {

    private String puertas;

    public Carro() {

    }

    public Carro(String color, String modelo, String marca, float tamanio, float recorrido) {
        super(color, modelo, marca, tamanio, recorrido);
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

}

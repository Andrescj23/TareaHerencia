package org.andreschaj;

public abstract class Transporte {

    private String color;
    private String modelo;
    private String marca;
    private float tamanio;
    private float recorrido;

    public Transporte() {

        System.out.println("mensaje" + this);

    }

    public Transporte(String color, String modelo, String marca, float tamanio, float recorrido) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.tamanio = tamanio;
        this.recorrido = recorrido;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public float getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(float recorrido) {
        this.recorrido = recorrido;
    }

}

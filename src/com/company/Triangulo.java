package com.company;

public class Triangulo {
    //Atributos
    private double base;
    private double altura;

    //Metodos
        //Constructor
    public Triangulo() {
        base=0;
        altura=0;
    }
    public Triangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

        //Get
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

        //Set
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}

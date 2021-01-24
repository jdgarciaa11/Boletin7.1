package com.company;

public class Cuadrado {
    private int lado;

    public Cuadrado(){
        lado=0;
    }
    public Cuadrado(int lado){
        this.lado=lado;
    }

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getArea(){
        setLado(getLado()*getLado());
        return getLado();
    }
    public void printCuadrado(){
        for(int altura = 0; altura < getLado(); altura++){
            for (int base = 0; base < getLado(); base ++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}

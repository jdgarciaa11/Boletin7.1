package com.company;

public class Piratagochi {
    private String nombre;
    private int energia;
    private boolean estaHambriento;
    int nivelFelicidad;

    public Piratagochi(){
        nombre = "Sin nombre";
        energia = 0;
        estaHambriento = false;
        nivelFelicidad = 0;
    }
    public Piratagochi(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEnergia() {
        return energia;
    }
    public boolean isEstaHambriento() {
        return estaHambriento;
    }
    public int getNivelFelicidad() {
        return nivelFelicidad;
    }

    public void setEnergia(int energia) {
        if (energia>=1 && energia <= 10){
            this.energia = energia;
        }
    }
    public void setEstaHambriento(boolean estaHambriento) {
        this.estaHambriento = estaHambriento;
    }
    public void setNivelFelicidad(int nivelFelicidad) {
        if (nivelFelicidad >=1 && nivelFelicidad <= 10) {
            this.nivelFelicidad = nivelFelicidad;
        }
    }

    
}

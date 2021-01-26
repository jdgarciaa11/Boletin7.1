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

    public void comer(){
        if(isEstaHambriento()){
            setEstaHambriento(true);
        }
    }
    public void dormir(int horasDurmiendo){
        for (int i = 0; i < horasDurmiendo; i++){
            if (getEnergia() < horasDurmiendo) {
                setEnergia(getEnergia() + 1);
            } else {
               setNivelFelicidad(getNivelFelicidad() - 1);
            }
        }
    }
    public void jugar(int horasJugando){
        if (!isEstaHambriento()){
            for (int i = 0; i < horasJugando; i++){
                setNivelFelicidad(getNivelFelicidad()+1);
                setEnergia(getEnergia()-1);
            }
            setEstaHambriento(true);
        } else {
            for (int i = 0; i < horasJugando; i++){
                setNivelFelicidad(getNivelFelicidad()-1);
                setEnergia(getEnergia()-1);
            }
        }
    }
    public void getNecesidades(){
        if (isEstaHambriento()){
            System.out.println("Tengo hambre");
        } else if (getEnergia() < 5){
            System.out.println("Tengo sueño. Nivel de energia "+getEnergia());
        } else if (getNivelFelicidad() < 5){
            System.out.println("Estoy triste :(. Nivel de felicidad "+getNivelFelicidad());
        }
    }

    
}

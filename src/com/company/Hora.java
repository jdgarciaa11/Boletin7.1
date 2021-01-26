package com.company;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(){
        hora = 10;
        minutos = 10;
        segundos = 10;
    }
    public Hora(int hora, int minutos, int segundos){
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }
    public int getMinutos() {
        return minutos;
    }
    public int getSegundos() {
        return segundos;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23 ) {
            this.hora = hora;
        }
    }
    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        }
    }
    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        }
    }

//    public void sumarSegundos(int segundos){
//        if (getSegundos() >= 59){
//
//        }
//    }

    @Override
    public String toString() {
        return getHora()+":"+getMinutos()+":"+getSegundos();
    }
}

package com.company;

public class Cuenta {
    private String iban;
    private int numeroCuenta;
    private double saldo;
    private boolean descubierta;
    private double interesMensual;

    public Cuenta(){
        iban = "ESXX 0123 4567 8901 2345 6789";
        numeroCuenta = 0;
        interesMensual = 0.00;
    }
    public Cuenta(String iban,int numeroCuenta, double interesMensual){
        this.iban = iban;
        this.numeroCuenta = numeroCuenta;
        this.interesMensual = interesMensual;
    }

    public String getIban() {
        return iban;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public boolean isDescubierta() {
        return descubierta;
    }
    public double getInteresMensual() {
        return interesMensual;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }else{
            this.saldo = saldo;
            setDescubierta(true);
        }
    }
    public void setDescubierta(boolean descubierta) {
        this.descubierta = descubierta;
    }

    @Override
    public String toString() {
        return "Cuenta numero: "+getNumeroCuenta()+", cuyo IBAN es: "+getIban()+", y saldo es: "+getSaldo()+"€. Descubierta es "+isDescubierta()+" y el interes es del"+getInteresMensual()+"%.";
    }

    public void ingresar(double dinero){
        setSaldo(getSaldo()+dinero);
        System.out.println("Saldo actual: "+getSaldo()+"€");
    }
    public boolean retirar(double dinero){
        boolean aceptada = false;
        if (!isDescubierta()){
            if (getSaldo() < 0 || getSaldo() < dinero) {
                aceptada = false;
            } else {
                setSaldo(getSaldo()-dinero);
                System.out.println("Saldo actual: "+getSaldo()+"€");
                aceptada = true;
            }
        }
        return aceptada;
    }
    public boolean hacerTransferencia(Cuenta x, double cantidad){
        boolean aceptada = false;
        if (!isDescubierta()){
            if (getSaldo() < 0 || getSaldo() < cantidad) {
                aceptada = false;
            } else {
                setSaldo(getSaldo()-cantidad);
                x.setSaldo(x.getSaldo()+cantidad);
                System.out.println("Saldo actual: "+getSaldo()+"€");
                aceptada = true;
            }
        }
        return aceptada;
    }
    public double beneficiosFuturos(int numMese){
        double beneficios = 0;
        if (isDescubierta() || numMese<=0){
            beneficios = 0;
        } else {
            beneficios = getInteresMensual() * numMese;
        }
        return beneficios;
    }


}

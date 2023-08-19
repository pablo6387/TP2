package com.mycompany.tp2;

public class Rueda {
    private String marca;
    private double presion;

    public Rueda(String marca) {
        this.marca = marca;
        presion = 28.0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
    
    public void inflar(){
        presion =28.0;
    }
    
    public void desinflar(){
        if (presion>0){
            presion = presion -0.5;
        }
    }
    
    public void pinchar(){
        presion = 0;
    }
    
}

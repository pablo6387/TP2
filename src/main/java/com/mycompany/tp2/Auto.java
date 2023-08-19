package com.mycompany.tp2;

public class Auto {
    private String color;
    private String patente;
    private int combustible;
    private Rueda r1;
    private Rueda r2;
    private Rueda r3;
    private Rueda r4;

    public Auto(String color, String patente, Rueda r1, Rueda r2, Rueda r3, Rueda r4) {
        this.color = color;
        this.patente = patente;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
        combustible = 50;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public Rueda getR1() {
        return r1;
    }

    public void setR1(Rueda r1) {
        this.r1 = r1;
    }

    public Rueda getR2() {
        return r2;
    }

    public void setR2(Rueda r2) {
        this.r2 = r2;
    }

    public Rueda getR3() {
        return r3;
    }

    public void setR3(Rueda r3) {
        this.r3 = r3;
    }

    public Rueda getR4() {
        return r4;
    }

    public void setR4(Rueda r4) {
        this.r4 = r4;
    }

        
    
    public void avanzar(int metros){
        if (combustible>0){
            combustible = combustible - (metros/10);
        }else{
            System.out.println("Combustible insuficiente");
        }
    }
    
    public void retroceder(int metros){
        if (combustible>0){
            combustible = combustible - (metros/10);
        }else{
            System.out.println("Combustible insuficiente");
        }
    }
    
    public void llenarTanque(){
        combustible = 50;
    }
    
    
}

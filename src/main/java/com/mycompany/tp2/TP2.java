package com.mycompany.tp2;

public class TP2 {

    public static void main(String[] args) {
        Auto auto = new Auto("negro", "ABC 789", new Rueda("firestone"),new Rueda("firestone"),new Rueda("firestone"),new Rueda("firestone"));
        auto.avanzar(300);
        auto.retroceder(100);
        auto.getR1().desinflar();
        auto.getR4().desinflar();
        auto.getR1().desinflar();
        
        System.out.println("AUTO");
        System.out.println("");
        System.out.println("Color: " + auto.getColor());
        System.out.println("Patente: " + auto.getPatente());
        System.out.println("Combustible: " + auto.getCombustible());
        System.out.println("Presion rueda 1: " + auto.getR1().getPresion());
        System.out.println("Presion rueda 2: " + auto.getR2().getPresion());
        System.out.println("Presion rueda 3: " + auto.getR3().getPresion());
        System.out.println("Presion rueda 4: " + auto.getR4().getPresion());
        System.out.println("");
        System.out.println("");
        
        auto.llenarTanque();
        auto.getR1().inflar();
        auto.getR2().pinchar();
        auto.getR3().desinflar();
        auto.getR3().desinflar();
        auto.getR3().desinflar();
                
        System.out.println("AUTO");
        System.out.println("");
        System.out.println("Color: " + auto.getColor());
        System.out.println("Patente: " + auto.getPatente());
        System.out.println("Combustible: " + auto.getCombustible());
        System.out.println("Presion rueda 1: " + auto.getR1().getPresion());
        System.out.println("Presion rueda 2: " + auto.getR2().getPresion());
        System.out.println("Presion rueda 3: " + auto.getR3().getPresion());
        System.out.println("Presion rueda 4: " + auto.getR4().getPresion());
        
    }
}

package com.anferdev;

public class Main {


    public static void main(String[] args) {
        Main ejecuta = new Main();
        double resultado = ejecuta.sumar(5, 9, 3);
        System.out.println(resultado);

        System.out.println("************************");

        Coche coche1 = new Coche();
        coche1.setNro_puertas(4);
        coche1.incrementaPuertas(1);
        System.out.println("El coche tiene " + coche1.getNro_puertas() +" puertas.");
    }

    private double sumar(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

}

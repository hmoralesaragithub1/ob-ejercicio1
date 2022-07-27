package com.anferdev;

public class Coche {
    private int nro_puertas;

    public int getNro_puertas() {
        return nro_puertas;
    }

    public void setNro_puertas(int nro_puertas) {
        this.nro_puertas = nro_puertas;
    }

    public void incrementaPuertas(int puertas_incrementar){
        this.setNro_puertas(this.getNro_puertas()+puertas_incrementar);
    }
}

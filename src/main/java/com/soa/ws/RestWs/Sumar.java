package com.soa.ws.RestWs;

public class Sumar{

    private final long contador;
    private final int numero1;
    private final int numero2;

    public Sumar(long contador, int numero1, int numero2) {
        this.contador = contador;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public long getContador() {
        return contador;
    }

    public int getResultado(){
        return numero1 + numero2;
    }
}






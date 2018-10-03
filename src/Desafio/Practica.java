package Desafio;

import mx.com.sintelti.desafios.oporx.Solucion;

public class Practica implements Solucion {
    private String entrada;
    @Override
    public String convertir(String entrada) {


        entrada = entrada.replaceAll("o", "x");
        if (entrada.length() == 7 || entrada.length() == 8) {
            this.entrada = entrada;
        }
        return entrada;

    }

    public String getEntrada() {
        return entrada;
    }
}

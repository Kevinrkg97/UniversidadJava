package org.example.aritmetica;

import org.example.exceptions.OperacionExcepcion;

public class Aritmetica {
    public static int division(int numerador, int denominador) throws OperacionExcepcion{
        if (denominador == 0){
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador / denominador;
    }
}

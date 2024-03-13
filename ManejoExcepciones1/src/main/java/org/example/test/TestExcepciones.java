package org.example.test;

import org.example.exceptions.OperacionExcepcion;

import static org.example.aritmetica.Aritmetica.division;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;

        try {
            resultado = division(10, 0);
        }catch (OperacionExcepcion e) {
            System.out.println("Ocurrió un error de tipo OperacionExcepcion: ");
            System.out.println(e.getMessage());
        }catch (Exception e){
           // e.printStackTrace();
            System.out.println("Ocurrió un error de tipo Exception: ");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se revisó la división entre cero.");
        }

        System.out.println("Resultado = " + resultado);
    }
}

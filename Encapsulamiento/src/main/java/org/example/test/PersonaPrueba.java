package org.example.test;
import org.example.dominio.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Kevin", 5000, false);
        persona1.setNombre("Roberto");
        persona1.setSueldo(50000);
        System.out.println("Persona1 nombre: " + persona1.getNombre());
        System.out.println("El sueldo es de: " + persona1.getSueldo());
        System.out.println(persona1);
    }
}

package Entrega2;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Daniela", "Gómez"));
        personas.add(new Persona("Flavio", "Carracedo"));
        personas.add(new Persona("Ruben", "Roca"));
        personas.add(new Persona("Hernan", "Furnari"));
        personas.add(new Persona("Marcelo", "Sosa"));

        // Ordenar por nombre
        Collections.sort(personas, Comparator.comparing(Persona::getNombre));
        System.out.println("Ordenado por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Ordenar por apellido
        Collections.sort(personas, Comparator.comparing(Persona::getApellido));
        System.out.println("\nOrdenado por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Ordenar inversamente por apellido
        Collections.sort(personas, Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("\nOrdenado inversamente por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}

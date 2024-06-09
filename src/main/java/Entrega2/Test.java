package Entrega2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Carlos", "Gómez"));
        personas.add(new Persona("Ana", "Martínez"));
        personas.add(new Persona("Luis", "Rodríguez"));
        personas.add(new Persona("María", "Pérez"));
        personas.add(new Persona("Juan", "Hernández"));

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

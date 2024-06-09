package Entrega1;

import java.util.Scanner;

public class entrega1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // apital solicitado
        System.out.print("Ingrese el capital solicitado: ");
        float capitalSolicitado = scanner.nextFloat();

        // tasa de interés
        System.out.print("Ingrese la tasa de interés (en porcentaje, por ejemplo 5.5 para 5.5%): ");
        float tasaInteres = scanner.nextFloat() / 100; // Convertir el porcentaje a decimal

        // período en meses
        System.out.print("Ingrese el período en meses: ");
        int periodoMeses = scanner.nextInt();

        // interés a pagar
        float interesAPagar = capitalSolicitado * tasaInteres * periodoMeses;

        // monto total a pagar
        float montoTotalAPagar = capitalSolicitado + interesAPagar;
        System.out.printf("El monto total a pagar es: %.2f\n", montoTotalAPagar);

        // Separar y mostrar la parte entera y la parte decimal del monto total
        int parteEntera = (int) montoTotalAPagar;
        float parteDecimal = montoTotalAPagar - parteEntera;

        System.out.println("Parte entera: " + parteEntera);
        System.out.printf("Parte decimal: %.2f\n", parteDecimal);


        scanner.close();
    }
}

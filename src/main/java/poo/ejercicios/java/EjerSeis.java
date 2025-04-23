package poo.ejercicios.java;

import java.util.Scanner;

public class EjerSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mejorVehiculo = 0;
        double mejorTiempo = Double.MAX_VALUE;

        for (int i = 1; i <= 12; i++) {
            System.out.println("Ingrese número de vehículo:");
            int nroVehiculo = Integer.parseInt(sc.nextLine());

            System.out.println("Ingrese tiempo en segundos:");
            double tiempo = Double.parseDouble(sc.nextLine());

            if (tiempo < mejorTiempo) {
                mejorTiempo = tiempo;
                mejorVehiculo = nroVehiculo;
            }
        }

        System.out.println("Vehículo con mejor tiempo: " + mejorVehiculo + ", Tiempo: " + mejorTiempo + " segundos");
    }
}


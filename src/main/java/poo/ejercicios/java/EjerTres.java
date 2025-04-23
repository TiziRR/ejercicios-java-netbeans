package poo.ejercicios.java;

import java.util.Scanner;

public class EjerTres {
    // Constructor que hace los cálculos
    public EjerTres(int[] cantidades, double[] costos) {
        double precioTotalGeneral = 0;

        System.out.println("\nProductos que superan los $1000:");

        for (int i = 0; i < cantidades.length; i++) {
            double totalProducto = cantidades[i] * costos[i];
            precioTotalGeneral += totalProducto;

            if (totalProducto > 1000) {
                System.out.println("Producto " + (i + 1) + ": $" + totalProducto);
            }
        }

        System.out.println("\nPrecio total de todos los productos: $" + precioTotalGeneral);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos: ");
        int n = scanner.nextInt();

        int[] cantidades = new int[n];
        double[] costos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la cantidad del producto " + (i + 1) + ": ");
            cantidades[i] = scanner.nextInt();

            System.out.print("Ingrese el costo unitario del producto " + (i + 1) + ": ");
            costos[i] = scanner.nextDouble();
        }

        new EjerTres(cantidades, costos);

        scanner.close();
    }
}

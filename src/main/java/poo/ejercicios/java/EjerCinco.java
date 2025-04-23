package poo.ejercicios.java;

import java.util.Scanner;

public class EjerCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] precios = {750, 1100, 1500};
        int descuento = 5;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingresar DNI del cliente: ");
            String dni = sc.nextLine();

            System.out.println("Tipo de servicio:\n1. Internet 30 megas\n2. Internet 50 megas\n3. Internet 100 megas");
            int tipoServicio = Integer.parseInt(sc.nextLine());

            double monto;
            if (tipoServicio == 3) {
                monto = precios[2] * 0.95; // 5% de descuento
            } else {
                monto = precios[tipoServicio - 1];
            }

            System.out.println("Cliente DNI: " + dni + ", Servicio: " + tipoServicio + ", Monto a pagar: $" + monto);
        }
    }
}


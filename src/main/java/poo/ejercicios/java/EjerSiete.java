package poo.ejercicios.java;


import java.util.Scanner;

public class EjerSiete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int varones = 0;
        int mujeres = 0;
        int varonesEdadMedia = 0;

        String documentoMayorEdad = "";
        int mayorEdad = -1;
        String sexoMayor = "";

        while (true) {
            System.out.println("Ingresar número de documento (0 para finalizar):");
            String documento = sc.nextLine();
            if (documento.equals("0")) break;

            System.out.println("Ingresar edad:");
            int edad = Integer.parseInt(sc.nextLine());

            System.out.println("Ingresar sexo (F o M):");
            String sexo = sc.nextLine().toUpperCase();

            total++;

            if (sexo.equals("M")) {
                varones++;
                if (edad >= 16 && edad <= 65) {
                    varonesEdadMedia++;
                }
            } else if (sexo.equals("F")) {
                mujeres++;
            }

            if (edad > mayorEdad) {
                mayorEdad = edad;
                documentoMayorEdad = documento;
                sexoMayor = sexo;
            }
        }

        System.out.println("Total censados: " + total);
        System.out.println("Cantidad de varones: " + varones);
        System.out.println("Cantidad de mujeres: " + mujeres);

        if (varones > 0) {
            double porcentaje = (double) varonesEdadMedia * 100 / varones;
            System.out.println("Porcentaje de varones entre 16 y 65 años: " + porcentaje + "%");
        } else {
            System.out.println("No se censaron varones.");
        }

        System.out.println("Persona de mayor edad - Documento: " + documentoMayorEdad + ", Edad: " + mayorEdad + ", Sexo: " + sexoMayor);
    }
}



package poo.ejercicios.java;

import java.util.Scanner;

public class EjerUno {
    public int cantNotas;
    public int[] notas;
    
    public EjerUno(int cantNotas){
        this.cantNotas =  cantNotas;
        this.notas = new int[this.cantNotas];
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < this.notas.length; i++){
            System.out.println("Cargar nota N°" + (i + 1) + ":");
            this.notas[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        int notaMaxima = this.notas[0];
        for (int i = 1; i < this.notas.length; i++){
            if (this.notas[i] > notaMaxima){
                notaMaxima = this.notas[i];
            }
        }
        
        System.out.println("La nota máxima es: " + notaMaxima);
    }
}

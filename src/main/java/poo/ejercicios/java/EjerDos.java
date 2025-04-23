
package poo.ejercicios.java;

import java.util.Scanner;

public class EjerDos {
    public int cantNotas;
    public int[] notas;
    
    public EjerDos(int cantNotas){
        this.cantNotas =  cantNotas;
        this.notas = new int[this.cantNotas];
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < this.notas.length; i++){
            System.out.println("Cargar nota N°" + (i + 1) + ":");
            this.notas[i] = scanner.nextInt();
        }
        
        scanner.close();
    
        int cantAprobados = 0;
        int cantDesaprobados = 0;
        
        for (int i = 0; i < this.notas.length; i++){
            if (this.notas[i] >= 6){
                cantAprobados += 1;
            } else {
                cantDesaprobados += 1;
            }
        }
        
        System.out.println("Cantidad de Aprobados: " + cantAprobados);
        System.out.println("Cantidad de Desaprobados: " + cantDesaprobados);
    }
}

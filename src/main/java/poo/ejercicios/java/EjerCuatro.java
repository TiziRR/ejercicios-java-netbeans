package poo.ejercicios.java;

import java.util.Scanner;

class Camionero {
    private String patente;
    private String nombreCompleto;
    private String tipoCarga;
    private String horaEgreso;
    
    public Camionero(String patente, String nombreCompleto, String tipoCarga, String horaEgreso) {
        this.patente = patente;
        this.nombreCompleto = nombreCompleto;
        this.tipoCarga = tipoCarga;
        this.horaEgreso = horaEgreso;
    }
    
    public String getPatente() {
        return patente;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    public String getTipoCarga() {
        return tipoCarga;
    }
    
    public String getHoraEgreso() {
        return horaEgreso;
    }
    
    @Override
    public String toString() {
        return String.format(
            "Patente: %s | Chofer: %s | Carga: %s | Hora egreso: %s",
            patente, nombreCompleto, tipoCarga, horaEgreso
        );
    }
}

public class EjerCuatro {
    private int cantidadCamiones;
    private Camionero[] camioneros;
    
    public EjerCuatro(int cantidadCamiones) {
        this.cantidadCamiones = cantidadCamiones;
        this.camioneros = new Camionero[cantidadCamiones];
        cargarDatos();
        mostrarReporte();
    }
    
    private void cargarDatos() {
        Scanner sc = new Scanner(System.in);
        int contadorTe = 0;
        
        for (int i = 0; i < cantidadCamiones; i++) {
            System.out.printf("=== Camión %d de %d ===%n", i+1, cantidadCamiones);
            System.out.print("Ingresar patente: ");
            String patente = sc.nextLine().trim();
            
            System.out.print("Ingresar nombre y apellido del chofer: ");
            String nombre = sc.nextLine().trim();
            
            System.out.print("Ingresar tipo de carga (Madera, Yerba o Té): ");
            String tipo = sc.nextLine().trim();
            
            System.out.print("Ingresar hora de egreso (HH:MM): ");
            String hora = sc.nextLine().trim();
            
            if (tipo.equalsIgnoreCase("té")) {
                contadorTe++;
            }
            
            camioneros[i] = new Camionero(patente, nombre, tipo, hora);
        }
        
        System.out.printf("%nCantidad de camiones que cargaron té: %d%n%n", contadorTe);
    }
    
    private void mostrarReporte() {
        System.out.println("===== REPORTE DE EGRESO DE CAMIONES =====");
        for (Camionero c : camioneros) {
            System.out.println(c);
        }
    }
    
    public static void main(String[] args) {
        Scanner scMain = new Scanner(System.in);
        System.out.print("¿Cuántos camiones desea cargar? ");
        int n = Integer.parseInt(scMain.nextLine());
        
        // Se crea la instancia que gestiona todo
        new EjerCuatro(n);
    }
}

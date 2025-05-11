package poo.ejercicios.sanatorio;

import java.util.List;

public class ObraSocial {
    private String nombre;
    private List<String> cobertura;
    private double descuento;
    private boolean vademecum;

    public ObraSocial(String nombre, List<String> cobertura, double descuento, boolean vademecum) {
        this.nombre = nombre;
        this.cobertura = cobertura;
        this.descuento = descuento;
        this.vademecum = vademecum;
    };
    
    public String getNombre() {
        return nombre;
    }

    public List<String> getCobertura() {
        return cobertura;
    }

    public double getDescuento() {
        return descuento;
    }
    
    public boolean getVademecum() {
        return vademecum;
    }
    
    @Override
    public String toString() {
        return "Obra Social: " + nombre + ", Cobertura: " + cobertura + ", Descuento: " + descuento + "%";
    }
}

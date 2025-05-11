package poo.ejercicios.sanatorio;

public abstract class Paciente {
    
    protected String nombre;
    protected String dni;
    protected ObraSocial obraSocial;
    
    public Paciente(String nombre, String dni, ObraSocial obraSocial) {
        this.nombre = nombre;
        this.dni = dni;
        this.obraSocial = obraSocial;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }
    
    public abstract void mostrarInfo();
}

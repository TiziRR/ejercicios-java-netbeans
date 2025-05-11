package poo.ejercicios.sanatorio;

public class PacienteUno extends Paciente implements IPediatrico{
    
    private int peso;
    private String celular;
    private String tutor;
    
    public PacienteUno(String nombre, String dni, ObraSocial obraSocial, int peso, String celular, String tutor) {
        super(nombre, dni, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public String getCelular() {
        return celular;
    }

    @Override
    public String getTutor() {
        return tutor;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Paciente Infantil: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Tutor: " + tutor);
        System.out.println("Obra Social: " + obraSocial);
    }
    
}

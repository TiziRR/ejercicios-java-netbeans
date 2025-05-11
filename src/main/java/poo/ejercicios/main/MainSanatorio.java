package poo.ejercicios.main;

import poo.ejercicios.sanatorio.*;

import java.util.Arrays;

public class MainSanatorio {
    public static void main(String[] args) {
        ObraSocial os = new ObraSocial("OSDE", Arrays.asList("pediatría", "odontología"), 15.0, true);

        PacienteUno paciente = new PacienteUno(
            "Milti", "12345678", os, 20, "1122334455", "Santi Ezequiel"
        );

        paciente.mostrarInfo();
    }
}
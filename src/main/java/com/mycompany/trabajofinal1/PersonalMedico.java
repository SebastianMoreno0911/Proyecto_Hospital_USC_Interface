package com.mycompany.trabajofinal1;

/**
 *
 * @author SEBASTIAN MORENO
 * @id: 1192792720
 * @fecha: 25/noviembre/2023
 *
 */
public class PersonalMedico extends Personal {
    // Constructor
    public PersonalMedico(String nombre, int edad, String genero, String cargo, String nivelEducacional) {
        super(nombre, edad, genero, cargo, nivelEducacional);
    }

    // Implementación del método abstracto
    @Override
    public void realizarOperacionComun() {
        // Implementación específica para el personal médico
        System.out.println("Operación común para el personal médico");
    }
}

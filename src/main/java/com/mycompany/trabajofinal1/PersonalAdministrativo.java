package com.mycompany.trabajofinal1;

/**
 *
 * @author SEBASTIAN MORENO
 * @id: 1192792720
 * @fecha: 25/noviembre/2023
 *
 */
public class PersonalAdministrativo extends Personal {
    // Constructor
    public PersonalAdministrativo(String nombre, int edad, String genero, String cargo, String nivelEducacional) {
        super(nombre, edad, genero, cargo, nivelEducacional);
    }

    // Implementación del método abstracto
    @Override
    public void realizarOperacionComun() {
        // Implementación específica para el personal administrativo
        System.out.println("Operacion comun para el personal administrativo");
    }
}


package com.mycompany.trabajofinal1;

/**
 *
 * @author SEBASTIAN MORENO
 * @id: 1192792720
 * @fecha: 25/noviembre/2023
 *
 */
// Clase abstracta para el personal
public abstract class Personal extends Persona {
    protected String cargo;
    protected String nivelEducacional;

    // Constructor
    public Personal(String nombre, int edad, String genero, String cargo, String nivelEducacional) {
        super(nombre, edad, genero);
        this.cargo = cargo;
        this.nivelEducacional = nivelEducacional;
    }

    // Método abstracto que deberá ser implementado por las clases concretas
    public abstract void realizarOperacionComun();
}

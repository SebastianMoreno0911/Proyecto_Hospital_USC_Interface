package com.mycompany.trabajofinal1;

/**
 *
 * @author SEBASTIAN MORENO
 * @id: 1192792720
 * @fecha: 25/noviembre/2023
 *
 */
public class Hospital {

    protected String nombre;
    protected double nit;
    protected String ubicacion;
    protected int pacientesAtendidos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNit() {
        return nit;
    }

    public void setNit(double nit) {
        this.nit = nit;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPacientesAtendidos() {
        return pacientesAtendidos;
    }

    public void setPacientesAtendidos(int pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }
}

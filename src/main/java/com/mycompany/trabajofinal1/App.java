package com.mycompany.trabajofinal1;

//import javax.swing.*;

/**
 *
 * @author SEBASTIAN MORENO
 * @id: 1192792720
 * @fecha: 25/noviembre/2023
 *
 */

public class App {

    public static void main(String[] args) {

        // Crear objetos de la clinica
        Medico medicoGeneral = new Medico("General", new Empleado("Dr. Jhon", 35, "masculino", 1500000, null));
        Paciente paciente = new Paciente("Paola", 25, "femenino", "contributivo", 3000000, 2);
        ConsultaMedica consultaMedica = new ConsultaMedica("09-11-2023", medicoGeneral, paciente, "C2");

        // Mostrar informacion del paciente y la consulta
        paciente.mostrarDatos();
        System.out.println("Tipo de regimen: " + paciente.getRegimen());
        System.out.println("Salario: " + paciente.getSalario());
        System.out.println("Costo de la consulta: $" + paciente.pagoConsulta());

        System.out.println("\nDatos de consulta:");
        System.out.println("Fecha: " + consultaMedica.getFecha());
        System.out.println("Medico: " + consultaMedica.getMedico().getDatEmpleado().getNombre());
        System.out.println("Consultorio: " + consultaMedica.getConsultorio());

        // Calcular bonificacion para el medico
        Pago pago = new Pago();
        pago.calcularNomina(medicoGeneral.getDatEmpleado());
        System.out.println("Salario del medico: $" + medicoGeneral.getDatEmpleado().getSalario());
    }
}

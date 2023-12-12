package com.mycompany.trabajofinal1;

import java.util.List;

/**
 *
 * @author SEBASTIAN MORENO
 * @id: 1192792720
 * @fecha: 25/noviembre/2023
 *
 */
public class Pago {

    protected List<Empleado> listEmpleados;

    // metodo para calcular la ganancia
    public Empleado calcularNomina(Empleado empleado) {
        if (empleado != null && empleado.getTipoMedico() != null) {
            if ("general".equals(empleado.getTipoMedico().getEspecialidad())) {
                empleado.setSalario((int) (empleado.getSalario() + empleado.getSalario() * 0.05));
                if (empleado.getTipoMedico().getHijosMenores7().contains("Si")) {
                    empleado.setSalario(empleado.getSalario() + 100000);
                }
            } else if ("especialista".equals(empleado.getTipoMedico().getEspecialidad())) {
                empleado.setSalario((int) (empleado.getSalario() + empleado.getSalario() * 0.02));
            }
        }
        return empleado;
    }
}

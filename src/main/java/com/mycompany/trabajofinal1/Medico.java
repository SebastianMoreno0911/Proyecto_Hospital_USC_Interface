package com.mycompany.trabajofinal1;

import Datos.CrearDatos;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SEBASTIAN MORENO
 * @id: 1192792720
 * @fecha: 25/noviembre/2023
 *
 */
public class Medico extends Persona {

    protected String especialidad;// solo agrego 2 para mas manejo (general o especialista)
    protected String hijosMenores7;
    protected Empleado datEmpleado;

    // constructor
    public Medico() {
    }

    public Medico(String nombre, int edad, String genero, String especialidad, String hijosMenores7) {
        super(especialidad, edad, genero);
        this.especialidad = especialidad;
        this.hijosMenores7 = hijosMenores7;

    }

    public Medico(String especialidad, Empleado datEmpleado) {
        this.especialidad = especialidad;
        this.datEmpleado = datEmpleado;
    }

    //getter and setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHijosMenores7() {
        return hijosMenores7;
    }

    public void setHijosMenores7(String hijosMenores7) {
        this.hijosMenores7 = hijosMenores7;
    }

    public Empleado getDatEmpleado() {
        return datEmpleado;
    }

    public void setDatEmpleado(Empleado datEmpleado) {
        this.datEmpleado = datEmpleado;
    }

    public boolean almacenarDatosCita(Cita datosCita) {
        CrearDatos archivo = new CrearDatos("Citas.txt");

        Cita objCita = new Cita();
        //datos paciente
        objCita.setFecha(datosCita.getFecha());
        objCita.setHora(datosCita.getHora());
        objCita.setConsultorio(datosCita.getConsultorio());
        objCita.setMedico(datosCita.getMedico());
        objCita.setValorCita(datosCita.getValorCita());

        Gson gson = new Gson();
        String citaJson = gson.toJson(datosCita);
        archivo.leerArchivo();
        if (archivo.crearArchivo(citaJson)) {
            return true;
        }
        return false;
    }

    public List<Cita> getCitas() {//leer los datos y convertirlos en list 

        CrearDatos archivo = new CrearDatos("Citas.txt");

        List<String> listaCitas = archivo.leerArchivo();
        String sCitas;

        List<Cita> listaJsonCitas = new ArrayList<>();
        for (String item : listaCitas) {
            Gson gson = new Gson();
            Cita objCita = gson.fromJson(item, Cita.class);
            listaJsonCitas.add(objCita);

        }
        return listaJsonCitas;
    }

    public boolean existeCitaPaciente(Cita objCita1) {

        for (Cita rowCita : getCitas()) {
            if (rowCita.paciente.identifiacion == objCita1.paciente.identifiacion
                    && rowCita.medico.nombre.contentEquals(objCita1.medico.nombre)
                    && rowCita.fecha.contentEquals(objCita1.fecha)
                    && rowCita.consultorio.contentEquals(objCita1.consultorio)
                    && rowCita.hora.contentEquals(objCita1.hora)) {

                return true;
            }
        }
        return false;
    }

    public Empleado getMedicoxId(int idMedico) {

        CrearDatos archivo = new CrearDatos("Empleados.txt");

        List<String> listaEmpleados = archivo.leerArchivo();

        for (String item : listaEmpleados) {

            Gson gson = new Gson();
            Empleado objEmpleado = gson.fromJson(item, Empleado.class);
            if (objEmpleado.identificacion == idMedico) {
                return objEmpleado;
            }
        }
        return null;
    }

    public boolean almacenarDatosMedico(Medico objMedicoGuardar) {
        CrearDatos archivo = new CrearDatos("Medicos.txt");

        objMedicoGuardar.setEspecialidad(getEspecialidad());
        objMedicoGuardar.setDatEmpleado(getDatEmpleado());
        objMedicoGuardar.setHijosMenores7(getHijosMenores7());

        Gson gson = new Gson();
        String medicoJson = gson.toJson(objMedicoGuardar);
        archivo.leerArchivo();
        if (archivo.crearArchivo(medicoJson)) {
            return true;
        }

        return false;

    }

    public double calcularBonificacion(Medico objMedico) {

        if ("General".equals(objMedico.getEspecialidad())) {
            objMedico.datEmpleado.setSalario((int) (objMedico.datEmpleado.getSalario() + objMedico.datEmpleado.getSalario() * 0.05));
            if (objMedico.getHijosMenores7().contains("Si")) {
                objMedico.datEmpleado.setSalario(objMedico.datEmpleado.getSalario() + 100000);
            }
        } else if ("Especialista".equals(objMedico.getEspecialidad())) {
            objMedico.datEmpleado.setSalario((int) (objMedico.datEmpleado.getSalario() + objMedico.datEmpleado.getSalario() * 0.02));
        }
        return objMedico.datEmpleado.getSalario();
    }

    public boolean existeMedico(int sIdentificacion) {

        for (Medico objMedico : getMedicos()) {
            if (objMedico.getDatEmpleado().getIdentificacion() == sIdentificacion) {
                return true;
            }
        }
        return false;
    }

    public Medico objexisteMedico(int sIdentificacion) {

        for (Medico objMedico : getMedicos()) {
            if (objMedico.getDatEmpleado().getIdentificacion() == sIdentificacion) {
                return objMedico;
            }
        }
        return null;
    }

    public List<Medico> getMedicos() {
        CrearDatos archivo = new CrearDatos("Medicos.txt");

        List<String> listaMedicos = archivo.leerArchivo();
        String sMedico;

        List<Medico> listaJsonMedicos = new ArrayList<>();
        for (String item : listaMedicos) {
            Gson gson = new Gson();
            Medico objMedico = gson.fromJson(item, Medico.class);
            listaJsonMedicos.add(objMedico);
        }
        return listaJsonMedicos;

    }
    
    public Medico getMedicobyName(String nombreMedico) {
        CrearDatos archivo = new CrearDatos("Medicos.txt");

        List<String> listaMedicos = archivo.leerArchivo();
        String sMedico;

        for (String item : listaMedicos) {
            Gson gson = new Gson();
            Medico objMedico = gson.fromJson(item, Medico.class);
            if (objMedico.getDatEmpleado().getNombre().contains(nombreMedico)) {
                return objMedico;
            }
        }
        return null;
    }
}


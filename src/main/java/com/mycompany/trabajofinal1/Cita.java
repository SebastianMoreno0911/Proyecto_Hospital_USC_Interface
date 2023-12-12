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

public class Cita {
    
    protected String medicoNombre;
    protected String fecha;
    protected String hora;
    protected String consultorio;
    protected Paciente paciente;
    protected Medico medico;
    protected double valorCita;
    protected Hospital hospital;

    // constructor
    public Cita() {

    }

    // get Set
    public String getFecha() {
        return fecha;
    }

    public String getMedicoNombre() {
        return medicoNombre;
    }

    public void setMedicoNombre(String medicoNombre) {
        this.medicoNombre = medicoNombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public double getValorCita() {
        return valorCita;
    }

    public void setValorCita(double valorCita) {
        this.valorCita = valorCita;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
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
        objCita.setMedicoNombre(datosCita.getMedicoNombre());       
        
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

    public boolean existeMedicoDisponible(Cita objCita1) {

        for (Cita rowCita : getCitas()) {
            if (rowCita.medico.nombre.contentEquals(objCita1.medico.nombre)
                    && rowCita.fecha.contentEquals(objCita1.fecha)
                    && rowCita.hora.contentEquals(objCita1.hora)) {

                return true;
            }
        }
        return false;
    }

    public Cita getCitaxId(int idPaciente) {

        CrearDatos archivo = new CrearDatos("Citas.txt");
        Cita datosCita = new Cita();

        List<String> listaCita = archivo.leerArchivo();

        for (String item : listaCita) {

            Gson gson = new Gson();
            Cita objCita = gson.fromJson(item, Cita.class);
            if (objCita.paciente.identifiacion == idPaciente) {
                return objCita;
            }
        }
        return null;

    }

}

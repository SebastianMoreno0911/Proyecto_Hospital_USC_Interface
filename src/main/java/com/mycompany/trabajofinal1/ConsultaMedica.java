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

public class ConsultaMedica {

    protected String fecha;
    protected Medico medico;
    protected String diagnostico;
    protected String tratamiento;
    protected Paciente paciente;
    protected String consultorio;
    protected String nombrePaciente;

    // constructor
    public ConsultaMedica(String fecha, Medico medico, Paciente paciente, String consultorio) {
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        this.consultorio = consultorio;
    }

    public ConsultaMedica() {
    }

    /*public void historiaClinica(String fecha, Paciente paciente, String diagnostico) {
        this.fecha = fecha;
        this.paciente = paciente;
    }*/

    //get and set
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }
    
    public boolean almacenarDatosConsulta(ConsultaMedica datosConsulta) {
        CrearDatos archivo = new CrearDatos("Consultas.txt");

        ConsultaMedica objConsultaMedica = new ConsultaMedica();
        //datos paciente
        objConsultaMedica.setFecha(datosConsulta.getFecha());
        objConsultaMedica.setMedico(datosConsulta.getMedico());
        objConsultaMedica.setPaciente(datosConsulta.getPaciente());
        objConsultaMedica.setDiagnostico(datosConsulta.getDiagnostico());
        objConsultaMedica.setTratamiento(datosConsulta.getTratamiento());

        Gson gson = new Gson();
        String consultaJson = gson.toJson(datosConsulta);
        archivo.leerArchivo();
        if (archivo.crearArchivo(consultaJson)) {
            return true;
        }
        return false;
    }
    
    public List<ConsultaMedica> getConsultaMedicas() {

        CrearDatos archivo = new CrearDatos("Consultas.txt");

        List<String> listaConsultas = archivo.leerArchivo();
        String sCitas;

        List<ConsultaMedica> listaJsonConsultas = new ArrayList<>();
        for (String item : listaConsultas) {
            Gson gson = new Gson();
            ConsultaMedica objconConsultaMedica = gson.fromJson(item, ConsultaMedica.class);
            listaJsonConsultas.add(objconConsultaMedica);

        }
        return listaJsonConsultas;

    }
    
    public List<ConsultaMedica> getConsultaPorPaciente(int idPaciente) {

        CrearDatos archivo = new CrearDatos("Consultas.txt");

        List<String> listaConsultas = archivo.leerArchivo();
        String sCitas;

        List<ConsultaMedica> listaJsonConsultas = new ArrayList<>();
        for (String item : listaConsultas) {
            Gson gson = new Gson();
            ConsultaMedica objconConsultaMedica = gson.fromJson(item, ConsultaMedica.class);
            if (objconConsultaMedica.getPaciente().getIdentifiacion() == idPaciente) {
                listaJsonConsultas.add(objconConsultaMedica);
            }
        }
        return listaJsonConsultas;
    }
    
    public ConsultaMedica getConsultaPorfecha(int idPaciente,String fechaCOnsulta) {
        
        CrearDatos archivo = new CrearDatos("Consultas.txt");

        List<String> listaConsultas = archivo.leerArchivo();
        String sCitas;

        for (String item : listaConsultas) {
            Gson gson = new Gson();
            ConsultaMedica objconConsultaMedica = gson.fromJson(item, ConsultaMedica.class);
            if (objconConsultaMedica.getPaciente().getIdentifiacion() == idPaciente && objconConsultaMedica.getFecha().equals(fechaCOnsulta)) {
                return objconConsultaMedica;
            }
        }
        return null;
    }
    
    
    
    
    
}

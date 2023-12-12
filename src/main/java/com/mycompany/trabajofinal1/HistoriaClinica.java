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
public class HistoriaClinica {

    protected List<ConsultaMedica> consultaMedicas;
    protected Diagnostico diagnostico;

    //get and set
    public List<ConsultaMedica> getConsultaMedicas() {
        return consultaMedicas;
    }

    public void setConsultaMedicas(List<ConsultaMedica> consultaMedicas) {
        this.consultaMedicas = consultaMedicas;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public List<ConsultaMedica> getHistoriaPorPaciente(int idPaciente) {

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

    public List<String> obtenerFechasConsultas(int idPaciente) {
        ConsultaMedica objConsultaMedica = new ConsultaMedica();
        
        List<String> fechasConsultas = new ArrayList<>();
        List<ConsultaMedica> consultasPaciente = objConsultaMedica.getConsultaPorPaciente(idPaciente);

        for (ConsultaMedica consulta : consultasPaciente) {
            fechasConsultas.add(consulta.getFecha());
        }

        return fechasConsultas;
    }

}

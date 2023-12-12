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
public class Paciente extends Persona {

    protected Persona persona;
    protected String regimen;
    protected double salario;
    protected int estrato;
    protected Cita cita;
    protected int identifiacion;
    protected String direccion;
    protected HistoriaClinica historiaClinica;
    protected String fechaConsulta;

    public Paciente(String nombre, int edad, String genero, String regimen, double salario, int estrato) {
        super(nombre, edad, genero);
        this.regimen = regimen;
        this.salario = salario;
        this.estrato = estrato;
    }

    public Paciente() {

    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public double pagoConsulta() {
        try {// excepcion
            double valorConsulta = 20000;// defino el valor de todas las consultas, puede cambiar con entrada por teclado
            // o como sea necesario
            if (regimen.toLowerCase().equals("contributivo")) {
                if (salario < 2000000) {
                    return valorConsulta * 0.1081;// segun lo investigado 10.81% si salario es menor a 2 SMLMV
                } else if (salario > 2000000 || salario < 5000000) {
                    return valorConsulta * 0.1156;// si salario es mayor a 2 SMLMV y menor a 5 SMLMV para el 11,56%
                } else if (salario > 5000000) {
                    return valorConsulta * 0.1169;// si salario es mayor a 5 SMLMV paga el 11,69%
                }
            } else if (regimen.toLowerCase().equals("subsidiado")) {
                if (estrato == 0) {
                    return 0;// no tiene copago
                } else if (estrato == 1) {
                    return salario * 0.01;// segun el texto
                } else if (estrato == 2) {
                    return salario * 0.02;// segun el texto
                }
            }
        } catch (Exception e) {
            System.out.print("Tipo de regimen errado\n1- contributivo\n2- subsidiado");
        }
        return 0;
    }

    // getter and setters
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    /*public double getValorConsulta() {
        return valorConsulta;
    }*/

 /*public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }*/
    public int getIdentifiacion() {
        return identifiacion;
    }

    public void setIdentifiacion(int identifiacion) {
        this.identifiacion = identifiacion;
    }

    public boolean almacenarDatosPaciente(Paciente datoPaciente) {//crear para cada interfaz
        CrearDatos archivo = new CrearDatos("Pacientes.txt");

        //obj con datos que solo necesito
        Paciente pacienteGuardar = new Paciente();
        pacienteGuardar.setNombre(datoPaciente.getNombre());
        pacienteGuardar.setIdentifiacion(datoPaciente.getIdentifiacion());
        pacienteGuardar.setEdad(datoPaciente.getEdad());
        pacienteGuardar.setFechaConsulta(datoPaciente.fechaConsulta);
        pacienteGuardar.setGenero(datoPaciente.getGenero());
        pacienteGuardar.setDireccion(datoPaciente.getDireccion());
        pacienteGuardar.setRegimen(datoPaciente.getRegimen());
        pacienteGuardar.setEstrato(datoPaciente.getEstrato());

        Gson gson = new Gson();
        String pacienteJson = gson.toJson(datoPaciente);
        archivo.leerArchivo();
        if (archivo.crearArchivo(pacienteJson)) {
            return true;
        }
        return false;
    }

    public String getInformacion(){
        return String.format("Nombre: %s\nIdentificación: %d\nEdad: %d\nGénero: %s\nDirección: %s\nRegimen: %s\nEstrato: %d",
                getNombre(),getIdentifiacion(),getEdad(),getGenero(),getDireccion(),getRegimen(),getEstrato());
    }
    
    public List<Paciente> getPacientes() {//leer los datos y convertirlos en list para todos

        CrearDatos archivo = new CrearDatos("Pacientes.txt");

        List<String> listaPacientes = archivo.leerArchivo();
        String sPaciente;

        List<Paciente> listaJsonPacientes = new ArrayList<>();
        for (String item : listaPacientes) {
            Gson gson = new Gson();
            Paciente objPaciente = gson.fromJson(item, Paciente.class);
            listaJsonPacientes.add(objPaciente);

        }
        return listaJsonPacientes;

    }

    public boolean existePaciente(int sIdentificacion) {//para todos

        for (Paciente objPaciente : getPacientes()) {
            if (objPaciente.identifiacion == sIdentificacion) {
                return true;
            }
        }
        return false;

    }

    public Paciente getPacientexId(int idPaciente) {//leer los datos y convertirlos en list //para todos

        CrearDatos archivo = new CrearDatos("Pacientes.txt");
        Paciente datosPaciente = new Paciente();

        List<String> listaPacientes = archivo.leerArchivo();

        for (String item : listaPacientes) {

            Gson gson = new Gson();
            Paciente objPaciente = gson.fromJson(item, Paciente.class);
            if (objPaciente.identifiacion == idPaciente) {
                return objPaciente;
            }

        }
        return null;
    }

    public Paciente getPacientexNombre(int nombrePaciente) {//leer los datos y convertirlos en list 

        CrearDatos archivo = new CrearDatos("Pacientes.txt");
        Paciente datosPaciente = new Paciente();

        List<String> listaPacientes = archivo.leerArchivo();

        for (String item : listaPacientes) {

            Gson gson = new Gson();
            Paciente objPaciente = gson.fromJson(item, Paciente.class);
            if (objPaciente.identifiacion == nombrePaciente) {
                return objPaciente;
            }

        }
        return null;

    }

    

}

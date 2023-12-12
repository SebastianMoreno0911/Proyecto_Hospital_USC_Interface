package com.mycompany.trabajofinal1;

import Datos.CrearDatos;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SEBASTIAN MORENO
 * @id: 1192792720
 * @fecha: 25/noviembre/2023
 *
 */
public class Empleado extends Persona {

    protected int identificacion;
    protected String cargo;
    protected String fechaIngreso;
    protected String nombreJefe;
    protected double salario;
    protected Medico tipoMedico;

    // contructor
    public Empleado() {
    }

    public Empleado(String nombre, int edad, String genero, double salario, String nombreJefe) {
        super(nombre, edad, genero);
        this.salario = salario;
        this.nombreJefe = nombreJefe;
    }

    public Empleado(String nombre, int edad, String genero, int identificacion, String cargo, String fechaIngreso,
            String nombreJefe, int salario, Medico tipoMedico) {
        super(nombre, edad, genero);
        this.identificacion = identificacion;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.nombreJefe = nombreJefe;
        this.salario = salario;
        this.tipoMedico = tipoMedico;
    }

    //get y setters
    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombreJefe() {
        return nombreJefe;
    }

    public void setNombreJefe(String nombreJefe) {
        this.nombreJefe = nombreJefe;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Medico getTipoMedico() {
        return tipoMedico;
    }

    public void setTipoMedico(Medico tipoMedico) {
        this.tipoMedico = tipoMedico;
    }

    public boolean almacenarDatosEmpleado(Empleado empleadoGuardar) {
        CrearDatos archivo = new CrearDatos("Empleados.txt");

        empleadoGuardar.setNombre(getNombre());
        empleadoGuardar.setIdentificacion(getIdentificacion());
        empleadoGuardar.setCargo(getCargo());
        empleadoGuardar.setGenero(getGenero());
        empleadoGuardar.setSalario(getSalario());
        empleadoGuardar.setFechaIngreso(fechaIngreso);
        empleadoGuardar.setNombreJefe(getNombreJefe());

        Gson gson = new Gson();
        String EmpleadoJson = gson.toJson(empleadoGuardar);
        archivo.leerArchivo();
        if (archivo.crearArchivo(EmpleadoJson)) {
            return true;
        }
        return false;
    }

    public List<Empleado> getEmpleados() {
        CrearDatos archivo = new CrearDatos("Empleados.txt");

        List<String> listaEmpleados = archivo.leerArchivo();
        String sEmpleado;

        List<Empleado> listaJsonEmpleados = new ArrayList<>();
        for (String item : listaEmpleados) {
            Gson gson = new Gson();
            Empleado objEmpleado = gson.fromJson(item, Empleado.class);
            listaJsonEmpleados.add(objEmpleado);
        }
        return listaJsonEmpleados;

    }

    public boolean existeEmpleado(int sIdentificacion) {

        for (Empleado objEmpleado : getEmpleados()) {
            if (objEmpleado.identificacion == sIdentificacion) {
                return true;
            }
        }
        return false;
    }

    public List<Empleado> getMedicos() {
        CrearDatos archivo = new CrearDatos("Empleados.txt");

        List<String> listaEmpleados = archivo.leerArchivo();
        String sEmpleado;

        List<Empleado> listaJsonEmpleados = new ArrayList<>();
        for (String item : listaEmpleados) {
            Gson gson = new Gson();
            Empleado objEmpleado = gson.fromJson(item, Empleado.class);
            if (objEmpleado.cargo.contains("Medico")) {
                listaJsonEmpleados.add(objEmpleado);
            }

        }
        return listaJsonEmpleados;

    }

    public void updateEmpleado(Empleado objEmpleadoActualizar) {

        CrearDatos archivo = new CrearDatos("Empleados.txt");
        archivo.updateEmpleado(objEmpleadoActualizar);
        
        /*List<String> listaEmpleados = archivo.leerArchivo();
        //Gson strignSon = new Gson();
        for (String item : listaEmpleados) {
            Gson gson = new Gson();
            Empleado objEmpleado = gson.fromJson(item, Empleado.class);
            
            //String EmpleadoJsonNew = strignSon.toJson(objEmpleadoActualizar);
            if (objEmpleado.identificacion == objEmpleadoActualizar.identificacion) {
                objEmpleadoActualizar.tipoMedico.datEmpleado = null;
                
                listaEmpleados.add(gson.toJson(objEmpleado));

                
            }
        }
        archivo.actualizarArchivo(listaEmpleados);*/
    }
    
    
}

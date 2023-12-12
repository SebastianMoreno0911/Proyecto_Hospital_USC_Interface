package Datos;

import com.google.gson.Gson;
import java.io.*;
import com.mycompany.trabajofinal1.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SEBASTIAN MORENO
 * @id: 1192792720
 * @fecha: 25/noviembre/2023
 *
 */
public class CrearDatos {

    private String nombreArchivo;

    public CrearDatos(String nombreArchivo) {//no tocar
        this.nombreArchivo = nombreArchivo;
    }

    //Metodos
    public List<String> leerArchivo() {
        List<String> lista = new ArrayList<>();

        try {

            String path = System.getProperty("user.dir") + "\\src\\main\\java\\Datos\\";
            File file = new File(path + nombreArchivo);
            
            if (!file.exists()) {
                return lista;
            }

            FileReader lectorArchivo = new FileReader(path + nombreArchivo);
            BufferedReader entrada = new BufferedReader(lectorArchivo);

            String lectura;
            while ((lectura = entrada.readLine()) != null) {
                lista.add(lectura);
            }
            entrada.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }

        return lista;
    }

    public boolean actualizarArchivo(List<String> lineas) {

        try {
            String path = System.getProperty("user.dir") + "\\src\\main\\java\\Datos\\";
            FileWriter escritorArchivo = new FileWriter(path + nombreArchivo);
            try (BufferedWriter salida = new BufferedWriter(escritorArchivo)) {
                for (String linea : lineas) {
                    salida.write(linea);
                    salida.newLine();
                }
            }
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar archivo");
        }
        return false;
    }

    public boolean crearArchivo(String Contenido) {//no tocar
        boolean fueCreado = false;

        try {
            //String path = "C:\\Users\\SEBASTIAN MORENO\\OneDrive\\Escritorio\\NetBeans Documents\\TrabajoFinal1\\src\\main\\java\\Datos\\";
            String path = System.getProperty("user.dir") + "\\src\\main\\java\\Datos\\";
            File file = new File(path + nombreArchivo);

            if (!file.exists()) {

                FileWriter fileWriter = new FileWriter(path + nombreArchivo, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                fileWriter.write(Contenido);
                fileWriter.flush();
                fileWriter.close();
                fueCreado = true;
            } else {
                FileWriter fileWriter = new FileWriter(path + nombreArchivo, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                fileWriter.append("\n" + Contenido);
                fileWriter.flush();
                fileWriter.close();
                fueCreado = true;
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al Crear el Archivo.");
        }
        return fueCreado;
    }

    public void updateEmpleado(Empleado objEmpleadoActualizar) {
        List<String> lineas = new ArrayList<>();

        try {
            String path = System.getProperty("user.dir") + "\\src\\main\\java\\Datos\\";
            FileReader leerArchivo = new FileReader(path + nombreArchivo);
            BufferedReader entrada = new BufferedReader(leerArchivo);

            String lectura;
            while ((lectura = entrada.readLine()) != null) {
                Gson gson = new Gson();
                Empleado objEmpleado = gson.fromJson(lectura, Empleado.class);

                //String EmpleadoJsonNew = strignSon.toJson(objEmpleadoActualizar);
                if (objEmpleado.getIdentificacion() == objEmpleadoActualizar.getIdentificacion()) {
                    lineas.add(gson.toJson(objEmpleadoActualizar));
                }
            }
            entrada.close();

            FileWriter escritorArchivo = new FileWriter(path + nombreArchivo);
            BufferedWriter salida = new BufferedWriter(escritorArchivo);

            for (String linea : lineas) {
                salida.write(linea);
                salida.newLine();
            }

            salida.close();
            System.out.println("Empleado Modificado Correctamente.");
        } catch (Exception ex) {
            System.out.print("Error en Leer/Escribir el Archivo.");
        }
    }

    public static void eliminarArchivo(Scanner scanner) {
        List<String> archivosDisponibles = obtenerArchivosDisponibles();
        if (!archivosDisponibles.isEmpty()) { //si existen archivos 
            System.out.println("Archivos disponibles:");
            for (int i = 0; i < archivosDisponibles.size(); i++) {
                System.out.println((i + 1) + ". " + archivosDisponibles.get(i)); // Se muestra la lista de archivos disponibles
            }
            System.out.print("Ingrese el Numero del Archivo que Desea Eliminar: ");
            int seleccion = scanner.nextInt();

            if (seleccion >= 1 && seleccion <= archivosDisponibles.size()) {
                String nombreArchivoAEliminar = archivosDisponibles.get(seleccion - 1);
                File archivo = new File(nombreArchivoAEliminar);
                if (archivo.exists()) {
                    archivo.delete(); //se eleimina el archivo seleccionado
                    System.out.println("Se elimino el Archivo: " + nombreArchivoAEliminar);
                } else {
                    System.out.println("El Archivo no Existe: " + nombreArchivoAEliminar);
                }
            } else {
                System.out.println("Seleccion de Archivo no Valida.");
            }
        } else {
            System.out.println("No hay Archivos Disponibles para Eliminar.");
        }
    }
    
    public static List<String> obtenerArchivosDisponibles() { //Metodo para la listas en el directorio
        List<String> archivos = new ArrayList<>();
        File directorioActual = new File(System.getProperty("user.dir"));

        if (directorioActual.isDirectory()) {
            File[] archivosEnDirectorio = directorioActual.listFiles();
            if (archivosEnDirectorio != null) {
                for (File archivo : archivosEnDirectorio) {
                    if (archivo.isFile()) {
                        archivos.add(archivo.getName()); // Se agregan los nombres de archivos disponibles a la lista
                    }
                }
            }
        }

        return archivos;
    }

}

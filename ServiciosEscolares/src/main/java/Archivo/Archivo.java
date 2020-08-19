package Archivo;

import Alumnos.*;
import java.io.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Archivo {

    File file;
    FileWriter fileWriter;
    FileReader fileReader;
    BufferedReader bufferedReader;

    public boolean validarArchivo(String nombreArchivo) {
        File file = new File(nombreArchivo);
        return file.exists();

    }

    public void crearArchivo(String nombreArchivo) {
        try {
            file = new File(nombreArchivo);
            if (file.createNewFile()) {
                System.out.println("El archivo se ha creado");
            }
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    public boolean escribirAlumnoRegular(Regulares regulares) {
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(regulares.getNombre() + "%" + regulares.getApellidos() + "%" + regulares.getEdad()
                    + "%" + regulares.getGenero() + "%" + regulares.getMatricula() + "%" + regulares.getGrupo() + "%" + regulares.getCarrera() + "\r\n");

            fileWriter.close();
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    /* La otra copia
     public boolean escribirAlumnoRegular(Regulares regulares) {
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write("\n\nNombre : " + regulares.getNombre() + "\nApellidos: " + regulares.getApellidos() + "\nEdad: " + regulares.getEdad()
                    +  "\nGenero: " + regulares.getGenero()+ "\nMatricula: " + regulares.getMatricula() + "\nGrupo: " + regulares.getGrupo() + "\nCarrera: " + regulares.getCarrera());

            fileWriter.close();
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }*/
    public boolean escribirAlumnoIrregular(Irregulares irregulares) {
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(irregulares.getNombre() + "%" + irregulares.getApellidos() + "%" + irregulares.getEdad()
                    + "%" + irregulares.getGenero() + "%" + irregulares.getMatricula() + "%" + irregulares.getGrupo() + "%" + irregulares.getCarrera() + "%" + irregulares.getMatReprobadas());

            fileWriter.close();
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return true;
        }
    }

    public boolean escribirAlumnoEgresado(Egresados egresados) {
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(egresados.getNombre() + "%" + egresados.getApellidos() + "%" + egresados.getEdad()
                    + "%" + egresados.getGenero() + "%" + egresados.getMatricula() + "%" + egresados.getGrupo() + "%" + egresados.getCarrera());

            fileWriter.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return true;
        }
    }
}

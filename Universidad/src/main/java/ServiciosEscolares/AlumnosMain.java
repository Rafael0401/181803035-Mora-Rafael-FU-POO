package ServiciosEscolares;

import Archivo.*;
import Alumnos.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class AlumnosMain {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        List<Alumnos> alumnos = new ArrayList<>();
        Archivo archivo = new Archivo();
        File file = new File("Alumnos");
      
        System.out.println(file.mkdir());
        String archivoRegular = "Alumnos/Regulares.txt";
        String archivoIrregular = "Alumnos/Irregulares.txt";
        String archivoEgresado = "Alumnos/Egresados.txt";

        int op;

        do {
            int op2 = 0, op3 = 0, op4 = 0;
            
            System.out.println("        MENU PRINCIPAL\n");
            System.out.println("    1) Agregar nuevo alumno");
            System.out.println("    2) Editar alumno");
            System.out.println("    3) Mostrar Alumnos Inscritos");
            System.out.println("    4) Salir");
            op = leer.nextInt();

            switch (op) {

                case 1:
                    while (op2 < 4) {
                        System.out.println("       AGREGAR NUEVO ALUMNO\n");
                        System.out.println("    1) Regular");
                        System.out.println("    2) Irregular");
                        System.out.println("    3) Egresado");
                        System.out.println("    4) Regresar al menu principal");
                        op2 = leer.nextInt();
                        leer.nextLine();
                        switch (op2) {

                            case 1:
                                Regulares regular = new Regulares().agregarAlumnoRegular();
                                archivo.agregarAlumnoregular(regular, archivoRegular);
                                //alumnos.add(regular);
                                break;

                            case 2:
                                Irregulares irregular = new Irregulares().agregarAlumnoIrregular();
                                archivo.agregarAlumnoIrregular(irregular, archivoIrregular);
                                //    alumnos.add(irregular);
                                break;
                            case 3:
                                Egresados egresado = new Egresados().agregarAlumnoEgresado();
                                archivo.agregarAlumnoEgresado(egresado, archivoEgresado);
                                // alumnos.add(egresado);
                                break;

                        }

                    }
                    break;

                case 2:
                    while (op3 < 4) {
                        System.out.println("       EDITAR ALUMNO\n");
                        System.out.println("    1) Regular");
                        System.out.println("    2) Irregular");
                        System.out.println("    3) Egresado");
                        System.out.println("    4) Regresar al menu principal");
                        op3 = leer.nextInt();

                        switch (op3) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                        }
                    }

                    break;

                case 3:
                    while (op4 < 4) {
                        System.out.println("       MOSTRAR ALUMNOS INSCRITOS\n");
                        System.out.println("    1) Lista de alumnos regulares");
                        System.out.println("    2) Lista de alumnos irregulares");
                        System.out.println("    3) Lista de alumnos egresados");
                        System.out.println("    4) Regresar al menu principal");
                        op4 = leer.nextInt();
                        switch (op4) {

                            case 1:
                                archivo.validarArchivo(op4);
                                System.out.println(" Lista de alumnos regulares");
                                archivo.cargarDatosAlumnos(archivoRegular);

                                break;

                            case 2:
                                archivo.validarArchivo(op4);
                                System.out.println(" Lista de alumnos irregulares");
                                archivo.cargarDatosAlumnos(archivoIrregular);
                                break;

                            case 3:
                                archivo.validarArchivo(op4);
                                System.out.println(" Lista de alumnos egresados");
                                archivo.cargarDatosAlumnos(archivoEgresado);
                                break;

                        }
                    }

                    break;
            }
        } while (op < 4);
    }

}

package Alumnos;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Irregulares extends Alumnos {

    Scanner leer = new Scanner(System.in);
    private int MatReprobadas;

    public Irregulares() {
    }

    public Irregulares(String Nombre, String Apellidos, int Edad, String Genero, long Matricula, String Grupo, String Carrera, int MatReprobadas) {
        super(Nombre, Apellidos, Edad, Genero, Matricula, Grupo, Carrera);
        this.MatReprobadas = MatReprobadas;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String getApellidos() {
        return Apellidos;
    }

    @Override
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    @Override
    public String getGenero() {
        return Genero;
    }

    @Override
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public int getEdad() {
        return Edad;
    }

    @Override
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public long getMatricula() {
        return Matricula;
    }

    @Override
    public void setMatricula(long Matricula) {
        this.Matricula = Matricula;
    }

    @Override
    public String getGrupo() {
        return Grupo;
    }

    @Override
    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    @Override
    public String getCarrera() {
        return Carrera;
    }

    @Override
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getMatReprobadas() {
        return MatReprobadas;
    }

    public void setMatReprobadas(int MatReprobadas) {
        this.MatReprobadas = MatReprobadas;
    }

    public Irregulares agregarAlumnoIrregular() {

        System.out.println(" Introduzca el nombre del alumno");
        Nombre = leer.nextLine();

        System.out.println(" Introduzca los apellidos del alumno");
        Apellidos = leer.nextLine();

        System.out.println(" Introduzca el genero del alumno");
        Genero = leer.nextLine();

        System.out.println(" Introduzca la edad del alumno");
        Edad = leer.nextInt();

        System.out.println(" Introduzca la matricula del alumno");
        Matricula = leer.nextLong();

        leer.nextLine();
        System.out.println(" Introduzca el grupo del alumno");
        Grupo = leer.nextLine();

        System.out.println(" Introduzca el programa academico del alumno");
        Carrera = leer.nextLine();

        System.out.println(" Introduzca las materias reprobadas del alumno");
        MatReprobadas = leer.nextInt();

        return new Irregulares(Nombre, Apellidos, Edad, Genero, Matricula, Grupo, Carrera, MatReprobadas);
    }

    @Override
    public String toString() {
        return "Irregulares{" + super.toString() + "\nMaterias reprobadas: " + MatReprobadas + '}';
    }

}

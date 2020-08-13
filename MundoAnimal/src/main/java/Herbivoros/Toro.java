package Herbivoros;
import Animales.*;
/**
 *
 * @author Carlos
 */
public class Toro extends Herbivoro{
    private static final boolean sonido = true;
    private static final String ruido = "MUUU";
    private static final String genero = "Macho";
    private static final String nombreCientifico = "bos prinigenious taurus";
    private static final String habitat = "campo";
    private static final String reyno = "animalia";

    public Toro() {
    }

    public Toro( int edad) {
        super(Toro.genero, Toro.habitat, edad, Toro.reyno, Toro.nombreCientifico, tipoAlimento);
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     @Override
    public String toString() {
        return "Toro" + super.toString() + "\nRuido: " + ruido;
    }
}

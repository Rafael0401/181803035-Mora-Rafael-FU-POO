package Herbivoros;

/**
 *
 * @author Carlos
 */
public class Vaca extends Herbivoro {

    private static final boolean sonido = true;
    private static final String ruido = "muuuuu";
    private static final String genero = "hembra";
    private static final String nombreCientifico = "bos prinigenious taurus";
    private static final String habitat = "campo";
    private static final String reyno = "animalia";

    public Vaca() {
    }

    public Vaca(int edad) {
        super(Vaca.genero, Vaca.habitat, edad, Vaca.reyno, Vaca.nombreCientifico, tipoAlimento);
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
        return "Vaca" + super.toString() + "\nRuido: " + ruido;
    }
}

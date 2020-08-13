
package Carnivoros;

/**
 *
 * @author Carlos
 */
import Animales.Animal;

public class Carnivoro extends Animal {

    static final String tipoAlimento = "Carnivoro";

    public Carnivoro() {
    }

    public Carnivoro(String genero, String habitat, int edad, String reyno, String nombreCientifico, String tipoAlimento) {
        super(genero, habitat, edad, reyno, nombreCientifico, Carnivoro.tipoAlimento);
    }


}

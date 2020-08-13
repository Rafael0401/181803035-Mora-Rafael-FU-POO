package Omnivoros;

import Animales.*;

/**
 *
 * @author Carlos
 */
public class Omnivoro extends Animal {

    static final String tipoAlimento = "Omnivoro";

    public Omnivoro() {
    }

    public Omnivoro(String genero, String habitat, int edad, String reyno, String nombreCientifico, String tipoAlimento) {
        super(genero, habitat, edad, reyno, nombreCientifico, Omnivoro.tipoAlimento);
    }

    
}

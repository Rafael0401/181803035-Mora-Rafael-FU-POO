package Herbivoros;

import Animales.*;
/**
 *
 * @author Carlos
 */
public class Herbivoro extends Animal {
    static final String tipoAlimento="Herbivoro"; 

    public Herbivoro() {
    }

    public Herbivoro(String genero, String habitat, int edad, String reyno, String nombreCientifico, String tipoAlimento) {
        super(genero, habitat, edad, reyno, nombreCientifico, Herbivoro.tipoAlimento);
    }


    
    
}

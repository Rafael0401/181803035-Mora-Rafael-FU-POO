package mainAnimales;

import Animales.*;
import Herbivoros.*;
import Carnivoros.*;
import Omnivoros.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class mainMundoAnimal {

    public static void main(String args[]) {
        Vaca vaca1 = new Vaca(10);
        Vaca vaca2 = new Vaca(11);
        Vaca vaca3 = new Vaca(12);
        Vaca vaca4 = new Vaca(13);
        Vaca vaca5 = new Vaca(14);

        Toro toro1 = new Toro(1);
        Herbivoro toro2 = new Toro(2);
        Animal toro3 = new Toro(3);

        Zorro zorro1 = new Zorro(4);

        List<Animal> vacas = new ArrayList<>();
        vacas.add(vaca1);
        vacas.add(vaca2);
        vacas.add(vaca3);
        vacas.add(vaca4);
        vacas.add(vaca5);
        vacas.add(toro1);
        vacas.add(0, zorro1);
        System.out.println(vacas.size());

        for (Animal vaca : vacas) {
            System.out.println(vaca);
        }

    }
}


import java.util.Scanner;

public class MainJuego {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valor;
        Personaje p1 = new Personaje("Samuel");
        System.out.println(p1.arma.menuAk());
        valor = leer.nextInt();
        p1.equiparArma(valor);
        System.out.println(p1);
        Personaje p2 = new Personaje("Rafael");
        System.out.println(p2.arma.menuAk());
        valor = leer.nextInt();
        p2.equiparArma(valor);
        System.out.println(p2);

        System.out.println("El daño que hara es de: " + p2.arma.disparar());
        System.out.println(p2.arma.danio);
        p1.vida-=p2.arma.disparar();
        System.out.println(p1);

    }


}


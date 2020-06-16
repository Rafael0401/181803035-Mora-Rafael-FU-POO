
public class Personaje {

    int vida;
    String nombre;
    Ak arma;
    int danio2;

    public Personaje() {
        this.vida = 100;
    }

    public Personaje(String nombre) {
        this();

        this.nombre = nombre;
    }

    public void equiparArma(int valor) {
        switch (valor) {
            case 1:
                this.arma = new Ak("Bronce", 5, 75, 5, 1000, 10, 10);
                this.danio2 = 10;
                break;
            case 2:
                this.arma = new Ak("Plata", 8, 70, 4.5, 2300, 11, 9.8);
                this.danio2 = 11;
                break;
            case 3:
                this.arma = new Ak("Oro", 10, 85, 4.3, 2500, 13, 9.7);
                this.danio2 = 13;
                break;
            case 4:
                this.arma = new Ak("Diamante", 20, 95, 3, 4000, 20, 9.4);
                this.danio2 = 20;
                break;
            case 5:
                this.arma = new Ak("Adamantium", 30, 100, 1, 10000, 27, 8);
                this.danio2 = 27;
                break;

        }

    }

    public String disparar() {

        return " Te estoy disparando con un daño de " + danio2+"\n";
    }

    @Override
    public String toString() {
        return "Vida: " + vida + "\nNombre: " + nombre + "\nArma: " + arma;
    }
}


public class Personaje {

    int vida;
    String nombre;
    Ak arma;

    public Personaje() {
        this.vida = 100;
    }

    public Personaje(String nombre) {
        this();

        this.nombre = nombre;
        this.arma = new Ak();
    }

    public void equiparArma(int valor) {
        arma = new Ak(valor);

    }

    public void recibirDanio(double danio) {
        this.vida -= danio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nVida: " + vida + "\nArma: " + arma;
    }
}

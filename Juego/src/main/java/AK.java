
public class AK {
    //atributos del objeto de manera general

    String tipo = "";
    int cargador = 0;
    int precision = 0;
    double velocidadCarga = 0;
    double precio = 0;
    int danio = 0;
    double velocidadDisparo = 0;

    //Constructor con un parametro
    public AK(String tipoMandado) {
        tipo = tipoMandado;
    }

    public AK(String tipo, int cargador, int precision, double velocidadCarga, double precio, int danio, double velocidadDisparo) {
        this.tipo = tipo;
        this.cargador = cargador;
        this.precision = precision;
        this.velocidadCarga = velocidadCarga;
        this.precio = precio;
        this.danio = danio;
        this.velocidadDisparo = velocidadDisparo;
    }

    //Constructor vacio
    public AK() {

    }

    //acciones-metodos, son las acciones o iteraciones del objeto
    public String disparar() {
        return "Te estoy disparando con un daño de " + danio;
    }

    public void apuntar() {
    }

    public void recargar() {
    }

//metodo predefinido por Oracle
    @Override
    public String toString() {
        return "AK{" + "Tipo=" + tipo + "\n Cargador=" + cargador + "\n Precision=" + precision + "\n Velocidad de carga=" + velocidadCarga + "\n Precio=" + precio + "\n Danio=" + danio + "\n Velocidad de disparo=" + velocidadDisparo + '}';
    }
}

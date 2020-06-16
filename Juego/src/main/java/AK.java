
public class Ak {
    //atributos del objeto de manera general

    String tipo ;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int danio;
    double velocidadDisparo;

    public Ak(String tipo, int cargador, int precision, double velocidadCarga, double precio, int danio, double velocidadDisparo) {
        this.tipo = tipo;
        this.cargador = cargador;
        this.precision = precision;
        this.velocidadCarga = velocidadCarga;
        this.precio = precio;
        this.danio = danio;
        this.velocidadDisparo = velocidadDisparo;
    }

    
    //Constructor vacio
    public Ak() {

    }

    //acciones-metodos, son las acciones o iteraciones del objeto
  

 /*   public void apuntar() {
    }

    public void recargar() {
    }*/

//metodo predefinido por Oracle
    @Override
    public String toString() {
        return "Ak{" + "Tipo=" + tipo + "\n Cargador=" + cargador + "\n Precision=" + precision + "\n Velocidad de carga=" + velocidadCarga + "\n Precio=" + precio + "\n Daño=" + danio + "\n Velocidad de disparo=" + velocidadDisparo + '}';
    }
}


public class AK {
    //atributos del objeto de manera general

    String tipo = "";
    int cargador = 0;
    int precision = 0;
    double velocidadCarga = 0;
    double precio = 0;
    int danio = 0;
    double velocidadDisparo = 0;

    //acciones-metodos, son las acciones o iteraciones del objeto
    public void disparar() {
        System.out.println("Te estoy disparando con un daño de" + danio);
    }

    public void apuntar() {
    }

    public void recargar() {
    }

    @Override
    public String toString() {
        return "AK{" + "Tipo=" + tipo + ", Cargador=" + cargador + ", Precision=" + precision + ", Velocidad de carga=" + velocidadCarga + ", Precio=" + precio + ", Danio=" + danio + ", Velocidad de disparo=" + velocidadDisparo + '}';
    }
}

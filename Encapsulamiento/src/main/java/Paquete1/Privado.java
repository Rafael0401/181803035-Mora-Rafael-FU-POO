
package Paquete1;

/**
 *
 * @author Carlos
 */
public class Privado {
    private String privado;

    public void setPrivado(String privado) {
        this.privado = privado;
    }

    public String getPrivado() {
        return this.privado;
    }
    
    @Override
    public String toString() {
        return "Privado {" + privado + '}';
    }
    
}

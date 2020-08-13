
package Paquete1;

/**
 *
 * @author Carlos
 */
public class Protegido {
    protected String proteger;

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Protegido {").append(proteger);
        sb.append('}');
        return sb.toString();
    }  
}


package Animales;

/**
 * @author: Carlos Rafael Mora Beltran :v
 */
public class Animal {
    protected String genero;
    protected String habitat;
    protected int edad;
    protected String reyno;
    protected String nombreCientifico;
    protected String tipoAlimento;

    public Animal() {
    }

    public Animal(String genero, String habitat, int edad, String reyno, String nombreCientifico, String tipoAlimento) {
        this.genero = genero;
        this.habitat = habitat;
        this.edad = edad;
        this.reyno= reyno;
        this.nombreCientifico = nombreCientifico;
        this.tipoAlimento = tipoAlimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    @Override
    public String toString() {
        return "{" + "genero=" + genero + ", habitat=" + habitat + ", edad=" + edad + ", reyno=" + reyno + ", nombreCientifico=" + nombreCientifico + ", tipoAlimento=" + tipoAlimento + '}';
    }
    
    
    
}

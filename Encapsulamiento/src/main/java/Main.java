/**
 *
 * @author Carlos
 */
import Paquete1.Defecto;
import Paquete1.Privado;
import Paquete1.Publica;
import Paquete1.Protegido;

public class Main {
    public static void main(String args []){
        Publica publicoObj=new Publica();
        publicoObj.publico="soy un atributo publico";
        System.out.println(publicoObj.toString());
        
        Privado privadoObj=new Privado();
        privadoObj.setPrivado("soy un atributo privado");
        System.out.println(privadoObj.toString());
        
        Protegido protegerObj=new Protegido();
        protegerObj.proteger="soy un atributo protegido";
        System.out.println(protegerObj.toString());
        
        Defecto defectoObj=new Defecto();
        defectoObj.defecto="soy un atributo por defecto";
        System.out.println(defectoObj.toString());
    } 
}

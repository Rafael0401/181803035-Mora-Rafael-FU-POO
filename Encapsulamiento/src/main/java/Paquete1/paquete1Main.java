
package Paquete1;

/**
 *
 * @author Carlos
 */
public class paquete1Main {
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

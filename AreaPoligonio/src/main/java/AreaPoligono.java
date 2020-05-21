
import java.util.Scanner;
public class AreaPoligono {
    public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        double apotema,perimetro,area,longitud;
        int lados;
        System.out.println("Introduzca el numero de lados del poligono");
       lados=leer.nextInt();
       System.out.println("Introduzca la longitud que miden los lados del poligono");
       longitud=leer.nextDouble();
     perimetro=longitud*lados;
        System.out.println("Introduzca el apotema del perimetro: ");
        apotema=leer.nextDouble();
        area=perimetro*apotema/2;
        System.out.println("El area del poligono es de: "+area);
        
    }
}

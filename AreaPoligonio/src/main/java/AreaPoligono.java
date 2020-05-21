
import java.util.Scanner;
public class AreaPoligono {
    public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        double apotema,perimetro,area;
        System.out.println("Introduzca el perimetro del poligono");
       perimetro=leer.nextDouble();
        System.out.println("Introduzca el apotema del perimetro: ");
        apotema=leer.nextDouble();
        area=perimetro*apotema/2;
        System.out.println("El area del poligono es de: "+area);
        
    }
}


import java.util.Scanner;
public class Piezas {
      public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        double porcentaje;
        int piezas,defecto;
        System.out.println("Introduzca el total de piezas producidas");
        piezas=leer.nextInt();
       System.out.println("Introduzca la numero de piezas defectuosas");
        defecto=leer.nextInt();
        porcentaje=defecto*100/piezas;
        System.out.println("Porcentaje de piezas rechazadas por defectos de fabricacion: "+porcentaje+"%");
        
        
    }
}

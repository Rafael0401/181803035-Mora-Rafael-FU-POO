
import java.util.Scanner;

public class Edad {
      public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        int edad,nacimiento,actual;
        System.out.println("Introduzca el año que nacio");
        nacimiento=leer.nextInt();
        System.out.println("Introduzca el año actual");
        actual=leer.nextInt();
        edad=actual-nacimiento;
        System.out.println("Su edad actual es de: "+edad);
        
    }
}

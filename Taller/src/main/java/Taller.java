
import java.util.Scanner;
public class Taller {
     public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        double impuesto,salario;
        int empleado,dias;
        System.out.println("Introduzca el numero del empleado");
        empleado=leer.nextInt();
         System.out.println("Introduzca el salario diario");
        salario=leer.nextDouble();
       System.out.println("Introduzca el numero de dias que se presento el empleado");
        dias=leer.nextInt();
         System.out.println("Empleado numero: "+empleado);
         System.out.println("Dias Trabajados: "+dias);
         System.out.println("Salario diario: "+salario+"$");
         salario=salario*dias;
         impuesto=salario*0.075;
         System.out.println("Salario acumulado por los "+dias+" dia(s) trabajados: "+salario+"$  -"+impuesto+"$ de impuestos");
         salario=salario-impuesto;
         System.out.println("Salario total: "+salario+"$");
        
        
    }
}

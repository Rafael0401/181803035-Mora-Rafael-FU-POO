
import java.util.Scanner;


public class Adivinar {
     public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        int num,valor=50;
        System.out.println(" Bienvenido intenta adivinar el numero secreto para poder salir del programa");
        do{
        System.out.println("\n Introduzca cualquier numero");
         num=leer.nextInt();
         if(num<50){
             System.out.println("\n El numero que introdujo es menor al numero secreto");
         }
         else
             System.out.println("\n El numero que introdujo es mayor al numero secreto");
        }while(num !=50);
        System.out.println("\n Felicidades a logrado adivinar el numero secreto que es: "+num);
        System.out.println(" Fin del programa");
    }
}

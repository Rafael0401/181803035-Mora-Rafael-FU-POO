import java.util.Scanner;
public class LeerJava {

    public static void main(String args []){
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduce tu nombre completo");
         String nombre=leer.nextLine();
         System.out.println("Nombre leido: "+nombre);
         System.out.println("Dame un Numero");
         int numero=leer.nextInt();
         System.out.println("El numero leido es: "+numero);
         System.out.println("Dame otro Numero");
         double numero2=leer.nextDouble();
         System.out.println("El segundo numero leido es "+numero2);
         
    }
}

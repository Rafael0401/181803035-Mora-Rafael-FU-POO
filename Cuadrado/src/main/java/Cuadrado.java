import java.util.Scanner;
public class Cuadrado {
    public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        double a,area;
        System.out.println("Introduzca el valor del cuadrado");
        a=leer.nextInt();
        area=a*a;
        System.out.println("El area del cuadrado es de: "+area);
        
    }
}

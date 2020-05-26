import java.util.Scanner;
public class totalPago {
    public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el total del monto a pagar");
        int pago;
        double desc;
        pago=leer.nextInt();
        if (pago>=100){
           desc=pago*.10;
           desc=pago-desc;
           System.out.println("Total a pagar con 10% de descuento: "+desc+"$");
        }
        else
            System.out.println("Total a pagar: "+pago+"$");
    }
}

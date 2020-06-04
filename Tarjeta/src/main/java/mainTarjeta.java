
import java.util.Scanner;

public class mainTarjeta {

    public static void main(String args[]) {

//avisare al programa que usare un objeto tarjeta
        Tarjeta tarjeta;
        Scanner leer = new Scanner(System.in);
        int nip, noCuenta, opcion;

        System.out.println("Introduzca el numero de cuenta");
        noCuenta = leer.nextInt();
        System.out.println("Introduzca el NIP");
        nip = leer.nextInt();

        //Condicion para validar si los datos de las cuentas existen si no para mostrar un mensaje de error
        if ((noCuenta == 123123 && nip == 1133) || (noCuenta == 456789 && nip == 3377)) {
            tarjeta = new Tarjeta().verificarCuenta(noCuenta, nip);
            System.out.println(tarjeta.toString());
            System.out.println();

            //ciclo que sirve para el menu y con la condicion de que se siga repiento hasta introducir el valor de finalizacion
            do {
                System.out.println("Menu de movimientos");
                System.out.println("1) Hacer un deposito");
                System.out.println("2) Hacer un retiro");
                System.out.println("3) Eliminar apartado");
                System.out.println("4) Imprimir datos de la cuenta");
                System.out.println("5) Salir");
                System.out.println("¿Que movimiento desea realizar?");
                opcion = leer.nextInt();
                System.out.println("\n----------------------------------------------------------");

                //sentencia de control que ejecutara la opcion introducida por el ususario
                switch (opcion) {
                    case 1:
                        System.out.println("Monto a depositar:");
                        tarjeta.depositar(leer.nextDouble());
                        System.out.println("\n----------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("Monto a retirar:");
                        tarjeta.retirar(leer.nextDouble());
                        System.out.println("\n----------------------------------------------------------");
                        break;
                    case 3:
                        System.out.println("Monto del saldo apartado a eliminar:");
                        tarjeta.eliminar(leer.nextDouble());
                        System.out.println("\n----------------------------------------------------------");
                        break;
                    case 4:
                        System.out.println(tarjeta.toString());
                        System.out.println("\n----------------------------------------------------------");
                        break;

                }

            } while (opcion < 5);
        } else {
            System.out.println("Esta cuenta no existe o se equivoco en los datos");
        }

    }
}

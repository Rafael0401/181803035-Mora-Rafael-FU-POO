
import java.util.Scanner;

public class mainTarjeta {

    public static void main(String args[]) {

//avisare al programa que usare un objeto tarjeta
        Tarjeta tarjeta;
        Scanner leer = new Scanner(System.in);
        int nip, noCuenta, opcion, dia = 0, mes = 0, anio = 0, meses, dia2 = 0, mes2 = 0, anio2 = 0;

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
                if (dia == 0 && mes == 0 && anio == 0) {
                    System.out.println("Introduzca la fecha");
                    System.out.println("Dia:");
                    dia = leer.nextInt();
                    System.out.println("Mes:");
                    mes = leer.nextInt();
                    System.out.println("Año:");
                    anio = leer.nextInt();
                } else {
                    System.out.println("Introduzca la fecha");
                    System.out.println("Dia:");
                    dia2 = leer.nextInt();
                    System.out.println("Mes:");
                    mes2 = leer.nextInt();
                    System.out.println("Año:");
                    anio2 = leer.nextInt();

                }
                if (dia2 == 0 && mes2 == 0 && anio2 == 0) {
                    System.out.println("Fecha: " + dia + "/" + mes + "/" + anio);
                } else {
                    System.out.println("Fecha: " + dia2 + "/" + mes2 + "/" + anio2);
                }

                System.out.println("Menu de movimientos");
                System.out.println("1) Hacer un deposito");
                System.out.println("2) Hacer un retiro");
                if (tarjeta.apartado > 0) {
                    System.out.println("3) Elinimar apartado");
                } else {
                    System.out.println("3) Crear apartado");
                }
                if (tarjeta.inversion == 0) {
                    System.out.println("4) Invertir saldo");
                } else if (dia2 >= dia && mes2 >= mes && anio2 >= anio) {
                    System.out.println("4) Retirar inversion");
                } else {
                    System.out.println("4) esta opcion estara disponible el: " + dia + "/" + mes + "/" + anio);
                }

                System.out.println("5) Imprimir datos de la cuenta");
                System.out.println("6) Salir");
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

                        if (tarjeta.apartado == 0) {
                            System.out.println("Monto que se apartara del saldo disponible:");
                            tarjeta.crearApartado(leer.nextDouble());
                            System.out.println("\n----------------------------------------------------------");
                            break;
                        } else {
                            System.out.println("Monto del saldo apartado a eliminar:");
                            tarjeta.eliminar(leer.nextDouble());
                            System.out.println("\n----------------------------------------------------------");
                        }
                        break;

                    case 4:
                        if (tarjeta.inversion == 0) {
                            System.out.println("Meses que desea aplazar su saldo en la inversion. ");
                            System.out.println("Nota: solo se puede aplazar de 3 a 12 meses.");
                            meses = leer.nextInt();
                            if (meses >= 3 && meses <= 12) {
                                System.out.println("Saldo a invertir: ");
                                tarjeta.invertir(leer.nextDouble());
                                if (mes + meses > 12) {
                                    anio = anio + 1;
                                    if (mes < meses) {
                                        mes = mes - meses;
                                        mes = Math.abs(mes);
                                    } else {
                                        mes = mes - meses;
                                        mes = Math.abs(mes);
                                    }
                                } else {
                                    mes = mes + meses;

                                }
                                System.out.println("\n----------------------------------------------------------");
                                break;
                            } else {
                                System.out.println("Error solo se puede admitir un plazo de 3 a 12 meses");
                                System.out.println("\n----------------------------------------------------------");
                                break;
                            }

                        } else if (dia2 >= dia && mes2 >= mes && anio2 >= anio) {
                            double inversion = tarjeta.inversion;
                            tarjeta.retirarInversion(inversion);
                            System.out.println("\n----------------------------------------------------------");
                            break;
                        } else {
                            System.out.println("Error  esta opcion estara disponible el: " + dia + "/" + mes + "/" + anio);
                            System.out.println("\n----------------------------------------------------------");
                            break;
                        }

                    case 5:
                        System.out.println(tarjeta.toString());
                        System.out.println("\n----------------------------------------------------------");
                        break;

                }

            } while (opcion < 6);
        } else {
            System.out.println("Esta cuenta no existe o se equivoco en los datos");
        }

    }
}

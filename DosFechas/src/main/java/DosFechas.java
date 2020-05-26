
import java.util.Scanner;

public class DosFechas {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int año1, dia1, mes1, año2, dia2, mes2;
        int dias = 0, dias_meses = 0, dias_años = 0;
        do {
            //Primera fecha
            System.out.println("Fecha de inicio \n");
            System.out.println("Introduzca el dia de la fecha de inicio");
            dia1 = leer.nextInt();
            System.out.println("Introduzca el mes de la fecha de inicio");
            mes1 = leer.nextInt();
            System.out.println("Introduzca el año de la fecha de inicio");
            año1 = leer.nextInt();

            //Segunda fecha
            System.out.println("\nIntroduzca la fecha de finalizacion \n");
            System.out.println("Introduzca el dia de la segunda fecha");
            dia2 = leer.nextInt();
            System.out.println("Introduzca el mes de la segunda fecha");
            mes2 = leer.nextInt();
            System.out.println("Introduzca el año de la segunda fecha");
            año2 = leer.nextInt();
        } while (dia1 < 1 || dia1 > 31 || mes1 < 1 || mes1 > 12 || año1 == 0 || dia2 < 1 || dia2 > 31 || mes2 < 1 || mes2 > 12 || año2 == 0);

        System.out.println("\nFecha de inicio: " + dia1 + "/" + mes1 + "/" + año1);
        System.out.println("Fecha de fin: " + dia2 + "/" + mes2 + "/" + año2);
        dias = dia2 - dia1;
        dias = Math.abs(dias);
        if (mes1 == 2 && dia1 > 28) {
            System.out.println("Error el mes 2 de la fecha de inicio solo puede tener 28 dias");
        } else if (mes2 == 2 && dia2 > 28) {
            System.out.println("Error el mes 2 de la fecha de finalizacion solo puede tener 28 dias");
        } else if ((mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) && (dia1 > 30)) {
            System.out.println("Error el mes " + mes1 + " de la fecha de inicio solo puede tener 30 dias");
        } else if ((mes2 == 4 || mes2 == 6 || mes2 == 9 || mes2 == 11) && (dia2 > 30)) {
            System.out.println("Error el mes " + mes2 + " de la fecha de finalizacion solo puede tener 30 dias");
        }
        
        
        if (mes1 > mes2 && año1 < año2) {
                        for (int i = mes1; i <= 12; i++) {

                            if (i == 4 || i == 6 || i == 9 || i == 11) {
                                dias_meses += 30;

                            } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                                dias_meses += 31;

                            } else if (i == 2) {
                                dias_meses += 28;
                            }
                        }
                    }

                    if (mes1 > mes2 && año1 < año2) {

                        for (int i = 1; i < mes2; i++) {

                            if (i == 4 || i == 6 || i == 9 || i == 11) {
                                dias_meses += 30;

                            } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                                dias_meses += 31;

                            } else if (i == 2) {
                                dias_meses += 28;
                            }
                        }
                        if (año2 - año1 >= 2) {
                            dias_años = año1 - año2;
                            dias_años += 1;
                            dias_años = Math.abs(dias_años);
                        }
                      
                        
                    }

                    if (mes1 > mes2 && año1 > año2) {

                        for (int i = mes2; i <= mes1; i++) {

                            if (i == 4 || i == 6 || i == 9 || i == 11) {
                                dias_meses += 30;

                            } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                                dias_meses += 31;

                            } else if (i == 2) {
                                dias_meses += 28;
                            }
                        }
                        if (año1 - año2 >= 2) {
                            dias_años = año1 - año2;
                            dias_años = Math.abs(dias_años);
                        }
                    }

                    if (mes1 > mes2 && año1 == año2) {
                        for (int i = mes2; i < mes1; i++) {

                            if (i == 4 || i == 6 || i == 9 || i == 11) {
                                dias_meses += 30;

                            } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                                dias_meses += 31;

                            } else if (i == 2) {
                                dias_meses += 28;
                            }
                        }

                    }

                    if (mes1 < mes2 && año1 > año2) {
                        for (int i = mes2; i <= 12; i++) {

                            if (i == 4 || i == 6 || i == 9 || i == 11) {
                                dias_meses += 30;

                            }

                            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                                dias_meses += 31;

                            }

                            if (i == 2) {
                                dias_meses += 28;
                            }
                        }
                    }

                    if (mes1 < mes2 && año1 > año2) {
                        for (int i = 1; i < mes1; i++) {

                            if (i == 4 || i == 6 || i == 9 || i == 11) {
                                dias_meses += 30;
                            }

                            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                                dias_meses += 31;
                            }
                           if (i == 2) {
                                dias_meses += 28;
                            }
                        }
                        if (año1 - año2 >= 2) {
                            dias_años = año1 - año2;
                            dias_años = Math.abs(dias_años);
                        }
                        dias = dia2 - dia1;
                        dias = Math.abs(dias);

                    }

                    if (mes1 < mes2 && año1 < año2) {
                        for (int i = mes1; i < mes2; i++) {

                            if (i == 4 || i == 6 || i == 9 || i == 11) {
                                dias_meses += 30;

                            }

                            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                                dias_meses += 31;

                            }

                            if (i == 2) {
                                dias_meses += 28;
                            }
                        }

                        if (año2 - año1 >= 2) {
                            dias_años = año2 - año1;
                            dias_años = Math.abs(dias_años);
                        }

                    }

                    dias_meses = Math.abs(dias_meses);
                   
                    dias_años *= 365;
                           
                     if(año1<año2){
                         System.out.println(" total de dias son: " + (dias_meses + dias + dias_años) + " dias");
                     }
                     else
                       System.out.println(" total de dias son: " + (dias_meses - dias + dias_años) + " dias");
    }
}

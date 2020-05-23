
import java.util.Scanner;

public class Oroscopo {
    public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        int nacimiento,dia,mes;
        
        System.out.println("Introduzca el año que nacio");
        nacimiento=leer.nextInt();
        System.out.println("Introduzca el mes de nacimiento");
        mes=leer.nextInt();
        System.out.println("Introduzca el dia");
        dia=leer.nextInt();
        switch(mes){
            case 1: if(dia<=20){
                System.out.println("Tu signo es capricornio");
            }
            else
                System.out.println("Tu signo es acuario");
            break;
            case 2: if(dia<=18){
                System.out.println("Tu signo es acuario");
            }
            else 
                System.out.println("Tu signo es piscis");
            break;
             case 3: if(dia<=20){
                 System.out.println("Tu signo es piscis");
             }
             else
                 System.out.println("Tu signo es Aries");
             break;
            case 4: if(dia<=20){
                 System.out.println("Tu signo es Aries");
             }
             else
                 System.out.println("Tu signo es Tauro");
            break;
             case 5: if(dia<=20){
                 System.out.println("Tu signo es Tauro");
             }
             else
                 System.out.println("Tu signo es Geminis");
             break;
             case 6: if(dia<=21){
                 System.out.println("Tu signo es Geminis");
             }
             else
                 System.out.println("Tu signo es Cancer");
             break;
             case 7: if(dia<=22){
                 System.out.println("Tu signo es Cancer");
             }
             else
                 System.out.println("Tu signo es Leo");
             break;
             case 8: if(dia<=22){
                 System.out.println("Tu signo es Leo");
             }
             else
                 System.out.println("Tu signo es Virgo");
             break;
             case 9: if(dia<=22){
                 System.out.println("Tu signo es Virgo");
             }
             else
                 System.out.println("Tu signo es Libra");
             break;
             case 10: if(dia<=22){
                 System.out.println("Tu signo es Libra");
             }
             else
                 System.out.println("Tu signo es Escorpio");
             break;
             case 11: if(dia<=22){
                 System.out.println("Tu signo es Escorpio");
             }
             else
                 System.out.println("Tu signo es Sagitario");
             break;
             case 12: if(dia<=21){
                 System.out.println("Tu signo es Sagitario");
             }
             else
                 System.out.println("Tu signo es capricornio");
             break;
        }
        
    }
}

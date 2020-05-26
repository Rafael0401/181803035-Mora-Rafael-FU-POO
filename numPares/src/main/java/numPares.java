import java.util.Scanner;
public class numPares {
     public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
         System.out.println("Ingrese cualquier numero mayor a cero");
        int num;
        num=leer.nextInt();
        if (num>0){
           for(int i=1;i<=num;i++){
               if(i%2==0){
                    System.out.print(" "+i);
               }
           }      
        }
        else
            System.out.println("Error Ingrese un numero mayor a cero");
    }
    }

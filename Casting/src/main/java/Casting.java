
public class Casting {
    public static void main(String args[]){
        //Casting explicito
        short a=1;
        int b=15;
        a=(short)b;
        //Casting implisito
        float c=4.5f;
        double d=5.6;
        d=c;
        //¿Que pasa con los decimales cuando casteo  de flotante a double a entero?
        double pi=3.1416;
        int duda=(int)pi;
        System.out.println("Resultado obtenido: "+duda);
        //Casting String
        String valor="15";
        int n=Integer.parseInt(valor);
        n=n+duda;
         System.out.println("Resultado del casteo de String: "+n);
         //Ciclo for
         System.out.println("");
         int i;
         for(i=1;i<10;i++){
              System.out.print(" "+i);
         }
         System.out.println("");
         //Ciclo while
         int j=1;
         while(j<10){
             System.out.print(" "+j);
             j++;
         }
             System.out.println("");
         //Ciclo do while
           int k=1;
         do{
             System.out.print(" "+k);
             k++;
         }while(k<10);
    }
}

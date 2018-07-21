public class ciclo_2
{
     public static void main(String[] avrg)
        {
           int i;
           for( i=0 ; i<10; i++)
           {
               System.out.println("el valor de i="+i);
               if(i==5)
                {
                    System.out.println("llegamos a 5");
                    i++;
                    //i=i+2;
                    //continue;
                }
              
           }
             System.out.println("texto fuera del ciclo");
        }
}
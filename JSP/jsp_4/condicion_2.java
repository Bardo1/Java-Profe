public class condicion_2
{
    public static void main(String[] avrg)
    {
        /*
        3000 = 10%
        4000= 20%
        5000=25%
        6000=45%
        default=15%
        */
        int sueldo,impuesto;
        sueldo=2345;
        
        switch(sueldo)
         {
            case 3000:
                impuesto=10;
            break;
            case 4000:
                impuesto=20;
            break;
                 case 5000:
                impuesto=25;
            break;
                      case 6000:
                impuesto=45;
            break;
            default:
                impuesto=15;  
            break;    
                      
         }
        
        System.out.println("El impuesto es de "+impuesto+"%");
    }
}
package com.cesarcancino.array;

/**
 *
 * @author peligro
 */
public class array 
{
    
    
    
    public static void main(String[] noquiero)
    {
        //int[] numero;
        //numero=new int[5];
        int[] numeros =new int[6];
        //numeros 1,34,556,343,65
               // 0, 1, 2 , 3, 4 
        numeros[0]=1;
        numeros[1]=34;
        numeros[2]=556;
        numeros[3]=343;
        numeros[4]=65;
        numeros[5]=889;
        System.out.println("posición 1="+numeros[1]);
        System.out.println(" El largo del arreglo números = "+numeros.length);
        for(int j=0;j<numeros.length;j++)
        {
            System.out.println("posisión "+j+"= "+numeros[j]);
        }
    }
    
}

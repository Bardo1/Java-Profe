package com.cesarcancino.array;

/**
 *
 * @author peligro
 */
public class array2 
{
    public static void main(String[] noquiero)
    {
        //int[] numero;
        //numero=new int[5];
        int[] numeros =new int[6];
        for(int i=0;i<6;i++)
        {
            numeros[i]=i+1;
        }
       // System.out.println(" El largo del arreglo números = "+numeros.length);
         //System.out.println("posición 1="+numeros[1]);
        for(int j=0;j<numeros.length;j++)
        {
            System.out.println("posisión "+j+"= "+numeros[j]);
        }
        
    }    
}

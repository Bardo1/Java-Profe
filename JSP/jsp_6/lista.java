package com.cesarcancino.array;
import java.util.ArrayList;
/**
 *
 * @author peligro
 */
public class lista 
{
    public static void main(String[] mamma)
    {
        ArrayList a=new ArrayList();
        a.add("César Cancino");
        a.add(3);
        a.add('a');
        a.add(23.5);
        a.add("último valor");
        a.add(3432);
        System.out.println("el largo del array ="+a.size());
        //a.remove(5);
        //System.out.println("el largo del array después de borrarle un valor ="+a.size());
        for(int i=0;i<a.size();i++)
        {
            System.out.println("posisión "+i+"= "+a.get(i));
        }
        
    }
}

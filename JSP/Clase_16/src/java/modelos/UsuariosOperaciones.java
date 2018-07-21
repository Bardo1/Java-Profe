/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author Administrador
 */
public class UsuariosOperaciones {
 
    public ArrayList<Usuarios> getUsuarios()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
            //acá hacemos la magia
                ArrayList<Usuarios> arreglo=new ArrayList<Usuarios>();
                Query q=session.createQuery("from Usuarios");
                List<Usuarios> lista=q.list();
                Iterator<Usuarios> iter=lista.iterator();
            //acá termina la magia
        tx.commit();
        session.close();
        //acá ya terminados todo y solo tomamos la lista y la pasamos a una arraylist
        while(iter.hasNext())
        {
            Usuarios noti = (Usuarios) iter.next();
            arreglo.add(noti);
        }
        
        return arreglo;
        
    }
    
}

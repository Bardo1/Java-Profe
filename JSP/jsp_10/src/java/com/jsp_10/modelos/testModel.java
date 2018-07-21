package com.jsp_10.modelos;

import javax.ejb.Stateless;

public class testModel 
{
     private String nombre;
     private String correo;
     
     public testModel()
     {
         this.nombre="Pedro Ñandú";
         this.correo="yo@cesarcancino.com";
     }
     
     public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String n)
    {
        this.nombre=n;
    } 
    public String getCorreo()
    {
        return this.correo;
    }
    public void setCorreo(String n)
    {
        this.correo=n;
    }
}

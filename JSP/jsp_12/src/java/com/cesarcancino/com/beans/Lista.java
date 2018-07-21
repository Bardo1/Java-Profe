/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cesarcancino.com.beans;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author peligro
 */
@Stateless
public class Lista {

   public List listaDeNombres;
    public Lista() 
    {
        listaDeNombres = new ArrayList();
        listaDeNombres.add("César Cancino");
        listaDeNombres.add("María Ñandú");
        listaDeNombres.add("Alberto Pérez");
        listaDeNombres.add("Lucía Méndez");
    }
    public List getListaDeNombres() {
        return listaDeNombres;
    }
}

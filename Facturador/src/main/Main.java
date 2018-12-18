/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import creacional.Factura;
import estructural.ComprobanteE;
import estructural.LemaDecorador;

/**
 *
 * @author Patricio
 */
public class Main {
    
    
    public static void main(String[] args) {
        Factura f=new Factura();
        f.agregarLema();
        ComprobanteE c=new LemaDecorador(f);
        c.agregarLema();
    }
    
}

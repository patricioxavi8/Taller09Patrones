/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacional;

import estructural.ComprobanteE;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Palacios
 */
public class GuiaRemision extends ComprobanteElectronico implements ComprobanteE{
    private String destino;
    private String placaVehiculo;
    private List<String> listaProductos;

    public GuiaRemision(String destino, String placaVehiculo, List<String> listaProductos, Cliente cliente, long codigo, LocalDate fecha) {
        super(cliente, codigo, fecha);
        this.destino = destino;
        this.placaVehiculo = placaVehiculo;
        this.listaProductos = listaProductos;
    }

    public GuiaRemision() {
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public List<String> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<String> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
    
        @Override
    public void agregarLogo() {
        System.out.println("SIN LOGO");
    }

    @Override
    public void agregarLema() {
        System.out.println("SIN LEMA");
    }
    
}

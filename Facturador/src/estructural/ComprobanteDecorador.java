/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

/**
 *
 * @author Patricio
 */
public abstract class ComprobanteDecorador implements ComprobanteE{
    
    protected ComprobanteE c;
    
    
    public ComprobanteDecorador(ComprobanteE ce){
        c=ce;
    }

    @Override
    public void agregarLogo(String logo) {
        c.agregarLogo(logo);
    }

    @Override
    public void agregarLema(String lema) {
        c.agregarLema(lema);
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author Víctor
 */
public class Lavadora extends Electrodomestico {
    
    private double carga;
    private final double CARGA_DEF = 5;
    
    
    public Lavadora () {
        super ();
        this.carga=CARGA_DEF;
    }
    
    public Lavadora (double pre, double pes) {
        super (pre,pes);
        this.carga=CARGA_DEF;
    }
    
    public Lavadora (double pre, double pes, String col, char c, double car){
        super (pre, pes, col, c);
        this.carga = car;
    }
    
    
    public void precioFinal (char clase, double peso,double car){
        super.precioFinal(clase, peso);
        if (carga>30){
            this.precio_base+=50;
        }
    }

    /**
     * @return the carga
     */
    public double getCarga() {
        return carga;
    }
    
}

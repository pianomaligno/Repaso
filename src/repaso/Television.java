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
public class Television extends Electrodomestico {
    
    private double resolucion;
    private final double RESOLUCION_DEF = 20 ;
    private boolean tdt;
    private final boolean TDT_DEF = false;
    
     public Television () {
        super ();
        this.resolucion=RESOLUCION_DEF;
        this.tdt=TDT_DEF;
    }
    
    public Television (double pre, double pes) {
        super (pre,pes);
        this.resolucion=RESOLUCION_DEF;
        this.tdt=TDT_DEF;
    }
    
    public Television (double pre, double pes, String col, char c, double res, boolean tdt){
        super (pre, pes, col, c);
        this.resolucion=res;
        this.tdt=tdt;
    }

    /**
     * @return the resolucion
     */
    public double getResolucion() {
        return resolucion;
    }

    /**
     * @return the tdt
     */
    public boolean isTdt() {
        return tdt;
    }
    
    public void precioFinal(char clase, double peso, double res, boolean tdt){
        super.precioFinal(clase, peso);
        if (res>40){
            precio_base*=1.3;
        }
        if (tdt==true){
            precio_base+=50;
        }
    }
    
}

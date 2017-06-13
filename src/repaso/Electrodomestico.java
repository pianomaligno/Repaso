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
public class Electrodomestico {
    
    protected double precio_base;
    protected String color;
    protected char consumo_energetico;
    protected double peso;
    
    public Electrodomestico () {
    
    this.color="Blanco";
    this.consumo_energetico='F';
    this.peso=5.0;
    this.precio_base=100.0;
}
    
    public Electrodomestico (double precio, double peso) {
    
    this.color="Blanco";
    this.consumo_energetico='F';
    this.peso=peso;
    this.precio_base=precio;
}
    
    public Electrodomestico (double precio, double peso, String col, char cons) {
    
    this.color=col;
    this.consumo_energetico=cons;
    this.peso=peso;
    this.precio_base=precio;
    comprobarColor(col);
    comprobarConsumoEnergetico(cons);
}

    /**
     * @return the precio_base
     */
    public double getPrecio_base() {
        return precio_base;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the consumo_energetico
     */
    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }
    
    public void comprobarConsumoEnergetico (char consumo){
        char [] consumos = {'A','B','C','D','E','F'};
        boolean encontrado = false;
        
        for (int i=0;i<consumos.length && !encontrado; i++){
            if(consumos[i]==(consumo)){
            encontrado=true;
            }
        }
        
        if (encontrado==false){
            this.consumo_energetico = 'F';
        }
    }
    public void comprobarColor(String col){
        String [] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
        boolean encontrado = false;
        
        for (int i=0; i<colores.length && !encontrado; i++){
           
            if (colores[i]==col){
                encontrado=true;    
        }
        }
        if (encontrado==false){
            this.color="Blanco";
        }
    }

    
    public void precioFinal(char clase, double peso){
        switch (clase){
            case 'A': this.precio_base+=100.0;
                    break;
            case 'B': this.precio_base+=80.0;
                    break;
            case 'C': this.precio_base+=60.0;
                    break;
            case 'D': this.precio_base+=50.0;
                    break;
            case 'E': this.precio_base+=30.0;
                    break;
            case 'F': this.precio_base+=10.0;
                    break;            
        }
        
        if (peso >=0.0 & peso <=19.0){
            this.precio_base+=10.0;
        }
        if (peso >=20.0 & peso <=49.0){
            this.precio_base+=50.0;
        }
        if (peso >=50.0 & peso <=79.0){
            this.precio_base+=80.0;
        }
        if (peso >=80.0){
            this.precio_base+=100.0;
        }
        
 
    
    
}}

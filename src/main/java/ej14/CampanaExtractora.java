/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

/**
 *
 * @author hinda
 */
public class CampanaExtractora extends Electrodomestico {

    //atributos
    private double decibelios;//no puede ser inferior a 50dB. 

    //constrectores
    public CampanaExtractora(double decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        this.decibelios = decibelios;
        if (this.decibelios < 50) {
            this.decibelios = 50;
        }
    }

    public CampanaExtractora() {
    }
    
    //setters y getters
    public double getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(double decibelios) {
        this.decibelios = decibelios;
        if (this.decibelios < 50) {
            this.decibelios = 50;
        }
    }
    
    //tostring
    @Override
    public String toString() {
        return super.toString()+" CampanaExtractora{" + "decibelios=" + decibelios + '}';
    }
    

}

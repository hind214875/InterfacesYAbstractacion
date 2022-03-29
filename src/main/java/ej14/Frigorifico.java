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
public class Frigorifico extends Electrodomestico implements Silencioso {

    //atributos
    private double capacidad;//capacidad en litros

    //constrectors
    public Frigorifico(double capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    public Frigorifico() {
    }

    //getters y setters
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString()+" Frigorifico: " + "capacidad=" + capacidad ;
    }
    
// deberá mostrar por consola que el frigorífico de modelo tal emite 50dB.
    @Override
    public void silencio() {
        System.out.println(" El Frigorifico de Modelo: "+this.getModelo()+" emite "+this.getConsumo());
    }

}

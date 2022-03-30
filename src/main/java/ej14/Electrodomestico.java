/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

import java.util.Objects;

/**
 *
 * @author hinda
 */
public abstract class Electrodomestico {

    //atributos
    private double consumo;
    private String modelo;

    //constrectores
    public Electrodomestico(double consumo, String modelo) {
        this.consumo = consumo;
        this.modelo = modelo;
    }

    //getters y setters
    public Electrodomestico() {
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.consumo) ^ (Double.doubleToLongBits(this.consumo) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.modelo);
        return hash;
    }

    //equals y haschcod
    @Override    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Electrodomestico other = (Electrodomestico) obj;
        if (Double.doubleToLongBits(this.consumo) != Double.doubleToLongBits(other.consumo)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    //ToString
    @Override
    public String toString() {
        return "Electrodomestico: " + "consumo=" + consumo + ", modelo=" + modelo +"\n";
    }

    
    
}

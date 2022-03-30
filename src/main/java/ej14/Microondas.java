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
public class Microondas extends Electrodomestico implements Silencioso,Comparable<Microondas>{
    //Atributos
    private int potenciaMaxima;
    
    
    //constrectores
    public Microondas(int potenciaMaxima, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMaxima = potenciaMaxima;
    }

    public Microondas() {
    }
    
    //getters y setters
    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString()+" Microondas: " + "potenciaMaxima=" + potenciaMaxima ;
    }

    //mostrar por consola que el microondas de consumo tal emite 40dB.
    @Override
    public void silencio() {
        System.out.println("El microondas de consumo de "+this.getConsumo());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Microondas)) return false;
        if (!super.equals(o)) return false;
        Microondas that = (Microondas) o;
        return potenciaMaxima == that.potenciaMaxima;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), potenciaMaxima);
    }

    @Override
    public int compareTo(Microondas o) {
        return Integer.compare(potenciaMaxima, o.potenciaMaxima);
    }
    
}

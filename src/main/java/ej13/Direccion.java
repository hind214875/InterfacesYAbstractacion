/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;

/**
 *
 * @author hinda
 */
public class Direccion {
    //Atributos
    private String nombreDeCalle;
    private String nombreDeCiudad;
    private int codigoPostal;
    private String nombrePais;
    
    //constrectores
    public Direccion(String nombreDeCalle, String nombreDeCiudad, int codigoPostal, String nombrePais) {
        this.nombreDeCalle = nombreDeCalle;
        this.nombreDeCiudad = nombreDeCiudad;
        this.codigoPostal = codigoPostal;
        this.nombrePais = nombrePais;
    }

    public Direccion() {
    }

    public String getNombreDeCalle() {
        return nombreDeCalle;
    }

    public void setNombreDeCalle(String nombreDeCalle) {
        this.nombreDeCalle = nombreDeCalle;
    }

    public String getNombreDeCiudad() {
        return nombreDeCiudad;
    }

    public void setNombreDeCiudad(String nombreDeCiudad) {
        this.nombreDeCiudad = nombreDeCiudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return "Direccion: " + "nombreDeCalle=" + nombreDeCalle + ", nombreDeCiudad=" + nombreDeCiudad + ", codigoPostal=" + codigoPostal + ", nombrePais=" + nombrePais;
    }
    
    
    
}

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
public class Estudiante extends Persona {
    //atributos
    private int iDEstudiante;
    
    //constrectores 
    public Estudiante(int iDEstudiante, String nombre, String apellidos, String Nif, Direccion direccion) {
        super(nombre, apellidos, Nif, direccion);
        this.iDEstudiante = iDEstudiante;
     }

    public Estudiante() {
    }

    public int getiDEstudiante() {
        return iDEstudiante;
    }

    public void setiDEstudiante(int iDEstudiante) {
        this.iDEstudiante = iDEstudiante;
    }

    @Override
    public String toString() {
        return super.toString()+" \nEstudiante:" + "iDEstudiante=" + iDEstudiante;
    }
    

    @Override
    public void identificate() {
        System.out.println("Es un estudiante");
    }
    
}

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
public class Profesor extends Persona{
    //Atributos
    private String especialidad;
    
    //constrectores
    public Profesor(String especialidad, String nombre, String apellidos, String Nif, Direccion direccion) {
        super(nombre, apellidos, Nif, direccion);
        this.especialidad = especialidad;
    }

    public Profesor() {
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    //getters y setters
    public void setEspecialidad(String especialidad) {    
        this.especialidad = especialidad;
    }

    //toString
    @Override
    public String toString() {
        return super.toString()+" \nProfesor: " + "especialidad=" + especialidad ;
    }

    @Override
    public void identificate() {
        System.out.println("Es un profesor");
    }
    
}

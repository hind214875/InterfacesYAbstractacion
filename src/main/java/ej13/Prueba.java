/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;

import java.util.ArrayList;
import javax.swing.plaf.metal.MetalIconFactory;

/**
 *
 * @author hinda
 */
public class Prueba {

    public static void main(String[] args) {
         //crear una lista de personas
        ArrayList<Persona> lista = new ArrayList<>();
        /* Here conversion implicita*/
        lista.add(new Estudiante(1, "Hind", "Samiri", "12345LK", new Direccion("Mar y Sierra", "Estepona", 0, "España")));
        lista.add(new Estudiante(2, "Jack", "Lopez", "656887JM", new Direccion("Las Flores", "Estepona", 0, "España")));
        lista.add(new Estudiante(3, "Juana", "Perez", "875214BV", new Direccion("Cueta", "Malaga", 0, "España")));
        lista.add(new Estudiante(4, "Sam", "k", "58694HG", new Direccion("Rodrigez", "Cadiz", 0, "España")));
        lista.add(new Profesor("Java", "Juan", "Vico", "56897MN", new Direccion("a", "a", 0, "españa")));//conversion implicita
        lista.add(new Profesor("Sistemas", "Carla", "Carla", "58467JN", new Direccion("b", "b", 0, "españa")));
        lista.add(new Profesor("Base de Datos", "Maria", "Mercedes", "45879OP", new Direccion("c", "c", 0, "españa")));

        for (Persona obj : lista) {
            System.out.print("El Persona : "+obj);
            obj.identificate();//polimorfismo
        }

        System.out.println("\nInformaciones de cada Objeto: \n" + lista.toString());

        //Usa el operador instanceof en cada iteración para mostrar la clase de cada uno de los objetos 
        //y llamar al método getID si es un Estudiante o llamar al método getEspecialidad si es un Profeso
        for (Persona obj : lista) {
            System.out.println(obj.getClass());//te da la clase de la paquete
           if(obj instanceof Estudiante){
               System.out.println("Id es: "+((Estudiante) obj).getiDEstudiante());//coversion explicita
           }else if(obj instanceof Profesor){
               System.out.println("Id es: "+((Profesor) obj).getEspecialidad());//coversion explicita
           }
        }
        
        //Puedes crear objetos de la clase Persona? 
        //No porque la clase Persona es una clase abstracta 
        
   /*-------------------------------------------------------------------------------------------------------------------*/
        //Repite el ejercicio pero usando una lista de objetos de tipo Identificable. ¿Por qué es posible?
        //crear una lista de Identificable
        ArrayList<Identificable> lista1 = new ArrayList<>();

        /* Here conversion implicita*/
        lista1.add(new Estudiante(1, "Hind", "Samiri", "12345LK", new Direccion("Mar y Sierra", "Estepona", 0, "España")));
        lista1.add(new Estudiante(2, "Jack", "Lopez", "656887JM", new Direccion("Las Flores", "Estepona", 0, "España")));
        lista1.add(new Estudiante(3, "Juana", "Perez", "875214BV", new Direccion("Cueta", "Malaga", 0, "España")));
        lista1.add(new Estudiante(4, "Sam", "k", "58694HG", new Direccion("Rodrigez", "Cadiz", 0, "España")));
        lista1.add(new Profesor("Java", "Juan", "Vico", "56897MN", new Direccion("a", "a", 0, "españa")));
        lista1.add(new Profesor("Sistemas", "Carla", "Carla", "58467JN", new Direccion("b", "b", 0, "españa")));
        lista1.add(new Profesor("Base de Datos", "Maria", "Mercedes", "45879OP", new Direccion("c", "c", 0, "españa")));

        for (Identificable obj : lista1) {
            System.out.print("El Persona : ");
            obj.identificate();//polimorfismo
        }
        
        System.out.println("\nInformaciones de cada Objeto: \n" + lista1.toString());

        //Usa el operador instanceof en cada iteración para mostrar la clase de cada uno de los objetos 
        //y llamar al método getID si es un Estudiante o llamar al método getEspecialidad si es un Profeso
        for (Identificable obj : lista1) {
           if(obj instanceof Estudiante){
               System.out.println("Id es: "+((Estudiante) obj).getiDEstudiante());//coversion explicita
           }else if(obj instanceof Profesor){
               System.out.println("Id es: "+((Profesor) obj).getEspecialidad());//coversion explicita
           }
        }

    }
}

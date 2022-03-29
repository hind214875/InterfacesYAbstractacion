/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class Prueba {

    public static void main(String[] args) {
        //Crea una lista de objetos de tipo Silencioso. 

        ArrayList<Silencioso> lista = new ArrayList<>();

        lista.add(new Frigorifico(100, 20, "LG"));
        lista.add(new Frigorifico(150, 40, "Teka"));
        lista.add(new Microondas(700, 100, "Cecotec"));
        lista.add(new Microondas(800, 50, " Bosch"));

        //¿Por qué no puedes incluir en esta lista los objetos de tipo CampanaExtractora?
        //porque CampanaExtractora no es objeto de tipo Silencioso no implements la interface Silencioso
        //lista.add((Silencioso) new CampanaExtractora());
        for (Silencioso obj : lista) {
            obj.silencio();
        }

        System.out.println("la lista: " + lista.toString());
    }
}

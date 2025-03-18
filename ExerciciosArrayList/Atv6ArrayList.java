package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Atv6ArrayList {

    public static void main(String[] args) {
    
        
     ArrayList<String> listafruta = new ArrayList<>();  
     Collections.addAll(listafruta, "Maça", "Laranja", "Banana", "Bergamota", "Pêra");   
     listafruta.set(2, "Morango");
     
        System.out.println("Lista de Frutas");
        for(String frutas : listafruta) {
            System.out.println(frutas);    
        }
        
         
        
        
        
        
    
        
        
        
        
        
        
    }   
}

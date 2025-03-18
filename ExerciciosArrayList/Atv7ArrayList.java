package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Atv7ArrayList {

    public static void main(String[] args) {
        
     ArrayList<Integer> listainteiro = new ArrayList<>();  
     Collections.addAll(listainteiro, 1, 3, 2, 5, 4, 7, 8, 6, 10, 9);
     Collections.sort(listainteiro);
             
        System.out.println("LISTA DE NÚMEROS ALEATÓRIOS");
        for(Integer num : listainteiro) {
            System.out.println(num);    
        }
        
        
        
        
        
    }
    
}

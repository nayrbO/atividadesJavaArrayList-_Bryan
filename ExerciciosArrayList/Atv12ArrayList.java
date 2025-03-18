package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Atv12ArrayList {

    public static void main(String[] args) {
        
      ArrayList<String> listanomes = new ArrayList<>();
      ArrayList<String> listanome2 = new ArrayList<>();
      ArrayList<String> interseccao = new ArrayList<>();
      
        Collections.addAll(listanomes, "Bryan", "Vitor", "Gabriel", "Luiz", "Matheus");
        Collections.addAll(listanome2, "Vitor", "Matheus", "João", "Lucas", "Lorenzo");
        
        System.out.println("PRIMEIRA LISTA NOMES");
        System.out.println(listanomes);
        
        System.out.println("SEGUNDA LISTA DE NOMES");
        System.out.println(listanome2);
        
        System.out.println("INTERSECÇÃO DAS LISTAS: ");
        for(String listanome : listanomes) {
        if (listanome2.contains(listanome)) {    
            interseccao.add(listanome);
        }
        }
        
        System.out.println(interseccao);
        
    }
    
}

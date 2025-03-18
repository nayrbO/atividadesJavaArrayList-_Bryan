package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Atv5ArrayList {

    public static void main(String[] args) {
        
      ArrayList<Character> listacaracter = new ArrayList<>(); 
      Collections.addAll(listacaracter, 'A', 'B', 'C', 'D');
      
      for(Character lista : listacaracter) {
          System.out.println(lista);    
      }
      
      int tamanho = listacaracter.size();
        System.out.println("A lista apossui "+tamanho+" itens.");
      
        
    }
    
}

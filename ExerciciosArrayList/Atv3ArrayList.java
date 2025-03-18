package ExerciciosArrayList;

import java.util.ArrayList;

public class Atv3ArrayList {

    public static void main(String[] args) {
        
        
      ArrayList<Double> indice = new ArrayList<>();   
      
        indice.add(10.5);
        indice.add(11.5);
        indice.add(12.5);
        indice.add(13.5);
        indice.add(14.5);
        
        //System.out.println("INDICE DECIMAL");
        //for(Double nome : indice) {
            //System.out.println(nome);    
        //}
        
        Double nome = indice.get(3);
        System.out.println(nome);
        
        
        
    }
    
}

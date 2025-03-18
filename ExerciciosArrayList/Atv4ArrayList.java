package ExerciciosArrayList;

import java.util.ArrayList;

public class Atv4ArrayList {

    public static void main(String[] args) {
        
        
       ArrayList<String> listacor = new ArrayList<>();
       listacor.add("Vermelho");
       listacor.add("Verde");
       listacor.add("Azul");
       
       boolean temessacor = listacor.isEmpty();
        System.out.println("O amarelo está presente na lista? "+temessacor);
       
        
        System.out.println("Lista de Cores");
        for(String cores : listacor) {
            System.out.println(cores);    
        }
        
    }
    
}

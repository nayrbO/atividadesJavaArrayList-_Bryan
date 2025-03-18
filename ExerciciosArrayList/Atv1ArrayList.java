package ExerciciosArrayList;

import java.util.ArrayList;

public class Atv1ArrayList {

    public static void main(String[] args) {
        
        ArrayList<String> listacidades = new ArrayList<>();
        listacidades.add("Imbé");
        listacidades.add("Tramandaí");
        listacidades.add("Xangri-la");
        listacidades.add("Capão da Canoa");
        listacidades.add("Capão Novo");
        
        System.out.println("Lista de Cidades");
        for(String nome : listacidades) {
            System.out.println(nome);    
        }
        
        
        
    }
    
}

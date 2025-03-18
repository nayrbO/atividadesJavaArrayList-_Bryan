package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atv10ArrayList {

    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
         ArrayList<String> listaanimais = new ArrayList<>();
         ArrayList<String> listaanimais2 = new ArrayList<>();
         String resp = null;
         String animaisnovos = null;
         
         
         Collections.addAll(listaanimais, "Gato", "Cachorro", "Macaco", "Tartaruga");
         
         System.out.println("LISTA ANIMAIS");
         System.out.println(listaanimais);
        
        do{
        System.out.println("Deseja adicionar um animal?");    
        animaisnovos = teclado.nextLine();
        listaanimais.add(animaisnovos);
        System.out.println(listaanimais);
        System.out.println("Deseja parar? [S/N]");
        resp = teclado.nextLine();
        }while(!resp.equalsIgnoreCase("S"));
        
        listaanimais2.addAll(listaanimais);
        System.out.println("LISTA DE ANIMAIS 2");
        System.out.println(listaanimais2);
    }
    
}

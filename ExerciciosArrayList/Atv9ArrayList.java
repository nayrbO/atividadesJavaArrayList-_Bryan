package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Atv9ArrayList {

    public static void main(String[] args) {
     
     Scanner teclado = new Scanner(System.in);   
     ArrayList<Integer> listaduplicada = new ArrayList<>();  
     Collections.addAll(listaduplicada, 5, 5, 7, 25, 30, 30, 50, 100);
     HashSet<Integer> numeros = new HashSet<>(listaduplicada);
     boolean hashDuplicatas = numeros.size() != listaduplicada.size();
    
        System.out.println("LISTA COM DUPLICATAS: ");
        System.out.println(listaduplicada);
        
        System.out.println("LISTA SEM DUPLICADAS");
        System.out.println(numeros);
     
     
     
     
        
    }
    
}

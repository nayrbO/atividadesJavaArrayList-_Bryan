package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv13ArrayList {

    public static void main(String[] args) {
        
     Scanner teclado = new Scanner(System.in);
        
     ArrayList<Integer> lista1 = new ArrayList<>();
     ArrayList<Integer> lista2 = new ArrayList<>();
        
        System.out.println("Digite 5 números para a lista 1: ");
        
        for (int i = 0; i < 5; i++) {
        System.out.println("Número " +(i+1)+": ");
        lista1.add(teclado.nextInt());
        }
        
        System.out.println("Digite 5 números para a Lista 2: ");
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Número " +(i+1)+": ");
            lista2.add(teclado.nextInt());
        }
        
        
        ArrayList<Integer> uniao = new ArrayList<>(lista1);
        
        for(Integer numero: lista2) {
         if(!uniao.contains(numero)){
             uniao.add(numero);
             
        }    
        }
        
        System.out.println("União das listas sem duplicatas: "+uniao);
        
    }
    
}

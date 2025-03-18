package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atv11ArayList {

    public static void main(String[] args) {
        
     int numRemove = 0;
     String resp = null;
     Scanner teclado = new Scanner(System.in);
     Scanner teclado2 = new Scanner(System.in);
     ArrayList<Integer> listanumduplo = new ArrayList<>();  
     
     Collections.addAll(listanumduplo, 1, 1, 2, 3, 4, 5, 6, 7, 8, 8);   
        
     
        System.out.println("LISTA DE NÚMEROS");
        System.out.println(listanumduplo);
     
        
        do{
            System.out.println("Remova os números duplicados!");
            numRemove = teclado.nextInt();
            
            listanumduplo.remove(numRemove);
         
            System.out.println("Todos os números duplicados foram removidos? [S/N] ");
            resp = teclado2.nextLine();
            
        }while(!resp.equalsIgnoreCase("S"));
        System.out.println(listanumduplo);
        
        
        
        
        
    }
    
}

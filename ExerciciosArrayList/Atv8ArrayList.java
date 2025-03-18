package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv8ArrayList {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);    
    ArrayList<String> listapaises = new ArrayList<>();
    
     System.out.println("DIGITE 5 NOME DE PAISES");
       
        for (int i = 0; i < 5; i++) {
        System.out.println("Escreva um país");
        String pais = teclado.nextLine();
        listapaises.add(pais);
        }
        
        System.out.println("LISTA DE PAÍSES");   
        for(int i = 0; i < listapaises.size(); i++) {
            System.out.println("Pais"+(i+1)+":"+listapaises.get(i));
        }    
    
    
    }
 
   
    
}

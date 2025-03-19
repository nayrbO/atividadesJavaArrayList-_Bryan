package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv14ArrayList {

    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    ArrayList<String> palavras = new ArrayList<>();
    
        System.out.println("Digite 10 palavras: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Palavra "+(i+1)+": ");
            palavras.add(teclado.nextLine());
        }
    
        ArrayList<String> palavrasFiltradas = new ArrayList<>();
        for(String palavra: palavras) {
            if(palavra.length() > 5) {
            palavrasFiltradas.add(palavra);    
            }
        }    
        
        System.out.println("Palavras com mais de 5 caracteres: "+palavrasFiltradas);
    }
}
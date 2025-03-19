package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv15ArrayList {

    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        
        System.out.println("Digite 6 palavras: ");
        for (int i = 0; i < 6; i++) {
            System.out.println("Palavra "+(i+1)+" :");
            palavras.add(teclado.nextLine());
        }
        
        int tamanho = palavras.size();
        for (int i = 0; i < tamanho / 2; i++) {
            String temp = palavras.get(i);
            palavras.set(i, palavras.get(tamanho -1 -i));
            palavras.set(tamanho -1 -i, temp);
            
        }
        System.out.println("Lista Revertida: "+palavras);
        teclado.close();
    }
    
}

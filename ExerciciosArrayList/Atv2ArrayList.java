package ExerciciosArrayList;

import java.util.ArrayList;

public class Atv2ArrayList {

    public static void main(String[] args) {
        
    ArrayList<Integer> listanumero = new ArrayList<>();  
    listanumero.add(1);
    listanumero.add(2);
    listanumero.add(3);
    listanumero.add(4); 
    listanumero.add(5); 
    listanumero.add(6);        
    listanumero.add(7);        
    listanumero.add(8);        
    listanumero.add(9);        
    listanumero.add(10);        
        
    
   listanumero.removeIf(n -> n % 2 == 0); 
    
    System.out.println("Lista Numérica");
    for(Integer numero : listanumero) {
        System.out.println(numero);    
    }
    
    }
    
}

package problems;
import java.util.ArrayList;

public class Problems {
    
    public static void main(String [] args){
        
        //Problema I
        
        System.out.println("Ordem Parcial\n");
        
        //Criando um Array de Pares
        ArrayList<TidyPair> setR = new ArrayList();
        
        TidyPair pair1 = new TidyPair (1,0);
        TidyPair pair2 = new TidyPair (2,0);
        TidyPair pair3 = new TidyPair (0,3);
        
        setR.add(pair1);
        setR.add(pair2);
        setR.add(pair3);
                
        //Letra A
        PartialOrder newPartial = new PartialOrder(4, setR); 
        //Letra B
        newPartial.amount();    
        //Letra C
        newPartial.printPairs();  
        //Letra D
        newPartial.minmax(); 
        
        
        //Problema II
        
        System.out.println("\nOrdem Total\n");
        
        //Criando uma Permutação dos N valores  
        ArrayList<Integer> perm = new ArrayList();
        
        perm.add(2);
        perm.add(1);
        perm.add(0);
        perm.add(3);
        
        //Letra A
        TotalOrder newTotal = new TotalOrder(4, perm);
        //TotalOrder newTotal = new TotalOrder(4, partial, perm);
        
        newTotal.amount();
        newTotal.printPermutation();
        
        //Letra B
        newTotal.minmax();
        
        //Letra C - Errada
        String text = newTotal.relation(0, 3); //Modifica aqui os Elementos
        System.out.println(text);
        
    }
    
}
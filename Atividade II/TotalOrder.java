package problems;
import java.util.ArrayList;

public class TotalOrder extends PartialOrder {
    
    //Atributos 
    private ArrayList<Integer> permutation;  
    
    //Construtor
    
    public TotalOrder(int n, ArrayList<Integer> permutation){
        
        super (n, new ArrayList<TidyPair>());
        this.permutation = permutation;      
        
    }
    
    /*public TotalOrder(int n, ArrayList<TidyPair> partial, ArrayList<Integer> permutation){
        
        super (n, partial);
        this.permutation = permutation;      
        
    }*/
    
    //Getters 
    
    private ArrayList<Integer> getPermutation(){
        
        return permutation;
        
    }
    
    //Setters
    
    private void setPermutation(ArrayList<Integer> permutation){
        
        this.permutation = permutation;
        
    }
    
    //Métodos  
    
    public void printPermutation(){
        
        System.out.print("Permutação: ");  
                
        for (int i : permutation){
            
            System.out.print(i + " ");
            
        }
        
        System.out.println(); 
        
    }
    
    //Especialização da Questão 1D
    @Override
    public void minmax(){
        
        System.out.println("Minimal: " + permutation.get(0));
        System.out.println("Maximal: " + permutation.get(n-1));
        
    }
    
    //Relação Definida
    public String relation(int A, int B){
        
        System.out.println("\nElemento A = " + A + "\nElemento B = " + B);  

        for (int i = 0; i < n; i++){
            
            if(permutation.get(i) == A){
                
                if (i == 0){
                    
                    if (permutation.get(i + 1) != B){
                        
                        return "Sem relação.";
                        
                    } else {
                        
                        return "A menor que B.";
                    }
                    
                } else
                if ((i + 1) == n){
                    
                    if (permutation.get(i - 1) != B){
                        
                        return "Sem relação.";
                        
                    } else {
                        
                        return "A maior que B.";
                    }
                 
                } else 
                if (permutation.get(i - 1) == B){
                    
                   return "A maior que B."; 
                    
                } else 
                if (permutation.get(i + 1) == B){
                    
                    return "A menor que B.";
                    
                } else {
                    
                    return "Sem relação.";
                    
                }
                
            }
        }
        
        return "\n";
    }
    
}
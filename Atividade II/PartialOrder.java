package problems;
import java.util.ArrayList;

public class PartialOrder{
    
    //Atributos
    protected int n;
    protected ArrayList<TidyPair> partial;
    
    //Construtor
    public PartialOrder (int n, ArrayList<TidyPair> partial){
        
        this.n = n;
        this.partial = new ArrayList();
        this.partial = partial;
        
    }
    
    //Getters
    
    protected int getN (){
        
        return n;
        
    }
    
    protected ArrayList<TidyPair> getPartial(){
        
        return partial;
        
    }
    
    //Setters
    
    protected void setN(int n){
        
        this.n = n;
        
    }
    
    protected void setPartial (ArrayList <TidyPair> partial){
        
        this.partial = partial;
        
    }
    
    //Métodos
    
    public final void amount(){
        
        System.out.println("# Elementos = " + n);
        //System.out.println("# Pares = " + partial.size());
        
    }
    
    public final void printPairs(){
    
        System.out.print("Pares: "); 
                
        for (TidyPair i : partial){
            
            i.printPair();
            
        }
        
        System.out.println();
    }
    
    protected boolean[] falses (boolean[] change){
        
        for (int i = 0; i < n; i++){
            change[i] = false;
            //System.out.println(change[i]);
        }       
     
        return change;
        
    }
    
    public void minmax(){
        
        boolean[] min = new boolean[n];
        boolean[] max = new boolean[n];
        
        falses(min);
        falses(max);
        
        for (TidyPair t: partial){

            min[t.getFirst()] = true;
            max[t.getSecond()] = true;

        }
        
        for (TidyPair f: partial){
            
            min[f.getSecond()] = false;
            max[f.getFirst()] = false;
            
        }
        
        System.out.print("Minimais: ");
        
        for (int i = 0; i < n; i++){
            
            if (min[i] == true){

                System.out.print (i + " ");
                
            }
        }
        
        System.out.print("\nMaximais: ");
        
        for (int i = 0; i < n; i++){
            
            if (max[i] == true){

                System.out.print (i + " ");
                
            }
        }
        
        System.out.println();
    }
    
} //Fechamento da Classe
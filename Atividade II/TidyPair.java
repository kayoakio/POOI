package problems;

public class TidyPair{
    
    //Atributos
    private int first;
    private int second;
    
    //Construtor
    
    public TidyPair(int first, int second){
        
        setFirst(first);
        setSecond(second);
        
    }
    
    //Getters
    
    public int getFirst (){
        
        return first;
        
    }
    
    public int getSecond(){
        
        return second;
        
    }
    
    //Setters
    
    private void setFirst(int first){
        
        this.first = first;
        
    }
    
    private void setSecond(int second){
        
        this.second = second;
        
    }
    
    //Métodos
    
    public void printPair (){
        
        System.out.print("(" + getFirst() + "," + getSecond() + ") ");
          
    }
    
}
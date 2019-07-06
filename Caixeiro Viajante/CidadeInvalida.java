package caixeiroviajante;

public class CidadeInvalida extends Exception {

    private int cidade1;
      
    public CidadeInvalida(int cidade1) {
        
        this.cidade1 = cidade1;
        
    }
    
    public int getCidade1(){
    
        return cidade1;
    
    }
    
    @Override
    public String toString(){
        
        return "Cidade Inválida: " + cidade1;
        
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixeiroviajante;

/**
 *
 * @author deise
 */
public class CidadeInvalidaDupla extends CidadeInvalida {
    
    private int cidade2;
    private int n;
    
    public CidadeInvalidaDupla(int cidade1, int cidade2, int n) {
        
        super(cidade1);
        this.cidade2 = cidade2;
        this.n = n;
        
    }
    
    @Override 
    public String toString(){
        
        if (super.getCidade1() >= 0 && super.getCidade1() < n){
            return "Cidade Inválida: " + cidade2;
        } else if (cidade2 >= 0 && cidade2 < n){
            return "Cidade Inválida: " + super.getCidade1();
        } else{
            return "Cidades Inválidas: " + super.getCidade1() + " " + cidade2;
        }
        
    }
}

package problemas;

public class Node{
    
    //Atributos
    private int key;
    private String payload;
    private Node next;
    
    //Construtores
    
    public Node(int key, String payload){
        setKey(key);
        setPayload(payload);
        setNext(null);
    }
    
    //Métodos
    
    public void printNode(){
        
        System.out.println(getKey() + " " + getPayload());
        
    }
    
    //Gets
    
    public int getKey(){
        return key;
    }
    
    private String getPayload(){
        return payload;
    }
    
    public Node getNext(){
        return next;
    }
    
    //Sets
    
    private void setKey(int key){
        this.key = key;
    }
    
    private void setPayload(String payload){
        this.payload = payload;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
}
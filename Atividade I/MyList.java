package problemas;

public class MyList{
    
    //Atributos
    private int size;
    private Node head;
    
    //Construtores
    
    public MyList(){
        setSize(0);
        setHead(null);
    }
    
    //Métodos
    
    public void insertTail(Node add){

        if (size == 0){
            
            head = add;
                        
        } else {
            
            Node aux = head;
            
            while(aux.getNext() != null){
                
                aux = aux.getNext();
                
            }
            
            aux.setNext(add);
            
        }
        
        size++;
        
    }
    
    public void printList(){
        
        Node aux = head;
        
        while(aux != null){
            
            aux.printNode();
            
            aux = aux.getNext();
            
        }
    }
    
    public void removeNode(int key){
        
        if (size == 0){
            
            System.out.println("Lista Vazia.");
            
        } else {
                        
            Node aux = head;
            
            //Caso Remoção no Começo
            if (aux.getKey() == key){
                
               head = aux.getNext();
               
            } else {
                        
                Node opa = aux.getNext();
                
                while(opa.getKey() != key){
                    
                    aux = aux.getNext();
                    opa = aux.getNext();
                                      
                }
                
                aux.setNext(opa.getNext());
            }
              
        }  
        
        size--;
        
    }
    
    //Gets
    
    private int getSize(){
        return size;
    }
    
    private Node getHead(){
        return head;
    }
    
    //Sets
    
    private void setSize(int size){
        this.size = size;
    }
    
    private void setHead(Node head){
        this.head = head;
    }
    
}
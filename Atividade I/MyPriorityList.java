package problemas;

public class MyPriorityList{
    
    //Atributos
    private int size;
    private Node head;
    
    //Construtores
    public MyPriorityList(){
        setSize(0);
        setHead(null);
    }
        
    //Métodos
    
    void insert(Node add){
        
        if(size == 0){
            
            head = add;
            
        } else {

            if(add.getKey() < head.getKey()){
                
                add.setNext(head);
                head = add;
                                
            } else {
                
                int chavinha = 0;
                Node aux = head;
                Node prox = head.getNext();
                
                while((prox != null)){
                    
                    if((add.getKey() < prox.getKey()) && (add.getKey() > aux.getKey())){
                        
                        add.setNext(prox);
                        aux.setNext(add);
                        chavinha = 1;
                        
                    } 
                    
                    aux = aux.getNext();
                    prox = prox.getNext();
                }  
                
                if (chavinha == 0){
                    
                    add.setNext(null);
                    aux.setNext(add);
 
                }
            } 
        }

        size++;        

    }
    
    void remove(){
        
        head = head.getNext();
        
        size--;
        
    }
    
    public void printList(){
        
        Node aux = head;
        
        while(aux != null){
            
            aux.printNode();
            
            aux = aux.getNext();
            
        }
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
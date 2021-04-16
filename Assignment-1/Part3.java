public class thisStack {
    int size;
    ArrayList<Integer> elements;
    int index;
  
    public thisStack() {
        index = -1;
        elements= new ArrayList<Integer>();
    }

    public void push(int b){
        index++;
        elements.add(b);
    }
  
    public int pop(){
        return elements.remove(index--);
        
    }
  
    public int top(){
        return elements.get(index);
    }

    public boolean isEmpty(){
        if (index == -1) return true;
        else return false;
    }

    public int size(){
        return index + 1;
    }

    


    public sta
    
    
    // Queue class 
public class thisQueue{
    ArrayList<Integer> numbers;
    int size;
    int count;
    int start;
    
    public thisQueue(){
        
        numbers = new ArrayList<Integer>();
        count = -1;
        start=0;
    }
    
    public void enqueue(int b){
        count++;
        numbers.add(b);
    }
    
    public int dequeue(){
        count--;
        return numbers.remove(start);
    }
    public int rear(){
        return numbers.get(count);
    }
    
    public int front(){
        return numbers.get(start);
    }
    
    public int size(){
        if (count > 0)
        return count + 1;
        else return 0;
    }
    public boolean isEmpty(){
        if (count <= -1) return true;
        else return false;

    

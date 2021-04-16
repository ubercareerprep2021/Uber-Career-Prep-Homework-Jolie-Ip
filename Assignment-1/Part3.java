public class thisStack {
    int size;
    int[] elements;
    int index;
  
    public thisStack(int a) {
        size = a;
        elements = new int [size];
        index = -1;
    
    }

    public void push(int b){
        index++;
        elements[index] = b;
    }
  
    public int pop(){
        return elements[index--];
        
    }
  
    public int top(){
        return elements[index];
    }

    public boolean isEmpty(){
        if (index == -1) return true;
        else return false;
    }

    public int size(){
        return index + 1;
    }

    
    
    // Queue class 
public class thisQueue{
    int[] numbers;
    int size;
    int count;
    int start;
    
    public thisQueue(int a){
        size = a;
        numbers = new int[size];
        count = -1;
        start=0;
    }
    
    public void enqueue(int b){
        count++;
        numbers[count]= b;
    }
    
    public int dequeue(){
        count--;
        return numbers[start++];
    }
    public int rear(){
        return numbers[count];
    }
    
    public int front(){
        return numbers[start];
    }
    
    public int size(){
        if (count > 0)
        return count + 1;
        else return 0;
    }
    public boolean isEmpty(){
        if (count <= -1) return true;
        else return false;
    }

    

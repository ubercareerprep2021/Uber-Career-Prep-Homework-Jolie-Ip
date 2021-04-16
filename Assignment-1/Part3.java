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

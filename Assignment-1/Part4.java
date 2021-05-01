import java.util.*;
public class App {

    static Node head;
    static int count;
    static class Node {
        int value;
        Node next;

        Node (int x) {
            value = x;
            next = null;
        }
    }

    static void App(){
        count =0;
    }

    static void push (Node node) {
        head = node;
        count++;
    }

static Node pop() {
    Node deleted = new Node(0);
    Node temp = new Node(0);
    deleted = head;
    if (deleted.next != null) {
        temp = deleted.next;
        deleted.next = deleted;
    }
    count--;
    deleted = null;
    return temp;  
}

static void insert(int a, Node newNode) {
    //Node after = new Node(0);
    Node prev = null;
    Node temp1 = head;
    int index =0;

   if (a == 0 && temp1 == null) {
        head = newNode;
   }

   if (a == 0 && temp1 != null) {
        newNode.next = head;
        head = newNode;
   }

   while (head.next != null && index < a) {
    prev = temp1;
    temp1 = temp1.next;
    index ++;
   }
}

public void remove(int b){
    // 1 -> 3 ->5 -> 7

    Node prev = null;
    Node temp2 = head;
    int index =1; 

    if (b == 1) {
        head = head.next;
        count --;
    }

    while (index < b && b != 0) {
        prev = temp2;
        temp2 = temp2.next;
        index ++;
    }

    if (b == index) {
        prev.next = temp2.next;
        temp2 = null;

        if (prev == null) {
            head = null;
        }
    }
}

public Node elementAt(int index){
    Node temp3 = head;
    int counter = 0;
    while (temp3.next != null) {
        temp3 = temp3.next;
        counter ++;
        if (index == counter){
            return temp3;
        }
    }

    if (index == 0 && temp3 != null) {
        return head;
    }

    return null;
}

public int size(){
    return count;
}

public void printList(){
    Node temp = head;
    String list = "";
    
    while (temp != null)
    {
        list += temp.value;
        if (temp.next != null)
        {
            list += "->";
        }
        temp = temp.next;
    }
    System.out.println(list);
    }




public boolean hasCycle(Node x){
    HashSet<Node> s = new HashSet<Node>();
        while (x != null) {
           
            if (s.contains(x))
                return true;
 
            
            s.add(x);
 
            x = x.next;
        }
 
        return false;
}

 

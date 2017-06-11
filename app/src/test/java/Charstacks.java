/**
 * Created by Administrator on 2017-06-11.
 */
class Node{
    char data;
    Node nextNode;
    public Node(char data){
        this.data = data;
        this.nextNode=null;
    }
}
public class Charstacks {
    Node top;

    public Charstacks(){
        top =null;
    }

    public boolean empty(){
        return (top == null);
    }

    public void push(char num){
        Node term=new Node(num);
        term.nextNode=top;
        top=term;
    }
    public char peek(){
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        return top.data;
    }
    public char pop(){
        char num=peek();
        top=top.nextNode;
        return num;
    }
}


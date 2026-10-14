public class CLList {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFront(int data){
        Node newNode =new Node(data);
        size++;
        if(size==1){
            head=tail=newNode;
            tail.next=head;
            return;
        }
        newNode.next=head;
        tail.next=head;
        return ;
    }
    public static void main(String[] args) {
        CLList 
    }
}

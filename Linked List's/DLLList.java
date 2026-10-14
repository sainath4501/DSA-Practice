public class DLLList {

    public static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // to addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // to print
    public int removeFist(){
        if(head==null){
            System.out.println("Empty");
            return Integer.MAX_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=head.next;
            size--;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        head.prev=null;
        return val;
    }

    // to print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }
    public void deletelast(){
        if(size==1){
            head=tail=null;
            return ;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }

    public static void main(String[] args) {
        DLLList dll = new DLLList();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.addLast(35);
        dll.print();
        dll.removeFist();
        // dll.print();
        // dll.reverse();
        dll.print();
        dll.deletelast();
        dll.print();
        System.out.println(dll.size);
    }
}
public class CreateLinedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add at Front
    public void addFront(int data){
        Node newNode=new Node(data);
        size++;

        if(head==null){
             head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode; 
    }

    //add at Last
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode; 
    }

    //add at middle
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFront(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i < idx-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //remove at last
    public int removeFirst(){
        if(size==0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            size--;
            head=head.next;
            return val;
        }
        int val=head.data;
        size--;
        head=head.next;
        return val;
    }

    //display
    public void print(){
        if(head==null){
            System.out.println("null");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    //remove at last
    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val=head.data;
            size--;
            head=tail=null;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        size--;
        prev.next=null;
        tail=prev;
        return val;
    }


    public static void main(String[] args) {
        CreateLinedList list=new CreateLinedList();
        list.addFront(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addMiddle(1, 15);
        
        list.removeFirst();
        list.removeLast();
        list.print();
        System.out.println(list.size);
        
    }
}
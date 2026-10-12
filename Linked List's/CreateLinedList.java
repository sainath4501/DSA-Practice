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
            return ;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;


    }
    //remove at first
    public void removeFirst(){
        if(size==0){
            System.out.println("Empty");
            return ;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return;

        }
        int val=head.data;
        head=head.next;
        size--;
        return;
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
        System.out.println("null");
    }

    //remove at last
    public int  removeLast(){
         if(size==0){
            System.out.println("Empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return Integer.MAX_VALUE;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;  
        size--;
        tail=prev;
        return val; 
    }

    public int iterative(int key){
        Node temp=head;
        int i=0;
        while (temp!=null) {
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    //recusive serach

    //reverse Linked List
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //remove nth node from end
    public void removeNthNode(int n){
        //cal size
        int size=0;
        Node temp=head;
        while (temp!=null) {
            temp=temp.next;
            size++;
        }

        if(n==size){
            head=head.next;
            return ;
        } //if not

        int i=1;
        int NMSIZE=size-n;
        Node prev=head;

        while (i < NMSIZE) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }
    //LL is Palindrome or not--------------------------------------------------------------------------------------------------
    // step 1 find mid
    
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while (fast !=null && fast.next != null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    //step to find 2 & 3
    public boolean isPalindrom(){
        //basecase
        if(head==null || head.next==null){
            return true;
        }

        //find mid
        Node mid=findMid(head);

        //revser 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        //chck left data & right data are equal
        while (right!=null) {
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    //-----------------------------------------------------------------------------------------------------------------------------------------------------

    //detect a loop in LL
    public boolean isLoop(){
        Node slow=head;
        Node fast=head;

        while (fast != null && fast.next != null) {
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                return true;
            }
        }
        return false;

    }
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------

    //to delete a loop
    public static void deleteLoop(){
        Node fast=head;
        Node slow=head;
        boolean iscycle=false;

        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                iscycle=true;
                return;
            }

        }
        if(iscycle==false){
            return;
        }
        slow=head;
        Node prev=null;
        while (slow != fast) {
            prev=fast;
            fast=fast.next;
            slow=slow.next;
            
        }
        prev.next=null;
    }


    public static void main(String[] args) {
        CreateLinedList list=new CreateLinedList();
        // list.addFront(10);
        // list.addLast(20);
        // list.addLast(30);
        // list.addLast(40);
        // list.addMiddle(1, 15);
        
        // list.removeFirst();
        // list.removeLast();
        // list.reverse();
        // list.removeNthNode(3);
        // list.addFront(1);
        // list.addFront(2);
        // list.addFront(2);
        // list.addFront(1);
        // list.print();
        // System.out.println(list.size);
           // System.out.println(list.isPalindrom());
           // System.out.println("Index of 30: " + list.iterative(30));

        head =new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(list.isLoop());
        list.deleteLoop();
        System.out.println(list.isLoop());

     
       
        
        
    }
}
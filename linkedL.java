public class linkedL {
    Node head;
    class Node{
     String data;
     Node next;
     Node(String data){
         this.data=data;
         this.next=null;
     }
    }
    public void addfirst(String data){
        Node newNode=new Node(data);
          if(head == null){
           head=newNode;
           return;
          }
          newNode.next=head;
          head=newNode;
    }
    public void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
              currNode.next =newNode;
    }
    public void printlist(){
        if(head == null){
            System.out.println("list is empty");
        }
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) {
      linkedL l1=new linkedL();
      l1.addfirst("vaibhav");
      l1.addfirst("pandey");
      l1.printlist();
    }
}
public class DLL {

      Node head;
      Node tail;
      int size;
       DLL()
{
    this.size=0;
}
void insertfirst(int val){
    Node node=new Node(val);

    node.next=head;
    node.prev=null;
    if(head!=null){
     head.prev=node;

    }
    head=node;
}
void insertlast(int val){

    Node node=new Node(val);
    node.next=null;
    if(head==null)
    {
     node.prev=null;
     head=node;
    }
    

if(tail!=0)
{
     tail.next=node;
}
     

     node.prev=tail;
    
     tail=node;;

}
 void insertPos(int index,int val)
 { Node node=new Node(val);

    Node temp=head;
if(head==null){
    insertfirst(val);
}
    for(int i=0;i<=index;i++){
        temp=temp.next;

    }
    if(node.next!=null){
        node.next=temp.next;
    } 
    temp.next=node;
    node.prev=temp;
    
    temp.next.prev=node;
 }
// int deleteFirst(){

    
//       head=head.next;


// }

void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.value+"->");
        temp=temp.next;
    }
    System.out.println("END");

}

    class Node{

        int value;
        Node next;
        Node prev;
         Node(int value){
            this.value=value;

         }

         Node(int value,Node next,  Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;       

          }
    }
    public static void main(String[]args){

 DLL list=new DLL();
 list.insertfirst(100);
 list.insertfirst(200);
 list.insertfirst(300);
 //list.insertlast(199);
 list.insertfirst(400);
 list.insertfirst(500);
 list.insertfirst(600);
 list.insertlast(199);
 list.insertPos(3,143);
 list.insertPos(2,7);
 list.insertPos(3,111);
 list.insertPos(3,143);
 list.insertPos(3,199);
 list.display();

    }
    
}

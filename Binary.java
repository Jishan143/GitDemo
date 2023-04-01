public class Binary {

     Node root;

    void insert(int val){

        Node temp=new Node(val);

        if(temp.val<root.val){
            root.left=temp;
        }
        else
        root.right=temp;
        insert(val);
    }
    void display()
    {
        Node temp=root;
        while(temp.left!=null)
        {

              System.out.println(temp.val+" "+temp.left.val+" "+temp.right.val+" ");
        }




    }

   public class Node{

    Node left;
    Node right;
    int val;
    Node(int val){
        this.val=val;

    }



    public static void main(String[]argd){
        Binary tree=new Binary();

        tree.insert(76);
        tree.insert(45);
        tree.insert(10);
        tree.display();

    }
    
}
}

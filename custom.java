class zees extends stack{
    
    zees(int size){
super(size);
    }
 
     @Override
     void push(int item){
        super.push(item);
     }
    //  @Override
    //  int pop(){
    //     return super.pop();

    //  }

     int pop(int ind,int rem){

        if(ind==-1){
            System.out.println("its empty");
                }

                rem=arr[ind--];
                ind--;
     
        return pop(ind--,rem);

     }

    
}


public class custom{

    public static void main(String[]args){
        zees k=new zees(10);

        k.push(10);
        k.push(20);
        k.push(30);
        k.push(40);
        k.push(60);
        System.out.println(pop(10,0));
    //    System.out.println(k.pop());
    //    System.out.println(k.pop());
    //    System.out.println(k.pop());

    }

}


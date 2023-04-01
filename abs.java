 abstract class  zee   //Must declase a classa sabstract class;
{
 int age;
 zee(){
    this.age=0;
 }

    abstract int area(int a,int b);     //These two are abstract method i.e method without body
    abstract int dist(int s,int t);
    
}
class traingle extends zee{

    
    @Override
    int area(int a,int b){   //abstracted method with Body
 
        return a*b;

    }
    @Override
    int dist(int s,int t)  //abstracted method with Body
    {

        return s*t;
    }
}
class rect extends zee{

    @Override
    int area(int a,int b){   //abstracted method with Body
 
        return a+b;

    }
    @Override
    int dist(int k,int l)   //abstracted method with Body
    {

        return k-l;
    }

}

public abstract class  abs {
    public static void main(String[]args){

        zee z=new rect();  //Dynamic memory dispatch
            System.out.println(z.area(10,10));
            System.out.println(z.dist(8,6));

            int a=100;
            String s=String.valueOf(a);
            System.out.println(s);
    }

}

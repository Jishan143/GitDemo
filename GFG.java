import java.util.Scanner;
class GFG {
    
    static int geeko(int A,int B,int C,int n)
    {
       Scanner in=new Scanner(System.in);
   
   //for(int i=0;i<T;i++)
   //{
    //    int A=in.nextInt();
    //    int B=in.nextInt();
    //    int C=in.nextInt();
       
       if(n==1)
       {
           return A;
       }
       if(n==2){
           return B;
       }
       if(n==3){
           return C;
       }
    
       return (geeko(A,B,C,n-1)+geeko(A,B,C,n-2)+geeko(A,B,C,n-3));
       
       
       
    }
   
       public static void main(String[] args) {
           
           System.out.println(geeko(4,6,7,4));
           
       }
   }

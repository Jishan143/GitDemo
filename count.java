public class count {

    static int  COUNT(String s,int count){
       
       if(count==s.length())
       {
        return count;
    }
//       if(s==null || s==""){
//  return 0;
//          }
        


   
return COUNT(s,count+1);}
   

   
    public static void main(String[]args){
        String s="Shubham Arora and Zeeshan khan and sahil tiwari";
        System.out.print("total count is"+" ");
         System.out.println(COUNT(s,0));
    }

}

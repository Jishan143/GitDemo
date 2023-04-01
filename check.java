import java.util.Scanner;
public class check {
    



    public static void main(String[]args){
      
int arr[]={1,2,3,4,5};

System.out.println(yesORno(arr,0));

    }
    static boolean yesORno(int arr[],int count){
        count=0;
        int i=count;
       
        for(i=0;i<arr.length();i++){
          return (arr[i]<arr[i+1]) && yesORno(arr,count++);
           
           } 
       
       
       return false;
       
       }
}

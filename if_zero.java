public class if_zero {
    
    static void ifzero(int arr[]){

int a[]=new int[arr.length];
        for(int i=0;i<=arr.length;i++)
        {
if(arr[i]==0 &arr[i+1]!=0)
{
 a[i]=arr[i];
 arr[i+1]=arr[i];
 if(a[i+1]==null){

 }
}
        }
        for(int i=arr.length-1;i<arr.length;i++){
            arr[i]=a[i];
        }
        System.out.println("");
    }
    public static void  main(String[]args){


        int arr[]={1,2,0,4,5,0,4};
        ifzero(arr);
    }
}

public class anagram {


    static boolean isAnagram(String a, String b) {
        
        char s[]=new char[a.length()];
        char p[]=new char[b.length()];
        
        if(a.length()!=b.length())
        {
             System.out.println("Not Anagrams");
             
        }
        
        
        for(int i=0;i<a.length();i++){
            s[i]=a.charAt(i);
        }
        
         for(int i=0;i<b.length();i++){
            p[i]=a.charAt(i);
        }
         for(int i=0;i<a.length();i++){
            
            for(int j=i+i;j<a.length();j++){
                if(s[j]<s[i]){
                    char temp=s[j];
                    s[j]=s[i];
                    s[i]=temp;
                }
            }
            
        }
        
         for(int i=0;i<b.length();i++){
            
            for(int j=i+i;j<a.length();j++){
                if(p[j]<p[i]){
                    char wemp=p[j];
                    p[j]=p[i];
                    p[i]=wemp;
                }
            }
            
        }
         for(int i=0;i<b.length();i++){

             if(s[i]==p[i]){
                 return true;
                 //System.out.println("Anagrams");
             }
             else
             return false;
             // System.out.println(" No Anagrams");
         }
                
    
        
        return true;
    }
    
    public static void main(String[]args){

        String a="zeeshan";
        String b="eeashnps";
     
      boolean ret=isAnagram(a,b);
      System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );



    }
}

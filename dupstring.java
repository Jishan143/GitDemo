public class dupstring {

public static void main(String[]args){

    String myString = "zeeshan khan";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < myString.length(); i++) {
        char c = myString.charAt(i);
        if (sb.indexOf(String.valueOf(c)) == -1) {
            sb.append(c);
        }
    }
           System.out.println(sb);  
    
}
}

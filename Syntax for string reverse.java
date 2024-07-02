import java.util.*;
public class string_Builders{
    public static void main(String args[]){
        
        //Syntax
        StringBuilder sb = new StringBuilder("Tonyyt");
        
        //for any string reverse syntax
        for (int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;
            
            char frontChar =sb.charAt(front);
            char backChar = sb.charAt(back);
            
            sb.setCharAt(front, backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
import java.util.*;
public class string_Builders{
    public static void main(String args[]){
        
        //Syntax
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        
        //String Index
        System.out.println(sb.charAt(0));
        
        //String Replace
        sb.setCharAt(0 , 'p');
        System.out.println(sb);
        
        //String Insert
        sb.insert(0 , 'A');
        System.out.println(sb);
        
        //String delete
        sb.delete(0 ,2);
        System.out.println(sb);
    }
}
import java.util.*;
public class StringsConcatenation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        if (firstName.compareTo(lastName) ==0){
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
    }
}
import java.util.*;
public class Mosin{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        if (button== 1){
            System.out.println("Water");
        } else if (button == 2) {
            System.out.println("Coffee");
        } else if (button == 3) {
            System.out.println("Tea");
        } else {
            System.out.println("Inavlid button");
        }   
    }
 }

import java.io.IOException;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner (System.in);
        
        int X = sc.nextInt();
        double Y = sc.nextDouble();
        
        
        double avg = X/Y;
        
        
        System.out.printf("%.3f",avg);
        System.out.println(" km/l");

        
        
    }
 
}

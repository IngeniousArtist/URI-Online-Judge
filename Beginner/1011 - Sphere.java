import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner (System.in);
        
        double R = sc.nextDouble();
        
        double VOLUME = ((4.0/3.0)*3.14159*R*R*R);
        
        System.out.printf("VOLUME = %.3f\n",VOLUME);
        
        
    }
 
}

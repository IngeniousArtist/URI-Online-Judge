import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner (System.in);
        
        String NAME = sc.nextLine();
        double SALARY = sc.nextDouble();
        double SALES = sc.nextDouble();
        
        
        double TOTAL = (0.15*SALES)+SALARY; 
        

        System.out.printf("TOTAL = R$ %.2f\n",TOTAL);

 
    }
 
}

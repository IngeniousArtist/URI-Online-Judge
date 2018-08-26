import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner (System.in);
        
        int NUMBER = sc.nextInt();
        int HOURS = sc.nextInt();
        double AMOUNT = sc.nextDouble();
        
        
        double SALARY = HOURS*AMOUNT;
        

        System.out.println("NUMBER = "+NUMBER);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);

 
    }
 
}

import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        
        int num = N;
        
        int h=0;
        int m=0;
        int s=0;
        
        h = num/3600;
        num = num%3600;
        
        m = num/60;
        num = num%60;
        
        s = num;
        
        System.out.println(h+":"+m+":"+s);
        
        
        
    }
 
}

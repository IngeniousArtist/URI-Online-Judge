import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner (System.in);
        int input = sc.nextInt();
        
        int num = input;
        
        int y=0;
        int m=0;
        int d=0;

        y = num/365;
        num = num%365;
        
        m = num/30;
        num = num%30;
        
        d = num;
        
        System.out.println(y+" ano(s)");
        System.out.println(m+" mes(es)");
        System.out.println(d+" dia(s)");
    }
 
}

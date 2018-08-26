import java.io.IOException;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner (System.in);
        int input = sc.nextInt();
        
        int num = input;
        
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        
        a = num/100;
        num = num%100;
        
        b = num/50;
        num = num%50;
        
        c = num/20;
        num = num%20;
        
        d = num/10;
        num = num%10;
        
        e = num/5;
        num = num%5;
        
        f = num/2;
        num = num%2;
        
        g = num/1;
        num = num%1;
        
        System.out.println(input);
        System.out.println(a+ " nota(s) de R$ 100,00");
        System.out.println(b+ " nota(s) de R$ 50,00");
        System.out.println(c+ " nota(s) de R$ 20,00");
        System.out.println(d+ " nota(s) de R$ 10,00");
        System.out.println(e+ " nota(s) de R$ 5,00");
        System.out.println(f+ " nota(s) de R$ 2,00");
        System.out.println(g+ " nota(s) de R$ 1,00");
        
    }
 
}

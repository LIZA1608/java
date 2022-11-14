package ST1PRACTI;
import java.util.*;
public class gcd {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int c=0;
            int temp=Math.min(n, m);
            for(int i=1;i<=temp;i++){
                if(n%i==0 && m%i==0){
                    c=i;
                }
            }
System.out.print(c);
        }        
    }
}

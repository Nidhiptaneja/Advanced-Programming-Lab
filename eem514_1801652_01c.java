import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
public class eem514_1801652_01c
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N,sq;
        BigInteger sum;
        BigInteger A=BigInteger.ONE;
        BigInteger B=new BigInteger("2");
        N=sc.nextInt();
        sq=N*N;
        sum=(B.pow(sq)).subtract(A);
        System.out.println(sum);
    }
    
}
        
        
        
    



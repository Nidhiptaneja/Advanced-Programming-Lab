import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
public class eem514_1801652_01d
{
    
    static BigInteger factorial(int N) 
    { 
        
        BigInteger f = new BigInteger("1"); 
        for (int i = 2; i <= N; i++)
        { 
            f = f.multiply(BigInteger.valueOf(i));
        } 
        return f; 
    } 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N,M;
        int c=0;
        BigInteger total_ways,q;
        N=sc.nextInt();
        M=sc.nextInt();
        BigInteger A=BigInteger.valueOf(0);
        BigInteger B=BigInteger.valueOf(10);
        total_ways=(factorial(N)).divide(factorial(N-M));
        
        while(total_ways.compareTo(A)>0) {
            q= total_ways.mod(B);         
            if(q.equals(A)) {
                c=c+1;
            }else {
                break;
            }           
            total_ways=total_ways.divide(B);
        }           
    System.out.println(c);
        
        
    }
}
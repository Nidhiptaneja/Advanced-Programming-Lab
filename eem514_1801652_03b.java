import java.util.*;
import java.math.BigInteger;
import java.lang.*;
public class eem514_1801652_03b
{
	public static BigInteger string_simple(int n)
	{
		int i;
		BigInteger A,B,C,D;
		B  = BigInteger.valueOf(n);
		String s="";
		A=BigInteger.valueOf(System.currentTimeMillis());
		for(i=0;i<n;i++)
			s+='*';
		
		C=BigInteger.valueOf(System.currentTimeMillis());
		D=C.subtract(A);
		return D;
	}
	public static BigInteger string_buffer(int n)
	{
		int i;
		BigInteger A,B,C,D;
		B  = BigInteger.valueOf(n);
		StringBuffer s=new StringBuffer();
		A=BigInteger.valueOf(System.currentTimeMillis());
		for(i=0;i<n;i++)
			s.append('*');
		C=BigInteger.valueOf(System.currentTimeMillis());
		D=C.subtract(A);
		return D;
	}
	public static BigInteger string_builder(int n)
	{
		int i;
		BigInteger A,B,C,D;
		B  = BigInteger.valueOf(n);
		StringBuilder s = new StringBuilder();
		A=BigInteger.valueOf(System.currentTimeMillis());
		for(i=0;i<n;i++)
			s.append('*');
		C=BigInteger.valueOf(System.currentTimeMillis());
		D=C.subtract(A);
		return D;
	}
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(string_simple(n)+" ");
		System.out.print(string_buffer(n)+" ");
		System.out.println(string_builder(n));
	}
	

}

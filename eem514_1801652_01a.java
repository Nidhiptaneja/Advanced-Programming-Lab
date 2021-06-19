import java.util.*;
public class eem514_1801652_01a
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N= sc.nextInt();
		int a[]=new int[N];
		int i,k,mid,first,last;
		int c=0;
		for(i=0;i<N;i++)
		{a[i]=sc.nextInt();
		}
		k=sc.nextInt();
		first=0;
		last=N-1;
		mid=(first+last)/2;
		while(first<=last)
		{c++;
			if(a[mid]==k)
			{
				System.out.println(c);
				break;
			}
			else if(k>a[mid])
			{
				first=mid+1;
			}
			else if(k<a[mid])
			{
				last=mid-1;
			}
			
		mid=(first+last)/2;
	    }
	    if(first>last)
	    System.out.println(-1);
	    
    }
}
import java.util.*;
public class eem514_1801652_02a
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l,l1,i,j=0,f,t=0;
        char ch,c;
        l=s.length();
        int n[]= new int[l];
        s=s.toUpperCase();
        for(c='A';c<='Z';c++)
        {f=0;
            for(i=0;i<l;i++)
            {
                ch=s.charAt(i);
                if(c==ch)
                ++f;
            }
            if(f>0)
            {
              n[j]=f;
              j++;
            }
        }
        l1=n.length;
        for(i=0;i<l1-1;i++)
        {
            for(j=0;j<l1-i-1;j++)
            {
                if(n[j]<n[j+1])
                {
                t=n[j];
                n[j]=n[j+1];
                n[j+1]=t;
                }
            }
        }
        for(i=0;i<l1;i++)
        if(n[i]!=0)
        System.out.print(n[i]+" ");
    }
}
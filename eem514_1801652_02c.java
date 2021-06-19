import java.util.*;
public class eem514_1801652_02c
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        int l,i,m;
        char ch;
        l=s.length();
        String s1="";
        m=(int)(l/2);
        for(i=0;i<=m;i++)
        {
            ch=s.charAt(i);
            s1=s1+ch;
            if(i!=m)
            s1=s1+s.charAt((l-1-i));
            if(l%2!=0)
            {
                if(i==m)
                {
                    break;
                }
            }
            else if(l%2==0)
            {
                if(i==(m-1))
                {
                    break;
                }
            }
        }
        System.out.println(s1);
    }
}

        
        
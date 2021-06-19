import java.util.*;
public class eem514_1801652_02b
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1= s.replaceAll("\\s","");
        s1=s1.toUpperCase();
        int i,p1,p2,p3,n1=0,n2=0;
        String s2=s1.substring(0,3);
        p1=s1.indexOf('(');
        p2=s1.indexOf(',');
        p3=s1.indexOf(')');
        char c[]= s1.toCharArray();
        for(i=p1+1;i<p2;i++)
        {
            n1=n1*10;
            n1=n1+Character.getNumericValue(c[i]);
        }
        for(i=p2+1;i<p3;i++)
        {
            n2=n2*10;
            n2=n2+Character.getNumericValue(c[i]);
        }
        switch(s2)
        {
            case "ADD":
            System.out.println(n1+n2);
            break;
            case "SUB":
            System.out.println(n1-n2);
            break;
            case "MUL":
            System.out.println(n1*n2);
            break;
            case "DIV":
            System.out.println((int)(n1/n2));
            break;
            case "POW":
            System.out.println((int)Math.pow(n1,n2));
            break;
            
        }
    }
}
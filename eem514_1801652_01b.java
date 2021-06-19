import java.util.*;
public class eem514_1801652_01b
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f;
        String s=new String();
        
        f=n%8;
        if (f == 1) 
        s="thumb"; 
        if (f == 5) 
        s="little"; 
        if (f == 0 || f == 2) 
        s="index"; 
        if (f == 3 || f == 7) 
        s="middle"; 
        if (f == 4 || f == 6) 
        s="ring"; 
        System.out.println(s);
    }
} 
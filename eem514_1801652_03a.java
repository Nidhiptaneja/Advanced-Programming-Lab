import java.util.*;
import java.io.File;
import java.util.*;

public class eem514_1801652_03a 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc= new Scanner(System.in);
		String inputfile=sc.nextLine();
		File file= new File(inputfile);
		Scanner sc1 = new Scanner(file);
		
		
		
		


	    int  countopeningbraces=0;
	    int  countclosingbraces=0;
	    int c=0;
	    StringBuffer sb= new StringBuffer();	
	    while(sc1.hasNext()) 
	    {
		   sb.append(" "+sc1.nextLine());
	    }	
	    String s= sb.toString();
	    s= s.replaceAll("\\s{2,}", " ");
	    int ind=s.indexOf(" class ");	
		if(ind>=0) 
		{
			c=1;
			while(true) 
			{
				int k= s.indexOf(" class ",(ind+5));
	            ind=k;
	            if(k>0) 
	            	c++;
	            if(k==-1)
		             break;
	        }

	        
	        
		}
		
		int indBraceOp=s.indexOf("{");	
		if(indBraceOp>=0) 
		{
		    countopeningbraces=1;	 
		    while(true) 
		    {
		    	int k1= s.indexOf("{",(indBraceOp+1));
	            indBraceOp=k1;
	            if(k1>0) 
	                countopeningbraces++;
	             if(k1==-1)
	                break;
	        }
	    }
		
		 
		int indBraceCl=s.indexOf("}");	
		if(indBraceCl>=0) 
		{
			countclosingbraces=1;	 
		    while(true) 
		    {
		        int k1= s.indexOf("}",(indBraceCl+1));
		        indBraceCl=k1;
		        if(k1>0)
		            countclosingbraces++;
		        if(k1==-1)
		            break;
		    }
		}
			
		int fault=0;
		int fromIndex=0;
		while((fromIndex= s.indexOf("{ } class", fromIndex))!= -1)
		{
			fault++;
			fromIndex++;
		}
		if(countclosingbraces==countopeningbraces && fault==0)
		System.out.println(c);
		else
		System.out.println("ERROR");
	}
}


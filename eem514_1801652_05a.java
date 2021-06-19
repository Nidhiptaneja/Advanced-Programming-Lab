import java.util.*;
public class eem514_1801652_05a 
{
	public static void main (String args[]) 
	{
		Plate p = new Plate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N");
		int N=sc.nextInt();
		Tom t = new Tom(p,N); 
		Jerry j = new Jerry(p,N); 		
		t.setPriority(10);
		t.start();
		j.start();
	}
}
class Plate 
{
	Random rand=new Random();
	String [] s = {"KitKat","Mars","DailyMilk","Twix","Toblerone"};
	boolean avail=false;
	synchronized void waitForEmptyPlate()
	{
		while (avail==true ) 
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}	

	synchronized void waitForChocolate()
	{
		while (avail==false) 
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}	
	
	synchronized void eatChoco(int k, int Num) 
	{
		int temp=k;
		if(k>4)	temp=k%4;
		if(avail==true) 
		{
		try 
		{
			Thread.sleep(rand.nextInt(2)*1000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println();
		System.out.print(k+":Jerry : eats up the "+ s[temp]);
		System.out.println();
		System.out.println(k+":Jerry : slips back into the hole");
		if(k+1<Num)
		System.out.println((k+1)+":Jerry : peeks out of the hole");
		avail = false;
		notify();
		}
	}

	synchronized void placeChoco(int k) 
	{
		try 
		{
			Thread.sleep(rand.nextInt(2)*1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.print(k);
		if(k>4) k=k%4;
		System.out.println(":Tom : puts a "+s[k]+" on the table and turns back..");
		avail=true;
		notify();
	}

}

class Tom extends Thread 
{
	Plate p; int no;
	public Tom(Plate p,int n) 
	{
		this.p=p;
		no=n;
	}
	public void run () 
	{
		System.out.println();
		System.out.println("0:Tom : opens the fridge door");
		for(int i=0;i< no;i++) 
		{
		p.placeChoco(i);
		p.waitForEmptyPlate();
		System.out.println(i+":Tom : closes the fridge door,turns and sees the empty plate");
		if(i<no-1)
		System.out.println((i+1)+":Tom : opens the fridge door again");
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {e.printStackTrace();}
		}
	System.out.println("Tom cries Meeeaaaooowww!");
	
	}
}

class Jerry extends Thread 
{
	Plate p; int no;
	public Jerry(Plate p,int n) 
	{
		this.p=p;
		no=n;
	}
	public void run () 
	{
		System.out.println("0:Jerry : peaks out of the hole");
		for(int i=0;i< no;i++) 
		{
		p.eatChoco(i,no);
		if(i<no-1)
		p.waitForChocolate();
		}
		
	}
}

import java.util.*;


public class eem514_1801652_06a 
{
	
	public static void main(String[] args) throws Exception 
	{
		int N = 61 * (int)(Math.pow(10,6));
		//Random rand = new Random();
		//int index= rand.nextInt(N);
		ArrayList  <Integer>  array = new ArrayList<>(N);
		LinkedList <Integer> linked= new LinkedList<>();
		System.out.println(N);
		for(int i=0;i<N;i++) 08
		{
			array.add(i, 1);
			linked.add(i, 1);			
		}
		//Insertion
		//Random

		long start1= System.nanoTime();
		array.add(N-1,50);
		long end1= System.nanoTime();
		System.out.println(end1-start1+" insert at random of array");
		
		long start2= System.nanoTime();
		linked.add(N-1,70);
		long end2= System.nanoTime();
		System.out.println(end2-start2+" insert at random of linked size" + N);
	}
}
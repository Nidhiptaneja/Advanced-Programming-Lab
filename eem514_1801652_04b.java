import org.jfugue.Player;

public class eem514_1801652_04b
{
	public static void main(String[] args) 
	{
	 	int i; 
	 	Player player = new Player();
	 	String c[]=new String[] {"C4q","D4q","E4q","f4q","G4q","A4q","B4q"};
	 	int pattern[]=new int[] {0,1,2,3,1,2,3,4,2,3,4,6,5,4,6,4,5,0};
	 	String music="";
	 	for(i=0;i<pattern.length;i++)
	 	{
	 		if(i%2==0) 
	 		{
	 			music+= c[pattern[i]]+"+"+c[(pattern[i]+2)%c.length]+"+"+c[(pattern[i]+4)%c.length]+" ";
	 		}
	 		else
	 		{
	 			music+=c[pattern[i]]+" ";
	 		}
	 	}
	 	for(i=0;i<pattern.length;i++)
	 	{
	 		if(i%2==0) 
	 		{
	 			music+= c[pattern[pattern.length-1-i]]+"+"+c[(pattern[pattern.length-1-i]+2)%c.length]+"+"+c[(pattern[pattern.length-1-i]+4)%c.length]+" ";
	 		}
	 		else
	 			music+=c[pattern[i]]+" ";
	 	}
	 	player.play(music);
	 	
  
	}
	

}
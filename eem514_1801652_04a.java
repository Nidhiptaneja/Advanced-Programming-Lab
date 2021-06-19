import java.io.File;
import java.util.*;
public class eem514_1801652_04a
{

	public static void main ( String [] args ) throws Exception
	{
		//File file = new File("_4a.input");
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			String line = sc.nextLine();
		    if(line.equals("END"))
		    {
		    	break;
		    }
		    int p1=line.indexOf(',');
		    String name = line.substring(0,p1);
		    int totalStocks=Integer.parseInt(line.substring(p1+1).trim());
		    Investor I = new Investor(name,totalStocks);

		    readInput(sc,I);
		    report(I);
		}
	}
	
	public static void readInput(Scanner sc, Investor I) 
	{
		int i,j;
		String symbol;
		double currentPrice;
		int no_Purchase;
		for(i=0;i<I.getTotalStocks();i++)
		{
			String line= sc.nextLine();
			String element[]=line.split(",");
		    symbol= element[0];
		    currentPrice= Double.parseDouble(element[1].trim());
		    no_Purchase= Integer.parseInt(element[2].trim());
		    Stock S= new Stock(symbol,currentPrice);
		    for(j=0;j<no_Purchase;j++)
		    {
		    	line= sc.nextLine();
		    	String shares[]= line.split(",");
		    	int no_shares= Integer.parseInt(shares[0].trim());
		    	double cost_share= Double.parseDouble(shares[1].trim());
		    	
		    	S.purchase(no_shares, cost_share);
		    }
		    I.addStock(S);
		}
	}
	
	public static void report(Investor I) 
	{
		I.displayStockSummary();
	}
	
}


class Stock 
{

	private String symbol;
	private int totalShares;
	private double totalCost; 
	private double currentPrice;

	
	
	public Stock(String theSymbol, double currentPrice) 
	{
		symbol=theSymbol;
		this.currentPrice=currentPrice;
		totalShares=0;
		totalCost=0.0;
	}
	public void purchase(int shares, double pricePerShare) 
	{
		totalShares+=shares;
		totalCost+=(double)(shares*pricePerShare);

	}
	
	
	public double getProfit() 
	{
		double profit=(double)(totalShares*currentPrice)-totalCost;
		return profit;

	}

	public String getSymbol() 
	{
		return symbol;
	}
	
	public double getCurrentPrice() 
	{
		return currentPrice;
	}
	
 }


class Investor 
{

	private String investorName;
	private Stock cosList[]; 
	private int totalStocks;
	private double overallProfit;
	private int p=0;
	public Investor(String name, int n) 
	{
		investorName=name;
		totalStocks=n;
		cosList= new Stock[totalStocks];
	}
	public String getInvestorName()
	{
		return investorName;
	}
	public int getTotalStocks()
	{
		return totalStocks;
	}
	public void addStock (Stock s)
	{
		cosList[p++]=s;
	}
	public double totalProfit()
	{
		int i;
		for(i=0;i<totalStocks;i++)
		{
			overallProfit+=cosList[i].getProfit();
		}
		return overallProfit;
	}
	public Stock mostProfittableStock()
	{
		int i;
		Stock maxProfit;
		maxProfit= cosList[0];
		for(i=0;i<totalStocks;i++)
		{
			if(cosList[i].getProfit()>maxProfit.getProfit())
			{
				maxProfit=cosList[i];
			}
		}
		return maxProfit;
	}
	public Stock leastProfittableStock()
	{
		int i;
		Stock leastProfit;
		leastProfit=cosList[0];
		for(i=0;i<totalStocks;i++)
		{
			if(cosList[i].getProfit()<leastProfit.getProfit())
			{
				leastProfit=cosList[i];
			}
		}
		return leastProfit;
	}
	public void displayStockSummary()
	{
		int i;
		double pr;
		System.out.println("Investor Name: "+getInvestorName());
		System.out.println("Stock"+"   "+"Curr Price"+"   "+"Profit/Loss");
		for(i=0;i<totalStocks;i++)
		{
			System.out.println(cosList[i].getSymbol()+"   "+cosList[i].getCurrentPrice()+"   "+cosList[i].getProfit());
		}
		pr=totalProfit();
		System.out.println("Nett.Profit/loss as of today:"+pr);
		System.out.println(getInvestorName()+"'s most Profitable scrip is:"+mostProfittableStock().getSymbol()+"(Price:"+mostProfittableStock().getCurrentPrice()+" Profit:"+mostProfittableStock().getProfit()+")");
		System.out.println("what "+getInvestorName()+"'should probably sell off:"+leastProfittableStock().getSymbol());
	}
}

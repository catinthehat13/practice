package interview;

public class NumberToString 
{
	private String getSingle(int i)
	{
		String [] numSt = {	"", 
					"one", 
					"two", 
					"three", 
					"four", 
					"five", 
					"six",
					"seven",
					"eight",
					"nine"};
		
		if(i < 0)
		{
			System.out.println("Single digit is negative!");
			return "";
		}
		
		return numSt[i];
	}
	
	private String getTens(int i)
	{
		String [] numSt = {	"", 
					"ten", 
					"twenty", 
					"thirty", 
					"forty", 
					"fifty", 
					"sixty", 
					"seventy", 
					"eighty", 
					"ninety"};
		
		String [] teensSt = {	"ten",
					"eleven",
					"twelve",
					"thirteen",
					"fourteen",
					"fifteen",
					"sixteen",
					"seventeen",
					"eighteen",
					"nineteen"};
		
		int ones = i % 10;
		int tens = (int) (i / 10);
		
		if(tens == 1)
		{
			return teensSt[ones];
		}
		else
		{
			return numSt[tens] + " " + this.getSingle(ones);
		}
	}
	
	private String getHundred(int hundred)
	{
		String hundredSt = "";
		
		int h = (int)(hundred / 100);
		int hRemainder = hundred % 100;
		
		if(h > 0)
		{
			hundredSt = getSingle(h) + " hundred";
			
			if(hRemainder > 0)
			{
				hundredSt += " and ";
			}
		}
		
		hundredSt += getTens(hRemainder);
		
		return hundredSt;
	}
	
	public void printIt(int i)
	{
		int h = i % 1000;
		int t = (int)(i/1000);
		String numSt = "";
		
		if (i == 0)
		{
			numSt = "zero";
		}
		
		if (t > 0)
		{
			numSt = getHundred(t) + " thousand ";
		}
		
		if(h > 0)
		{
			numSt += getHundred(h);
		}
		
		System.out.println(numSt);
	}
	
}

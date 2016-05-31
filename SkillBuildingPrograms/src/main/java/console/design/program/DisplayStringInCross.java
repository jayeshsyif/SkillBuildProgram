package console.design.program;

public class DisplayStringInCross {

	public static void main(String[] args) {
		String[] arr = {"jayesh","sagar","India"};
		for(String s:arr)
		{
			displayStringInCross(s);
		}
	}
	private static void displayStringInCross(String s)
	{
		System.out.println();
		int count = s.length();
		for(int i=0; i<count;i++)
		{
			int last = count-1-i;
			for(int j=0; j<count;j++)
			{
				String toDisplay ="";
				if(j==last)
				{
					toDisplay = toDisplay + s.charAt(last);
				}
				else if(j== i)
				{
					toDisplay = toDisplay + s.charAt(i);
				}else
				{
					toDisplay = toDisplay +" ";
				}
				System.out.print(toDisplay);
			}
			System.out.println();
		}
	}

}

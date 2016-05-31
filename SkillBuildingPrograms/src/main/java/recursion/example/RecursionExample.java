package recursion.example;
class RecursionExample{

	public static void recursivefun(int n) 
	{ 
		if(n <= 20) 
		{

			System.out.println(n); 
			recursivefun(n+1);
		}
	}

	public static void main(String args[]) 
	{

		recursivefun(1); 

	}

}
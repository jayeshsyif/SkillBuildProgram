package exception.example;

public class SystemErrInTryExample {

	public static void main(String[] args) {
		System.out.println(tryM2());
	}
	@SuppressWarnings("unused")
	private static int tryM1()
	{
		try
		{
			return 1;
		}catch(Exception e)
		{
			System.err.println("Error");
		}finally {
			System.out.println("Finally ");
		}
		return 0;
	}
	private static int tryM2()
	{
		try
		{
			System.out.println("try ");
			System.exit(10);
		}catch(Exception e)
		{
			System.err.println("Error");
		}finally {
			System.out.println("Finally ");
		}
		return 0;
	}
}

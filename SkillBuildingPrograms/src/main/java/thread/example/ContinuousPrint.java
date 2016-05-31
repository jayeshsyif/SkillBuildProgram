package thread.example;

import java.util.Scanner;

public class ContinuousPrint 
{
	public static int number=0;
	public static Boolean flag = false;
	public static void main(String[] args) {
		System.out.println("printing");

		PrintNumbers printNumbers = new PrintNumbers();
		printNumbers.start();

		PressEnter pressEnter = new PressEnter();
		pressEnter.start();
	}

}
class PrintNumbers extends Thread
{
	@Override
	public void run() {
		for(;;)
		{
			if(ContinuousPrint.flag)
			{
				break;
			}else
			{
				System.out.println(ContinuousPrint.number);
			}
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			ContinuousPrint.number++;
		}
	}
}
class PressEnter extends Thread
{
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		String s = null;
		{
			s= sc.nextLine();
			if(s != null)
			{
				ContinuousPrint.flag = true;
			}
		}
		sc.close();
	}
}
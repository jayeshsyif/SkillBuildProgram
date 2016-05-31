package thread.example;



public class ArrayContinuousPrint 
{
	public static int starti=0, startj=0, endi=0, endj=0, row=10, col=10,sleep = 400;
	public static int[][] arr = new int[row][col];
	public static void main(String[] args) {
		initialize();

		StartPrintArray startPrintArray = new StartPrintArray();
		startPrintArray.start();

		EndPrintArray endPrintArray = new EndPrintArray();
		endPrintArray.start();
	}
	public static void initialize()
	{
		//int count = 1;
		for(int i=0; i< row; i++)
		{
			for(int j=0; j< col; j++)
			{
				//arr[i][j] = count;
				arr[i][j] = 0;
				//count++;
			}
		}
	}
	public static synchronized void printArr()
	{
		System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
		for(int i=0; i< row; i++)
		{
			for(int j=0; j< col; j++)
			{
				if(arr[i][j] == 0)
					System.out.print("[ ]\t");
				else if(arr[i][j] == 1)
					System.out.print("*\t");
				else if(arr[i][j] == 2)
					System.out.print("#\t");
			}
			System.out.println();
		}

	}

}

class StartPrintArray extends Thread
{
	@Override
	public void run() 
	{
		for(int i=0; i<ArrayContinuousPrint.row; i++)
		{
			for(int j=0; j<ArrayContinuousPrint.col; j++)
			{
				if(ArrayContinuousPrint.arr[i][j] == 0)
				{
					try {
						sleep(ArrayContinuousPrint.sleep);
						synchronized (this) 
						{
							ArrayContinuousPrint.arr[i][j] = 1;
							ArrayContinuousPrint.printArr();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else
				{
					break;
				}
			}
		}
	}
}
class EndPrintArray extends Thread
{
	@Override
	public void run() {
		for(int i=ArrayContinuousPrint.row-1; i>=0; i--)
		{
			for(int j=ArrayContinuousPrint.col-1 ; j>=0; j--)
			{
				if(ArrayContinuousPrint.arr[i][j] == 0)
				{
					try {
						sleep(ArrayContinuousPrint.sleep);
						synchronized (this) 
						{
							ArrayContinuousPrint.arr[i][j] = 2;
							ArrayContinuousPrint.printArr();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else
				{
					break;
				}
			}
		}
	}
}
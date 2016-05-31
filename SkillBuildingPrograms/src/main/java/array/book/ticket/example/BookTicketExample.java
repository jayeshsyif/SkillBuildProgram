package array.book.ticket.example;

import java.util.Scanner;


public class BookTicketExample
{

	public static void main(String[] args) {
		int row = 10;
		int col = 10;
		int[][] arr = new int[row][col];
		
		initialize(arr, row, col);
		print(arr, row, col);

		char ch = 'N';
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter number of tickets to book ");
			try{
				int choice = sc.nextInt();
				switch (choice) 
				{
				case 1:
					book(new BookOneTicket(), arr, row, col);
					break;
				case 2:
					book(new BookTwoTicket(), arr, row, col);
					break;
				case 3:
					book(new BookThreeTicket(), arr, row, col);
					break;
				default:
					System.out.println("\nCannot book more than 3 tickets!\n");
					break;
				}

			}catch(Exception e)
			{
				System.out.println("Invalid choice! Enter number only");
			}

			System.out.println("Do you want to continue (Y/N)? ");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
		sc.close();
	}

	public static void print(int arr[][],int row, int col)
	{
		System.out.println("\n");
		for(int i=0; i< row; i++)
		{
			for(int j=0; j< col; j++)
			{
				if(arr[i][j] == 0)
				{
					System.out.print("[ ]\t");
				}else
				{
					System.out.print("[X]\t");
				}
			}
			System.out.println();
		}
	}

	public static void initialize(int arr[][],int row, int col)
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
	public static void book(TicketAdapterInterface cl,int arr[][], int row, int col)
	{

		TicketAdapterImp ai = new TicketAdapterImp(cl);
		TicketAdapterInterface a = ai.get();
		a.bookTicket(arr, row, col);
		print(arr, row, col);

	}
}

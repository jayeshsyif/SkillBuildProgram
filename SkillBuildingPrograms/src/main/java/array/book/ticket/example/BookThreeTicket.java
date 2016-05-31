package array.book.ticket.example;

public class BookThreeTicket implements TicketAdapterInterface{

	@Override
	public void bookTicket(int[][] arr,int row, int col) 
	{
		boolean booked = false;
		for(int i=0; i< row; i++)
		{
			int start = 0;
			if(arr[i][start] == 0 && arr[i][start+1] == 0 && arr[i][start+2] == 0 )
			{
				arr[i][start] =1;
				arr[i][start+1] =1;
				arr[i][start+2] =1;
				booked = true;
				break;
			}else if(arr[i][col-1] == 0 && arr[i][col-2] == 0 && arr[i][col-3] == 0 )
			{
				arr[i][col-1] = 1;
				arr[i][col-2] = 1;
				arr[i][col-3] = 1;
				booked = true;
				break;
			}
		}
		if(!booked)
			{
			for(int i=0; i< row; i++)
			{
				for(int j=0; j< col; j++)
				{
					if(j+1 < col)
					{
						if(arr[i][j] == 0 && arr[i][j+1] == 0 && arr[i][j+2] == 0)
						{
							arr[i][j]   = 1;
							arr[i][j+1] = 1;
							arr[i][j+2] = 1;
							booked = true;
							break;
						}
					}else
					{
						//System.out.println("booked in next row!");
						break;
					}
				}
				if(booked)
					break;
			}
			}
		if(!booked)
			System.out.println("No tickets available for 3 seats!");
	}


}

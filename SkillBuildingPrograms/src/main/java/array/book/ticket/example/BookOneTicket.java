package array.book.ticket.example;

public class BookOneTicket implements TicketAdapterInterface{

	@Override
	public void bookTicket(int[][] arr,int row, int col) 
	{
		boolean booked = false;
		for(int i=0; i< row; i++)
		{
			for(int j=0; j< col; j++)
			{
				if(arr[i][j] == 0)
				{
					arr[i][j] = 1;
					booked = true;
					break;
				}
			}
			if(booked)
				break;
		}
		if( !booked)
			System.out.println("No tickets available for 1 seats!");
		
	}


}

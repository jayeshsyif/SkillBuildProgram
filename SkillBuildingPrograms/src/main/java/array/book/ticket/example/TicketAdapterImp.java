package array.book.ticket.example;

public class TicketAdapterImp {

	private TicketAdapterInterface a;
	
	public TicketAdapterImp(TicketAdapterInterface a) {
		this.a = a;
	}
	public TicketAdapterInterface get()
	{
		return a;
	}
}

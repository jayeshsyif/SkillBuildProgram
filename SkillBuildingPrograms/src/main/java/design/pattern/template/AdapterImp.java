package design.pattern.template;

public class AdapterImp {

	private AdapterInterface a;
	
	public AdapterImp(AdapterInterface a) {
		this.a = a;
	}
	public AdapterInterface get()
	{
		return a;
	}
}

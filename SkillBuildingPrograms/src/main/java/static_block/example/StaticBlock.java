package static_block.example;

public class StaticBlock {

	public static void main(String[] args) {
		System.out.println(sk.getK());
	}
}

class sk
{
	private static final sk K;
	static
	{
		K= new sk();
	}
	public static sk getK()
	{
		return K;
	}
	
}

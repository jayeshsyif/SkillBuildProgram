package instance_block.example;

public class InitailizeBlock {

	public static void main(String[] args) {
		dk dk = new dk();
		System.out.println(dk.getI());
	}
}
class dk
{
	private int i=0;
	{
		i=10;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
}

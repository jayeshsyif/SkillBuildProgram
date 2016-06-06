package exception.example;

class parentException
{
	public void m1() throws NullPointerException{}
	public void m2() throws NullPointerException{}
	public void m3() throws RuntimeException{}
}
public class ExceptionWithOverriding {

	public void m1() throws NullPointerException{}
	public void m2() throws RuntimeException{}
	public void m3() throws NullPointerException{}
}

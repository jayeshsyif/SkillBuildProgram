package overriding_and_overload.example;

@SuppressWarnings("unused")
class parent
{
	private static void m1(int i){}
	public static void m2(int i){}
	public final void m3(int i){}
	public static void m4(int i){}
	private static void m5(int i){}
	public void m6(int i){}
	
}
public class OverridingExmaple extends parent{
	//@Override
	//private static void m1(int i){}//not allowed
	//@Override
	//public static void m2(int i){}//not allowed
	//@Override
	//private static void m2(int i){}//not allowed
	//@Override
	//public static void m2(int i,int j){}//not allowed
	//public static int m2(int i){}//not allowed
	//public void m3(int i){} //not allowed
	//private static void m4(int i){} // not allowed
	//@Override
	//public static void m4(int i){}// not allowed
	//@Override
	//public static void m5(int i){}// not allowed
	@Override
	public void m6(int i){}
	//@Override
	//public void m6(int i,int j){}// not allowed
}

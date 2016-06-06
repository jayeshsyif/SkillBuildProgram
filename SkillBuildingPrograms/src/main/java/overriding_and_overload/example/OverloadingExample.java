package overriding_and_overload.example;

@SuppressWarnings("unused")
public class OverloadingExample {
	private static void m1(int i){}
	private static void m1(int i,int j){}
	//private static int m1(int i){} //not allowed compilation error
	private static void m1(float i){}
	//public static void m1(int i){} //not allowed
}

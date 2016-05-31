package design.pattern.template;

public class TemplatePatternDemo {

	public static void main(String[] args) {
		System.out.println("Printing");
		
		AdapterImp ai =new AdapterImp(new Two());
		AdapterInterface a = ai.get();
		a.printHello();
		
	}
}

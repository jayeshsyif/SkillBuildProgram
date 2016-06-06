package string.examples;

import java.util.Scanner;

public class RepeatedCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		String out = new String();
		int len = in.length();
		for(int i=0; i<len; i++)
		{
			char iCh = in.charAt(i);
			boolean flag = true;
			for(int j=0; j<out.length(); j++)
			{
				char oCh = in.charAt(j);
				if(iCh == oCh)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				out = out + iCh;
			}
		}
		System.out.println("Non repeating string is "+out);
	}
}

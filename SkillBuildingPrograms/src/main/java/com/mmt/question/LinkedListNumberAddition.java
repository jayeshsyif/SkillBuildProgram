package com.mmt.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedListNumberAddition {
	private static List<BigNumber> NUMBERS = new ArrayList<>(); 
	public static void main(String[] args) {
		method2();
	}
	public static void method1(){
		int toContinue =0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("\nEnter number: \n");
			BigNumber number = new BigNumber();
			try
			{
				number.setNumber(sc.nextLong());
				number.setNext(null);
				if(NUMBERS.size() > 0)
				{
					NUMBERS.get(NUMBERS.size()-1).setNext(number);
				}
				NUMBERS.add(number);
			}catch(Exception e)
			{
				System.out.println("\nEnter valid number\n");
			}
			System.out.println("\nDo you want to continue? (yes = 0 / no = 1)\n");
			toContinue = sc.nextInt();
		}while(toContinue == 0);
		sc.close();
		print();
		System.out.println("total is "+add());
	}
	public static void method2(){
		int toContinue =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter numbers followed by enter: (Enter alphabet to exit) \n");
		do{
			BigNumber number = new BigNumber();
			try
			{
				long num=sc.nextLong();
				number.setNumber(num);
				number.setNext(null);
				if(NUMBERS.size() > 0)
				{
					NUMBERS.get(NUMBERS.size()-1).setNext(number);
				}
				NUMBERS.add(number);
			}catch(Exception e)
			{
				toContinue=1;
			}
		}while(toContinue == 0);
		sc.close();
		print();
		System.out.println("total is "+add());
	}
	private static void print()
	{
		int count = 1;
		BigNumber number = NUMBERS.get(0);
		do{
			System.out.println(" "+count+" "+number.getNumber());
			count++;
			number = number.getNext();
		}while(number != null);
	}
	private static long add()
	{
		long carry = 0L;
		int num10=1;
		int mul10=1;
		long totalOfDigit=0;
		long total=0l;
		long maxIterate = 0;
		boolean isMaxFound = false;
		do{
			BigNumber number = NUMBERS.get(0);
			do{
				long num = number.getNumber()/num10;
				long digit = num%10;
				//System.out.println(digit);
				totalOfDigit = totalOfDigit + digit;
				number = number.getNext();
				if(isMaxFound == false && (maxIterate == 0 || maxIterate < new String(""+num).length()-1))
				{
					maxIterate = new String(""+num).length()-1;
				}

			}while(number != null );
			if(carry > 0)
			{
				total = total + carry;
			}
			if(mul10 >0)
			{
				total = total+( totalOfDigit * mul10);
			}else
			{
				total = totalOfDigit;	
			}
			
			if(number == null)
			{
				num10 = num10 * 10;
				mul10 = mul10 * 10;
			}
			carry = totalOfDigit / 10;
			//System.out.println(total +" carry "+carry+" max "+maxIterate+" totalOfDigit "+totalOfDigit);
			totalOfDigit = 0;
			carry = 0;
			maxIterate = maxIterate -1;
			isMaxFound = true;
		}while( maxIterate >= 0);
		if(carry > 0)
		{
			total = total + carry;
		}
		return total;
	}

}
class BigNumber
{
	private Long number;
	private BigNumber next;
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public BigNumber getNext() {
		return next;
	}
	public void setNext(BigNumber next) {
		this.next = next;
	}

}

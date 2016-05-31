package com.mmt.question;

import java.util.Scanner;

public class SprialMatrix {

	private static int[][] MATRIX;
	private static int MAX=0,COUNT=1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max number ");
		MAX= sc.nextInt();
		MATRIX = new int[MAX][MAX];
		sc.close();
		init();
		initSprial();
		print();
		System.out.println("MAX NUMBER "+COUNT);
	}
	private static void init()
	{
		for(int i=0; i< MAX;i++)
		{
			for(int j=0; j< MAX;j++)
			{
				MATRIX[i][j]=0;
			}
		}
	}
	private static void print()
	{
		for(int i=0; i< MAX;i++)
		{
			for(int j=0; j< MAX;j++)
			{
				System.out.print(MATRIX[i][j]+" \t ");
			}
			System.out.println();
		}
	}
	private static void initSprial()
	{
		int localMax = (MAX/2);
		for(int i=0; i< localMax;i++)
		{
			initOneCircle(i,MAX-(i+1));
		}
		if(MATRIX[localMax][localMax] == 0)
		{
			MATRIX[localMax][localMax] = COUNT;
		}
	}
	private static void initOneCircle(int x,int max)
	{
		//top
		for(int i=x; i<max;i++)
		{
			MATRIX[x][i] = COUNT;
			COUNT++;
		}
		//right
		for(int i=x; i<max;i++)
		{
			MATRIX[i][max] = COUNT;
			COUNT++;
		}
		//bottom
		for(int i=max; i>x;i--)
		{
			MATRIX[max][i] = COUNT;
			COUNT++;
		}
		//left
		for(int i=max; i>x ;i--)
		{
			MATRIX[i][x] = COUNT;
			COUNT++;
		}
	}
}

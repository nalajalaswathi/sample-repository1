package p2;

import java.util.Scanner;

public class primenumbersex1 {

	public static void main(String[] args) {
		int num;
		int counter=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		num = sc.nextInt();
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				counter = counter+1;
			}
			
		}
		if(counter==1)
		{
			System.out.println("num is prime number");
		}
		else {
			System.out.println("not prime number");
		}
	}

}

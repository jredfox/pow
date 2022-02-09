package jredfox.pow;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		if(args.length == 0)
		{
			args = new String[2];
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.print("enter base:");
			args[0] = scanner.nextLine();
			System.out.print("enter exponent:");
			args[1] = scanner.nextLine();
		}
		System.out.println(args[0] + "^" + args[1] + "=" + pow(args[0], Integer.parseInt(args[1])));
	}
	
	public static BigInteger pow(long base, int exp)
	{
		return pow("" + base, exp);
	}

	public static BigInteger pow(String base, int exp)
	{
		Long.parseLong(base);
		return new BigInteger("" + base).pow(exp);
	}
}

import java.util.Scanner;

public class James {
	public static void main(String args[]) 
	{
		Scanner var = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num:");
		fnum = var.nextDouble();
		System.out.println("Enter second num:");
		snum = var.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}

}

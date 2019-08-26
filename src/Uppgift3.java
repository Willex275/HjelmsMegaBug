import java.util.Scanner;

public class Uppgift3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double radie = input.nextDouble();
		
		double volym = radie * radie * 3.14;
		
		System.out.println(volym);
	}

}

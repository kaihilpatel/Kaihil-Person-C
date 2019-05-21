import java.util.Scanner;

public class PersonC {

	public static void main(String[] args)
	{
	    Scanner scanner = new Scanner(System.in)
	    System.out.print("Type your first number");
		int x = scanner.nextInt();
		System.out.print("Type your second number");
		int y = scanner.nextInt();
		System.out.print("here is the random number:" +  (int) Math.random()*x + y);

	}

}
//fixed your garbage

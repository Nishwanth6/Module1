import java.util.Scanner;
public class AgeGuess {
	public static void main(String args[]) {
		
	Scanner obj = new Scanner(System.in);
	String name;
	System.out.print("Enter name ");
	name= obj.nextLine();
	Scanner age = new Scanner(System.in);
	int ageGuess;
	System.out.print("Enter the age ");
	ageGuess=age.nextInt();
	System.out.print("The name is " + name + " and the age is " + ageGuess);
	}
}

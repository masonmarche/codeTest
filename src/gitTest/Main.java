package gitTest;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		System.out.print("What is your name?");
		Scanner scan = new Scanner(System.in); //added initialization of Scanner
		String name = scan.nextLine() //added variable to stroe name
		System.out.println(name); //added print to display name
		scan.close(); //closed scanner
	}
}

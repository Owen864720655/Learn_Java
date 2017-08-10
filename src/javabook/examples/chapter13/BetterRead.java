package javabook.examples.chapter13;

import java.util.Scanner;


public class BetterRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(SimpleRead.input);
		System.out.println("What is your name?");
		String name = stdin.nextLine();
		System.out.println(name);
		System.out.println(
			"How old are you? What is your favorite double?");
		System.out.println("(input: <age> <double>);");
		int age = stdin.nextInt();
		double favorite = stdin.nextDouble();
		System.out.println(age);
		System.out.println(favorite);
	}

}

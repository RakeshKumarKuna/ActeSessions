package com.acte.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class AtmPin {
	final String pin = "7898";

	public static void main(String[] args) {
		// Exception will terminate our application abnormally try catch finally
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter first number");
			try {
				int a = sc.nextInt();
				System.out.println("Enter second number");
				int b = sc.nextInt();
				System.out.println("Result is " + (a / b)); // athimetic exception
			}
			catch (InputMismatchException exp) {
				System.out.println("Enter Numbers only ");
			} catch (ArithmeticException in) {
				System.out.println("check your input");
			}catch (Exception ex) {
				System.out.println("internal problem");
			} 
			finally {

				System.out.println("finallhy executed");
			}
			System.out.println("do not forget to close the connection");
			System.out.println("-----------");
			System.out.println("Do you want to continue ? Y/N");
			String ch = sc.next();
			if (ch.charAt(0) == 'N') {
				break;
			}
		}
		System.out.println("application exited");

	}

}

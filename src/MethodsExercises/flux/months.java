package MethodsExercises.flux;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class months {

	public static void main(String[] args) {
		List<String> month = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número do mês: ");
		int num = scan.nextInt();
		
		if (num > 12 || num < 1) {
			System.out.println("Invalid value");
			
		} else {
			String name = month.get(num - 1);
			System.out.println(name);
		}
	}
}

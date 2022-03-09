package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> curseA = new HashSet<>();
		Set<Integer> curseB = new HashSet<>();
		Set<Integer> curseC = new HashSet<>();

		System.out.print("How many students for course A? ");
		int qtdAluno = sc.nextInt();
		for (int i = 0; i <qtdAluno; i++) {
			int number = sc.nextInt();
			curseA.add(number);
		}
		System.out.print("How many students for course B? ");
		qtdAluno = sc.nextInt();
		for (int i = 0; i <qtdAluno; i++) {
			int number = sc.nextInt();
			curseB.add(number);
		}
		System.out.print("How many students for course C? ");
		qtdAluno = sc.nextInt();
		for (int i = 0; i <qtdAluno; i++) {
			int number = sc.nextInt();
			curseC.add(number);
		}
		Set<Integer> total = new HashSet<>(curseA);
		total.addAll(curseB);
		total.addAll(curseC);
		
		System.out.println("Total Students: " + total.size());

		sc.close();
	}

}



import java.io.*;
import java.util.*;
import java.lang.*;

public class Grades {

	private final int LOWEST_GRADE = 0;
	private final int HIGHEST_GRADE = 100;

	// student's grades
	private int[] grades;

	private Scanner in;

	
	public static void main(String[] args) {
		Grades grades = new Grades();
		grades.in = new Scanner(System.in);

		System.out.println("Enter the number of students: ");
		int numStudents = grades.in.nextInt();
		grades.run(numStudents);
	}

	
	private void run(int noStudents) {
		if (noStudents <= 0) {
			System.out.println("Try again invalid grade");
			return;
		}
		grades = new int[noStudents];

		double sum = 0;
		int i = 0;
		while (i < noStudents) {
			System.out.printf("Enter the grade for student %1$d: ", (i + 1));
			int grade = in.nextInt();

			// check if grade is between 0 and 100
			if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE)) {
				grades[i] = grade;
				sum += grade;
				i++;
				continue;
			}
			System.out.println("Invalid grade, try again...");
		}
		System.out.printf("The average is %1$.2f\n", (sum / noStudents));
	}

}
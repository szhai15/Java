package week_3;

import java.util.Scanner;

public class GradesStatistics {
	public static int[] grades;
	static int gradeMax = 100;
	static int gradeMin = 0;

	public static void main(String[] args) {
		readGrades();
		System.out.println("The average is " + average());
//		System.out.println("The median is " + median();
		System.out.println("The minimum is " + min());
		System.out.println("The maximum is " + max());
		System.out.println("The standard deviation is " + stdDev());
	}
	
	public static void readGrades()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int students = in.nextInt();
		
		grades = new int[students];
		
		int i = 0;
		while (i < students)
		{
			System.out.printf("Enter the grade for student " + (i+1) + ":");
			int grade = in.nextInt();
			if (gradeMin <= grade && grade <= gradeMax)
			{
				grades[i] = grade;
				i++;
			}
			else
			{
				System.out.println("Grade must be an integer in range[0, 100].");
			}
		}
	}

	
	public static double average()
	{
		double sum = 0.0;
		for (int i = 0; i < grades.length; i++)
		{
			sum += grades[i];
		}
		return (sum / grades.length);
	}
	
	public static int max()
	{
		int max = grades[0];
		for (int i = 0; i < grades.length; i++)
		{
			if (grades[i] > max)
			{
				max = grades[i];
			}
		}
		return max;
	}
	
	public static int min()
	{
		int min = grades[0];
		for (int i = 0; i < grades.length; i++)
		{
			if (grades[i] < min)
			{
				min = grades[i];
			}
		}
		return min;
	}
	
	public static double stdDev()
	{
		double sum = 0;
		double avg = average();
		for (int i = 0; i < grades.length; i++)
		{
			sum += (grades[i] - avg) * (grades[i] - avg);
		}
		return Math.sqrt(sum / grades.length);
	
	}
		
}

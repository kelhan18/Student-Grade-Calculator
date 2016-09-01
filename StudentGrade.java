//Keller Han
//Write a program that calculates a student's numeric grade and letter grade for a course. The user will input scores for two quizzes 
//that together count for 25% of the grade, a midterm that is 25%, and a final that is 50%. The quizzes are out of 10
//while the exams are out of 100. The results of every assignment and course grade will be returned.

import java.util.Scanner;

public class StudentGrade{
	
	// Initialize variables
	public String name;
	public double quiz1;
	public double quiz2;
	public int midTermExam;
	public int finalExam;
	public char letterGrade;
	public double numericGrade;
	
	/*-------------------------------------------------------------
	|  Method: [setName(String name)]
	|
	|  Purpose:  [This method, if called, allows the user to manually set the student's name by entering it as a string]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The input name will become the new name of the students]
	|
	|  Parameters:
	|      name - The new student of the name that we want
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/

	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/*-------------------------------------------------------------
	|  Method: [setQuiz1(double quiz1)]
	|
	|  Purpose:  [This method, if called, allows the user to manually set the quiz1 score]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The input quiz1 score will become the new score for quiz1]
	|
	|  Parameters:
	|      quiz1 = the new score for quiz1 that we want
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void setQuiz1(double quiz1)
	{
		this.quiz1 = quiz1;
	}
	
	/*-------------------------------------------------------------
	|  Method: [setQuiz2(doublequiz2)]
	|
	|  Purpose:  [This method, if called, allows the user to manually set the quiz2 score]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The input quiz2 score will become the new score for quiz2]
	|
	|  Parameters:
	|      quiz2 = the new score for quiz2 that we want
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void setQuiz2(double quiz2)
	{
		this.quiz2 = quiz2;
	}
	
	/*-------------------------------------------------------------
	|  Method: [setMidTermExam(int midTermExam)]
	|
	|  Purpose:  [This method, if called, allows the user to manually set the midTermExam score]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The input midTermExam score will become the new score for midTermExam]
	|
	|  Parameters:
	|      midTermExam = the new score for midTermExam that we want
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void setMidTermExam(int midTermExam)
	{
		this.midTermExam = midTermExam;
	}
	
	/*-------------------------------------------------------------
	|  Method: [setFinalExam(int finalExam)]
	|
	|  Purpose:  [This method, if called, allows the user to manually set the finalExam score]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The input finalExam score will become the new score for finalExam]
	|
	|  Parameters:
	|      finalExam = the new score for finalExam that we want
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void setFinalExam(int finalExam)
	{
		this.finalExam = finalExam;
	}
	
	/*-------------------------------------------------------------
	|  Method: [getName()]
	|
	|  Purpose:  [To retrieve the student's name and return it]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The name of the student will be returned]
	|
	|  Parameters:
	|      name - the name of the student
	|
	|  Returns:  [The name of the student]
	*------------------------------------------------------------------*/
	
	public String getName()
	{
		return name;
	}
	
	/*-------------------------------------------------------------
	|  Method: [getQuiz1()]
	|
	|  Purpose:  [To retrieve the quiz1 score and return it]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The quiz1 score of the student will be returned]
	|
	|  Parameters:
	|      quiz1 - the quiz1 score of the student
	|
	|  Returns:  [The quiz1 score of the student]
	*------------------------------------------------------------------*/
	
	public double getQuiz1()
	{
		return quiz1;
	}
	
	/*-------------------------------------------------------------
	|  Method: [getQuiz2()]
	|
	|  Purpose:  [To retrieve the quiz2 score and return it]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The quiz2 score of the student will be returned]
	|
	|  Parameters:
	|      quiz2 - the quiz2 score of the student
	|
	|  Returns:  [The quiz2 score of the student]
	*------------------------------------------------------------------*/
	
	public double getQuiz2()
	{
		return quiz2;
	}
	
	/*-------------------------------------------------------------
	|  Method: [getMidTermExam()]
	|
	|  Purpose:  [To retrieve the midTermExam score and return it]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The midTermExam score of the student will be returned]
	|
	|  Parameters:
	|      midTermExam - the midTermExamscore of the student
	|
	|  Returns:  [The midTermExam score of the student]
	*------------------------------------------------------------------*/
	
	public double getMidTermExam()
	{
		return midTermExam;
	}
	
	/*-------------------------------------------------------------
	|  Method: [getFinalExam()]
	|
	|  Purpose:  [To retrieve the finalExam score and return it]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The finalExam score of the student will be returned]
	|
	|  Parameters:
	|      finalExam - the finalExam score of the student
	|
	|  Returns:  [The finalExam score of the student]
	*------------------------------------------------------------------*/
	
	public double getFinalExam()
	{
		return finalExam;
	}
	
	/*-------------------------------------------------------------
	|  Method: [getNumericGrade()]
	|
	|  Purpose:  [To retrieve the numericGrade score of the student's course and return it]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The numericGrade score of the student will be returned]
	|
	|  Parameters:
	|      numericGrade - the numericGrade score of the student
	|
	|  Returns:  [The numericGrade score of the student]
	*------------------------------------------------------------------*/
	
	public double getNumericGrade()
	{
		return numericGrade;
	}
	
	/*-------------------------------------------------------------
	|  Method: [getLetterGrade()]
	|
	|  Purpose:  [To retrieve the letterGrade score of the student's course and return it]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The letterGrade score of the student will be returned]
	|
	|  Parameters:
	|      letterGrade - the letterGrade score of the student
	|
	|  Returns:  [The letterGrade score of the student]
	*------------------------------------------------------------------*/
	
	public char getLetterGrade()
	{
		return letterGrade;
	}
	
	/*-------------------------------------------------------------
	|  Method: [determineScores]
	|
	|  Purpose:  [To ask the user to input name and scores for both quizzes, midterm, and final
				so that the program will be able to use those values in order to determine
				the final numeric and letter grade]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The program will have the scores for every assignment in the course
						and can proceed to calculating grades]
	|
	|  Parameters:
	|      name - allow user to store his name 
		   quiz1 - the double score of quiz 1
		   quiz2 - the double score of quiz 2
		   midTermExam - the int score of midterm exam
		   finalExam - the int score of final exam
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void determineScores()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the students name?: ");
		name = input.nextLine();
		System.out.println("When entering scores, please enter positive numbers ");
		System.out.println("What is their quiz 1 score out of 10?: ");
		quiz1 = input.nextInt();
		while (quiz1 < 0 || quiz1 > 10)
		{
			System.out.println("Error. Quiz 1 score not in range. Please enter a valid score: ");
			quiz1 = input.nextInt();
		}
		System.out.println("What is their quiz 2 score out of 10?: ");
		quiz2 = input.nextInt();
		while (quiz2 < 0 || quiz2 > 10)
		{
			System.out.println("Error. Quiz 2 score not in range. Please enter a valid score: ");
			quiz2 = input.nextInt();
		}
		System.out.println("What is their midterm exam score out of 100?: ");
		midTermExam = input.nextInt();
		while (midTermExam < 0 || midTermExam > 100)
		{
			System.out.println("Error. Mid-Term score not in range. Please enter a valid score: ");
			midTermExam = input.nextInt();
		}
		System.out.println("What is their final exam score out of 100?: ");
		finalExam = input.nextInt();
		while (finalExam < 0 || finalExam > 100)
		{
			System.out.println("Error. Final Exam score not in range. Please enter a valid score: ");
			finalExam = input.nextInt();
		}
		input.close();
	}
	
	/*-------------------------------------------------------------
	|  Method: [calculateGrades]
	|
	|  Purpose:  [To apply the weights to the quizzes, midterm, and final scores and then use the weighted
				values to calculate the numeric and letter grade of the class]
	|
	|  Pre-condition:  [The user must have already input their scores for each assignment]
	|
	|  Post-condition: [The program will have determined the student's numeric and letter grade for the course]
	|
	|  Parameters:
	|      quizValue - the weighted value of both quiz 1 and quiz 2 together (25%)
		   midTermValue - the weighted value of the midterm score (25%)
		   finalExamValue - the weighted value of the final exam score (50%)
		   numericGrade- the student's numeric grade in the course determined by adding the weighted value of all assignments
		   letterGrade - the student's letter grade in the course determined by their numeric grade
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void calculateGrade()
	{
		double quizValue = ((quiz1 + quiz2) / 20) * 25;
		int midTermValue = (int) (midTermExam * 0.25);
		int finalExamValue = (int) (finalExam * 0.50);
	    numericGrade = quizValue + midTermValue + finalExamValue;
		if (numericGrade >= 90)
		{
			letterGrade = 'A';
		}
		else if (numericGrade >= 80)
		{
			letterGrade = 'B';
		}
		else if (numericGrade >= 70)
		{
			letterGrade = 'C';
		}
		else if (numericGrade >= 60)
		{
			letterGrade = 'D';
		}
		else
		{
			letterGrade = 'F';
		}
	}
	
	/*-------------------------------------------------------------
	|  Method: [displayResults]
	|
	|  Purpose:  [To display the results of all the scores, including the final numeric and letter grade, and grades back to the user
				so that they can see how they performed in the course]
	|
	|  Pre-condition:  [The user must have input their scores for each assignment and the program must have calculated
						the numeric and letter grade using those scores]
	|
	|  Post-condition: [The user will know how they performed in the course]
	|
	|  Parameters:
	|      N/A
	|
	|  Returns:  [name, quiz1 score, quiz2 score, midterm score, final score, course numeric grade, course letter grade]
	*------------------------------------------------------------------*/
	
	public void displayResults()
	{
		System.out.println("The student's name is: " + getName());
		System.out.println("The score for quiz 1 is: " + getQuiz1());
		System.out.println("The score for quiz 2 is: " + getQuiz2());
		System.out.println("The score for the midterm exam is: " + getMidTermExam());
		System.out.println("The score for the final exam is: " + getFinalExam());
		System.out.println("The student's total score for the entire course is: " + getNumericGrade() + "%");
		System.out.println("The student's final letter grade is: " + getLetterGrade());
	}
}
	
	
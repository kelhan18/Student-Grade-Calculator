//Keller Han
//Create a demo that will test the StudentGrade class and return name, the scores for 
//quiz1, quiz2, midterm, final, course numeric grade, and course letter grade.

public class StudentGradeDemo {
	
	public static void main(String[] args) {
		StudentGrade demo = new StudentGrade();
		demo.determineScores();
		demo.calculateGrade();
		demo.displayResults();
	}

}

package algorithms;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
	public static void main(String[] args) {
		List<Integer> grades = new ArrayList();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		System.out.println(gradingStudents(grades).toString());
	}
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
		for(int grade = 0; grade < grades.size(); grade++) {
			if(grades.get(grade) > 37) {
				if(5 - (grades.get(grade) % 5) < 3) {
					grades.set(grade, grades.get(grade) + 5 - (grades.get(grade) % 5));
				}
			}
		}
		return grades;
	}
}

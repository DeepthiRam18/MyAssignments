package week3Day1;

public class OverRidingSubClass {

	public void mathClassStudents(String name, int no) {
		// TODO Auto-generated method stub
		System.out.println("Exam name is : "+ name + "\n" + "Average class Mark:" +no);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverRidingSubClass mc= new OverRidingSubClass();
		mc.mathClassStudents("Monthly Test", 85);

			
	}

}

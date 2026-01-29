package Task1;
public class Student extends Person{
			private int rollNo;
			private String course;
			public int getRollNo() {
				return rollNo;
			}
			public void setRollNo(int rollNo) {
				this.rollNo = rollNo;
			}
			public String getCourse() {
				return course;
			}
			public void setCourse(String course) {
				this.course = course;
			}
			@Override
			public void displayInfo() {
				super.displayInfo();
				System.out.println("Roll No: " + rollNo);
				System.out.println("Course: " + course);
			}
		
}


package Task1;
public class MainApp {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Vinay");
        student.setAge(21);
        student.setRollNo(101);
        student.setCourse("Computer Science");

        student.displayInfo();
    }
}

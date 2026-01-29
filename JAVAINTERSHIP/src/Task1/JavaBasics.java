package Task1;

public class JavaBasics {

    public static void main(String[] args) {
    	int[] marks = {85, 90, 78, 92, 88};

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        int average = total / marks.length;

        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
}


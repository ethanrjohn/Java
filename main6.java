import java.util.Scanner;

class main6 {
    public static void main(String[] args) {
        int sum = 0;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int noOfSubjects = sc.nextInt();
        int marks[] = new int[noOfSubjects];
        System.out.println(
            "Enter marks of" + noOfSubjects + "Subjects.Press Enter to give marks for another subject"
        );
        for (int i = 0; i < noOfSubjects; i++) {
            marks[i] = sc.nextInt();

        }
        for (int j = 0; j < noOfSubjects; j++) {
            sum = sum + marks[j];
        }
        int percentage = sum / noOfSubjects;
        System.out.println(percentage);
        if (percentage >= 95) {
            result = "You scored O grade. Great work";
        }
        else if (percentage > 90 && percentage < 95) {
            result = "You scored A+. Well done";
        }
        else{
            result = "You passed";
        }
        System.out.println(result);
    }
}
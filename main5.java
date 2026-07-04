import java.util.Scanner;

class main5 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        int lucky = sc.nextInt();
        System.out.println("Hello " + name + " your Lucky number " + lucky + " Shows you are really hardworking. keep it up");
    }
}
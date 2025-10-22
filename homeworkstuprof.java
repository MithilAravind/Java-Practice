import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("What's your name? ");
    String name = input.nextLine();

    System.out.println("What grade are you in? ");
    int grade = input.nextInt();
    input.nextLine();

    System.out.println("What is your favorite subject? ");
    String subject = input.nextLine();

    System.out.println("Hello " + name + ". Your in " + grade + "th grade and your favorite subject is " + subject + ".");
    }
}
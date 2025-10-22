import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner name = new Scanner(System.in);
    System.out.println("What's your name? ");

    String personName = name.nextLine();
    System.out.println("Hello " + personName);
    }
}
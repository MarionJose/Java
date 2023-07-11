import java.util.Scanner;

public class Scanex{
    public static void main(String[] args){

       Scanner scanner= new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.println("\nUser Details:\n" + age);
        scanner.close();
    }
}


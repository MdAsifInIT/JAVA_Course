import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Input your age (in Years): ");
        int age = sc.nextInt();

        System.out.print("Input your weight (in Kg): ");
        float weight = sc.nextFloat();

        sc.nextLine(); // consume the leftover newline

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Your name is " + name + " Janana.");
        System.out.println("Your age is " + age + " Years.");
        System.out.println("Your weight is " + weight + " Kilograms.");

        System.out.println(sentence);

        if (weight > +69) {
            System.out.println("Congrats! You're a fatass.");

        }
        sc.close();

    }
}

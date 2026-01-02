import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Is Sun Up? :");
        boolean isSunUp = sc.nextBoolean();


        if (isSunUp == true) {
            System.out.println("day");

        }

        else {
            System.out.println("night");
        }

        sc.close();
    }

}

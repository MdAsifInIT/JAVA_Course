import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("mon");
                break;

            case 2:
                System.out.println("tue");
                break;

            case 3:
                System.out.println("wed");
                break;

            case 4:
                System.out.println("thu");
                break;

            case 5:
                System.out.println("fri");
                break;

            case 6:
                System.out.println("sat");
                break;

            case 7:
                System.out.println("sun");
                break;

            default:
                System.out.println("Please select 1 to 7");

        }
        sc.close();
    }
}
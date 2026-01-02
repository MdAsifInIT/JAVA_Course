import java.util.Arrays;

public class Arrays_Ops {

    public static void main(String[] args) {
        int marks[] = new int[3];

        marks[0] = 67;
        marks[1] = 96;
        marks[2] = 69;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println("");
        System.out.println("");

        //length
        // System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}

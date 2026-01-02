
public class String_concatenation {

    public static void main(String[] args) {
        String name1 = "Md";
        String name2 = " ";
        String name3 = "Asif";
        String name5 = name1 + name2 + name3;

        System.out.println(name5);

        String name6 = name5.replace('A', 'X');
        System.out.println(name6);

        String name7 = "Md Asif";
        System.out.println(name7.substring(3, 7));
    }
}

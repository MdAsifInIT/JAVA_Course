/*
Problem Statement:
Write a Java program to:
- Create a Student class with name, number, gender, aggregate
- Include get() method to read values
- Include put() method to display values
- Create 'n' student objects
- Display the male student who has secured the highest aggregate
*/

import java.util.Scanner;

class Student {
    String name;
    int number;
    char gender;
    float aggregate;

    // Method to get student details
    void get(Scanner sc) {
        name = sc.next();
        number = sc.nextInt();
        gender = sc.next().charAt(0);
        aggregate = sc.nextFloat();
    }

    // Method to display student details
    void put() {
        System.out.println("Name      : " + name);
        System.out.println("Number    : " + number);
        System.out.println("Gender    : " + gender);
        System.out.println("Aggregate : " + aggregate);
    }
}

public class StudentHighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].get(sc);
        }

        float max = -1;
        int index = -1;

        for (int i = 0; i < n; i++) {
            if ((s[i].gender == 'M' || s[i].gender == 'm') &&
                s[i].aggregate > max) {
                max = s[i].aggregate;
                index = i;
            }
        }

        if (index != -1) {
            System.out.println("Male student with highest aggregate:");
            s[index].put();
        } else {
            System.out.println("No male student found.");
        }

        sc.close();
    }
}

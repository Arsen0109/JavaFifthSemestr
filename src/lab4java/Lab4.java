package lab4java;

import java.util.Arrays;

public class Lab4 {
    public static void main(String[] args) {
        Student arsen = new Student("Arsen", "Neroda", 19, 3, 14);
        Student oksana = new Student("Oksana", "Petriv", 22, 4, 20);
        Student bodya = new Student("Bodya", "Malesyk", 20, 3, 10);
        Student stas = new Student("Stas", "Yanchuk", 17, 1, 29);
        Student[] students = {arsen, oksana, bodya, stas};
        Arrays.sort(students, new byAge());
        System.out.println("Sorting by age:");
        for (Student student : students){
            System.out.printf("%s %s %d %d %d%n", student.name, student.surname, student.age, student.yearOfStudying, student.numberInGroupList);
        }
        System.out.println();

        Arrays.sort(students, new byNumberInGroup());
        System.out.println("Sorting by student number in group in reverse order:");
        for (Student student : students){
            System.out.printf("%s %s %d %d %d%n", student.name, student.surname, student.age, student.yearOfStudying, student.numberInGroupList);
        }
        System.out.println();
    }
}

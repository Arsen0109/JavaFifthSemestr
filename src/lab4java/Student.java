package lab4java;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int yearOfStudying;
    private int numberInGroupList;
    public Student(String name, String surname, int age, int yearOfStudying, int numberInGroupList){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.yearOfStudying = yearOfStudying;
        this.numberInGroupList = numberInGroupList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfStudying() {
        return yearOfStudying;
    }

    public void setYearOfStudying(int yearOfStudying) {
        this.yearOfStudying = yearOfStudying;
    }

    public int getNumberInGroupList() {
        return numberInGroupList;
    }

    public void setNumberInGroupList(int numberInGroupList) {
        this.numberInGroupList = numberInGroupList;
    }
}

package sef.FinalActivity.FirstActivity;

public class Student extends Person {

    private String schoolName;


    public Student() {
        this.schoolName = "Hogwarts";
    }

    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }


    public void setSchoolName (String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName ;
    }

    public void announce(){
        System.out.println("My name is " + name + " and I'm " + age + " years old. " +
                        "I'm studying in " + schoolName + " university.");

    }




}

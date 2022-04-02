package sef.FinalActivity.Extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {

    public String name;
    int age;
    private String jobTitle;
    private String company;
    private double salary;


    public Employee(String name, int age, String jobTitle,String company,double salary) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public String toString(){
        return name + " " + ", age " + age + ". " + jobTitle + " in " + company +". Salary: "+ salary;
    }

    public static void announce(List list){
        for  (Object obj: list){
            System.out.println(obj.toString());
        }
    }


    public static void main (String[] args) {

        List<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Algis Zvirblis", 40,"manager","Volvo",1500));
        list.add(new Employee("Radvila Juodasis",67,"speaker","LDK",37561));
        list.add(new Employee("Birute Augustaite",35,"director","It beauty",42156));
        list.add(new Employee("Petras Pirmasis",235,"annoyer","Petro palace",7070707));
        list.add(new Employee("Jonas Kirvis",20,"practicant","Kempinski",200));


        System.out.println("--- Employees list ----------");
        announce(list);


        System.out.println("\n--- Employees list, sorted by name ----------");
        Collections.sort(list,(list1,list2) -> (list1.getName().compareTo(list2.getName())));
        announce(list);



        Collections.sort(list,(list1,list2) -> (list1.getName().split(" ")[1].compareTo(list2.getName().split(" ")[1])));
        System.out.println("\n--- Employees list, sorted by surname----------");
        announce(list);


    }


}






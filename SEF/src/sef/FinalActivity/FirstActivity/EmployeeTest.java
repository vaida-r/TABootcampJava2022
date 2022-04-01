package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

import java.util.*;


public class EmployeeTest extends TestCase  {


    public void testPrintSalary(){

        List<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Algis",40,"manager","Volvo",1500));
        list.add(new Employee("Radvila",67,"speaker","LDK",37561));
        list.add(new Employee("Birute",35,"director","It beauty",42156));
        list.add(new Employee("Petras Pirmasis",235,"annoyer","Petro palace",7070707));
        list.add(new Employee("Jonas",20,"practicant","Kempinski",200));


        System.out.println("--- Employees list ----------");
        for  (Object obj: list){
            System.out.println(obj.toString());
        }


        Collections.sort(list,(list1,list2) -> Double.compare(list2.getSalary(), list1.getSalary()));

        System.out.println("\n--- Employees list, sorted by salary descending ----------");
        for  (Object obj: list){
            System.out.println(obj.toString());
        }

    }

}

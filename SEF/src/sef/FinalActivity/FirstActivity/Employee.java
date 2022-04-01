package sef.FinalActivity.FirstActivity;

public class Employee extends Person {

    private String jobTitle;
    private String company;
    private double salary;


    public Employee() {

    }


    public Employee(String name, int age, String jobTitle,String company,double salary) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }


    public void setJobTitle (String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle ;
    }

    public void setCompany( String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setSalary( double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    public void announce(){
        System.out.println("My name is " + name + " and I'm " + age + " years old. " +
                        "I'm working as " + jobTitle + " in " + company +". Salary: "+ salary);

    }


    public String toString(){
        return name + ", age " + age + ". " + jobTitle + " in " + company +". Salary: "+ salary;
    }


}

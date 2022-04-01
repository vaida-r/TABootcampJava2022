package sef.FinalActivity.FirstActivity;

public class Person {

    public String name;
    public int age;


    public Person(){
//        this.name = "Vaida";
//        this.age = 46;
    }

    public Person(String name, int age) throws CustomException {

        if (name.matches(".*[0-9].*") ) {
            throw new CustomException() ;
        } else {
            this.name = name;
        }
        this.age = age ;

    }


    public String getName() {
        return name;
    }


    public void setName(String name) throws CustomException {
        if (name.matches(".*[0-9].*") ) {
            throw new CustomException() ;
        } else {
            this.name = name;
        }
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void announce(){
        System.out.println("My name is " + name + " and I'm " + age + " years old.");
    }

    public static void main(String[] args) throws CustomException {
        Person pr = new Person("V2",20);
        pr.announce() ;

    }

}

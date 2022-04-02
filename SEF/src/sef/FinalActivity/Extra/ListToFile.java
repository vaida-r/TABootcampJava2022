package sef.FinalActivity.Extra;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class ListToFile {


        public static void main(String[] args) throws IOException {

            List<Employee> list = new ArrayList<Employee>();

            list.add(new Employee("Algis Zvirblis", 40,"manager","Volvo",1500));
            list.add(new Employee("Radvila Juodasis",67,"speaker","LDK",37561));
            list.add(new Employee("Birute Augustaite",35,"director","It beauty",42156));
            list.add(new Employee("Petras Pirmasis",235,"annoyer","Petro palace",7070707));
            list.add(new Employee("Jonas Kirvis",20,"practicant","Kempinski",200));


            // it creates demo_employees.txt file in root directory. It's safe to delete
            Path fileName = Path.of(System.getProperty("user.dir")+ "\\demo_employees.txt");
            for  (Object obj: list){
                Files.writeString(fileName, obj.toString() + System.lineSeparator(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            }

        }


}

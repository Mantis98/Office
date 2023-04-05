package pl.office;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Boss boss = new Boss("Michael", "Scott", 6000);

        Employee employee1 = new Employee("Tom", "Wambsgans", 4800, 500);
        Employee employee2 = new Employee("Mr", "Bean", 4200, 210);

        Boss[] leader = new Boss[1];
        leader[0] = boss;

        Employee[] worker = new Employee[2];
        worker[0] = employee1;
        worker[1] = employee2;


        for (Employee b : worker) {
            System.out.println(b);
        }


        File file = new File("C:\\Users\\mateu\\OneDrive\\Desktop\\office.txt");
        PrintWriter save = new PrintWriter(file);
        save.println(leader[0]);
        save.println(worker[0]);
        save.println(worker[1]);
        save.close();


    }

}

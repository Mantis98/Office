package pl.office;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SavingToFile {

    public void saving() throws FileNotFoundException {

        File file = new File("C:\\Users\\mateu\\OneDrive\\Desktop\\office.txt");
        PrintWriter save = new PrintWriter(file);
//        save.println(boss.getFirstName() + " " + boss.getLastName() + " " + boss.getSalary());
//        save.println(employee1.getFirstName() + " " + employee1.getLastName() + " " + employee1.getSalary() + " " + employee1.getBonus());
        save.close();
    }

}

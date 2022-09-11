package pl.office;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Boss boss = new Boss("Michael", "Scott", 6000);

        Worker employee1 = new Worker("Dwight", "Shrutte", 4800, 500);
        Worker employee2 = new Worker("Pam", "Beasley", 4200, 210);

        System.out.println(boss);
        System.out.println(employee1);
        System.out.println(employee2);


        File file = new File("C:\\Users\\mateu\\OneDrive\\Desktop\\office.txt");
        PrintWriter save = new PrintWriter(file);
        save.println(boss);
        save.println(employee1);
        save.println(employee2);
        save.close();


//        SavingToFile saving = new SavingToFile();
//        saving.saving();


    }

}

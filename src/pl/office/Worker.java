package pl.office;

import java.util.Scanner;

public class Worker extends Boss {
    int bonus;

    public Worker(String firstName, String lastName, int salary, int bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public String toString(){
        return firstName + " " + lastName + " " + salary + " " + bonus;
    }

    public int getBonus() {
        return bonus;
    }


}

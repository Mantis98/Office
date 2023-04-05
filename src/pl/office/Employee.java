package pl.office;

import java.util.Scanner;

public class Employee extends Boss {
    int bonus;

    public Employee(String firstName, String lastName, int salary, int bonus) {
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

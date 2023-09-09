package ru.gb.StudentsApp.Controllers;

import ru.gb.StudentsApp.Domen.Person;

import java.util.List;

public class AccountController {
    public <T extends Person> void PaySalary(T person, int salary){
        System.out.printf("%s get salary on the amount of %d USD", person.getName(), salary);
    }

    public static <T extends Person> int GetAverageAge(List<T> persons){
        int ageSum = 0;
        for (T person : persons) {
            ageSum += person.getAge();
        }
        return ageSum / persons.size();
    }
}

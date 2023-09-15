package ru.gb.MVCStudentApp.View;

import ru.gb.MVCStudentApp.Controller.Command;
import ru.gb.MVCStudentApp.Controller.Interface.IGetView;
import ru.gb.MVCStudentApp.Model.Core.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Class to deliver user with interaction through console which implements IGetView interface
 * This ConsoleIO is Russian language based
 */
public class ConsoleIORus implements IGetView {

    @Override
    public void PrintAll(List<Student> students) {
        for (Student student : students) {
            System.out.printf("Студент: [%s, возраст: %d, номер: %d]%n", student.getName(), student.getAge(), student.getStudentId());
        }
    }

    @Override
    public String GetUserSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш выбор: ");
        return scanner.nextLine();
    }

    @Override
    public Integer GetStudentIdFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ID студента: ");
        return Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void PrintDeleteResult(boolean deleteResult) {
        String deleteStatus = deleteResult ? "Студен успешно удален" : "студент с указанным ID не найден";
        System.out.println(deleteStatus);
    }

    public void PrintCommands(){
        System.out.println("Доступные команды:");
        System.out.println(Arrays.toString(Command.values()));
    }
}

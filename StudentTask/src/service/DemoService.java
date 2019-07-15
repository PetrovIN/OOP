package service;

import entity.Group;
import entity.Student;
import entity.StudentProgress;
import entity.Items;
import service.MarksCalculationService;

public class DemoService {
    MarksCalculationService marksCalculator = new MarksCalculationService();
    Group group = new Group(2);
    Student student1 = new Student(1,"Антон",
            new StudentProgress(
                    new Items[]{new Items("Обществознание", new int []{2, 5, 5}),
                                new Items("Программирование", new int []{5, 5, 5})}));

    Student student2 = new Student(2,"Илья",
            new StudentProgress(
                    new Items[]{new Items("Обществознание", new int []{5, 5, 5}),
                                new Items("Программирование", new int []{5, 5, 5})}));

    Group group1 = new Group(new Student[]{student1, student2});

    public void start() {
        System.out.println("Calculate student average mark by item");
        System.out.println(marksCalculator.AverageMarkGroupByItem(group1, "Обществознание"));
        System.out.println();

        System.out.println("Calculate student average mark by all items");
        System.out.println(marksCalculator.AverageMarkStudent(group1, 1));
        System.out.println();

        System.out.println("Calculate amount of honours students");
        System.out.println(marksCalculator.AmountHonoursStudents(group1));
        System.out.println();

        System.out.println("Calculate amount of bad students");
        System.out.println(marksCalculator.AmountBadStudentsByItem(group1));
        System.out.println();
    }
}

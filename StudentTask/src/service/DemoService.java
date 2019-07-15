package service;

import entity.Group;
import entity.Student;
import entity.StudentProgress;
import entity.Items;
import service.MarksCalculationService;

public class DemoService {
    Group group = new Group(2);
    Student student1 = new Student(1,"Антон",
            new StudentProgress(
                    new Items[]{new Items("Обществознание", new int []{2, 3, 4}),
                                new Items("Программирование", new int []{3, 3, 2})}));

    Student student2 = new Student(2,"Илья",
            new StudentProgress(
                    new Items[]{new Items("Обществознание", new int []{5, 5, 5}),
                                new Items("Программирование", new int []{5, 5, 5})}));
    Group group1 = new Group(new Student[]{student1, student2});
    public void start() {
        MarksCalculationService marksCalculator = new MarksCalculationService();

        //System.out.println(marksCalculator.AverageMarkGroup(group1));
        //System.out.println(marksCalculator.AverageMarkStudent(group1, 1));
        System.out.println(marksCalculator.AmountHonoursStudents(group1));
    }
}

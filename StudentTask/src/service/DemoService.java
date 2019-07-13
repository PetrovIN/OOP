package service;

import entity.Group;
import entity.Student;

public class DemoService {
    Student student = new Student(1,5,"Илья");
    Student student1 = new Student(2,3,"Илья");
    Student student2 = new Student(3,2,"Илья");
    Student student3 = new Student(4,4,"Илья");
    Group group = new Group(1);
    public void start() {
        MarksCalculationService marksCalculationService = new MarksCalculationService();
        marksCalculationService.AverageMarkGroup()
        System.out.println();
    }
}

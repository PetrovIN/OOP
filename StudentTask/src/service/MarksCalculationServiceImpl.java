package service;

import entity.Group;
import entity.Student;

public interface MarksCalculationServiceImpl {
    double AverageMarkGroup(Group group, String name);
    double AverageMarkStudent(Group group, int num);
    int AmountHonoursStudents(Group group);
    int AmountBadStudents(Group group, String name);
}

package service;

import entity.Group;
import entity.Student;

public interface MarksCalculationServiceImpl {
    int AverageMarkGroup(Group group, Student student);
    int AverageMarkStudent(Group group, int num);
    int AmountHonoursStudents(Group group, Student student);
    int AmountBadStudents(Group group, Student student);
}

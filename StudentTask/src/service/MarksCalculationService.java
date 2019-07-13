package service;

import entity.Group;
import entity.Student;

public class MarksCalculationService implements MarksCalculationServiceImpl {
    @Override
    public int AverageMarkGroup(Group group, Student student) {
        int studentMark;
        int amountStudentMark = 0;
        int amountStudents = 0;
        Student [] students = group.getStudents();
        for (int i = 0; i < students.length ; i++) {
            if (students[i] !== null) {
                studentMark = students[i].getMark();
                amountStudentMark = amountStudentMark + studentMark;
                amountStudents = amountStudents + 1;
            }
        }
        if (amountStudentMark !== 0) {
            return amountStudentMark / amountStudents;
        }
        return 0;
    }

    @Override
    public int AverageMarkStudent(Group group, int num) {
        return 0;
    }

    @Override
    public int AmountHonoursStudents(Group group, Student student) {
        return 0;
    }

    @Override
    public int AmountBadStudents(Group group, Student student) {
        return 0;
    }
}

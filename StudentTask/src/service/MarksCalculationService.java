package service;

import entity.Group;
import entity.Student;

public class MarksCalculationService implements MarksCalculationServiceImpl {
    @Override
    public double AverageMarkGroup(Group group, String name) {
        int [] studentMark;
        String studentItem;
        double averageMark;
        int amountStudentMark = 0;
        Student [] students = group.getStudents();
        for (int i = 0; i < students.length ; i++) {
            if (students[i] != null) {
                for (int j = 0; j < students[i].getStudentProgress().getItems().length; j++) {
                    studentItem = students[i].getStudentProgress().getItems()[j].getName();
                    if (studentItem.equals(name)) {
                        studentMark = students[i].getStudentProgress().getItems()[j].getMarks();
                        for (int k = 0; k < studentMark.length; k++) {
                            amountStudentMark += studentMark[k];
                        }
                    }

                }
            }
        }
        if (amountStudentMark != 0) {
            averageMark = amountStudentMark / students.length;
            return averageMark;
        }
        return 0;
    }

    @Override
    public double AverageMarkStudent(Group group, int num) {
        int [] studentMark;
        double averageMark;
        double count = 0;
        double amountStudentMark = 0;
        Student [] students = group.getStudents();
        for (int i = 0; i < students.length ; i++) {
            if (students[num] != null) {
                for (int j = 0; j < students[i].getStudentProgress().getItems().length; j++) {
                    studentMark = students[num].getStudentProgress().getItems()[j].getMarks();
                    for (int k = 0; k < studentMark.length; k++) {
                        amountStudentMark += studentMark[k];
                        count += 1;
                    }
                }
                break;
            }
        }
        if (amountStudentMark != 0) {
            averageMark = amountStudentMark / count;
            return averageMark;
        }
        return 0;
    }

    @Override
    public int AmountHonoursStudents(Group group) {
        int count = 0;
        Student[] students = group.getStudents();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].getStudentProgress().getItems()[i].getMarks());
                System.out.println(AverageMarkStudent(group, i));
                if (AverageMarkStudent(group, i) == 5.0) {
                    count += 1;
                }
            }
            return count;
        }
        return 0;
    }

    @Override
    public int AmountBadStudents(Group group, String name) {
        return 0;
    }
}

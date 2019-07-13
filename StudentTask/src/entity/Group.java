package entity;

import entity.Student;

public class Group {
    private Student [] students;

    public Group(int size) {
        students = new Student[size];
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

}

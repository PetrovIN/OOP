package entity;

public class Student {
    private int id;
    private String name;
    private StudentProgress studentProgress;

    public Student(int id, String name, StudentProgress studentProgress) {
        this.id = id;
        this.name = name;
        this.studentProgress = studentProgress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentProgress getStudentProgress() {
        return studentProgress;
    }

    public void setStudentProgress(StudentProgress studentProgress) {
        this.studentProgress = studentProgress;
    }
}

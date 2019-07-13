package entity;

public class Student {
    private int id;
    private int mark;
    private String name;

    public Student(int id, int mark, String name) {
        this.id = id;
        this.mark = mark;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

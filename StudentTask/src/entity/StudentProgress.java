package entity;

public class StudentProgress {
    private Items [] items;

    public StudentProgress(Items[] items) {
        this.items = items;
    }

    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }
}

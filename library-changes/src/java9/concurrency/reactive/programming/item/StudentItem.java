package java9.concurrency.reactive.programming.item;

public class StudentItem {
    private String name;
    private String rollNo;

    public StudentItem(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public StudentItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "StudentItem [name=" + name + ", rollNo=" + rollNo + "]";
    }

}

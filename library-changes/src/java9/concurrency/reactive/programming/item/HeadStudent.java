package java9.concurrency.reactive.programming.item;

public class HeadStudent extends StudentItem {

    private String headStudentSerial;

    public HeadStudent(String name, String rollNo, String headBoySerial) {
        super(name, rollNo);
        this.headStudentSerial = headBoySerial;
    }

    public HeadStudent() {
        super();
    }

    public HeadStudent(String name, String rollNo) {
        super(name, rollNo);
    }

    @Override
    public String toString() {
        return "HeadBoy [headStudentSerial=" + headStudentSerial + ", " + super.toString() + " ]";
    }
}

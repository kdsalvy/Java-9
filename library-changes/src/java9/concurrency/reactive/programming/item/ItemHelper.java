package java9.concurrency.reactive.programming.item;

import java.util.Arrays;
import java.util.List;

public class ItemHelper {

    public static List<StudentItem> getStudents() {
        return Arrays.asList(
            new StudentItem("Saurabh Kedia", "1234"),
            new StudentItem("Rahul Kapoor", "1345"),
            new StudentItem("Shrey Khanna", "1456"),
            new StudentItem("Anjali Batra", "1567"),
            new StudentItem("Dipti Ahuja", "1678"),
            new StudentItem("Aayan Basu", "1789")
            );
    }
}

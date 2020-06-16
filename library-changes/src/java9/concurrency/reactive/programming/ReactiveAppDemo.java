package java9.concurrency.reactive.programming;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

import java9.concurrency.reactive.programming.item.HeadStudent;
import java9.concurrency.reactive.programming.item.ItemHelper;
import java9.concurrency.reactive.programming.item.StudentItem;
import java9.concurrency.reactive.programming.processor.StudentProcessor;
import java9.concurrency.reactive.programming.subscriber.HeadStudentSubscriber;
import java9.concurrency.reactive.programming.subscriber.StudentSubscriber;

/**
 * <b>Java 9 Reactive Programming </b></br>
 * Java 9 Reactive Streams allows us to implement non-blocking asynchronous stream processing.
 * Java 9 Flow API implements the Reactive Streams Specification. Flow API is a combination 
 * of Iterator and Observer pattern. </br>
 * <b>Java 9 Flow API Classes and Interfaces</b>
 * <ul>
 *     <li> java.util.concurrent.Flow </li>
 *     <li> java.util.concurrent.Flow.Publisher </li>
 *     <li> java.util.concurrent.Flow.Subscriber </li>
 *     <ol>
 *         <li> onSubscribe </li>
 *         <li> onNext </li>
 *         <li> onError </li>
 *         <li> onComplete </li>
 *     </ol>
 *     <li> java.util.concurrent.Flow.Subscription </li>
 *     <li> java.util.concurrent.Flow.Processor </li>
 *     <li> java.util.concurrent.SubmissionPublisher </li>
 * </ul>
 *      
 * @author saukedia1
 *
 */
public class ReactiveAppDemo {

    public static void main(String[] args) throws InterruptedException {
        simplePublisherSubcriberDemo();
        publisherProcessorSubscriber();
    }

    private static void publisherProcessorSubscriber() throws InterruptedException {
        // Creating Publisher:: Using SubmissionPublisher as Publisher to publish events
        SubmissionPublisher<StudentItem> publisher = new SubmissionPublisher<>();

        // Create Processor
        StudentProcessor processor = new StudentProcessor(student -> new HeadStudent(student.getName(), student.getRollNo(), "HeadStudent::" + student.getRollNo()));

        // Create Subscriber chain from publisher -> processor -> subscriber
        HeadStudentSubscriber subscriber = new HeadStudentSubscriber();
        publisher.subscribe(processor);
        processor.subscribe(subscriber);

        // Publish Items
        List<StudentItem> students = ItemHelper.getStudents();
        students.stream()
            .forEach(publisher::submit);

        while (students.size() != subscriber.getCounter()) {
            Thread.sleep(10);
        }

        // close in correct order
        publisher.close();
        processor.close();

        System.out.println(":::EXIT:::");
    }

    private static void simplePublisherSubcriberDemo() throws InterruptedException {
        // Creating Publisher:: Using SubmissionPublisher as Publisher to publish events
        SubmissionPublisher<StudentItem> publisher = new SubmissionPublisher<>();
        List<StudentItem> items = ItemHelper.getStudents();

        // Registering Subscriber
        StudentSubscriber subscriber = new StudentSubscriber();
        publisher.subscribe(subscriber);

        // Publish items 1 at a time
        System.out.println("Publishing items to subscriber");
        items.stream()
            .forEach(publisher::submit);

        // sleep main thread until all messages are processed
        while (items.size() != subscriber.getCounter()) {
            Thread.sleep(10);
        }

        // close the publisher
        publisher.close();

        System.out.println("Exit:: Processing Done");
    }

}

package java9.concurrency.reactive.programming.subscriber;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

import java9.concurrency.reactive.programming.item.StudentItem;

public class StudentSubscriber implements Subscriber<StudentItem> {

    // Hold the subscription instance
    private Subscription subscription;
    private int counter;

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("MySubscriber.onSubscribe()");
        this.subscription = subscription;
        // no of items to request
        this.subscription.request(1);
        System.out.println("onSubscribe requesting 1 item");

    }

    @Override
    public void onNext(StudentItem item) {
        System.out.println("MySubscriber.onNext()");
        System.out.println("Processing Item: " + item);
        counter++;
        this.subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("MySubscriber.onError()");
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("MySubscriber.onComplete()");
        System.out.println("Processing completed for all items");
    }

    public int getCounter() {
        return this.counter;
    }
}

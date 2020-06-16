package java9.concurrency.reactive.programming.subscriber;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

import java9.concurrency.reactive.programming.item.HeadStudent;

public class HeadStudentSubscriber implements Subscriber<HeadStudent> {

    private Subscription subscription;
    private int counter;

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("HeadStudentSubscriber.onSubscribe()");
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(HeadStudent item) {
        System.out.println("HeadStudentSubscriber.onNext() " + item);
        subscription.request(1);
        counter++;
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("HeadStudentSubscriber.onError()");
        throwable.printStackTrace();

    }

    @Override
    public void onComplete() {
        System.out.println("HeadStudentSubscriber.onComplete()");
    }

    public int getCounter() {
        return this.counter;
    }

}

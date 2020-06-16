package java9.concurrency.reactive.programming.processor;

import java.util.concurrent.Flow.Processor;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;

import java9.concurrency.reactive.programming.item.HeadStudent;
import java9.concurrency.reactive.programming.item.StudentItem;

public class StudentProcessor extends SubmissionPublisher<HeadStudent> implements Processor<StudentItem, HeadStudent> {

    private Subscription subscription;
    private Function<StudentItem, HeadStudent> processorFunction;

    public StudentProcessor(Function<StudentItem, HeadStudent> function) {
        this.processorFunction = function;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("StudentProcessor.onSubscribe() ");
        this.subscription = subscription;
        subscription.request(1);

    }

    @Override
    public void onNext(StudentItem item) {
        System.out.println("StudentProcessor.onNext() " + item);
        submit((HeadStudent) processorFunction.apply(item));
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("StudentProcessor.onError()");
    }

    @Override
    public void onComplete() {
        System.out.println("StudentProcessor.onComplete()");
    }

}

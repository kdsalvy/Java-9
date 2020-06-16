package java9.classes.anonymous;

/**
 * Diamond operators are used to infer Types for generic classes. However,
 * it was having few limitations when it was used in anonymous classes.
 * Java 9 has fixed those limitations.
 * @author saukedia1
 *
 */
public class AnonymousClassDiamonOprDemo {

    public static void main(String[] args) {
        // This used to give error "cannot infer type arguments" prior to java 9
        InnerClassInterface<Integer> anonymousInnerClass = new InnerClassInterface<>() {
            public Integer operation(Integer a, Integer b) {
                return a + b;
            }
        };

        System.out.println("Output::: " + anonymousInnerClass.operation(2, 5));
    }
}

interface InnerClassInterface<T> {
    public T operation(T t1, T t2);
}

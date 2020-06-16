# Java 9 Updates

## Java 9 REPL (JShell)
Oracle Corp has introduced a new tool called “jshell”. It stands for Java Shell 
and also known as REPL (Read Evaluate Print Loop). It is used to execute and test 
any Java Constructs like class, interface, enum, object, statements etc. very easily.

```
C:\>jshell
|  Welcome to JShell -- Version 9.0.4
|  For an introduction type: /help intro

jshell> int a = 10
a ==> 10

jshell> System.out.println("a value = " + a )
a value = 10
```

## Factory Methods for Immutable Collections
[Collections Demo](./library-changes/src/java9/collections/CollectionsFactoryMethod.java)

## Private methods in Interfaces 
[Interfaces Demo](./library-changes/src/java9/interfaces/InterfacesWithPrivateMethods.java)

## Java 9 Module System 
[Reusable-Module](./hello-world-module)
[Reusable-Client](./hello-world-client)

## Process API performance improvements
[ProcessHandle Demo](./library-changes/src/java9/process/api/ProcessAPIDemo.java)

## Try-With-Resources API readablilty improvements
[Try-With-Resources Demo](./library-changes/src/java9/exceptions/handling/TryWithResourcesImprovementDemo.java)

## Completable Future API improvements
[CompletableFuture Demo](./library-changes/src/java9/concurrency/executors/CompletableFutureImprovementDemo.java)

## Reactive Streams
[Reative Steam Demo](./library-changes/src/java9/concurrency/reactive/programming/ReactiveAppDemo.java)

## Anonymous class Diamond operator fix
[Demo](./library-changes/src/java9/classes/anonymous/AnonymousClassDiamonOprDemo.java)

## Optional class enhancements
[Optional Class Enhancements Demo](./library-changes/src/java9/optional/OptionalClassAdditionsDemo.java)

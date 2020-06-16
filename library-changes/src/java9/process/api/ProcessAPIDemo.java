package java9.process.api;

/**
 * Process API has added some methods to ease controlling OS process.</br>
 * Two new interfcase in Process API:</br>
 * <ul><li>java.lang.ProcessHandle</li>
 * <li>java.lang.ProcessHandle.info</li>
 * </ul>
 * @author saukedia1
 *
 */
public class ProcessAPIDemo {

    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println(currentProcess.pid());

        ProcessHandle.Info info = currentProcess.info();
        System.out.println(info);
    }

}

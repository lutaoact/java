import java.lang.Thread;

public class ThreadTest {
    public static void main(String args[]) {
        new Thread(() -> System.out.print("this is lambda expression")).start();
    }
}

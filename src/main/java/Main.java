import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Function;

public class Main {
    private static ArrayList Alist = new ArrayList();
    private static LinkedList Llist = new LinkedList();
    private static int N = 1000;

    private static void timer(Function<String, ArrayList> func) {
        for (int i = 0; i < N; i++) {
            func.apply(Integer.toString(i));
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Function func = Alist::add;
        timer(func);
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");
        startTime = System.currentTimeMillis();
        func = Alist::remove;
        timer(func);
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");
    }
}

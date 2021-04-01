import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Function;

public class Main {
    private static ArrayList Alist = new ArrayList();
    private static LinkedList Llist = new LinkedList();
    private static int N = 1000;

    private static void addArray() {
        for (int i = 0; i < N; i++) {
            Alist.add(i);
        }
    }
    private static void addLinked() {
        for (int i = 0; i < N; i++) {
            Llist.add(i);
        }
    }

    private static void deleteArray() {
        for (int i = 0; i < N; i++) {
            Alist.remove(0);
        }
    }
    private static void deleteLinked() {
        for (int i = 0; i < N; i++) {
            Llist.remove(0);
        }
    }

    private static void getArray() {
        for (int i = 0; i < N; i++) {
            Alist.get(0);
        }
    }
    private static void getLinked() {
        for (int i = 0; i < N; i++) {
            Llist.get(0);
        }
    }

    public static void timer(Function func) {
        long startTime = System.currentTimeMillis();

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
        startTime = System.currentTimeMillis();
        //func = Llist::get;
        timer(func);
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");
    }
}

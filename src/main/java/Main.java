import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Function;

public class Main {
    private static ArrayList Alist = new ArrayList();
    private static LinkedList Llist = new LinkedList();
    private static int N = 1000;
    private static long [][] arr = new long[2][3];

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

    public static void timer() {
        long startTime = System.currentTimeMillis();
        addArray();
        long endTime = System.currentTimeMillis();
        arr[0][0] = endTime-startTime;
        startTime = System.currentTimeMillis();
        addLinked();
        endTime = System.currentTimeMillis();
        arr[1][0] = endTime-startTime;
        startTime = System.currentTimeMillis();
        deleteArray();
        endTime = System.currentTimeMillis();
        arr[0][1] = endTime-startTime;
        startTime = System.currentTimeMillis();
        deleteLinked();
        endTime = System.currentTimeMillis();
        arr[1][1] = endTime-startTime;
        startTime = System.currentTimeMillis();
        getArray();
        endTime = System.currentTimeMillis();
        arr[0][2] = endTime-startTime;
        startTime = System.currentTimeMillis();
        getLinked();
        endTime = System.currentTimeMillis();
        arr[1][2] = endTime-startTime;
    }

    public static void main(String[] args) {
        timer();
    }
}

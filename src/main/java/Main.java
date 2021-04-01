import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Класс сравнения эффективности основных операций ArrayList и LinkedList
 * @author Павел Акованцев
 */
public class Main {

    /** Поле списка коллекции ArrayList для сравнения эффективности*/
    private static ArrayList Alist = new ArrayList();
    /** Поле списка коллекции LinkedList для сравнения эффективности*/
    private static LinkedList Llist = new LinkedList();
    /** Поле количество выполненных операций*/
    private static int N = 10000;
    /** Поле количество проверяемых методов*/
    private static int countMethods = 4;
    /** Поле массив для хранения результатов*/
    private static long [][] arr = new long[2][countMethods];

    /**
     * Функция выполняющая N раз метод add коллекции ArrayList
     */
    private static void addArray() {
        for (int i = 0; i < N; i++) {
            Alist.add(i);
        }
    }

    /**
     * Функция выполняющая N раз метод add коллекции LinkedList
     */
    private static void addLinked() {
        for (int i = 0; i < N; i++) {
            Llist.add(i);
        }
    }

    /**
     * Функция выполняющая N раз метод indexOf коллекции ArrayList
     */
    private static void indexOfArray() {
        for (int i = 0; i < N; i++) {
            Alist.indexOf(i);
        }
    }

    /**
     * Функция выполняющая N раз метод indexOf коллекции LinkedList
     */
    private static void indexOfLinked() {
        for (int i = 0; i < N; i++) {
            Llist.indexOf(i);
        }
    }

    /**
     * Функция выполняющая N раз метод delete коллекции ArrayList
     */
    private static void deleteArray() {
        for (int i = 0; i < N; i++) {
            Alist.remove(i);
        }
    }

    /**
     * Функция выполняющая N раз метод delete коллекции LinkedList
     */
    private static void deleteLinked() {
        for (int i = 0; i < N; i++) {
            Llist.remove(i);
        }
    }

    /**
     * Функция выполняющая N раз метод get коллекции ArrayList
     */
    private static void getArray() {
        for (int i = 0; i < N; i++) {
            Alist.get(i);
        }
    }

    /**
     * Функция выполняющая N раз метод get коллекции LinkedList
     */
    private static void getLinked() {
        for (int i = 0; i < N; i++) {
            Llist.get(i);
        }
    }

    /**
     * Функция записи времени выполнения основных операций коллекций ArrayList и LinkedList в массив arr
     */
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
        startTime = System.currentTimeMillis();
        indexOfArray();
        endTime = System.currentTimeMillis();
        arr[0][3] = endTime-startTime;
        startTime = System.currentTimeMillis();
        indexOfLinked();
        endTime = System.currentTimeMillis();
        arr[1][3] = endTime-startTime;
    }

    /**
     * Функция вывода полученных данных в консоль
     */
    public static void print() {
        System.out.print("             add  delete get indexOf\n");
        System.out.print("ArrayList:   ");
        for (int i = 0; i < countMethods; i++) {
            System.out.print(arr[0][i] + "ms   ");
        }
        System.out.print("\nLinkedList:  ");
        for (int i = 0; i < countMethods; i++) {
            System.out.print(arr[1][i] + "ms   ");
        }
        System.out.println("\nCount of operation: " + N);
    }

    /**
     * Функция main, основная функция программы
     */
    public static void main(String[] args) {
        addArray();
        addLinked();
        timer();
        print();
    }
}

import java.util.*;

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
     * Функция выполняющая N раз метод add
     */
    private static void addList(List list) {
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
    }

    /**
     * Функция выполняющая N раз метод indexOf
     */
    private static void indexOfList(List list) {
        for (int i = 0; i < N; i++) {
            list.indexOf(i);
        }
    }

    /**
     * Функция выполняющая N раз метод delete
     */
    private static void deleteList(List list) {
        for (int i = 0; i < N; i++) {
            list.remove(i);
        }
    }

    /**
     * Функция выполняющая N раз метод get
     */
    private static void getList(List list) {
        for (int i = 0; i < N; i++) {
            list.get(i);
        }
    }

    /**
     * Функция записи времени выполнения основных операций коллекций ArrayList и LinkedList в массив arr
     */
    public static void timer() {
        long startTime = System.currentTimeMillis();
        addList(Alist);
        long endTime = System.currentTimeMillis();
        arr[0][0] = endTime-startTime;
        startTime = System.currentTimeMillis();
        addList(Llist);
        endTime = System.currentTimeMillis();
        arr[1][0] = endTime-startTime;
        startTime = System.currentTimeMillis();
        deleteList(Alist);
        endTime = System.currentTimeMillis();
        arr[0][1] = endTime-startTime;
        startTime = System.currentTimeMillis();
        deleteList(Llist);
        endTime = System.currentTimeMillis();
        arr[1][1] = endTime-startTime;
        startTime = System.currentTimeMillis();
        getList(Alist);
        endTime = System.currentTimeMillis();
        arr[0][2] = endTime-startTime;
        startTime = System.currentTimeMillis();
        getList(Llist);
        endTime = System.currentTimeMillis();
        arr[1][2] = endTime-startTime;
        startTime = System.currentTimeMillis();
        indexOfList(Alist);
        endTime = System.currentTimeMillis();
        arr[0][3] = endTime-startTime;
        startTime = System.currentTimeMillis();
        indexOfList(Llist);
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
        addList(Alist);
        addList(Llist);
        timer();
        print();
    }
}

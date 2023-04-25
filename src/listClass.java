import java.util.ArrayList;

public class listClass implements Runnable {
    private final Object Lock = new Object();
    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> oddNumbers = new ArrayList<>();
    ArrayList<Integer> evenNumbers = new ArrayList<>();


    public listClass() {

        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }
    }

    @Override
    public void run() {

            System.out.println(Thread.currentThread().getName() + ":");
            if (Thread.currentThread().getName().substring(7).equals("0")) {
                add(0,2500);
            }
            if (Thread.currentThread().getName().substring(7).equals("1")) {
                add(2500,5000);
            }
            if (Thread.currentThread().getName().substring(7).equals("2")) {
                add(5000,7500);
            }
            if (Thread.currentThread().getName().substring(7).equals("3")) {
                add(7500,10000);
            }

        printNumbers();
    }
    synchronized void add(int i,int j){
        for (int k = i; k < j; k++) {
            if (numbers.get(k) % 2 == 0) {
                evenNumbers.add(numbers.get(k));

            }
            if (numbers.get(k) % 2 == 1) {
                oddNumbers.add(numbers.get(k));

            }
        }
    }
    public void printNumbers() {
        for (Integer i : oddNumbers
        ) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("Tek sayıların boyutu :"+oddNumbers.size());

        for (Integer k : evenNumbers
        ) {
            System.out.print(k + ", ");
        }
        System.out.println();
        System.out.println("Çift sayıların boyutu :"+oddNumbers.size());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        listClass lClass=new listClass();

        Thread t1=new Thread(lClass);
        Thread t2=new Thread(lClass);
        Thread t3=new Thread(lClass);
        Thread t4=new Thread(lClass);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();





    }
}
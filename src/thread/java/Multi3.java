package thread.java;

public class Multi3 implements Runnable{

    public void run() {
        System.out.println("thread is running");

    }

    public static void main(String[] args) {
        Multi3 M1= new Multi3();
        Thread T1 = new Thread(M1);
        T1.start();
    }
}

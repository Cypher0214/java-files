package thread.java;

public class table {

    synchronized void print(int n) {
        int i;
        for (i = 1; i <=10; i++) {
            System.out.println(n * i);


            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println("exception is" + e);
            }

        }
    }
}
    class thread1 extends Thread {
        table t;

        thread1(table t) {
            this.t = t;

        }

        public void run() {
            t.print(2);

        }
    }

    class thread2 extends Thread {
         table t;

        thread2(table t) {
            this.t = t;

        }

        public void run() {
            t.print(5);

        }
    }
class synchronised{
    public static void main(String[] args) {
        table obj=new table();
        thread1 obj1=new thread1(obj);
        thread2 obj2=new thread2(obj);
        obj1.start();
        obj2.start();
    }
}




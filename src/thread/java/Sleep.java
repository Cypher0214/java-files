package thread.java;

public class Sleep extends Thread {
    public void run() {

        int i;
        for(i=0; i<5; i++)
        {

            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);


        }

    }

    public static void main(String[] args) {
        Sleep obj1= new Sleep();
        Sleep obj2 = new Sleep();
        obj1.run();

    }
}

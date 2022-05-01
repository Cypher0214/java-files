package thread.java;

public class Join extends Thread {
    @Override

    public void run() {

        int i;
        for(i=0; i<5; i++)
        {

            try {
                Thread.sleep(500);
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
        obj1.start();
     try {
            obj1.join();
        } catch (Exception e){
            System.out.println(e);
        };


        obj2.start();

    }
}

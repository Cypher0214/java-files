package thread.java;

public class priority extends Thread{

    public void run()
    {
        System.out.println("Current thread's name is:"+currentThread().getName());
        System.out.println("Current thread's Priority is :"+currentThread().getPriority());
    }

    public static void main(String[] args) {

         priority obj1= new priority();
         priority obj2=new priority();
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        obj2.start();




    }

}

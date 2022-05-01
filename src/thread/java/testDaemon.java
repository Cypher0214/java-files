package thread.java;


public class testDaemon extends Thread{
 public void run()
 {
   if(currentThread().isDaemon())
   {
    System.out.println("daemon thread");

   }
   else
    System.out.println("user thread");



 }

 public static void main(String[] args) {
  testDaemon obj1=new testDaemon();
  testDaemon obj2=new testDaemon();
  obj1.setDaemon(true);
  obj1.start();
  obj2.start();

 }
}

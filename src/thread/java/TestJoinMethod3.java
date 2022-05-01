package thread.java;

public class TestJoinMethod3 extends Thread{
    @Override
    public void run() {
        System.out.println("running"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        TestJoinMethod3 obj1= new TestJoinMethod3();
        TestJoinMethod3 obj2= new TestJoinMethod3();
        System.out.println("Name of 1st Thread:"+obj1.getName());
        System.out.println("Name of 2nd Thread:"+obj2.getName());
        System.out.println("id is:"+obj2.getId());
        obj1.start();
        obj2.start();
        obj1.setName("Tisha");
        System.out.println("name after setName:"+obj1.getName());


    }
}

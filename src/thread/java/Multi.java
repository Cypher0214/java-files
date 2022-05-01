package thread.java;

class Multi extends Thread{
    public void run()
    {
        System.out.println("running thread");
        System.out.println("good intellij");
    }


    public static void main(String[] args) {
        Multi Obj=new Multi();
        Obj.start();
    }
}

class Multi extends Thread{
    public void run()
    {
        System.out.println("running thread");
    }


    public static void main(String[] args) {
        Multi Obj=new Multi();
        Obj.start();
    }
}
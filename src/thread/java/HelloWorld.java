package thread.java;

class printing
{
    public void print(char ch)
    {
        for (int i=1;i<=10;i++)
        {
            for(int j=1; j<=10; j++)
            {
                System.out.print(ch);
            }
            System.out.println();
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
class ThreadA extends Thread
{
    printing p;
    ThreadA(printing p)
    {
        this.p=p;
    }
    public void run()
    {
        p.print('*');
    }
}
class ThreadB extends Thread
{
    printing p;
    ThreadB(printing p)
    {
        this.p=p;
    }
    public void run()
    {
        p.print ('#');
    }
}
class HelloWorld
{
    public static void main(String[] args)
    {
        printing pp= new printing ();
        ThreadA t2=new ThreadA(pp);
        ThreadB t1=new ThreadB(pp);
        t1.start();
        t2.start();
    }
}
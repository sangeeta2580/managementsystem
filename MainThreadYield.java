class ThreadOne extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread one is running ");
           // Thread.yield();

        }
    }
}

class ThreadTwo extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread two is running ");
        }
    }
}
 
class MainThreadYield
{
    public static void main(String args[])
    {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        threadOne.start();
        threadTwo.start();
    }
}


/* Output:


C:\Users\SANGEETA CHOUDHARY\OneDrive\Desktop\Session_wise_java_program\Session_20_21_22_multithreading>javac MainThreadYield.java

C:\Users\SANGEETA CHOUDHARY\OneDrive\Desktop\Session_wise_java_program\Session_20_21_22_multithreading>java MainThreadYield
Thread one is running
Thread one is running
Thread one is running
Thread one is running
Thread two is running
Thread two is running
Thread one is running
Thread two is running
Thread two is running
Thread two is running


*/
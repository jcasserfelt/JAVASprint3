package ThreadDemo;


class SampleThread extends Thread {
    public int processingCount = 0;
 
    SampleThread(int processingCount) {
        this.processingCount = processingCount;
        System.out.println("Thread Created");
    }
 
    @Override
    public void run() {
        System.out.println("Thread " + this.getName() + " started");
        while (processingCount > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread " + this.getName() + " interrupted");
            }
            processingCount--;
        }
        System.out.println("Thread " + this.getName() + " exiting");
    }
}
 
class Runner{
public static void  main(String[] args) throws InterruptedException {
      Thread t2 = new SampleThread(1);
      t2.start();
      System.out.println("Invoking join");
      t2.join();
      System.out.println("Returned from join");
      System.out.println("is t2 alive " + t2.isAlive());
  }
}
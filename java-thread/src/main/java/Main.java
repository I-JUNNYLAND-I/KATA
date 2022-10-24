public class Main {

  public static void main(String[] args) {
    Thread thread = new Thread(new MyThread("A", 100));
    Thread thread2 = new Thread(new MyRunable());

    thread.start();
    thread2.start();

    while (true) {
      int count = 0;

      System.out.println("MAIN : " + count);
      count++;
      try {
        Thread.sleep(300);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
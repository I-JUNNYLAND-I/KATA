public class MyRunable implements Runnable{

  int count = 0;

  @Override
  public void run() {
    while (true) {

      System.out.println("Runnable : " + count);
      count++;
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

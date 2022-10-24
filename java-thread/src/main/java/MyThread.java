public class MyThread extends Thread {
  private int count = 0;
  private String name = null;
  private int sleepTime = 100;

  public MyThread(String name, int sleepTime) {
    this.name = name;
    this.sleepTime = sleepTime;
  }

  public void run() {
    while (true) {
      System.out.println(name + " : " + count);
      count++;
      try {
        Thread.sleep(sleepTime);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

import static java.lang.Thread.State.TERMINATED;

public class Main {
    public static void main(String[] args) {
        PrinterScheduler scheduler = PrinterScheduler.init(Printer.job("A", "B", "C"));
        System.out.println("1. Printer Run");
        scheduler.start();

        Sleep.sleep(500L);
        System.out.println("3. Printer Add more");
        scheduler.addSchedule(Printer.job("1", "2", "3"));

        while (true){
            if (scheduler.state() == TERMINATED) {
                System.out.println("5. Printer Stop");
                break;
            }
        }
    }
}

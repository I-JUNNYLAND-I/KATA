import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PrinterScheduler extends Thread {
    private final List<Printer> printers;
    private Thread schedulerThread;

    private PrinterScheduler(CopyOnWriteArrayList<Printer> printers) {
        this.printers = printers;
    }
    public static PrinterScheduler init(Printer printer) {
        return new PrinterScheduler(new CopyOnWriteArrayList<>(){{
            add(printer);
        }});
    }

    @Override
    public void run() {
        this.schedulerThread = Thread.currentThread();
        System.out.println("2. Searching Printer ... "+printers.size());
        while (true) {
            System.out.println("Printer Status ... "+schedulerThread.getState());
            System.out.println("Printer Size ... "+ printers.size());
            printers.forEach(this::start);

            Sleep.sleep(5000L);

            if(printers.size() == 0) {
                System.out.println("4. Printer is Empty ...");
                break;
            }
        }
    }
    public void start(Printer printer){
        printer.start();
        printers.remove(printer);
    }
    public void addSchedule(Printer printer){
        printers.add(printer);
    }

    public State state() {
        return schedulerThread.getState();
    }
}

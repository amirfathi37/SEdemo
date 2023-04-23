public class ScanVirous implements Runnable {
    @Override
    public void run() {
        System.out.println("scanning started...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("scanning finished.");

    }
}

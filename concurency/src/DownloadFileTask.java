public class DownloadFileTask implements Runnable {

    @Override
    public void run() {
        System.out.println("started to download...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finished download.");

        Thread scanVirous = new Thread(new ScanVirous());
        scanVirous.start();
        try {
            scanVirous.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("download and scann finished.");
    }
}

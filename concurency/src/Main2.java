public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new DownloadFileTask2());
        System.out.println("app statred ...");
        myThread.start();
        Thread.sleep(3000);
        myThread.interrupt();
        System.out.println("file ready.");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new DownloadFileTask());
        System.out.println("app statred ...");
        myThread.start();
        myThread.join();
        System.out.println("file ready.");
    }
}

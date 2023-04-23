public class DownloadFileTask3 implements Runnable {

    private DownloadStatus status;

    public DownloadFileTask3() {
      status = new DownloadStatus();
    }

    @Override
    public void run() {
        System.out.println("started to download...");
       for (int i  = 0 ; i < 10_000 ; i++)
           status.incerement();
        System.out.println("finished download.");
    }

    public DownloadStatus getStatus() {
        return status;
    }
}

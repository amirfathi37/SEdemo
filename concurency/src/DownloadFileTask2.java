public class DownloadFileTask2 implements Runnable {

    @Override
    public void run() {

        System.out.println("started to download...");
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            System.out.println("downloaded " + i + " files");
        }
        System.out.println("finished download.");
    }
}

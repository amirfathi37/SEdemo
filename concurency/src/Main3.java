import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("app statred ...");
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask3> task3s = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            DownloadFileTask3 downloadFileTask3 = new DownloadFileTask3();
            Thread thread = new Thread(downloadFileTask3);
            thread.start();
            threads.add(thread);
            task3s.add(downloadFileTask3);
        }
        for (Thread thread : threads) {
            thread.join();
        }
        int dlBytes = 0;
        for (DownloadFileTask3 fileTask3 : task3s) {
            dlBytes += fileTask3.getStatus().getDownloadedByte();
        }
        System.out.println("file ready and downloaded file count is : " + dlBytes);
    }
}

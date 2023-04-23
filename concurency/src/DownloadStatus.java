public class DownloadStatus {
    private volatile int downloadedByte;

    public int getDownloadedByte() {
        return downloadedByte;
    }

    public void incerement() {
        downloadedByte++;
    }
}

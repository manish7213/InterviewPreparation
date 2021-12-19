package Multithreading_Concurrency;

public class ThreadDemo {

    public static void main(String[] args) {

        DownloadThread downloadThread = new DownloadThread();
        downloadThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("This is main thread");
        }


    }
}

class DownloadThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is download thread");
        }
    }
}

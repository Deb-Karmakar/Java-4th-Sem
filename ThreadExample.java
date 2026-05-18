// 1. Create a class that extends Thread
class DownloadTask extends Thread {
    // 2. Override the run() method
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Downloading file... " + i + "MB");
            // Thread.sleep pauses this specific thread for 1 second (1000ms)
            try { Thread.sleep(1000); } catch (Exception e) {} 
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // 3. Create the thread object
        DownloadTask task1 = new DownloadTask();
        
        // 🚨 CRUCIAL: Do NOT call task1.run()! 
        // If you call run(), it runs like a normal method on the main thread.
        // You MUST call start(). This tells Java to spawn a brand new thread.
        task1.start(); 
        
        // This will print IMMEDIATELY, while the download happens in the background!
        System.out.println("The main program is not frozen!"); 
    }
}
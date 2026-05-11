// 1. Define the Interfaces
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playSong(String title);
}

// 2. Implement Multiple Interfaces in one class
// This is how Java handles multiple inheritance of behavior
class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Smartphone: Click! Photo saved to gallery.");
    }

    @Override
    public void playSong(String title) {
        System.out.println("Smartphone: Now playing -> " + title);
    }

    // A regular method unique to the SmartPhone class
    public void makeCall(String number) {
        System.out.println("Smartphone: Calling " + number + "...");
    }
}

// 3. The Main class to run the test
public class interfaceTest {
    public static void main(String[] args) {
        // Create an instance of SmartPhone
        SmartPhone myPhone = new SmartPhone();

        System.out.println("--- Testing Multi-Role Device ---");
        
        // Test Camera functionality
        myPhone.takePhoto();

        // Test MusicPlayer functionality
        myPhone.playSong("Bohemian Rhapsody");

        // Test Phone functionality
        myPhone.makeCall("987-654-3210");
        
        System.out.println("---------------------------------");
    }
}

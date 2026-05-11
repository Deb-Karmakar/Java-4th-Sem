// Department Interface
interface Department {
    void getDeptData(String depName, String depHead);
    void printDeptData();
}

// Hostel Class
class Hostel {
    String hostelName;
    String hostelLocation;
    int noOfRooms;

    public void getHostelData(String name, String location, int rooms) {
        this.hostelName = name;
        this.hostelLocation = location;
        this.noOfRooms = rooms;
    }

    public void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + noOfRooms);
    }
}

// Student Class extending Hostel and implementing Department
class Student extends Hostel implements Department {
    // Interface attributes implemented in the class
    String depName;
    String depHead;
    
    // Student specific attributes
    String studentName;
    String regNo;
    String electiveSubject;
    double avgMarks;

    // Implementing Department methods
    @Override
    public void getDeptData(String depName, String depHead) {
        this.depName = depName;
        this.depHead = depHead;
    }

    @Override
    public void printDeptData() {
        System.out.println("Department Name: " + depName);
        System.out.println("Department Head: " + depHead);
    }

    // Student methods
    public void getStudentData(String name, String regNo, String elective, double marks) {
        this.studentName = name;
        this.regNo = regNo;
        this.electiveSubject = elective;
        this.avgMarks = marks;
    }

    public void printStudentData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
    }
}

// Driver Class
public class MainDriver {
    public static void main(String[] args) {
        Student student = new Student();
        
        // Populating data
        student.getHostelData("Greenwood Boys Hostel", "North Campus", 150);
        student.getDeptData("Computer Science", "Dr. Alan Turing");
        student.getStudentData("Rahul Sharma", "CS2024001", "Artificial Intelligence", 88.5);

        // Printing data
        System.out.println("=== STUDENT PROFILE ===");
        student.printStudentData();
        System.out.println("\n=== DEPARTMENT DETAILS ===");
        student.printDeptData();
        System.out.println("\n=== HOSTEL DETAILS ===");
        student.printHostelData();
    }
}
class student {

    int rollNo;
    String name;
    int marks;

    // default constructor
    student() {
        rollNo = 0;
        name = "Unknown";
        marks = 0;
    }

    // parameterized constructor
    student(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // copy constructor
    student(student s) {
        rollNo = s.rollNo;
        name = s.name;
        marks = s.marks;
    }

    // Method to display details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class constructors {

    public static void main(String[] args) {

        // using default constructor
        student s1 = new student();

        // using parameterized constructor
        student s2 = new student(101, "Kanishk", 85);

        // using copy constructor
        student s3 = new student(s2);

        System.out.println("Default Constructor:");
        s1.display();

        System.out.println("\nParameterized Constructor:");
        s2.display();

        System.out.println("\nCopy Constructor:");
        s3.display();
    }
}
class account {
    int num;
    String name;
    double balance;

    // Constructor to initialize account details
    account(int a, String n, double b) {
        num = a;
        name = n;
        balance = b;
    }

    // Method to display account details
    void showDetails() {
        System.out.println("Account No: " + num);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class bankapp {
    public static void main(String[] args) {

        // Creating object
        account acc = new account(1001, "Kanishk", 5000);

        acc.showDetails();
    }
}
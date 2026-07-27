public class MetOverSv
{
    static int count; // total number of objects
    int a = 0; // value of a

    // default constructor
    MetOverSv()
    {
        a = 1;
        count++;
    }

    // parameterized constructor
    MetOverSv(int b)
    {
        a = b;
        count++;
    }

    // to display values
    void show()
    {
        System.out.println("a: " + a);
        System.out.println("Count: " + MetOverSv.count);
    }

    // method overloading with parameter
    void show(int c)
    {
        System.out.println("Inside parameterized show: ");
        System.out.println("a: " + a);
        System.out.println("c: " + c);
    }

    public static void main(String[] args)
    {
        // object with default constructor
        MetOverSv o1 = new MetOverSv();

        o1.show();
        o1.show(100);

        // object with parameterized constructor
        MetOverSv o2 = new MetOverSv(5);

        o2.show(122);

        System.out.println("Count: " + MetOverSv.count);
    }
}
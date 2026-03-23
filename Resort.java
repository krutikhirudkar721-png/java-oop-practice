// Q4: Create a Resort class to calculate total charges based on days and charges per day.

import java.util.*;

class Resort {

    int RNo;
    String name;
    float charges;
    int days;

    float compute() {
        float amount = days * charges;

        if (amount > 11000)
            amount = amount * 1.02f;

        return amount;
    }

    void getInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Room No: ");
        RNo = sc.nextInt();

        System.out.print("Name: ");
        name = sc.next();

        System.out.print("Charges: ");
        charges = sc.nextFloat();

        System.out.print("Days: ");
        days = sc.nextInt();
    }

    void dispInfo() {
        System.out.println("Room No: " + RNo);
        System.out.println("Name: " + name);
        System.out.println("Amount: " + compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.getInfo();
        r.dispInfo();
    }
}

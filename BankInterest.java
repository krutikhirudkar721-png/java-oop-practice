// Q10: Create an interface Bank to display different interest rates.

interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    public double getInterestRate() { return 6.5; }
}

class HDFC implements Bank {
    public double getInterestRate() { return 7.0; }
}

class ICICI implements Bank {
    public double getInterestRate() { return 6.8; }

    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI: " + b1.getInterestRate());
        System.out.println("HDFC: " + b2.getInterestRate());
        System.out.println("ICICI: " + b3.getInterestRate());
    }
}

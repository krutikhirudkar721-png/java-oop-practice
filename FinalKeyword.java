// Q18: Demonstrate final variable.

class FinalKeyword {
    final double interestRate = 7.5;

    double calculateInterest(double amount) {
        return amount * interestRate / 100;
    }

    public static void main(String[] args) {
        FinalKeyword b = new FinalKeyword();
        System.out.println(b.calculateInterest(10000));
        System.out.println(b.calculateInterest(20000));
    }
}

// Q16: Demonstrate runtime polymorphism using Staff roles.

class Staff {
    void work() {
        System.out.println("Staff working");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Doctor treats patients");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Nurse assists doctor");
    }
}

class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist manages appointments");
    }

    public static void main(String[] args) {
        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        Staff s3 = new Receptionist();

        s1.work();
        s2.work();
        s3.work();
    }
}

// Q5: Write a program to calculate employee salary using basic, HRA, and DA.

import java.util.*;

class Employee {

    int empno;
    String ename;
    float basic, hra, da, netpay;

    float calculate() {
        return basic + hra + da;
    }

    void havedata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Emp No: ");
        empno = sc.nextInt();

        System.out.print("Name: ");
        ename = sc.next();

        System.out.print("Basic: ");
        basic = sc.nextFloat();

        System.out.print("HRA: ");
        hra = sc.nextFloat();

        System.out.print("DA: ");
        da = sc.nextFloat();

        netpay = calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " NetPay: " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata();
        e.dispdata();
    }
}

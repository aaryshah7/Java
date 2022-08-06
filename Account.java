/*Design a class named Account that contains: 
• A private int data field named id for the account (default 0). 
• A private double data field named balance for the account (default 500₹). 
• A private double data field named annualInterestRate that stores the current interest rate (default 7%). Assume all accounts have the same interest rate. 
• A private Date data field named dateCreated that stores the date when the account was created. 
• A no-arg constructor that creates a default account. 
• A constructor that creates an account with the specified id and initial balance. 
• The accessor and mutator methods for id, balance, and annualInterestRate. 
• The accessor method for dateCreated. 
• A method named getMonthlyInterestRate() that returns the monthly interest rate. • A method named getMonthlyInterest() that returns the monthly interest. 
• A method named withdraw that withdraws a specified amount from the account. 
• A method named deposit that deposits a specified amount to the account.
 */
//21CE124-Aary Shah
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Account {
    private int id = 0;
    private double balance = 500;
    private double annualInterestRate = 0.07;
    private Date date;

    Account() {

    }

    public Account(int a, double b, double c) {

        id = a;
        balance = b;
        annualInterestRate = c;

    }

    public void getdata() {

        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        balance = sc.nextDouble();
        annualInterestRate = sc.nextDouble();

    }

    public void putdata() {
        System.out.println(id);
        System.out.println(balance);
        System.out.println(annualInterestRate);
    }

    public void getdate() {
        SimpleDateFormat dateform = new SimpleDateFormat("dd/MM/yyyy");
        Date newdate = new Date();
        System.out.println(dateform.format(newdate));

    }

    public double getMonthlyIntrestRate() {
        double l;
        l = balance * annualInterestRate;
        System.out.println(l);
        return l;
    }

    public void Withdraw() {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        
    }

    public void Deposit() {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        balance += l;
    }

    public static void main(String[] args) {

        Account acc = new Account();

        acc.getdata();
        acc.putdata();
        acc.getdate();
        acc.getMonthlyIntrestRate();
        acc.Deposit();
        acc.Withdraw();
        System.out.println("he");
        acc.putdata();
        System.out.println("21CE124-Aary Shah");
    }

}


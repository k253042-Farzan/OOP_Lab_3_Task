// a bank wants to initialize customer accounts at the time of account creation.
//each account has acc number, acc holder name and initial balance
//Task
//Create a class bank acc, use a constructor to assign initial values,
// create one acc with balance and one without balance
// display acc details.

package LibraryFunctions;

public class Task1 {
    int accno;
    String accholder;
    double balance;

    public Task1(int accno, String accholder, double balance){
        this.accno = accno;
        this.accholder = accholder;
        this.balance = 0;
    }
    public void display(){
        System.out.println("Account Number: " + accno);
        System.out.println("Account Holder: " + accholder);
        System.out.println("Account Balance: " + balance);
    }
}

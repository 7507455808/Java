package Pooja;

 class Account {
int acc_no;
String acc_name;
double acc_amount;

void insertDetails(int i,String a, double amt) { //method to initialize object
	acc_no = i;
	acc_name = a;
	acc_amount =amt;
	
}
void deposite(double amt) {
	acc_amount = acc_amount+amt;
	System.out.println("amount deposited successfully....");
	
}
void withdraw(double amt) {
	if(acc_amount <amt) {
		System.out.println("No balance");
	} else {
		acc_amount = acc_amount - amt;
		System.out.println("amount withdraw successfully...");	
	}	
}
void checkbalance() {
	System.out.println("Balance in account : " +acc_amount);
	
}
public class BankSystemExample {
	
	 
 } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account obj = new Account();
obj.insertDetails(12345, "Tejas", 15000.34);
obj.deposite(5000);
obj.withdraw(2000);
obj.checkbalance();


	}

}

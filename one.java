package lab_programs;
class Bank{
	String name;
	String address;
	String phone;
	String pan;
	String aadhar;
	public Bank() {
	}
public Bank(String name, String address, String phone, String pan, String aadhar) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pan = pan;
		this.aadhar = aadhar;
	}
	
	void calcInt(){}
	void displayDetails(){
	System.out.println("Name : "+name+" "+"Address : "+address+" "+"Phone No : "+phone+" "+"PAN : "+pan+" "+"Aadhar : "+aadhar);
	}
	
}
class SBAccount extends Bank{
	String accNum;
	double accBal;
	double interest;
	public SBAccount(String name, String address, String phone, String pan, String aadhar,String num) {
	super(name, address, phone, pan, aadhar);
	accNum=num;
	accBal=1000;
	}
public SBAccount(String name, String address, String phone, String pan, String aadhar,String num,double bal) {
	super(name, address, phone, pan, aadhar);
	accNum=num;
	accBal=bal;
	}
	
void calcInt(){
	interest=accBal*0.04;
	}
void displayDetails(){
	super.displayDetails();
	System.out.println("Account Type : S/B Account\n"+"Account No : "+accNum+"\n"+"Interest paid per year : "+interest+"\nfor Amount : "+accBal);
	}	
}

class LoanAccount extends Bank{
	String accNum;
	double loanAmt;
	double interest;
	public LoanAccount(String name, String address, String phone, String pan, String aadhar,String num,double loan) {
		super(name, address, phone, pan, aadhar);
		accNum=num;
		loanAmt=loan;
	}
void calcInt(){
		interest=loanAmt*0.10;
	}
void displayDetails(){
	super.displayDetails();
	System.out.println("Account Type : Loan Account\n"+"Account No : "+accNum+"\n"+"Interest demand for 1st year : "+interest+"\nfor Amount : "+loanAmt);
	}	
}

public class one {
public static void main(String[] args) {
Bank bankAcc=new Bank();
bankAcc=new SBAccount("Name1:nmit", "Bangalore", "123456", "ASTPM1000", "33334444", "111");
bankAcc.calcInt();
bankAcc.displayDetails();
System.out.println("\n");
bankAcc=new LoanAccount("Name2:NMIT2", "Mysore", "654321", "BSTPM1000", "55556666", "222",20000);
bankAcc.calcInt();
bankAcc.displayDetails();
}
}

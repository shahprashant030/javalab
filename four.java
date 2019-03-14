package lab_programs;
import java.util.Scanner;

class LessBalanceException extends Exception{
	String s1;
	LessBalanceException(String s2) {
		s1 = s2;
	} 
	@Override
	public String toString() { 
		return ("LessBalanceException = "+s1);
	}
}
class TransactionNotAllowed extends Exception{
	String s1;
	TransactionNotAllowed(String s2) {
		s1 = s2;
	} 
	@Override
	public String toString() { 
		return ("TransactionNotAllowed = "+s1);
	}
}
class AxisBank{
	String name;
	String address;
	String phone;
	String pan;
	String aadhar;
	double balance;
	public AxisBank(String name, String address, String phone, String pan, String aadhar,double balance) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pan = pan;
		this.aadhar = aadhar;
		this.balance=balance;
	}
	void depositAmount(double amt){
		balance +=amt;
	}
	void withdrawAmount(double amt){
		try{
			if(amt>4500)
				throw new TransactionNotAllowed("Exceeds per day limit (day limit is 4500)");
			if((balance-amt)<1000){
				throw new LessBalanceException("can\'t with this much amount due to insufficient balance, minimum 1000 has to be maintained");
			}else{
				balance-=amt;
			}
		}catch(LessBalanceException e){
			System.out.println(e);
		}
		catch(TransactionNotAllowed e){
			System.out.println(e);
		}
	}
	public void display() {
	System.out.println("Name : "+name+" "+"Address : "+address+" "+"Phone No : "+phone+" "+"PAN : "+pan+" "+"Aadhar : "+aadhar);
	System.out.println("Available Balanc in the account is "+balance);
	}

}
public class four {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int choice=0;double amt=0;
		AxisBank ab=new AxisBank("NMIT1", "Bangalore", "123456", "ASTPM1000", "111222", 1000);
		ab.display();
		do{
		System.out.println("1 : Deposit\n2 : Withdraw\n3 : Exit");
			choice=scan.nextInt();
		switch(choice){
		case 1:System.out.println("Enter amount to be deposited : ");
			amt=scan.nextDouble();
			ab.depositAmount(amt);
			ab.display();
			break;
		case 2:	
			System.out.println("Enter amount to withdraw : ");
			amt=scan.nextDouble();
			ab.withdrawAmount(amt);
			ab.display();				
break;
			default:System.out.println("Enter Valid Option");
			}		
		}while(choice!=3);
		scan.close();
	}
}

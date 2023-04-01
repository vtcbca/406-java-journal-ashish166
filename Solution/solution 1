import java.util.Scanner;

class bankaccount{
	String name;
	int acno;
	String actype;
	int balance;
	Scanner sc = new Scanner(System.in);
	bankaccount(String name,int acno,String actype,int balance){
			this.name = name;
			this.acno = acno;
			this.actype = actype;
			this.balance = balance;
			System.out.println("-----------------------------------");
			System.out.println("Account Holder's Name :"+name);
			System.out.println("Account number        :"+acno);
			System.out.println("Type of Account       :"+actype);
			System.out.println("Bank Balance          :"+this.balance);
			System.out.println("-----------------------------------");
		}
		
		
		
		void deposit(){
			System.out.print("Enter amount to deposit:");
			int dip = sc.nextInt();
			this.balance += dip;
		}
		
		void withdraw(){
			System.out.print("Enter Amount to withdraw:");
			int withd = sc.nextInt();
			if(withd>this.balance)
				System.out.println("Insufficient balance!!!!!!");
			else
				this.balance -= withd;
		}
		
		void checkbal(){
			System.out.println("Available Bank balance:"+this.balance);
		}
		
		void info(){
			System.out.println("-----------------------------------");
			System.out.println("Account Holder's Name :"+name);
			System.out.println("Account number        :"+acno);
			System.out.println("Type of Account       :"+actype);
			System.out.println("Bank Balance          :"+this.balance);
			System.out.println("-----------------------------------");
		}
		
		void switchh(){
			System.out.println("-----------------------------------\n");
				System.out.println("Press 1 for Deposit Money");
				System.out.println("Press 2 for Withdraw Money.");
				System.out.println("Press 3 for Check Bank Balance.");
				System.out.println("Press 4 for View information of account.");
				System.out.println("Press 5 for exit.");
				System.out.print("Enter your choice:");
				
				
		}
		
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int opt=0;
			bankaccount obj = new bankaccount("Ashish",351680208,"Saving",6000);
			do{
				
				obj.switchh();
				opt = sc.nextInt();
				System.out.println("-----------------------------------\n");
				
				switch(opt){
					case 1:
						obj.deposit();		
						break;
					case 2:
						obj.withdraw();
						break;
					case 3:
						obj.checkbal();
						break;
					case 4:
						obj.info();
						break;
					case 5:
						break;
					default:
						System.out.println("Enter proper choice.");
				}
			}while(opt != 5);
		}
}

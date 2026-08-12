class BankAccount{
	public static void accountDetails(int accountNumber,String customerName,String accountType){
		System.out.println("Running accountDetails in BankAccount");
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Customer Name:"+customerName);
		System.out.println("Account Type:"+accountType \n);
	}
	public static void balanceDetails(double currentBalence,double minimumBalence){
		System.out.println("Running balanceDetails in BankAccount");
		System.out.println("Current Balence:"+currentBalence);
		System.out.println("Minimum Balence:"+minimumBalence);
	}
	public static  void bankDetails(String bankName,String branch,String ifscCode){
		System.out.println("Running bankDetails in BankAccount");
		System.out.println("Bank Name:"+bankName);
		System.out.println("Branch:"+branch);
		System.out.println("IFSC Code:"+ifscCode);
	}
	
		
		
	public static void main(String args[]){
		accountDetails(1001,"Rahul","Savings");
		balanceDetails(750000,5000);
		bankDetails("ABC Bank","Bengaluru","ABC0001234");
		
		
	}

}
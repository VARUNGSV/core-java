class BankAccount{
	public static void accountDetails(int accountNumber,String customerName,String accountType){
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Customer Name:"+customerName);
		System.out.println("Account Type:"+accountType);
	}
	public static void main(String args[]){
		accountDetails(1001,"Rahul","Savings");
	}
}
import java.util.Scanner;


public class ATMTester {
	static void disp_menu(){
		System.out.println("Welcome To Bank's ATM!");
	}

    public static void main(String[] args){
	
	    String pin;
        int selection;
        double deposit, withdraw;

	    Scanner inAccountNumber = new Scanner(System.in);
	    Scanner inPin = new Scanner(System.in);
	    Scanner inSelection = new Scanner(System.in);
	    Scanner inWithdraw = new Scanner(System.in);
	    Scanner inDeposit = new Scanner(System.in);
    }



    // private Object pin;


    
    //     System.out.printf("Please Enter Your Account Number");
	//     System.out.printf("Please Enter Your Pin Number: ");
	//     Pin = inPin.nextLine();
	    AccountDemo Acnt = new AccountDemo();
	    private int selection;

	    // System.out.printf("Welcome");
	

	
	//Show the option/welcome menu.
    void disp_menu1(){
	}{
        System.out.printf("Welcome");

    //Ask the person what they'd like to do and store their choice
    //in memory.
        while(true){

        System.out.printf("Please Make Your Selection(choose a number): ");
        Scanner inSelection;
		selection = inSelection.nextInt();
        Object withdraw;
		switch(selection)
        {
            //If the user chooses to see their balance (option 1)
            case 1:
                System.out.printf("Your current balance is $%.2f.", Acnt.balance());
            break;

            //If the user chooses to withdraw (option 2)
            case 2:
                System.out.printf("Withdraw how much?: ");
			Scanner inWithdraw;
			withdraw = inWithdraw.nextDouble();
                Acnt.Withdraw((Double) withdraw);
            break;

            //If the user chooses to deposit (option 3)
            case 3:
                 System.out.printf("Deposit how much?: ");
			Scanner inDeposit;
			double deposit = inDeposit.nextDouble();
			double deposit1;
			Acnt.Deposit(deposit1);
            break;

            //If the user decides to exit
            case 4:
                 System.out.printf("Thank You! Goodbye!");
                 System.exit(1);
            break;

            //If there's a choice number entered that doesn't exist.
            default:
                 System.out.printf("Invalid choice!");
            break;
       	 }
   	 }
    }
}
// End of Main



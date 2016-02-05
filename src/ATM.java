import java.util.Scanner;
public class ATM {
     
   public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   // We set the database size and store it to a array
	   System.out.println("How big do you want the database to be:");
	   int x = input.nextInt() + 1;

	   Accounts[] AtmCustomers = new Accounts[x];
        for(int i = 0 ; i < AtmCustomers.length ; i++){
        	// Instead of 100 in account balance, we use a random balance so we have some differences between the accounts
            double balance = Math.random() * 1000;
            int id = i;
            // We do the same thing on the Interest Rate
            // We also set a custom name, just to show it in the code. 
            String name = "Petter";
            double annualInterestRate = Math.random() * 2.2;
            AtmCustomers[i] = new Accounts(id, name, balance, annualInterestRate);
             
        }
        // We initialize the ATM program
        menu(AtmCustomers);
   }
 
    
    
   static void menu(Accounts AtmCustomers[]){
	   // We set parameters for the menu and the program itself
       int Menu = 1;
       int on = 1;
       double sum;
       while (on == 1){
    	   Scanner input = new Scanner(System.in);
    	   // We ask the user for his Customer Account
    	   System.out.println("Enter your Customer Account Number:");
    	   int ActiveCustomerAccount = input.nextInt();
    	   Menu = 1;
    	   // If the Account is bigger then the base itself, we ask for a new Account
    	   if( ActiveCustomerAccount > (AtmCustomers.length - 1) || ActiveCustomerAccount < 1 ){
    		   System.out.println("We cant seem to find that Customer Account.");
    		   System.out.println("Please check your Customer Account number\nand try again.\n");
    		   Menu = 1;
    	   }
    	   else {
    		   // Else we show the menu for the user
    		   while (Menu == 1){
    			   System.out.println("Main Menu:");
    			   System.out.println("1: Check Balance");
    			   System.out.println("2: Withdraw");
    			   System.out.println("3: Deposit");
    			   System.out.println("4: Transactions");
    			   System.out.println("5: Exit");
    			   System.out.println("Your choice:");
    			   System.out.println("------------------------");
    			   int choice = input.nextInt();
    			   // We use switch statements to handle the different choices
    			   switch (choice){
    			   		// Fetch and show balance
    			   case 1: System.out.printf("Your Balance Is: %.2f\n\n\n", AtmCustomers[ActiveCustomerAccount].getBalance());
						break;
						// Get amount to withdraw.
    			   case 2: System.out.println("Amount to withdraw: ");
						sum = input.nextDouble();
						// If we have enough in the account, we withdraw
						if( AtmCustomers[ActiveCustomerAccount].getBalance() >= sum){
							AtmCustomers[ActiveCustomerAccount].withdraw(sum);
							System.out.printf("Withdraw completed. New Balance: %.2f\n\n\n", 
									AtmCustomers[ActiveCustomerAccount].getBalance());
						}
						// Else we deny
						else {
							System.out.printf("Insufficient funds. Balance is: %.2f\n\n\n",
							AtmCustomers[ActiveCustomerAccount].getBalance());
						}
						break;
							// Get amount to deposit
    			   case 3: System.out.printf("Amount to deposit: ");
						   sum = input.nextDouble();
						   // We deposit and fetch the new balance to print.
						   AtmCustomers[ActiveCustomerAccount].deposit(sum);
						   System.out.printf("Deposit completed. New Balance: %.2f\n\n\n", 
								   AtmCustomers[ActiveCustomerAccount].getBalance());
						   break;
						   // Fetch and print
    			   case 4: System.out.println("Account:\t#" + AtmCustomers[ActiveCustomerAccount].getId());
    					   System.out.println("Owner:\t\t" + AtmCustomers[ActiveCustomerAccount].getName());
    					   System.out.println("Rate:\t\t" + AtmCustomers[ActiveCustomerAccount].getAnnualInterestRate() + '\n');
    					   System.out.println("Transactions:\nDate:\t\tType:\tAmount:\tBalance:\t\tDescription:");
    					   System.out.println(AtmCustomers[ActiveCustomerAccount].getTransactions().toString());
						   System.out.println("\n\n\n");
						   break;
						   // If you exit
    			   case 5: Menu = 0; 
						   System.out.println("Have a nice day, and welcome back.\n\n\n");
						   break;
					// Wrong choice
    			   default: System.out.println("That choice doesnt exsist.\nPlease try again.\n\n\n"); 
						    break;
    			   }
    		   }
    	   }
       }
   }         
}




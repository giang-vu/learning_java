/**
 * 
 */
package encapsulation;

import java.awt.*;
import java.lang.Math;
import java.util.Random;

/**
 * @author Giang Vu
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount myBankAccount = new BankAccount(1234567890, 100);
		
		myBankAccount.deposit(-60);
		myBankAccount.withdraw(200);
		
		myBankAccount.deposit(100);
		myBankAccount.withdraw(200);
		myBankAccount.showBalance();
	}

}

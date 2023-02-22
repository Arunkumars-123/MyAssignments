/*
 * Assignment1
============
    Class     :BankInfo
    Methods :saving(),fixed(),deposit()

     Class     :AxisBank
     Methods :deposit()

Description:
You have to override the method deposit in AxisBank.
package assignment;
*/

package assignment;

public class AxisBank {

	public void deposit() {
		
		System.out.println("deposit");
	}

	
	public static void main(String[] args) {
		
		BankInfo obj = new BankInfo();
		
		obj.savings();
		obj.fixed();
		obj.deposit();
		
	}
}

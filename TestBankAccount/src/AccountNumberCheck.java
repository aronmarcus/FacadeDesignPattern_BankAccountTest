/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aron
 */
public class AccountNumberCheck{
	
	private int accountNumber = 12345678;
	
	public int getAccountNumber() { return accountNumber; }
	
	public boolean accountActive(int acctNumToCheck){
		
		if(acctNumToCheck == getAccountNumber()) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
}

package com.workshop.Banking;

public class SavingAccount {
	/*
     * Declaring variables */
	
     private static double annualInterstaRate;
     private double savingBalance;
    
     public static double getAnnualInterstaRate() {
		return annualInterstaRate;
	 }
     
    /*
     * Setting interest rate as static method*/
     
	public static void modifyIntrestRate(double annualInterstaRate) {
		SavingAccount.annualInterstaRate = annualInterstaRate;
	}

	SavingAccount(double savingBalance){
    	
    	this.savingBalance=savingBalance;
    }
    
	/*Calculating monthlyInterest and adding to savingBalance
	 * */
    public double calculateMonthlyIntrest(double savingBalance) {
    	double monthlyIntrest;
    	monthlyIntrest=((annualInterstaRate/100)*savingBalance)/12;
    	return savingBalance += monthlyIntrest;
    }
    
	public static void main(String[] args) {
		
		
		/*1.Creating two Object as saver1 and saver2
		 * */
		SavingAccount saver1=new SavingAccount(2000);
		SavingAccount saver2=new SavingAccount(3000);
		
		/*2.Setting Interest rate for two Object as saver1 and saver2
		 * */
		modifyIntrestRate(4);
		
		
		/*3.Printing new balance for two Object as saver1 and saver2
		 * */
	
		System.out.println("The new balance for saver1  "+ saver1.calculateMonthlyIntrest(2000));
		System.out.println("The new balance for saver2  "+ saver2.calculateMonthlyIntrest(3000));
		
        System.out.println();
        
        /*4.Setting Interest rate for two Object as saver1 and saver2
		 * */
        modifyIntrestRate(5);
        
        /*5.Printing new balance for two Object as saver1 and saver2
		 * */
		System.out.println("The new balance for saver1 after setting new interest value "+ saver1.calculateMonthlyIntrest(2000));
		System.out.println("The new balance for saver2 after setting new interest value "+ saver2.calculateMonthlyIntrest(2000));
        
       
       
        
		
	}

}

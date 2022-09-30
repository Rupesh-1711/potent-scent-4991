package com.masai.main;

import java.util.Scanner;

import com.masai.bean.Administrator;
import com.masai.bean.Vender;
import com.masai.exceptions.AdministratorException;
import com.masai.exceptions.VenderException;
import com.masai.login.LoginMethods;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoginMethods lm = new LoginMethods();
		AdministratorFunctionality admin = new AdministratorFunctionality();
		boolean status = true;
		
		while(status) {
			
			System.out.println("Choose Option ");
			System.out.println("  1. Administrator Login.\r\n"
					+ "  2. Vender Login.\r\n"
					+ "  3. Exit.");
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1: {
				
				System.out.println("Welcome to Administrator login");
				System.out.println("Enter your UserName : ");
				String userName = sc.next();
				System.out.println("Enter your Password : ");
				String password = sc.next();
				try {
					Administrator ad = lm.loginAdministrator(userName, password);
				     System.out.println("welcome : "+ ad.getUserName());
				     admin.AdministratorRun();
				     
				} catch (AdministratorException e1) {
				
					System.out.println(e1.getMessage());
				}

			}
			
			case 2:{
				System.out.println("Welcome to Vender login");
				System.out.println("Enter your email : ");
				String email = sc.next();
				System.out.println("Enter your Password : ");
				String password = sc.next();
				
				try {
					Vender vd = lm.loginVender(email, password);
					  System.out.println("welcome : "+ vd.getVname());
				} catch (VenderException e) {
				    System.out.println(e.getMessage());
				}
				VenderFunctionality.venderRun();
			}
			
			case 3 :{
			     System.out.println("Thank You.");
			     status = false;
			     break;
			}
			
			default : System.out.println("Please Enter Valid Number");
			
			}
			
		}
	}
}

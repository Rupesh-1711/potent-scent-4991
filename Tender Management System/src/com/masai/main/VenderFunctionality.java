package com.masai.main;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Tender;
import com.masai.dao.AdministratorDeo;
import com.masai.dao.AdministratorDeoImpl;
import com.masai.exceptions.TenderException;


public class VenderFunctionality {


	public static void venderRun() {
		
		Login login = new Login();
		Scanner sc = new Scanner(System.in);
		
		boolean status = true;
		
		while(status) {
			
			System.out.println("Choose Option Below");
			System.out.println(
					 "1. View all the current Tenders.\r\n"
					 + "2. Place a Bid against a Tender.\r\n"
					 + "3. View status of a Bid(Whether Selected or Not)\r\n"
					 + "4. View his own Bid History.\r\n"
					 + "5. LogOut");
			System.out.println("==============================================");
			int num = sc.nextInt();
			switch(num) {
			
			case 1 : {
				AdministratorDeo deo4 = new AdministratorDeoImpl();
				try {
					List<Tender> tenders = deo4.getAllTenderDetails();
					tenders.forEach(s->System.out.println(s));
				} catch (TenderException e) {
					System.out.println(e.getMessage());
				}
			    VenderFunctionality.venderRun();

			}
			
			case 2 :{
				
			}
			
			case 3 :{
				
			}		
			
			
			case 4 :{
				
			}
			case 5 :{
			     System.out.println("Thank You.");
			     status = false;
			     login.main(null);
			     break;
			}
			
			default : System.out.println("Please Enter Valid Number");
			
		  }
		}
	}
}

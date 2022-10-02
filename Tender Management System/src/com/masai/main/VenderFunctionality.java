package com.masai.main;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Bids;
import com.masai.bean.Tender;
import com.masai.dao.AdministratorDeo;
import com.masai.dao.AdministratorDeoImpl;
import com.masai.dao.VenderDeo;
import com.masai.dao.VenderDeoImpl;
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
				VenderDeo deo4 = new VenderDeoImpl();
				try {
					List<Tender> tenders = deo4.getAllTenderDetails();
					tenders.forEach(s->System.out.println(s));
				} catch (TenderException e) {
					System.out.println(e.getMessage());
				}
			    VenderFunctionality.venderRun();

			}
			
			case 2 :{
			   System.out.println("Enter Your Vender Id :");
			   int bvid = sc.nextInt();
			    System.out.println("Enter Tender ID : ");
			    int btid = sc.nextInt();
			    System.out.println("Enter your Bid Amount : ");;
			    int amount = sc.nextInt();
			    Bids  bid = new Bids(btid, bvid, amount);
			    System.out.println("Bid sucessfully");
			    break;

			}
			
			case 3 :{
				   System.out.println("Enter Your Vender Id :");
				   int bvid = sc.nextInt();
				    System.out.println("Enter Tender ID : ");
				    int btid = sc.nextInt();
				    System.out.println("Enter your Bid Amount : ");;
				    int amount = sc.nextInt();
				    Bids  bid = new Bids(btid, bvid, amount);
				    System.out.println("Bid sucessfully");
				    break;
			}		
			
			
			case 4 :{
				   System.out.println("Enter Your Vender Id :");
				   int bvid = sc.nextInt();
				    System.out.println("Enter Tender ID : ");
				    int btid = sc.nextInt();
				    System.out.println("Enter your Bid Amount : ");;
				    int amount = sc.nextInt();
				    Bids  bid = new Bids(btid, bvid, amount);
				    System.out.println("Bid sucessfully");
				    break;
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

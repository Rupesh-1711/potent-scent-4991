package com.masai.main;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Administrator;
import com.masai.bean.Tender;
import com.masai.bean.Vender;
import com.masai.dao.AdministratorDeo;
import com.masai.dao.AdministratorDeoImpl;
import com.masai.exceptions.AdministratorException;
import com.masai.exceptions.TenderException;
import com.masai.exceptions.VenderException;

public class AdministratorFunctionality {

	public static void AdministratorRun() {
		
		Login login = new Login();
		AdministratorDeo deo = new AdministratorDeoImpl();
		Scanner sc = new Scanner(System.in);
		
		boolean status = true;
		
		while(status) {
			
			System.out.println("Choose Option Below");
			System.out.println(
					 "1. Register new Vendor. \r\n"
					+ "2. View all the vendors.\r\n"
					+ "3. Create new tenders.\r\n"
					+ "4. View All the Tenders.\r\n"
					+ "5. View All the Bids of a tender.\r\n"
					+ "6. Assign tender to a vendor.\r\n"
					+ "7. logOut");
			System.out.println("==============================================");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: {
				
				System.out.println("Welcome to Vender login");
				System.out.println("Enter Vender name");
				String vname = sc.next();
				System.out.println("Enter  Vender email : ");
				String vemail = sc.next();
				System.out.println("Enter  Password : ");
				String password = sc.next();
				System.out.println("Enter vender Company Name : ");
				String company = sc.next();
				System.out.println("Enter vender Address : ");
				String address = sc.next();
				Vender vender = new Vender(vname, vemail, password, company, address);
				String result = deo.registerVender(vender);
				System.out.println(result);
			     AdministratorFunctionality.AdministratorRun();
			}
			
			case 2:{
				AdministratorDeo deo1 = new AdministratorDeoImpl();
			     try {
					List<Vender> venders = deo1.getAllVendertDetails();
					
					venders.forEach(s-> System.out.println(s));
					
				} catch (VenderException e) {
			          System.out.println(e.getMessage());
				}
			     AdministratorFunctionality.AdministratorRun();
				
			}
			
			case 3 :{
				System.out.println("Enter Tender name : ");
				String tname = sc.next();
				System.out.println("Enter Tender description :");
				String tdesc = sc.next();
				Tender tender = new Tender(tname, tdesc);
				String result = deo.createTender(tender);
				System.out.println(result);
				 AdministratorFunctionality.AdministratorRun();
			}
			
			case 4 :{
				AdministratorDeo deo4 = new AdministratorDeoImpl();
				try {
					List<Tender> tenders = deo4.getAllTenderDetails();
					tenders.forEach(s->System.out.println(s));
				} catch (TenderException e) {
					System.out.println(e.getMessage());
				}
			     AdministratorFunctionality.AdministratorRun();

				
			}
			case 7 :{
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

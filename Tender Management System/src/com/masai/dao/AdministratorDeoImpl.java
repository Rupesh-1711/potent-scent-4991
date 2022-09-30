package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Tender;
import com.masai.bean.Vender;
import com.masai.exceptions.TenderException;
import com.masai.exceptions.VenderException;
import com.masai.utility.DBUtil;

public class AdministratorDeoImpl implements AdministratorDeo{

	@Override
	public String registerVender(Vender vender) {
		String message = "Not Inserted";
		try(Connection conn = DBUtil.provideConnection()){
		 PreparedStatement ps = conn.prepareStatement("insert into venders(vname,vemail,password,company,address) values(?,?,?,?,?)");
		 ps.setString(1, vender.getVname());
		 ps.setString(2,vender.getVemail());
		 ps.setString(3, vender.getPassword());
		 ps.setString(4, vender.getCompany());
		 ps.setString(5, vender.getAddress());
		 int x = ps.executeUpdate();
		 
		 if(x>0) {
			 message = "Vender Registered Sucessfully !";
		 }
			
		}catch(SQLException e) {
			message = e.getMessage();
		}
	
		
		return message;
	}

	@Override
	public List<Vender> getAllVendertDetails() throws VenderException {
		List<Vender> venders = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
		PreparedStatement ps =	conn.prepareStatement("Select * from venders");
			
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			int r= rs.getInt("vid");
			String n= rs.getString("vname");
			String e= rs.getString("vemail");
			String p= rs.getString("password");
			String co = rs.getString("company");
			String ad = rs.getString("address");
			
		Vender vender=new Vender(r, n, e, p, co, ad);	
		venders.add(vender);
		}
		
		} catch (SQLException e) {
			// TODO: handle exception
			throw new VenderException(e.getMessage());
		}
		
		if(venders.size() ==0) {
			throw new VenderException("Students not found");
		}
		
		return venders;
	}

	@Override
	public String createTender(Tender tender) {
		String message = "Not Inserted";
		try(Connection conn = DBUtil.provideConnection()){
		 PreparedStatement ps = conn.prepareStatement("insert into tenders(tname,tdesc) values(?,?)");
	
		
		 ps.setString(1, tender.getTname());
		 ps.setString(2, tender.getTdesc());
		
		 int x = ps.executeUpdate();
		 
		 
		 if(x>0) {
			 message = "Tender Created Sucessfully !";
		 }
			
		}catch(SQLException e) {
			message = e.getMessage();
		}
	
		
		return message;
	}

	@Override
	public List<Tender> getAllTenderDetails() throws TenderException {
         List<Tender> tenders = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
		PreparedStatement ps =	conn.prepareStatement("Select * from Tenders");
			
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			int tid= rs.getInt("tid");
			String tn= rs.getString("tname");
			String td= rs.getString("tdesc");

			
		Tender tender=new Tender(tid, tn, td);	
		tenders.add(tender);
		}
		
		} catch (SQLException e) {
			// TODO: handle exception
			throw new TenderException(e.getMessage());
		}
		
		if(tenders.size() ==0) {
			throw new TenderException("Tender not found");
		}
		
		return tenders;
	}

}

package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Tender;
import com.masai.exceptions.TenderException;
import com.masai.utility.DBUtil;

public class VenderDeoImpl implements VenderDeo{

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

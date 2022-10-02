package com.masai.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Administrator;
import com.masai.bean.Vender;
import com.masai.exceptions.AdministratorException;
import com.masai.exceptions.VenderException;
import com.masai.utility.DBUtil;

public class LoginMethods implements LoginInterFace {

	@Override
	public Administrator loginAdministrator(String userName, String Password) throws AdministratorException {
		
		Administrator administrator = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("Select * from administrator where userName = ? and password = ?");
			
			ps.setString(1, userName);
			ps.setString(2, Password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
			
				String userName1 = rs.getString("username");
				String password = rs.getString("password");
				
				administrator = new Administrator(userName1, password);
				
			}else {
				throw new AdministratorException("Invalid Username or Password");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new AdministratorException("Invalid Username or Password");
		}
		
		return administrator;
	}

	@Override
	public Vender loginVender(String vemail, String password)	throws VenderException {

		Vender vender = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("Select * from venders where vemail = ? and password = ?");
			
			ps.setString(1, vemail);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
			
				int vi = rs.getInt("vid");
				String vn = rs.getString("vname");
				String ve = rs.getString("vemail");
				String vp = rs.getString("password");
				String cp = rs.getString("company");
				String ad = rs.getString("address");
				
			
				vender = new Vender(vi, vn, vemail, password, cp, ad);

				
			}else {
				throw new VenderException("Invalid Username or Password");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new VenderException("Invalid Username or Password");
		}
		
		return vender;
	}

}

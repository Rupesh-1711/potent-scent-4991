package com.masai.login;

import com.masai.bean.Administrator;
import com.masai.exceptions.AdministratorException;
import com.masai.exceptions.VenderException;
import com.masai.bean.Vender;


public interface LoginInterFace {

	public Administrator loginAdministrator(String userName, String Password) throws AdministratorException;
//    public Vender loginVender(int vid, String vname, String vemail,String password,String company,String address) throws VenderException;
	 public Vender loginVender( String vemail,String password) throws VenderException;
}

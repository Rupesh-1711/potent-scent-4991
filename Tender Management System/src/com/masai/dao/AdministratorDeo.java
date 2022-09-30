package com.masai.dao;

import java.util.List;

import com.masai.bean.Tender;
import com.masai.bean.Vender;
import com.masai.exceptions.TenderException;
import com.masai.exceptions.VenderException;

public interface AdministratorDeo {

	public String registerVender(Vender vender);
	public List<Vender> getAllVendertDetails() throws VenderException;
	public String createTender(Tender tender);
	public List<Tender> getAllTenderDetails() throws TenderException;
}

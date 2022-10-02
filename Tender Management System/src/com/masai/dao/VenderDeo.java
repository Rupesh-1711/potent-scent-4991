package com.masai.dao;

import java.util.List;

import com.masai.bean.Tender;
import com.masai.exceptions.TenderException;

public interface VenderDeo {
	public List<Tender> getAllTenderDetails() throws TenderException;
}

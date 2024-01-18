package com.pcsglobal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcsglobal.dao.EProductDAO;
import com.pcsglobal.pojo.EProduct;

@Service
public class EProductService {
	
	@Autowired
	EProductDAO eProductDao;
	
	public List<EProduct> getProducts() {
		return eProductDao.getProducts();
	}

}

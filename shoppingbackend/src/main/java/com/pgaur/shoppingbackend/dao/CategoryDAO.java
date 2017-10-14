package com.pgaur.shoppingbackend.dao;

import java.util.List;

import com.pgaur.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);
	
	

}

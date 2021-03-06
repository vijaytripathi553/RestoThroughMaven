package com.vijay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vijay.dao.MenuDAO;
import com.vijay.entity.Menu;

@Service
@Transactional
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDAO menuDAO;

	public void saveMenu(Menu theMenu) {

		menuDAO.saveMenu(theMenu);

	}

	public List<Menu> getMenu() {
		return menuDAO.getMenu();
	}

	@Transactional
	public Menu getMenu(int theId) {

		return menuDAO.getMenu(theId);
	}

	public void showFormForDeleteCustomer(int theId) {
		menuDAO.showFormForDeleteCustomer(theId);

	}

	@Transactional
	public List<Menu> searchCustomers(String theSearchName) {

		return menuDAO.searchCustomers(theSearchName);
	}

}

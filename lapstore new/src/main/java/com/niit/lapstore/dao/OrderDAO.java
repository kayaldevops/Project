package com.niit.lapstore.dao;

import com.niit.lapstore.model.UserOrder;

public interface OrderDAO {
	void addOrder(UserOrder userOrder);
    double getOrderGrandTotal(int cartId);
}


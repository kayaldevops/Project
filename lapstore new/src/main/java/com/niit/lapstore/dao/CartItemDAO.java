package com.niit.lapstore.dao;

import java.util.List;

import com.niit.lapstore.model.Cart;
import com.niit.lapstore.model.CartItem;



public interface CartItemDAO {
	void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByItemId (int itemId);
    
    List<CartItem> getCartItemByItemName (String itemName);

    public List<CartItem> list();
}

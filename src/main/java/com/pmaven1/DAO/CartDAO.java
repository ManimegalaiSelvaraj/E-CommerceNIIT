package com.pmaven1.DAO;

import java.util.List;

import com.pmaven1.model.AddProduct;
import com.pmaven1.model.Cart;

public interface CartDAO {

  void cartsave(Cart cart1);
  List<Cart> cartlist();
AddProduct single_object(int pid);
public void deleteRow(int productId);
}

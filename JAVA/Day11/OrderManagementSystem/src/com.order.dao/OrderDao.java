package com.order.dao;

import java.util.List;
import java.util.Map;

import com.order.beans.Customer;
import com.order.beans.Item;

public interface OrderDao {

	boolean save(Customer c, List<Item> lst);

	Map<Customer, List<Item>> findAll();

}

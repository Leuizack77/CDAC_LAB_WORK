package com.order.service;

import java.util.List;
import java.util.Map;

import com.order.beans.Customer;
import com.order.beans.Item;

public interface OrderService {

	boolean addNewCustomer();

	Map<Customer, List<Item>> displayAll();

}

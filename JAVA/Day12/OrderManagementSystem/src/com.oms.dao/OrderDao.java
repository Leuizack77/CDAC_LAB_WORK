package com.oms.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.oms.beans.Customer;
import com.oms.beans.Item;

public interface OrderDao {

	boolean save(Customer c, List<Item> lst);

	Map<Customer, List<Item>> findAll();

	Entry<Customer, List<Item>> findById(int cid);

	boolean removeById(int cid);

	boolean addNewItem(int cid, Item item);

	boolean deleteById(int cid, int iid);

}

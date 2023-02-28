package com.cg.pizzaorder.dao;

import java.util.Map;

import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.exception.PizzaException;

public class PizzaOrderDAO implements IPizzaOrderDAO {

	// declaring maps to store datas of user and pizza
	Map<Integer, PizzaOrder> pizzaEntry;
	Map<Integer, Customer> customerEntry;

	public PizzaOrderDAO() {
		
	}

	// add data to map
	@Override
	public int placeOrder(Customer customer, PizzaOrder pizza)
			throws PizzaException {

		try {
			// create random customer ID
			int custID = (int) (Math.random() * 100);

			// create random pizza ID
			int orderID = (int) (Math.random() * 1000);

			customer.setCustomerId(custID);
			pizza.setCustomerId(custID);
			pizza.setOrderId(orderID);

			// passing ids as keys to bith the maps
			customerEntry.put(custID, customer);
			pizzaEntry.put(orderID, pizza);

			// return order id that was generated
			return orderID;
		} catch (Exception e) {
			//if cannot create customer and pizza entry
			throw new PizzaException("Cannot create order. Try again later");
		}
	}

	//to fetch 
	@Override
	public PizzaOrder getOrderDetails(int orderId) throws PizzaException {
		
		// Get order from user
		PizzaOrder pizza = pizzaEntry.get(orderId);
		
		//if valid then pass the pizzaorder object
		if (pizza != null)
			return pizza;
		else
			//if order id doesnt exits
			throw new PizzaException("No Order Found with this ID");
	}

}

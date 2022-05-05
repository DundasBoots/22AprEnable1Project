package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private Utils utils;
	
	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	@Override
	public Order create() {
		LOGGER.info("please enter order number: choose existing number to add an item to an order or specify new order number for new order");
		Long order_id = utils.getLong();
		LOGGER.info("Please enter customer name");
		String customer = utils.getString();
		LOGGER.info("Please enter an item");
		String item = utils.getString();
		Order order = orderDAO.create(new Order(order_id, customer, item));
		LOGGER.info("order created");
		return order;
	}

	@Override
	public Order update() {
		LOGGER.info("Please enter the order number you wish to remove an item from");
		Long order_id = utils.getLong();
		LOGGER.info("Please enter item you wish to remove");
		String item = utils.getString();
		Order order = orderDAO.update(new Order(order_id, item));
		LOGGER.info("Order Updated");
		return order;
		
		
	}
	
	@Override
	public int delete() {
		LOGGER.info("Please enter the order number for the order you wish to remove");
		Long order_id = utils.getLong();
		return orderDAO.delete(order_id);
	}
	
}

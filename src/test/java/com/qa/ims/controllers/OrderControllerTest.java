package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.OrderController;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {

	@Mock
	private Utils utils;

	@Mock
	private OrderDAO dao;

	@InjectMocks
	private OrderController controller;

	@Test
	public void testReadAll() {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1L, 1L, "Jack", "Car"));

		Mockito.when(dao.readAll()).thenReturn(orders);

		assertEquals(orders, controller.readAll());

		Mockito.verify(dao, Mockito.times(1)).readAll();
	}
	
//	@Test
//	public void testCreate() {
//		final Long ORDER_ID = 2L;
//		final String CUSTOMER = "Jack";
//		final String ITEM = "Car";
//		final Order created = new Order(ORDER_ID, CUSTOMER, ITEM);
//
//		Mockito.when(utils.getLong()).thenReturn(ORDER_ID);
//		Mockito.when(utils.getString()).thenReturn(CUSTOMER);
//		Mockito.when(utils.getString()).thenReturn(ITEM);
//		Mockito.when(dao.create(created)).thenReturn(created);
//
//		assertEquals(created, controller.create());
//
//		Mockito.verify(utils, Mockito.times(1)).getLong();
//		Mockito.verify(utils, Mockito.times(2)).getString();
//		Mockito.verify(dao, Mockito.times(1)).create(created);
//	}

	@Test
	public void testUpdate() {
		final Long ORDER_ID = 1L;
		final String ITEM = "Car";
		final Order updated = new Order(ORDER_ID, ITEM);

		Mockito.when(this.utils.getLong()).thenReturn(ORDER_ID);
		Mockito.when(this.utils.getString()).thenReturn(ITEM);
		Mockito.when(this.dao.update(updated)).thenReturn(updated);

		assertEquals(updated, this.controller.update());

		Mockito.verify(this.utils, Mockito.times(1)).getLong();
		Mockito.verify(this.utils, Mockito.times(1)).getString();
		Mockito.verify(this.dao, Mockito.times(1)).update(updated);
	}

	@Test
	public void testDelete() {
		final long ID = 1L;

		Mockito.when(utils.getLong()).thenReturn(ID);
		Mockito.when(dao.delete(ID)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(ID);
	}
}

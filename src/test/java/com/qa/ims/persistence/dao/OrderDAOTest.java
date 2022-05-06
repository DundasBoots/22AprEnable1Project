package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.DBUtils;

public class OrderDAOTest {

	private final OrderDAO DAO = new OrderDAO();
	
	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}

	@Test
	public void testCreate() {
		final Order created = new Order(2L, 2L, "Jack", "Car");
		assertEquals(created, DAO.create(created));
	}

	@Test
	public void testReadAll() {
		List<Order> expected = new ArrayList<>();
		expected.add(new Order(1L, 1L,  "Jordan", "Car"));
		assertEquals(expected, DAO.readAll());
	}

	@Test
	public void testReadLatest() {
		assertEquals(new Order(1L, 1L, "Jordan", "Car"), DAO.readLatest());
	}

	@Test
	public void testRead() {
		final long ID = 1L;
		final long NO = 1L;
		assertEquals(new Order(ID, NO, "Jordan", "Car"), DAO.read(ID));
	}

//	@Test
//	public void testUpdate() {
//		final long ID = 1L;
//		final String ITEM = "Car";
//		assertEquals ( DAO.update(1L, "Car"));
//
//	}

	@Test
	public void testDelete() {
		assertEquals(1, DAO.delete(1));
	}
}

package main.java.util;

import main.java.model.OrderLine;

public class Articulo {
	
	private Articulo previous;
	private Articulo next;
	private OrderLine orderLine;


	
	public Articulo getPrevious() {
		return previous;
	}
	public void setPrevious(Articulo previous) {
		this.previous = previous;
	}
	public Articulo getNext() {
		return next;
	}
	public void setNext(Articulo next) {
		this.next = next;
	}

	public void setOrderLine(OrderLine orderLine) {
		this.orderLine = orderLine;
	}

	public OrderLine getOrderLine() {
		return orderLine;
	}
}

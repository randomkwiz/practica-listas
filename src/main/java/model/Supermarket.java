package main.java.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Supermarket {
	
	public Supermarket(String name, Integer code) {
		this.name = name;
		this.code = code;
		this.products = new ArrayList<Product>();
		this.orders = new ArrayList<Order>();
	}
	
	private String name;
	private Integer code;
	
	private List<Product> products;
	private List<Order> orders;
	
	//TERCERA PARTE
	private Queue<Order> orderQueue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	public Queue<Order> getOrderQueue() {
		return orderQueue;
	}

	public void setOrderQueue(Queue<Order> orderQueue) {
		this.orderQueue = orderQueue;
	}

	public String toString() {
		return String.format("%o - %s", this.code, this.name);
	}
	
	//Métodos a completar
	//PRIMERA PARTE

	/*
	 * INTERFAZ
	 * Comentario: Este método añade un objeto de tipo Product a la lista products de la clase Supermarket
	 * Signatura: public void addProduct(Product product)
	 * Precondiciones: Por referencia se pasa un objeto de tipo Product
	 * Entradas: Product product
	 * Salidas:
	 * Postcondiciones: asociado al nombre no devuelve nada. Queda añadido un objeto más a la lista products.
	 * */
	public void addProduct(Product product) {
		//TODO Añadir producto
		products.add(product);
		
	}

	/*
	 * INTERFAZ
	 * Comentario: Este método elimina un objeto de tipo Product de la lista products de la clase Supermarket. Elimina la primera coincidencia, si existe.
	 * Signatura: public void removeProduct(Product product)
	 * Precondiciones: Por referencia se pasa un objeto de tipo Product
	 * Entradas: Product product
	 * Salidas:
	 * Postcondiciones: asociado al nombre no devuelve nada. Queda eliminado un objeto de la lista products, que será la primera
	 * 					coincidencia, si la hubiera.
	 * */
	public void removeProduct(Product product) {
		//TODO Eliminar producto
		products.remove(product);
		
	}

	/*
	 * INTERFAZ
	 * Comentario: Este método devuelve el objeto de tipo Product cuya posicion coincida con la pasada por parametros, de la lista de products.
	 * Signatura: public Product getProduct(int position)
	 * Precondiciones: Por valor se pasa un entero que es la posición del objeto en la lista que se devolverá
	 * Entradas: int position
	 * Salidas: objeto Product
	 * Postcondiciones: asociado al nombre se devuelve un objeto Product que es el elemento x de la lista, donde x es la posicion pasada por parámetro.
	 * */
	public Product getProduct(int position) {
		//TODO Obtener producto

		return products.get(position);
	}

	/*
	 * INTERFAZ
	 * Comentario: Este método añade un objeto de tipo Order a la lista orders de la clase Supermarket
	 * Signatura: public void addOrder(Order order)
	 * Precondiciones: Por referencia se pasa un objeto de tipo Order
	 * Entradas: Order order
	 * Salidas:
	 * Postcondiciones: asociado al nombre no devuelve nada. Queda añadido un objeto más a la lista orders.
	 * */
	public void addOrder(Order order) {
		//TODO Añadir pedido
		orders.add(order);
		
	}

	/*
	 * INTERFAZ
	 * Comentario: Este método elimina un objeto de tipo Order de la lista orders de la clase Supermarket. Elimina la primera coincidencia, si existe.
	 * Signatura: public void removeOrder(Order order)
	 * Precondiciones: Por referencia se pasa un objeto de tipo Order
	 * Entradas: Order order
	 * Salidas:
	 * Postcondiciones: asociado al nombre no devuelve nada. Queda eliminado un objeto de la lista orders, que será la primera
	 * 					coincidencia, si la hubiera.
	 * */
	public void removeOrder(Order order) {
		//TODO Eliminar pedido
		orders.remove(order);
		
	}


	/*
	 * INTERFAZ
	 * Comentario: Este método devuelve el objeto de tipo Order cuya posicion coincida con la pasada por parametros, de la lista de orders.
	 * Signatura: public Order getOrder(int position)
	 * Precondiciones: Por valor se pasa un entero que es la posición del objeto en la lista que se devolverá
	 * Entradas: int position
	 * Salidas: objeto Order
	 * Postcondiciones: asociado al nombre se devuelve un objeto Order que es el elemento x de la lista, donde x es la posicion pasada por parámetro.
	 * */
	public Order getOrder(int position) {
		//TODO Obtener pedido


		
		return orders.get(position);
	}
	
	//TERCERA PARTE
	//Cola de pedidos
	public void pushOrder(Order order) {
		//TODO Añadir pedido
		
	}
	
	public Order popOrder() {
		//TODO Obtener pedido
		
		return null;
	}
	
	public Order getFront() {
		//TODO Devuelve el primer pedido de la cola
		//OJO!! No hay que sacarlo, solo devolver el primer pedido
		
		return null;
	}
	
	//Operaciones
	public void getMinPriceProduct() {
		//TODO Devolver el producto con el precio más bajo
		
	}
	
	public void getMaxPriceProduct() {
		//TODO Devolver el producto con el precio más alto
		
	}
	
	public void getAvgPriceProduct() {
		//TODO Devolver la media de precios de los productos
		
	}
	
	public void getPriceByCode(Integer productCode) {
		//TODO Delvover el precio del producto
	}
	
	public void getBestSellingProduct() {
		//TODO Devolver el producto más vendido junto con el número de ventas
		
	}
	
	public void getWorstSellingProduct() {
		//TODO Devolver el producto más vendido junto con el número de ventas
		
	}
	
}

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
	
	/* INTERFAZ
	 * Comentario: A�ade un producto a la lista de productos
	 * Prototipo: public void addProduct(Product product)
	 * Entrada: Un Product a a�adir
	 * Precondiciones: No hay
	 * Salida: No hay
	 * Postcondiciones: A�ade un producto a la lista de productos
	 */
	public void addProduct(Product product) {
		products.add(product);
	}
	
	/* INTERFAZ
	 * Comentario: Borra un producto de la lista de productos
	 * Prototipo: public void removeProduct(Product product)
	 * Entrada: Un Product a borrar
	 * Precondiciones: No hay
	 * Salida: No hay
	 * Postcondiciones: Borrar el producto determinado de la lista, si el producto no se encuentra en la lista, no hace nada.
	 */
	public void removeProduct(Product product) {
		products.remove(product);
	}
	
	/* INTERFAZ
	 * Comentario: Obtiene un producto dada una posicion de la lista
	 * Prototipo: public Product getProduct(int position)
	 * Entrada: Un int con la posicion del producto
	 * Precondiciones: La posicion a buscar debe existir
	 * Salida: el Product de la posicion determinada
	 * Postcondiciones: Asociado al nombre devuelve el producto de la posicion determinada.
	 */
	public Product getProduct(int position) {
		return products.get(position);
	}
	
	/* INTERFAZ
	 * Comentario: A�ade un pedido (order) a la lista de pedidos
	 * Prototipo: public void addOrder(Order order)
	 * Entrada: Un Order con el pedido a a�adir
	 * Precondiciones: No hay
	 * Salida: No hay
	 * Postcondiciones: El Order determinado queda a�adido en la lista
	 */
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	/* INTERFAZ
	 * Comentario: Borra un pedido de la lista de pedidos
	 * Prototipo: public void removeOrder(Order order)
	 * Entrada: El Order a borrar de la lista de pedidos
	 * Precondiciones: No hay
	 * Salida: No hay
	 * Postcondiciones: Borra el pedido determinado de la lista, si el pedido no existe, no borra nada.
	 */
	public void removeOrder(Order order) {
		orders.remove(order);
	}
	
	/* INTERFAZ
	 * Comenario: Obtiene un pedido de la lista de pedidos dada una posicion
	 * Prototipo: public Order getOrder(int position)
	 * Entrada: Un int con la posicion del pedido a obtener
	 * Precondiciones: La posicion debe existir en la lista
	 * Salida: el Order de la posicion determinada
	 * Postcondiciones: Asociado al nombre devuelve el Order de la posici�n determinada
	 */
	public Order getOrder(int position) {
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

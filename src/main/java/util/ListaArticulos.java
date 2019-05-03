package main.java.util;

public class ListaArticulos {

	private Articulo primerArticulo;
	private Articulo ultimoArticulo;
	private int size = 0;

	public ListaArticulos() {
		primerArticulo = new Articulo();
		primerArticulo.setPrevious(null);
		primerArticulo.setNext(null);
		ultimoArticulo = primerArticulo;
		setSize(getSize() + 1 );
	}


	/* INTERFAZ
	 * Comentario: Añade un articulo a la lista
	 * Prototipo: public void add(Articulo articulo)
	 * Entrada: Un Articulo
	 * Precondiciones: No hay
	 * Salida: No hay
	 * Postocondiciones: El Articulo queda añadido al final de la lista
	 */
	public void add(Articulo articulo) {
		setSize(getSize() + 1 );
		articulo.setPrevious(ultimoArticulo);
		articulo.setNext(null);
		ultimoArticulo = articulo;
	}
	
	/* INTERFAZ
	 * Comentario: Inserta un articulo en una posicion determinada
	 * Prototipo: public void insert(Articulo articulo, int position)
	 * Entrada: El Articulo a insertar y un int con la posición donde se insertará.
	 * Precondiciones: La posición debe ser una posición existente en la lista
	 * Salida: No hay
	 * Postcondiciones: El Articulo se añade en la posición determinada
	 */
	public void insert(Articulo articulo, int position) {
		Articulo enPosActual = get(position);

		//Al que esta previo al de posicion actual, se le cambia su referencia del siguiente al nuevo que vamos a meter
		enPosActual.getPrevious().setNext(articulo);

		//Se cambian las referencias del nuevo metido
		articulo.setPrevious(enPosActual.getPrevious());
		articulo.setNext(enPosActual);

		//se cambian las referencias del anterior al que estaba en la posicion original ya que se ha desplazado
		enPosActual.setPrevious(articulo);


		
	}
	
	/* INTERFAZ
	 * Comentario: Borra un articulo de la lista
	 * Prototipo: public void remove(Articulo articulo)
	 * Entrada: El Articulo a borrar
	 * Precondiciones: No hay
	 * Salida: No hay
	 * Postcondiciones: Borra el articulo de la lista, si el articulo no estaba anteriormente en la lista, la lista no se modificará
	 */
	public void remove(Articulo articulo) {
		//cambiar referencias
		articulo.getPrevious().setNext(articulo.getNext());
		articulo.getNext().setPrevious(articulo.getPrevious());

		//eliminar
		articulo.setPrevious(null);
		articulo.setNext(null);
	}
	
	/* INTERFAZ
	 * Comentario: Obtiene un articulo por su posicion
	 * Prototipo: public Articulo get(int position)
	 * Entrada: Un int con la posicion del articulo
	 * Precondiciones: la posición debe ser una posición existente en la lista
	 * Salida: el Articulo que se encuentra en la posición determinada
	 * Postcondiciones: Asociado al nombre devuelve el articulo que se encuentra en la posición determinada
	 */
	public Articulo get(int position) {
		return getNext(primerArticulo, position, 0);
	}

	private Articulo getNext(Articulo a, int posicionABuscar, int posicionActual){
		Articulo resultado;
		if(posicionActual == posicionABuscar){
			resultado = a;
		} else{
		 	resultado = getNext(a.getNext(), posicionABuscar, ++posicionActual);
		}
		return resultado;
	}

	/* INTERFAZ
	 * Comentario: Obtiene el tamaño de la lista
	 * Prototipo: public int getSize()
	 * Entrada: No hay
	 * Precondiciones: No hay
	 * Salida: Un int con el tamaño de la lista
	 * Postcondiciones: Asociado al nombre devuelve un int con el tamaño de la lista
	 */
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}

package main.java.util;

public class ListaArticulos {

	private Articulo primerArticulo ;
	private Articulo ultimoArticulo;
	private int size = 0;

	public ListaArticulos() {
		primerArticulo = new Articulo();
		primerArticulo.setPrevious(null);
		primerArticulo.setNext(null);
		ultimoArticulo = primerArticulo;
		setSize(getSize() + 1 );
	}



	public void add(Articulo articulo) {
		//TODO Añadir artículo
		setSize(getSize() + 1 );
		articulo.setPrevious(ultimoArticulo);
		articulo.setNext(null);
		ultimoArticulo = articulo;
	}
	
	public void insert(Articulo articulo, int position) {
		//TODO Insertar el articulo en la posicion indicada
		Articulo enPosActual = get(position);

		//Al que esta previo al de posicion actual, se le cambia su referencia del siguiente al nuevo que vamos a meter
		enPosActual.getPrevious().setNext(articulo);

		//Se cambian las referencias del nuevo metido
		articulo.setPrevious(enPosActual.getPrevious());
		articulo.setNext(enPosActual);

		//se cambian las referencias del anterior al que estaba en la posicion original ya que se ha desplazado
		enPosActual.setPrevious(articulo);


		
	}
	
	public void remove(Articulo articulo) {
		//TODO Eliminar artículo de la lista

		//cambiar referencias
		articulo.getPrevious().setNext(articulo.getNext());
		articulo.getNext().setPrevious(articulo.getPrevious());

		//eliminar
		articulo.setPrevious(null);
		articulo.setNext(null);


	}
	
	public Articulo get(int position) {
		//TODO Obtener artículo de la lista
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


	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}

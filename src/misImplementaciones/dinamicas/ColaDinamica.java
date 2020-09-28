package misImplementaciones.dinamicas;

import miApi.ColaTDA;

// IMPLEMENTACION DE COLA CON PRIMERO AL INICIO
public class ColaDinamica implements ColaTDA {

	class Node{
		int d;
		Node sig;
	}
	
	private Node inicio, fin;
	
	//Implementacion dinamica
	
	/**
	 * Orden de complejidad: 1
	 */
	
	@Override
	public void inicializarCola() {
		inicio = fin = null;
	}
	
	/**
	 * Orden de complejidad: 1
	 */

	@Override
	public void acolar(int x) {
		Node n = new Node();
		n.d=x;
		n.sig=null;
		if(inicio == null) {
			inicio = fin = n;
		}
		else {
			fin.sig=n;
			fin = n;	
		}
	}

	/**
	 * Orden de complejidad: 1
	 */
	
	@Override
	public void desacolar() {
		inicio = inicio.sig;
		if(inicio==null) {
			fin = null;
		}
	}
	
	/**
	 * Orden de complejidad: 1
	 */

	@Override
	public boolean colaVacia() {
		
		return inicio == null;
	}
	
	/**
	 * Orden de complejidad: 1
	 */

	@Override
	public int primero() {
		return inicio.d;
	}

}

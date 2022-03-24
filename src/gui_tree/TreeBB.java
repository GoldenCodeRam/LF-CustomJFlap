package gui_tree;

import java.util.LinkedList;

import javax.swing.JPanel;

public class TreeBB {

	private Nodo raiz;
	int num_nodos;
	int alt;

	public TreeBB() {
		raiz = null;
	}

	public boolean agregar(String dato) {
		if (dato != "") {
			Nodo nuevo = new Nodo(dato, null, null);
			insertar(nuevo, raiz);
			return true;
		}
		return false;
	}

	public void insertar(Nodo nuevo, Nodo pivote) {
		if (this.raiz == null) {
			raiz = nuevo;
		} else {
			if (nuevo.getDato().equals(pivote.getDato())) {
				if (pivote.getIzq() == null) {
					pivote.setIzq(nuevo);
				} else {
					insertar(nuevo, pivote.getIzq());
				}
			} else {
				if (pivote.getDer() == null) {
					pivote.setDer(nuevo);
				} else {
					insertar(nuevo, pivote.getDer());
				}
			}
		}

	}

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	public LinkedList preOrden() {
		LinkedList rec = new LinkedList();
		preorden(raiz, rec);
		return rec;
	}

	public void preorden(Nodo aux, LinkedList recorrido) {
		if (aux != null) {
			recorrido.add(aux.getDato());
			preorden(aux.getIzq(), recorrido);
			preorden(aux.getDer(), recorrido);
		}
	}

	public LinkedList inOrden() {
		LinkedList rec = new LinkedList();
		inorden(raiz, rec);
		return rec;
	}

	public void inorden(Nodo aux, LinkedList recorrido) {
		if (aux != null) {
			inorden(aux.getIzq(), recorrido);
			recorrido.add(aux.getDato());
			inorden(aux.getDer(), recorrido);
		}
	}

	public LinkedList postOrden() {
		LinkedList rec = new LinkedList();
		postorden(raiz, rec);
		return rec;
	}

	public void postorden(Nodo aux, LinkedList recorrido) {
		if (aux != null) {
			postorden(aux.getIzq(), recorrido);
			postorden(aux.getDer(), recorrido);
			recorrido.add(aux.getDato());
		}
	}

	public boolean existe(String dato) {
		Nodo aux = raiz;
		while (aux != null) {
			if (dato.equals(aux.getDato())) {
				return true;
			} else if (dato.length() > aux.getDato().length()) {
				aux = aux.getDer();
			} else {
				aux = aux.getIzq();
			}
		}
		return false;
	}

	private void altura(Nodo aux, int nivel) {
		if (aux != null) {
			altura(aux.getIzq(), nivel + 1);
			alt = nivel;
			altura(aux.getDer(), nivel + 1);
		}
	}

	public int getAltura() {
		altura(raiz, 1);
		return alt;
	}

	public JPanel getdibujo() {
		return new GraphicExpressionTree(this);
	}
}

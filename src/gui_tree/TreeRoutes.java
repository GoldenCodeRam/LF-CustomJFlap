package gui_tree;

import java.util.LinkedList;

import javax.swing.JPanel;

public class TreeRoutes {

	TreeBB miArbol = new TreeBB();

	public TreeRoutes() {
	}

	public boolean insertar(String dato) {
		return (this.miArbol.agregar(dato));
	}

	public String preOrden() {
		LinkedList<String> it = this.miArbol.preOrden();
		return (recorrido(it, "Recorrido PreOrden"));
	}

	public String inOrden() {
		LinkedList<String> it = this.miArbol.inOrden();
		return (recorrido(it, "Recorrido InOrden"));
	}

	public String postOrden() {
		LinkedList<String> it = this.miArbol.postOrden();
		return (recorrido(it, "Recorrido PosOrden"));
	}

	private String recorrido(LinkedList<String> it, String msg) {
		int i = 0;
		String r = msg + "\n";
		while (i < it.size()) {
			r += "\t" + it.get(i).toString() + "";
			i++;
		}
		return (r);
	}

	public String buscar(String dato) {
		boolean siEsta = this.miArbol.existe(dato);
		String r = "El dato:" + dato.toString() + "\n";
		r += siEsta ? "Si se encuentra en el arbol" : "No se encuentra en el arbol";
		return (r);
	}

	public JPanel getDibujo() {
		return this.miArbol.getdibujo();
	}
}

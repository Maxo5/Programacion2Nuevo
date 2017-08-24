import java.util.ArrayList;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Papel higiénico");
		lista.add("Leche");
		lista.add("Café");
		lista.add("Manteca");
		System.out.println(lista.get(1));
		Iterator<String> elQueItera = lista.iterator();
		while (elQueItera.hasNext()) {
			String elemento = elQueItera.next();
			if (elemento.equals("Manteca")) {
				elQueItera.remove();
			}
		}

		for (String elemento : lista) {
			System.out.println(elemento);

		}
	}
}
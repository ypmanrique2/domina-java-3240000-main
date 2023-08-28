package es.dsrroma.school.java.domina1.video01_16;

import java.util.HashMap;
import java.util.Map;

public class ContadorColecciones {
	
	public static Map<Character, Integer> contador(String mensaje) {
		Map<Character, Integer> mapa = new HashMap<>();
		for (Character letra : mensaje.toCharArray()) {
			Integer contador = mapa.get(letra);
			if (contador == null) {
				contador = 0;
			}
			contador++;
			mapa.put(letra, contador);
		}
		return mapa;
	}
	
	public static void main(String[] args) {
		System.out.println(contador("mi mamá me mima"));
	}

}

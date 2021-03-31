package com.impacta.atividade.tdd;

public class PalindromoVerify {

	public boolean validate(String entry) {
		entry = entry.replaceAll("[^a-zA-Z0-9]", "");
		String invertida = new StringBuffer(entry).reverse().toString();

		if (entry.equalsIgnoreCase(invertida)) {
			return true;
		} else {
			return false;
		}
	}
}

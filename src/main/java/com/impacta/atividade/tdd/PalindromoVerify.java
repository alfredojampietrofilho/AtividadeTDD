package com.impacta.atividade.tdd;

public class PalindromoVerify {

	public boolean isPalindrome(String text) {
	    String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	    int tam = clean.length();
	    int paraFrente = 0;
	    int paraTras = tam - 1;
	    while (paraTras > paraFrente) {
	        char paraFrenteChar = clean.charAt(paraFrente++);
	        char paraTrasChar = clean.charAt(paraTras--);
	        if (paraFrenteChar != paraTrasChar)
	            return false;
	    }
	    return true;
	}
}

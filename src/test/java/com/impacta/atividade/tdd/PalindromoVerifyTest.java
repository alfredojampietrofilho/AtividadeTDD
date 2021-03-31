package com.impacta.atividade.tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromoVerifyTest {

	@Test
	public void shouldAnswerWithTrue1() {
		PalindromoVerify verify = new PalindromoVerify();
		assertTrue(verify.isPalindrome("Rotator"));
	}
	
	@Test
	public void shouldAnswerWithTrue2() {
		PalindromoVerify verify = new PalindromoVerify();
		assertTrue(verify.isPalindrome("bob"));
	}
	
	@Test
	public void shouldAnswerWithTrue3() {
		PalindromoVerify verify = new PalindromoVerify();
		assertTrue(verify.isPalindrome("madam"));
	}
	
	@Test
	public void shouldAnswerWithTrue4() {
		PalindromoVerify verify = new PalindromoVerify();
		assertTrue(verify.isPalindrome("mAlAyAlam"));
	}
	
	@Test
	public void shouldAnswerWithTrue5() {
		PalindromoVerify verify = new PalindromoVerify();
		assertTrue(verify.isPalindrome("1"));
	}
	
	@Test
	public void shouldAnswerWithTrue6() {
		PalindromoVerify verify = new PalindromoVerify();
		assertTrue(verify.isPalindrome("Able was I, ere I saw Elba"));
	}
	
	@Test
	public void shouldAnswerWithTrue7() {
		PalindromoVerify verify = new PalindromoVerify();
		assertTrue(verify.isPalindrome("Madam i`m Adam"));
	}
	
	@Test
	public void shouldAnswerWithTrue8() {
		PalindromoVerify verify = new PalindromoVerify();
		assertTrue(verify.isPalindrome("Step on no pets"));
	}
	
	@Test
	public void shouldAnswerWithTrue9() {
		PalindromoVerify verify = new PalindromoVerify();
		assertTrue(verify.isPalindrome("Top spot!"));
	}
	
	@Test
	public void shouldAnswerWithFalse1() {
		PalindromoVerify verify = new PalindromoVerify();
		assertFalse(verify.isPalindrome("xyz"));
	}
	
	@Test
	public void shouldAnswerWithFalse2() {
		PalindromoVerify verify = new PalindromoVerify();
		assertFalse(verify.isPalindrome("elephant"));
	}
	
	@Test
	public void shouldAnswerWithFalse3() {
		PalindromoVerify verify = new PalindromoVerify();
		assertFalse(verify.isPalindrome("Country"));
	}
	
	@Test
	public void shouldAnswerWithFalse4() {
		PalindromoVerify verify = new PalindromoVerify();
		assertFalse(verify.isPalindrome("Top . post!"));
	}
	
	@Test
	public void shouldAnswerWithFalse5() {
		PalindromoVerify verify = new PalindromoVerify();
		assertFalse(verify.isPalindrome("Wonderful-fool"));
	}
	
	@Test
	public void shouldAnswerWithFalse6() {
		PalindromoVerify verify = new PalindromoVerify();
		assertFalse(verify.isPalindrome("Wild imagination!"));
	}
}

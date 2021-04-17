package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import algorithms.datastructures.StackArray;

public class StackArrayTest {

	private StackArray stack;
	
	@BeforeEach
	public void initialize() {
		this.stack = new StackArray();
	}
	
	@Test
	@DisplayName("Teste de pilha vazia")
	public void testarPilhaVazia() {
		var result = stack.isEmpty();
		assertTrue(result);
	}
	
	@Test
	@DisplayName("Teste de pilha cheia")
	public void testarSePilhaCheia() {
		
		for(int i = 0; i <= 9; i++) {
			stack.push(i);
		}
		
		var result = stack.isFull();
		assertTrue(result);
	}
	
	@Test
	@DisplayName("Teste de inserção de elementos na pilha")
	public void testarInsercaoElementos() {
		
		var tamanhoMaximo = 4;
		
		for(int i = 0; i <= tamanhoMaximo; i++) {
			stack.push(i);
		}
		
		var retorno = stack.size();
		assertEquals(4+1, retorno);
	}
	
	
	@Test
	@DisplayName("Teste de remoção de elementos na pilha")
	public void testarRemocaoElementos() {
		
		for(int i = 0; i <= 9; i++) {
			stack.push(i);
		}
		
		for(int i = 9; i >= 0; i--) {
			var retorno = stack.pop();
			assertEquals(retorno, i);
		}
	}
	
	@Test
	@DisplayName("Teste de peek apos a remoção de elementos na pilha")
	public void testarPeekAposRemocao() {
		
		for(int i = 0; i <= 9; i++) {
			stack.push(i);
		}
		
		for(int i = 9; i >= 0; i--) {
			stack.pop();
			var retorno = stack.peek();
			assertEquals(retorno, i-1);
		}
		
	}
	
	@Test
	@DisplayName("Teste de peek para pilha vazia")
	public void testarPeekPilhaVazia() {
		var retorno = stack.peek();
		assertEquals(retorno, -1);
	}
	
	@Test
	@DisplayName("Teste de peek para pilha limpa")
	public void testarSePilhaLimpa() {
		for(int i = 0; i <= 11; i++) {
			stack.push(i);
		}
		
		stack.makeEmpty();
		var retorno = stack.isEmpty();
		assertTrue(retorno);
	}
	
	@Test
	@DisplayName("Teste do método que obtem tamanho da pilha")
	public void testarTamanhoPilha() {
	
		var elementos = new int[]{1,4,6,3,9};
		
		for(int i = 0; i <= 4; i++) {
			stack.push(elementos[i]);
		}
	
		var tamanhoPilha = stack.size();
		
		assertEquals(tamanhoPilha, elementos.length);
	}
	
	@Test
	@DisplayName("Teste de remoção de mais elementos que foram adicionados na pilha")
	public void testarRemocaoElementosMaiorQuePilha() {
		
		int retorno = 0;
		
		for(int i = 0; i <= 4; i++) {
			stack.push(i);
		}
		
		for(int i = 8; i >= 0; i--) {
			retorno = stack.pop();
		}
		
		assertEquals(retorno, -1);
	}
	
	
}

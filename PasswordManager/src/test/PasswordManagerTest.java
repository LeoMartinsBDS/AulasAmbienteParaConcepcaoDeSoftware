package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import domain.PasswordManager;

public class PasswordManagerTest {

	private static PasswordManager pwManager;
	
	@BeforeAll
	public static void initialize() {
		pwManager = new PasswordManager();
	}
	
	@Test
	public void testarSeComecaComLetraOuCifrao() {
		boolean valid = pwManager.validatePassword("leonardo");
		assertTrue(valid);
	}
	
	@Test
	public void testarSeNaoComecaComLetraOuCifrao() {
		boolean valid = pwManager.validatePassword("123eonardo");
		assertFalse(valid);
	}
	
	@Test
	public void testarSenhaTamanhoValido() {
		boolean valid = pwManager.validatePassword("batatinha");
		assertTrue(valid);
	}
	
	@Test
	public void testarSenhaUltraPassaTamanhomaximo() {
		boolean valid = pwManager.validatePassword("$essasenhaultrapassatamanhomaximo");
		assertFalse(valid);
	}
	
	@Test
	public void testarSenhaTamanhoMinimo() {
		boolean valid = pwManager.validatePassword("ab");
		assertFalse(valid);
	}
	
	@Test
	public void testarSeCaracteresSeguintesSaoValidos() {
		boolean valid = pwManager.validatePassword("E$$@eL3G4L");
		assertTrue(valid);
	}
	
	@Test
	public void testarSeCaracteresSeguintesSaoInvalidos() {
		boolean valid = pwManager.validatePassword("Inv@l1d$!");
		assertFalse(valid);
	}
	
}

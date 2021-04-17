package domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordManager {
	
	public boolean validatePassword(String password) {

		// A password de um usu�rio deve come�ar com uma letra ou $ 
		// e os caracteres seguintes podem ser letras, d�gitos, $ ou @. 
		// Al�m disso, a password deve ter de 6 a 10 caracteres
		Pattern p = Pattern.compile("[a-zA-Z\\$][a-zA-Z0-9\\$@]{6,10}");
		Matcher m = p.matcher(password);
		if(m.matches()) return true;
				
		return false;
	}

}
